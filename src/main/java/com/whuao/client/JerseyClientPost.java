package com.whuao.client;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONObject;

import com.whuao.Input;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientPost {

	public static void main(String[] args) {

		try {

			Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:8080/WebMaven2/rest/json/metallica/post");
			
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("singer", "Metallica");
			jsonObj.put("title", "Fade To Black");
			List<String> songs = new ArrayList<String>();
			songs.add("song11");
			songs.add("song22");
			songs.add("song33");
			jsonObj.put("songs", songs);
			
			Input data = new Input();
			data.setType("csv");
			data.setCsvInstance(new ArrayList<String>());
			data.getCsvInstance().add("data1");
			data.getCsvInstance().add("data2");
			data.getCsvInstance().add("data3");
			data.getCsvInstance().add("data4");
			
			JSONObject jsonInput = new JSONObject();
			jsonInput.put("type", data.getType());
			jsonInput.put("csvInstance", data.getCsvInstance());
			
			jsonObj.put("input", jsonInput);

//			String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
			String input = jsonObj.toString();
			System.out.println("\njsonObj is: " + input + "\n");

			ClientResponse response = webResource.type("application/json")
					.post(ClientResponse.class, input);

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
//			Track output = response.getEntity(Track.class);
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
