package Chain;

public class login {
	private User[] user;
	
	public void loadUsers(String[] namesAndSurnames) {
		user = new User[namesAndSurnames.length];
		
		for(int i = 0; i < namesAndSurnames.length; i++) {
			user[i] = new User(namesAndSurnames[i]);
		}
	}
	
	public void writeUsers() {
		System.out.println("Users in system: ");
		
		for(User u: user) {
			System.out.println(u);
		}
	}
	public static void main(String[] args) {
		login u = new login();
		u.loadUsers(args);
		u.writeUsers();
		String s1 = "Hi";
		System.out.println(s1.equals("hi"));
	}

}