package crypto.data.model.current_weather_report;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Uvindex{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("recordDesc")
	private String recordDesc;

	public List<DataItem> getData(){
		return data;
	}

	public String getRecordDesc(){
		return recordDesc;
	}
}