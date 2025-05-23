package com.NextGen.players;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Player 
{
	@Id
	@Column(name="id")
	int playerId;
	@Column(name="name")
	String playerName;
	@Column
	int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Player(int i, String string,int age) {
		// TODO Auto-generated constructor stub
	}
	
	public Player()
	{
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
}
