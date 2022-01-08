package crypto.data.model.earthquake;

import com.google.gson.annotations.SerializedName;

public class EarthquakeData{

	@SerializedName("mag")
	private double mag;

	@SerializedName("lon")
	private double lon;

	@SerializedName("updateTime")
	private String updateTime;

	@SerializedName("region")
	private String region;

	@SerializedName("ptime")
	private String ptime;

	@SerializedName("lat")
	private double lat;

	public double getMag(){
		return mag;
	}

	public double getLon(){
		return lon;
	}

	public String getUpdateTime(){
		return updateTime;
	}

	public String getRegion(){
		return region;
	}

	public String getPtime(){
		return ptime;
	}

	public double getLat(){
		return lat;
	}
}