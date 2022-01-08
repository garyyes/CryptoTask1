package crypto.data.model.ninedays;

import com.google.gson.annotations.SerializedName;

public class SoilTempItem{

	@SerializedName("unit")
	private String unit;

	@SerializedName("recordTime")
	private String recordTime;

	@SerializedName("depth")
	private Depth depth;

	@SerializedName("place")
	private String place;

	@SerializedName("value")
	private double value;

	public String getUnit(){
		return unit;
	}

	public String getRecordTime(){
		return recordTime;
	}

	public Depth getDepth(){
		return depth;
	}

	public String getPlace(){
		return place;
	}

	public double getValue(){
		return value;
	}
}