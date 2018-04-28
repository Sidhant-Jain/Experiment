package mindBasic;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONFile {

	public static void main(String[] args) {
		JSONObject jobj = new JSONObject();
		jobj.put("name", "Sidhant Jain");
		jobj.put("age", "26");
		
		JSONArray jarr = new JSONArray();
		jarr.add("msg 1");
		jarr.add("msg 2");
		
		jobj.put("msgs", jarr);
		
		try(FileWriter file = new FileWriter("D:\\system_testing\\JSON\\file.json")){
			file.write(jobj.toJSONString());
			file.flush();
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		System.out.println(jobj);
	}
}
