package crypto.data.model.ninedays;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class NineDayData{

	@SerializedName("soilTemp")
	private List<SoilTempItem> soilTemp;

	@SerializedName("weatherForecast")
	private List<WeatherForecastItem> weatherForecast;

	@SerializedName("generalSituation")
	private String generalSituation;

	@SerializedName("seaTemp")
	private SeaTemp seaTemp;

	@SerializedName("updateTime")
	private String updateTime;

	public List<SoilTempItem> getSoilTemp(){
		return soilTemp;
	}

	public List<WeatherForecastItem> getWeatherForecast(){
		return weatherForecast;
	}

	public String getGeneralSituation(){
		return generalSituation;
	}

	public SeaTemp getSeaTemp(){
		return seaTemp;
	}

	public String getUpdateTime(){
		return updateTime;
	}
}