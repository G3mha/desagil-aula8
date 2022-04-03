package br.edu.insper.desagil.aula8.mepipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Video {
	private String id;
	private String title;
	private Map<Integer, String> ads;
	private Reaction likes;
	private Reaction dislikes;

	public Video(String id, String title, Map<Integer, String> ads) {
		this.id = id;
		this.title = title;
		this.ads = ads;
		this.likes = new Reaction();
		this.dislikes = new Reaction();
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return this.id;
	}

	public int numberOfAds() {
		if (ads == null) {
			throw new RuntimeException("This method does not exist.");
		}
		return ads.size();
	}
}
