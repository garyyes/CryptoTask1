package crypto.data.model.ninedays;

import com.google.gson.annotations.SerializedName;

public class WeatherForecastItem{

	@SerializedName("forecastMaxrh")
	private ForecastMaxrh forecastMaxrh;

	@SerializedName("ForecastIcon")
	private int forecastIcon;

	@SerializedName("week")
	private String week;

	@SerializedName("forecastMaxtemp")
	private ForecastMaxtemp forecastMaxtemp;

	@SerializedName("forecastMintemp")
	private ForecastMintemp forecastMintemp;

	@SerializedName("forecastWind")
	private String forecastWind;

	@SerializedName("forecastWeather")
	private String forecastWeather;

	@SerializedName("PSR")
	private String pSR;

	@SerializedName("forecastDate")
	private String forecastDate;

	@SerializedName("forecastMinrh")
	private ForecastMinrh forecastMinrh;

	public ForecastMaxrh getForecastMaxrh(){
		return forecastMaxrh;
	}

	public int getForecastIcon(){
		return forecastIcon;
	}

	public String getWeek(){
		return week;
	}

	public ForecastMaxtemp getForecastMaxtemp(){
		return forecastMaxtemp;
	}

	public ForecastMintemp getForecastMintemp(){
		return forecastMintemp;
	}

	public String getForecastWind(){
		return forecastWind;
	}

	public String getForecastWeather(){
		return forecastWeather;
	}

	public String getPSR(){
		return pSR;
	}

	public String getForecastDate(){
		return forecastDate;
	}

	public ForecastMinrh getForecastMinrh(){
		return forecastMinrh;
	}
}