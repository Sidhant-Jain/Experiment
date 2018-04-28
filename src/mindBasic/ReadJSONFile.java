package mindBasic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Iterator;
import java.io.FileReader;

public class ReadJSONFile {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		
		try{
			Object obj = parser.parse(new FileReader("D:\\system_testing\\JSON\\file.json"));
			
			JSONObject jobj = (JSONObject) obj;
			System.out.println(jobj);
			
			String name = (String) jobj.get("name");
			System.out.println(name);
			
			int age = Integer.parseInt((String)jobj.get("age"));
			System.out.println(age);
			
			JSONArray jarr = (JSONArray) jobj.get("msgs");
			Iterator<String> iterator = jarr.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
		}
		catch(IOException ioe){
			
		}
		catch(ParseException pe){
			
		}
		System.out.println();
	}

}
