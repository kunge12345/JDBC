package edu.neu.cs5200.JDBC.entity;

public class Cast {
	private int id;
	private String characterName;
	private int actorId;
	private int movieId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public Cast(int id, String characterName, int actorId, int movieId) {
		this.id = id;
		this.characterName = characterName;
		this.actorId = actorId;
		this.movieId = movieId;
	}
	public Cast() {
	}
	

}
