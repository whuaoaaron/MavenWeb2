package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Input;
import com.mkyong.Track;

@Path("/json/metallica")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman3333");
		track.setSinger("Metallica");
		List<String> songs = new ArrayList<String>();
		songs.add("song1");
		songs.add("song2");
		songs.add("song3");
		track.setSongs(songs);
		
		Input input = new Input();
		input.setType("csv");
		input.setCsvInstance(new ArrayList<String>());
		input.getCsvInstance().add("data1");
		input.getCsvInstance().add("data2");
		input.getCsvInstance().add("data3");
		input.getCsvInstance().add("data4");
		
		track.setInput(input);

		return track;
		
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}