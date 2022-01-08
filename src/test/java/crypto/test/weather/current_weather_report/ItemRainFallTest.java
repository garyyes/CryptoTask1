package crypto.test.weather.current_weather_report;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import crypto.data.model.current_weather_report.CurrentWeatherData;
import crypto.data.url.IURL;
import crypto.data.url.UrlWeather;
import crypto.test.base.TestBase;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Feature("Feature - Verify Current Weather report - RainFall")
public class ItemRainFallTest extends TestBase{

    @Test(testName = "Check the items RainFall -> data")
    public void testCurrentWeatherRainFallData() throws Exception {

        // update the url
        ArrayList<String> paras = new ArrayList<>();
        paras.add("rhrread");
        paras.add("sc");
        IURL urlWeather = new UrlWeather(paras);

        // send request and get response body
        String responseBody = exec(urlWeather);
        System.out.println(responseBody);

        // covert to object and do verification.
        CurrentWeatherData weatherReportData = new Gson().fromJson(responseBody, CurrentWeatherData.class);
        // Check the item data->unit equals "mm"
        Assert.assertEquals(weatherReportData.getRainfall().getData().get(0).getUnit(), "mm", "Check the unit should be 'mm'");
        // Check the item data->place is not empty
        Assert.assertTrue(weatherReportData.getRainfall().getData().get(0).getPlace().length()>0, "Check Place is not blank");
        // Check the item data->main equals FALSE or TRUE
        Assert.assertTrue(weatherReportData.getRainfall().getData().get(0).getMain().equalsIgnoreCase("FALSE") ||
                weatherReportData.getRainfall().getData().get(0).getMain().equalsIgnoreCase("TRUE"), "Check Main is FALSE or TRUE");
        // Check the item data->max, >=0
        Assert.assertTrue(weatherReportData.getRainfall().getData().get(0).getMax()>=0, "Check the max is >=0");
    }

    @Test(testName = "Check the items RainFall -> startIime and endTime")
    public void testCurrentWeatherRainFallStartTime() throws Exception {

        // update the url
        ArrayList<String> paras = new ArrayList<>();
        paras.add("rhrread");
        paras.add("sc");
        IURL urlWeather = new UrlWeather(paras);

        // send request and get response body
        String responseBody = exec(urlWeather);
        System.out.println(responseBody);

        // covert to object and do verification.
        Gson gson = new GsonBuilder().create();
        CurrentWeatherData weatherReportData = gson.fromJson(responseBody, CurrentWeatherData.class);
        // Check the item data->startTime is not empty
        Assert.assertTrue(weatherReportData.getRainfall().getStartTime().length()>0, "Check startTime is not blank.");
        String startDate = weatherReportData.getRainfall().getStartTime();

        Date date1= new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss").parse(startDate);
        Assert.assertTrue(date1.getTime()>0, "Check the startTime format is correct.");

        // Check the item data->endTime is not empty
        Assert.assertTrue(weatherReportData.getRainfall().getEndTime().length()>0, "Check startTime is not blank.");
        String endTime = weatherReportData.getRainfall().getEndTime();

        Date date2= new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss").parse(endTime);
        Assert.assertTrue(date2.getTime()>0, "Check the endTime format is correct.");
    }
}
