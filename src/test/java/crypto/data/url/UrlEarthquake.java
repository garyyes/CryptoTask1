package crypto.data.url;

import java.util.ArrayList;

public class UrlEarthquake implements IURL{

    private String url;

    public UrlEarthquake(ArrayList<String> parameters){
        url = "https://data.weather.gov.hk/weatherAPI/opendata/earthquake.php?dataType="+parameters.get(0)+"&lang="+parameters.get(1);
    }

    public String getUrl(){
        return url;
    }
}
