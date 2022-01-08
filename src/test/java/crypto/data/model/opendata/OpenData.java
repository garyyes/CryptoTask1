package crypto.data.model.opendata;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class OpenData{

	@SerializedName("data")
	public List<List<String>> data;
	@SerializedName("fields")
	private List<String> fields;

	public List<List<String>>  getData(){
		return data;
	}

	public List<String> getFields(){
		return fields;
	}
}