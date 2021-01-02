package inscription;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Logout extends JFrame {

	private JLabel nomLabel;
	private JLabel prenomLabel;
	private JLabel ageLabel;

	private JLabel nom;
	private JLabel prenom;
	private JLabel age;

	private JButton retour;

	private Controller controller;

	public Logout() {

		super("Login");
		this.intialliser();
		this.dessiner();
		this.actions();

	}

	private void intialliser() {

		this.setLayout(new GridLayout(4, 2));
		this.setSize(600, 600);

		nomLabel = new JLabel("Nom : ");
		prenomLabel = new JLabel("Prenom : ");
		ageLabel = new JLabel("Age : ");

		nom = new JLabel();
		prenom = new JLabel();
		age = new JLabel();

		retour = new JButton("Retour");
	}

	private void dessiner() {

		this.add(nomLabel);
		this.add(nom);
		this.add(prenomLabel);
		this.add(prenom);
		this.add(ageLabel);
		this.add(age);
		this.add(retour);
	}

	private void actions() {

		retour.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				controller.returnToLogin();
			}
		});
	}

	public void setController(Controller controller2) {

		this.controller = controller2;
	}

	public void setPersonne(Personne personne) {

		nom.setText(personne.getNom());
		prenom.setText(personne.getPrenom());
		age.setText(String.valueOf(personne.getAge()));

	}

}
