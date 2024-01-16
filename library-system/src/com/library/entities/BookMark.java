package com.library.entities;

public  abstract class BookMark {
	private long id;
	private String title;
	private String profileUrl;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProfileUrl() {
		return profileUrl;
	}
	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}
	@Override
	public String toString() {
		return "BookMark [id=" + id + ", title=" + title + ", profileUrl=" + profileUrl + "]";
	}
	public abstract boolean isKidsFriendlyEligible();
	}
