package crypto.data.url;

import java.util.ArrayList;

public class UrlOpenData implements IURL{

    private String url;

    public UrlOpenData(ArrayList<String> parameters){
        url = "https://data.weather.gov.hk/weatherAPI/opendata/opendata.php?dataType="+parameters.get(0)+"&lang="+parameters.get(1)+"&rformat="+parameters.get(2);
    }

    public String getUrl(){
        return url;
    }
}
