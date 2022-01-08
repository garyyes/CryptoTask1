package crypto.com;

import okhttp3.Credentials;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.net.CookieManager;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HttpRequest {

    private Request request;
    private Request.Builder requestBuilder = new Request.Builder();
    
    static final String COOKIES_HEADER = "Set-Cookie";
    static final String COOKIE = "Cookie";
    static CookieManager msCookieManager = new CookieManager();

    private final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private final MediaType XML = MediaType.parse("application/xml; charset=utf-8");

    static final String CONTENT_TYPE = "Content-type";
    
    private Map<String, String> headers = new HashMap<>();

    // belows are for Http request

    public HttpRequest setRequestHeaders(Map<String, String> header){
        headers.putAll(header);
        for (String headerName: headers.keySet()) {
        	String value = headers.get(headerName);
        	requestBuilder.header(headerName, value);
        } 
        return this;
    }
        
    public Map<String, List<String>> getRequestHeaders(){
        return request.headers().toMultimap();
    }

    public HttpRequest setRequestFormBody(Map<String, String> form){
        headers.put(CONTENT_TYPE, HttpContentType.CONTENT_TYPE_FORM);

        HttpFormBody httpFormBody = new HttpFormBody();
        requestBuilder.post(httpFormBody.addFormBody(form));
        return this;
    }

    public HttpRequest setRequestJsonBody(String val){
        headers.put(CONTENT_TYPE, HttpContentType.CONTENT_TYPE_JSON);

        RequestBody body = RequestBody.create(JSON, val);
        requestBuilder.post(body);
        return this;
    }
    
    public HttpRequest setRequestJsonBody(byte[] content){
        headers.put(CONTENT_TYPE, HttpContentType.CONTENT_TYPE_JSON);

        RequestBody body = RequestBody.create(JSON, content);
        requestBuilder.post(body);
        return this;
    }

    public HttpRequest setRequestXMLBody(String val){
        headers.put(CONTENT_TYPE, HttpContentType.CONTENT_TYPE_XML);

        RequestBody body = RequestBody.create(XML, val);
        requestBuilder.post(body);
        return this;
    }
    public HttpRequest setRequestXMLBody(byte[] content){
        headers.put(CONTENT_TYPE, HttpContentType.CONTENT_TYPE_XML);

        RequestBody body = RequestBody.create(XML, content);
        requestBuilder.post(body);
        return this;
    }

    public HttpRequest setRequestUrl(String url){
        requestBuilder.url(url);
        return this;
    }
            
    public HttpRequest setAuthCredentials(String username, String password){
    	String credential = Credentials.basic(username, password);
    	headers.put("Authorization", credential);
    	requestBuilder.header("Authorization", credential);
        return this;
    }

    Request getRequest(){
        request = requestBuilder.build();
        return request;
    }
    
    public HttpRequest setCookies(List<HttpCookie> cookies) {
    	String cookieList = "";
	    for (HttpCookie cookie : cookies) {
	        cookieList = cookieList.concat(cookie.toString() + ";");
	    }
	    headers.put(COOKIE, cookieList);
	    requestBuilder.header(COOKIE, cookieList);
	    return this;
    }
    
    public HttpRequest setCookieManager(CookieManager cookieManager) {
    	String cookieList = "";
	    for (HttpCookie cookie : cookieManager.getCookieStore().getCookies()) {
	        cookieList = cookieList.concat(cookie.toString() + ";");
	    }
	    headers.put(COOKIE, cookieList);
	    requestBuilder.header(COOKIE, cookieList);
	    return this;
    }
    
	public String setCookie(String cookieName, String token) {
        StringBuilder cookieString = new StringBuilder();
        if (!msCookieManager.getCookieStore().getCookies().isEmpty()) {
            //While joining the Cookies, use ',' or ';' as needed. Most of the server are using ';'
            for (HttpCookie cookieItem : msCookieManager.getCookieStore().getCookies()) {
                cookieString.append(cookieItem.toString());
                cookieString.append(";");
            }
        }
        cookieString.append(cookieName + "=").append(token);
        return cookieString.toString();
    }

}
