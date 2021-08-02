package com.example.demo.dto;

import java.util.List;



public class NotificationDTO {
	
	public String heading;
    public String conteudo;
    public String stackKey;
    public String sceneKey;
    public String onBackSceneKey;
	private List<PlayerDTO> players;
	private Long featureId;


	public String getHeading() {
		return heading;
	}


	public void setHeading(String heading) {
		this.heading = heading;
	}


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	public String getStackKey() {
		return stackKey;
	}


	public void setStackKey(String stackKey) {
		this.stackKey = stackKey;
	}


	public String getSceneKey() {
		return sceneKey;
	}


	public void setSceneKey(String sceneKey) {
		this.sceneKey = sceneKey;
	}


	public String getOnBackSceneKey() {
		return onBackSceneKey;
	}


	public void setOnBackSceneKey(String onBackSceneKey) {
		this.onBackSceneKey = onBackSceneKey;
	}


	public List<PlayerDTO> getPlayers() {
		return players;
	}


	public void setPlayers(List<PlayerDTO> players) {
		this.players = players;
	}


	public Long getFeatureId() {
		return featureId;
	}


	public void setFeatureId(Long featureId) {
		this.featureId = featureId;
	}
	

}
