package crypto.data.url;

import java.util.ArrayList;

public class UrlWeather implements IURL{

    private String url;

    public UrlWeather(ArrayList<String> parameters){
        url = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php?dataType="+parameters.get(0)+"&lang="+parameters.get(1);
    }

    public String getUrl(){
        return url;
    }
}
