package com.services.examples.model;

public class User {

	private Long id;
	private String name;
	private Integer room;
	private String vkId;

	public User() {}

	public User(String string, Long anInt) {
		this.name = string;
		this.id = anInt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public String getVkId() {
		return vkId;
	}

	public void setVkId(String vkId) {
		this.vkId = vkId;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", id=" + id +
				'}';
	}

}