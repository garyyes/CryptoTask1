package crypto.data.model.local;

import com.google.gson.annotations.SerializedName;

public class LocalWeather{

	@SerializedName("tcInfo")
	private String tcInfo;

	@SerializedName("generalSituation")
	private String generalSituation;

	@SerializedName("forecastPeriod")
	private String forecastPeriod;

	@SerializedName("fireDangerWarning")
	private String fireDangerWarning;

	@SerializedName("forecastDesc")
	private String forecastDesc;

	@SerializedName("updateTime")
	private String updateTime;

	@SerializedName("outlook")
	private String outlook;

	public String getTcInfo(){
		return tcInfo;
	}

	public String getGeneralSituation(){
		return generalSituation;
	}

	public String getForecastPeriod(){
		return forecastPeriod;
	}

	public String getFireDangerWarning(){
		return fireDangerWarning;
	}

	public String getForecastDesc(){
		return forecastDesc;
	}

	public String getUpdateTime(){
		return updateTime;
	}

	public String getOutlook(){
		return outlook;
	}
}