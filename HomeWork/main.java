public class main {
	public static void main(String[] args){
		User user = new User("Bob");
		Persister ps = new Persister(user);
		ps.report();
		ps.save();
	}
}