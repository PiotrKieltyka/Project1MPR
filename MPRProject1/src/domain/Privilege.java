package domain;

import java.util.*;

public class Privilege {

	private String name;
	private List<Privilege> priveleges;
	private List<User> users;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Privilege> getPriveleges() {
		return priveleges;
	}
	public void setPriveleges(List<Privilege> priveleges) {
		this.priveleges = priveleges;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
