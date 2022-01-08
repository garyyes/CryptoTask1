package crypto.test.base;

import crypto.com.HttpClient;
import crypto.com.HttpRequest;
import crypto.com.HttpResponse;
import crypto.data.url.IURL;
import org.testng.Assert;

public abstract class TestBase {

    // Send the request and return the response
    protected String exec(IURL iurl) throws Exception {

        String url = iurl.getUrl();
        HttpClient httpClient = new HttpClient();
        HttpRequest httpRequest = new HttpRequest();

        httpRequest.setRequestUrl(url);

        httpClient
                .setReadTimeout(120)
                .setConnectTimeout(120)
                .call(httpRequest);
        HttpResponse httpResponse = httpClient.getHttpResponse();
        int responseCode = httpResponse.getCode();
        Assert.assertEquals(responseCode,200);

        return httpResponse.getBody();
    }


}
