package crypto.data.model.current_weather_report;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Rainfall{

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("startTime")
	private String startTime;

	@SerializedName("endTime")
	private String endTime;

	public List<DataItem> getData(){
		return data;
	}

	public String getStartTime(){
		return startTime;
	}

	public String getEndTime(){
		return endTime;
	}
}