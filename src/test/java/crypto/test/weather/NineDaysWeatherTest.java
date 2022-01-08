package crypto.test.weather;


import com.google.gson.Gson;
import crypto.data.model.ninedays.NineDayData;
import crypto.data.url.IURL;
import crypto.data.url.UrlWeather;
import crypto.test.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class NineDaysWeatherTest extends TestBase{

    @Test(testName = "Verify Nine Day Weather")
    public void testNineDayWeather() throws Exception {

        // update the url
        ArrayList<String> paras = new ArrayList<>();
        paras.add("fnd");
        paras.add("tc");
        IURL urlWeather = new UrlWeather(paras);

        // send request and get response body
        String responseBody = super.exec(urlWeather);
        System.out.println(responseBody);

        // covert to object and do verification.
        NineDayData nineDayData = new Gson().fromJson(responseBody, NineDayData.class);
        Assert.assertTrue(nineDayData.getGeneralSituation().length()>0, "Check nice day GeneralSituation is not blank");

    }
}
