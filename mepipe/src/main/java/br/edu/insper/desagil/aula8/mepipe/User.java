package br.edu.insper.desagil.aula8.mepipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {
	private String username;
	private String name;
	private List<Video> videos;

	public User(String username, String name) {
		this.videos = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void addVideo(String id, String title, Map<Integer, String> ads) {
		videos.add(new Video(id, title, null));
	}

	public int totalOfLikes() {
		int s = 0;
		for (Video video : videos) {
			s += video.totalLikes();
		}
		return s;
	}

	public int totalOfDislikes() {
		int s = 0;
		for (Video video : videos) {
			s += video.totalDislikes();
		}
		return s;
	}

	public double percentageOfLikes() {
		return percentage(totalOfLikes(), totalOfDislikes());
	}

	public double percentageOfDislikes() {
		return percentage(totalOfDislikes(), totalOfLikes());
	}

	private double percentage(int a, int b) {
		return (double) a / (a + b);
	}
}
