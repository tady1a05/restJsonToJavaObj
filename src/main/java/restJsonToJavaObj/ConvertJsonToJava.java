package restJsonToJavaObj;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ConvertJsonToJava {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		
		HeroLeague heroleague = mapper.readValue(new File("data/data.json"), HeroLeague.class);
		
		System.out.print(heroleague);
		
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.writeValue(new File("data/output.json"), heroleague);
	}

}
