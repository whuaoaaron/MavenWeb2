package com.mkyong;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonConverter {
	
	public static void main(String[] args) {
		Track track = new Track();
		track.setSinger("Mariah");
		track.setTitle("Infinity");
		track.setSongs(new ArrayList<String>());
		track.getSongs().add("song1");
		track.getSongs().add("song2");
		track.getSongs().add("song3");
		
		Input input1 = new Input();
		input1.setType("csv");
		input1.setCsvInstance(new ArrayList<String>());
		input1.getCsvInstance().add("data1");
		input1.getCsvInstance().add("data2");
		input1.getCsvInstance().add("data3");
		input1.getCsvInstance().add("data4");
		
		Input input2 = new Input();
		input2.setType("txt");
		input2.setCsvInstance(new ArrayList<String>());
		input2.getCsvInstance().add("data11");
		input2.getCsvInstance().add("data22");
		input2.getCsvInstance().add("data33");
		input2.getCsvInstance().add("data44");
		
//		track.setInput(input1);
		
		track.setDataList(new ArrayList<Input>());
		track.getDataList().add(input1);
		track.getDataList().add(input2);
		
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(track);
			System.out.println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
