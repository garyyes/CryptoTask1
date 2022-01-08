package crypto.data.model.current_weather_report;

import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("place")
	private String place;

	@SerializedName("value")
	private double value;

	@SerializedName("desc")
	private String desc;

	@SerializedName("unit")
	private String unit;

	@SerializedName("max")
	private double max;

	@SerializedName("min")
	private double min;

	@SerializedName("main")
	private String main;

	public String getPlace(){
		return place;
	}

	public double getValue(){
		return value;
	}

	public String getDesc(){
		return desc;
	}

	public String getUnit(){
		return unit;
	}

	public double getMax(){
		return max;
	}

	public double getMin(){
		return min;
	}

	public String getMain(){
		return main;
	}
}