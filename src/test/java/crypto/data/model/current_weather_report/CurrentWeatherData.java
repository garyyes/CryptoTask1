package crypto.data.model.current_weather_report;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentWeatherData {

	@SerializedName("uvindex")
	private Uvindex uvindex;

	@SerializedName("rainfall")
	private Rainfall rainfall;

	@SerializedName("icon")
	private List<Integer> icon;

	@SerializedName("warningMessage")
	private String warningMessage;

	@SerializedName("updateTime")
	private String updateTime;

	@SerializedName("mintempFrom00To09")
	private String mintempFrom00To09;

	@SerializedName("rainfallJanuaryToLastMonth")
	private String rainfallJanuaryToLastMonth;

	@SerializedName("iconUpdateTime")
	private String iconUpdateTime;

	@SerializedName("temperature")
	private Temperature temperature;

	@SerializedName("rainfallFrom00To12")
	private String rainfallFrom00To12;

	@SerializedName("rainfallLastMonth")
	private String rainfallLastMonth;

	@SerializedName("tcmessage")
	private String tcmessage;

	@SerializedName("humidity")
	private Humidity humidity;

	public Uvindex getUvindex(){
		return uvindex;
	}

	public Rainfall getRainfall(){
		return rainfall;
	}

	public List<Integer> getIcon(){
		return icon;
	}

	public String getWarningMessage(){
		return warningMessage;
	}

	public String getUpdateTime(){
		return updateTime;
	}

	public String getMintempFrom00To09(){
		return mintempFrom00To09;
	}

	public String getRainfallJanuaryToLastMonth(){
		return rainfallJanuaryToLastMonth;
	}

	public String getIconUpdateTime(){
		return iconUpdateTime;
	}

	public Temperature getTemperature(){
		return temperature;
	}

	public String getRainfallFrom00To12(){
		return rainfallFrom00To12;
	}

	public String getRainfallLastMonth(){
		return rainfallLastMonth;
	}

	public String getTcmessage(){
		return tcmessage;
	}

	public Humidity getHumidity(){
		return humidity;
	}
}