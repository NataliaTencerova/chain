package Chain;

public class User {
	private String name;
	private String surname;
	private String userName;
	public static final int MAX_SURNAME_LENGTH = 9;
	
	public User(String nameAndSurname) {
		nameAndSurname = nameAndSurname.trim();
		String[] division = nameAndSurname.split(" ");
		name = division [0];
		surname = division[1].toUpperCase();
		createUserName();
	}
	
	public void createUserName() {
		String surnameParts = surname;
		if(surname.length() > MAX_SURNAME_LENGTH) {
			surnameParts = surname.substring(0, MAX_SURNAME_LENGTH);
		}
		userName = name.charAt(0) + surnameParts;
		userName = userName.toLowerCase();
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getUserName() {
		return userName;
	}
	
	public String toString() {
		return ""+name+" "+surname+" - "+userName; 
	}
}