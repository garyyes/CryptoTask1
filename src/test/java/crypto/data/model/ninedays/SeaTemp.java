package crypto.data.model.ninedays;

import com.google.gson.annotations.SerializedName;

public class SeaTemp{

	@SerializedName("unit")
	private String unit;

	@SerializedName("recordTime")
	private String recordTime;

	@SerializedName("place")
	private String place;

	@SerializedName("value")
	private int value;

	public String getUnit(){
		return unit;
	}

	public String getRecordTime(){
		return recordTime;
	}

	public String getPlace(){
		return place;
	}

	public int getValue(){
		return value;
	}
}