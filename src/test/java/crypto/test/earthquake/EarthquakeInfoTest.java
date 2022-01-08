package crypto.test.earthquake;


import com.google.gson.Gson;
import crypto.data.model.earthquake.EarthquakeData;
import crypto.data.url.IURL;
import crypto.data.url.UrlEarthquake;
import crypto.test.base.TestBase;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

@Feature("Feature - Earthquake Info Response")
public class EarthquakeInfoTest extends TestBase{

    @Test(testName = "Verify Nine Day Weather")
    public void testNineDayWeather() throws Exception {

        // update the url
        ArrayList<String> paras = new ArrayList<>();
        paras.add("qem");
        paras.add("tc");
        IURL urlEarthquake = new UrlEarthquake(paras);

        // send request and get response body
        String responseBody = super.exec(urlEarthquake);
        System.out.println(responseBody);

        // covert to object and do verification.
        EarthquakeData earthquakeData = new Gson().fromJson(responseBody, EarthquakeData.class);
        Assert.assertTrue(earthquakeData.getRegion().length()>0, "Check the region is not blank");

    }
}
