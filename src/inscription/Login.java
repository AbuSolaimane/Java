package inscription;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {

	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JLabel ageLabel;

	private JTextField nom;
	private JTextField prenom;
	private JTextField age;

	private JButton login;
	
	private Controller controller;

	public Login() throws HeadlessException {

		super("Login");
		this.intialliser();
		this.dessiner();
		this.actions();
	}

	private void intialliser() {

		nomLabel = new JLabel("Nom : ");
		prenomLabel = new JLabel("Prenom : ");
		ageLabel = new JLabel("Age : ");

		nom = new JTextField();
		prenom = new JTextField();
		age = new JTextField();

		login = new JButton("Login");
		
		controller = new Controller(this);

	}

	private void dessiner() {

		this.setLayout(new GridLayout(4, 2));
		this.setSize(600, 600);
		
		this.add(nomLabel);
		this.add(nom);
		this.add(prenomLabel);
		this.add(prenom);
		this.add(ageLabel);
		this.add(age);
		this.add(login);

	}

	private void actions() {
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Personne m = getPersonne();
				controller.setPersonne(m);
				controller.intialliseLogout();
			}
		});
	}
	
	public Personne getPersonne() {
		String nom1 = nom.getText();
		String prenom1 = prenom.getText();
		int age1 = Integer.parseInt(age.getText());
		Personne m = new Personne(nom1, prenom1, age1);
		
		return m;
	}

}
