package crypto.com;

import okhttp3.Response;

import java.io.IOException;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpResponse {
	private Response response;
    Response.Builder responseBuilder;
    
    static final String COOKIES_HEADER = "Set-Cookie";
    static CookieManager msCookieManager = new CookieManager();

    public HttpResponse(Response _response){
        response=_response;
        responseBuilder=response.newBuilder();
    }

    public String getBody() throws IOException {
        return response.body().string();
    }

    public String getProtocal(){
        return response.priorResponse().toString();
    }

    public Map<String, List<String>> getHeaders(){
        return response.headers().toMultimap();
    }

    public String getHeaderByName(String name){
        return response.header(name);
    }

    public String getMessage(){
        return response.message();
    }

    public int getCode(){
        return response.code();
    }
    
    public CookieManager getCookies(HttpResponse httpResponse) {
    	Map<String, List<String>> responseHeadersMap = httpResponse.getHeaders();
        List<String> cookiesHeader = responseHeadersMap.get(COOKIES_HEADER);
        if (cookiesHeader != null) {
        	for (String cookie : cookiesHeader) {
    			msCookieManager.getCookieStore().add(null, HttpCookie.parse(cookie).get(0));
            	}
             }
	    return msCookieManager;
    
    }
    
    public String getToken(String regex, String body) {
    	
    	Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(body);
        
        String token = null;
        
        if (matcher.find()) {
        	token = matcher.group(1);
        }
        
        return token;
    }
}