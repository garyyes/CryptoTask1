package crypto.data.model.ninedays;

import com.google.gson.annotations.SerializedName;

public class Depth{

	@SerializedName("unit")
	private String unit;

	@SerializedName("value")
	private double value;

	public String getUnit(){
		return unit;
	}

	public double getValue(){
		return value;
	}
}