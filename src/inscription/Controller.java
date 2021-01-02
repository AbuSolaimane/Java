package inscription;

public class Controller {
	private Personne personne;
	private Login login;
	private Logout logout;
	
	public Controller(Login login) {
		
		super();
		this.login = login;
	}

	public void returnToLogin() {
		
		login.setVisible(true);
		logout.dispose();
	}

	public void setPersonne(Personne personne2) {
		
		this.personne = personne2;
	}

	public void intialliseLogout() {
		
		logout = new Logout();
		logout.setPersonne(personne);
		logout.setController(this);
		logout.setVisible(true);
		login.dispose();
	}
	
	
	
}
