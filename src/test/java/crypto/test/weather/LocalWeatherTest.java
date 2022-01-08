package crypto.test.weather;

import com.google.gson.Gson;
import crypto.data.model.local.LocalWeather;
import crypto.data.url.IURL;
import crypto.data.url.UrlWeather;
import crypto.test.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class LocalWeatherTest extends TestBase{


    @Test(testName = "Verify Nine Day Weather")
    public void testLocalWeather() throws Exception {

        // update the url
        ArrayList<String> paras = new ArrayList<>();
        paras.add("flw");
        paras.add("en");
        IURL urlWeather = new UrlWeather(paras);

        // send request and get response body
        String responseBody = super.exec(urlWeather);
        System.out.println(responseBody);

        // covert to object and do verification.
        LocalWeather localWeatherData = new Gson().fromJson(responseBody, LocalWeather.class);
        Assert.assertTrue(localWeatherData.getGeneralSituation().length()>0);

    }
}
