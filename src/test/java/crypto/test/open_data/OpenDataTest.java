package crypto.test.open_data;


import com.google.gson.Gson;
import crypto.data.model.opendata.OpenData;
import crypto.data.url.IURL;
import crypto.data.url.UrlOpenData;
import crypto.test.base.TestBase;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;


@Feature("Feature - Open Data Response")
public class OpenDataTest extends TestBase{

    @Test(testName = "Verify Nine Day Weather with CSV format")
    public void testOpenDataCSV() throws Exception {

        // update the url
        ArrayList<String> paras = new ArrayList<>();
        paras.add("LTMV");
        paras.add("en");
        paras.add("csv");
        IURL urlOpenData = new UrlOpenData(paras);

        // send request and get response body
        String responseBody = super.exec(urlOpenData);
        Assert.assertTrue(responseBody.contains("Date time") && responseBody.contains("Automatic Weather Station"), "Check the title");

    }

    @Test(testName = "Verify Nine Day Weather with json format")
    public void testOpenDataJson() throws Exception {

        // update the url
        ArrayList<String> paras = new ArrayList<>();
        paras.add("LTMV");
        paras.add("en");
        paras.add("json");
        IURL urlOpenData = new UrlOpenData(paras);

        // send request and get response body
        String responseBody = super.exec(urlOpenData);
        System.out.println(responseBody);

        // covert to object and do verification.
        OpenData openData = new Gson().fromJson(responseBody, OpenData.class);
        Assert.assertTrue(openData.getData().get(0).get(0).length()>0, "Check the Open data is not blank.");

    }
}
