package crypto.data.model.ninedays;

import com.google.gson.annotations.SerializedName;

public class ForecastMintemp{

	@SerializedName("unit")
	private String unit;

	@SerializedName("value")
	private int value;

	public String getUnit(){
		return unit;
	}

	public int getValue(){
		return value;
	}
}