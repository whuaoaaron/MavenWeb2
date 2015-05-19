package com.mkyong;

import java.util.ArrayList;
import java.util.List;

public class Track {
	String title;
	String singer;

	List<String> songs;

	Input input;

	List<Input> dataList;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public List<String> getSongs() {
		return songs;
	}

	public void setSongs(List<String> songs) {
		this.songs = songs;
	}

	public Input getInput() {
		return input;
	}

	public void setInput(Input input) {
		this.input = input;
	}

	public List<Input> getDataList() {
		return dataList;
	}

	public void setDataList(List<Input> dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return "Track [title=" + title + ", singer=" + singer + ", songs="
				+ songs + "]";
	}

}
