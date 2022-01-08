package crypto.com;

import okhttp3.*;
import okio.Buffer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

//FOR CLIENT CONFIGURATION
public class HttpClient {

    private OkHttpClient client;
    private OkHttpClient.Builder clientBuilder;

    private Response response;
    private Proxy proxy;

    public HttpClient(){
        client = new OkHttpClient();
        clientBuilder = client.newBuilder();
        clientBuilder.proxy(Proxy.NO_PROXY);
    }
    
    public static String bodyToString(final RequestBody request){
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if(copy != null)
                copy.writeTo(buffer);
            else
                return "";
            return buffer.readUtf8();
        }
        catch (final IOException e) {
            return "did not work";
        }
    }

    public HttpClient setHttpProxy(String ipAddress, int port){
        proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ipAddress, port));
        clientBuilder.proxy(proxy);
        return this;
    }
    
    public HttpClient setSOCKSProxy(String ipAddress, int port){
        proxy = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(ipAddress, port));
        clientBuilder.proxy(proxy);
        return this;
    }

    public HttpClient setConnectTimeout(int seconds){
        clientBuilder.connectTimeout(seconds, TimeUnit.SECONDS);
        return this;
    }

    public HttpClient setReadTimeout(int seconds){
        clientBuilder.readTimeout(seconds, TimeUnit.SECONDS);
        return this;
    }
    
    public HttpClient addInterceptor(Interceptor interceptor){
    	clientBuilder.addInterceptor(interceptor);
    	return this;
    }   
    
    public HttpClient setFollowRedirects(boolean followRedirects){
        clientBuilder.followRedirects(followRedirects);
        return this;
    }

    public HttpClient call(HttpRequest request) throws IOException {
        response = client.newCall(request.getRequest()).execute();
        return this;
    }
    
    public HttpResponse getHttpResponse(){
        return new HttpResponse(response);
    } 
}
