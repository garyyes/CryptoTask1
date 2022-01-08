package crypto.data.model.current_weather_report;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Temperature{

	@SerializedName("recordTime")
	private String recordTime;

	@SerializedName("data")
	private List<DataItem> data;

	public String getRecordTime(){
		return recordTime;
	}

	public List<DataItem> getData(){
		return data;
	}
}