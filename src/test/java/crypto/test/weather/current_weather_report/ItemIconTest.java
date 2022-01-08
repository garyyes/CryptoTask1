package crypto.test.weather.current_weather_report;

import com.google.gson.Gson;
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

@Feature("Feature - Verify Current Weather report - Icon and IconUpdateTime")
public class ItemIconTest extends TestBase{

    @Test(testName = "Check the items Icon and IconUpdateTime")
    public void testCurrentWeatherIconData() throws Exception {

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
        // Check the item size of List icon is more than 0
        Assert.assertTrue(weatherReportData.getIcon().size() > 0, "Check the size of List icon is more than 0");


        // Check the item iconUpdateTime is not empty
        Assert.assertTrue(weatherReportData.getIconUpdateTime().length()>0, "Check iconUpdateTime is not blank.");
        String iconUpdateTime = weatherReportData.getIconUpdateTime();

        // Check the item iconUpdateTime format
        Date date2= new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss").parse(iconUpdateTime);
        Assert.assertTrue(date2.getTime()>0, "Check the iconUpdateTime format is correct.");

    }

}
