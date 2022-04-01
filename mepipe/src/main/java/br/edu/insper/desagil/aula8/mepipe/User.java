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

	public void addVideo(String id, String title) {
		videos.add(new Video(id, title, null));
	}

	public void addMonetizedVideo(String id, String title, Map<Integer, String> ads) {
		videos.add(new Video(id, title, ads));
	}

	public int totalOfLikes() {
		int s = 0;
		for (Video video : videos) {
			s += video.getLikes().size();
		}
		return s;
	}

	public int totalOfDislikes() {
		int s = 0;
		for (Video video : videos) {
			s += video.getDislikes().size();
		}
		return s;
	}

	public double percentageOfLikes() {
		int l = 0;
		for (Video video : videos) {
			l += video.getLikes().size();
		}

		int d = 0;
		for (Video video : videos) {
			d += video.getDislikes().size();
		}

		return (double) l / (l + d);
	}

	public double percentageOfDislikes() {
		int l = 0;
		for (Video video : videos) {
			l += video.getLikes().size();
		}

		int d = 0;
		for (Video video : videos) {
			d += video.getDislikes().size();
		}

		return (double) d / (l + d);
	}
}
