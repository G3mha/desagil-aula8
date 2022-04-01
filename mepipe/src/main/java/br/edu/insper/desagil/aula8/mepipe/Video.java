package br.edu.insper.desagil.aula8.mepipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Video {
	private String id;
	private String title;
	private List<String> likes;
	private List<String> dislikes;
	private Map<Integer, String> ads;

	public Video(String id, String title, Map<Integer, String> ads) {
		this.id = id;
		this.title = title;
		this.likes = new ArrayList<>();
		this.dislikes = new ArrayList<>();
		this.ads = ads;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public List<String> getLikes() {
		return likes;
	}

	public List<String> getDislikes() {
		return dislikes;
	}

	public int numberOfAds() {
		if (ads == null) {
			throw new RuntimeException("This method does not exist.");
		}
		return ads.size();
	}
}
