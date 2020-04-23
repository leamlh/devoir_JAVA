
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class setPassword extends Applet implements ActionListener{

TextField nom, mdp, nv_mdp, confirm_mdp; 
Button modification; 
Label noms, mdps, nv_mdps, confirm_mdps; 
	
	public void init() {
		
		setSize(400, 200);
		setLayout(new GridLayout(5, 4));
		
		noms = new Label("Nom:"); 
		add(noms);
		nom = new TextField(10);
		add(nom);
		nom.addActionListener(this);
		mdps = new Label("Mot de passe:"); 
		add(mdps);
		mdp = new TextField(10);
		add(mdp);
		mdp.addActionListener(this);
		nv_mdps = new Label("Nouveau mot de passe:"); 
		add(nv_mdps);
		nv_mdp = new TextField(10);
		add(nv_mdp);
		nv_mdp.addActionListener(this);
		confirm_mdps = new Label("Retapez le mot de passe:"); 
		add(confirm_mdps);
		confirm_mdp = new TextField(10);
		add(confirm_mdp);
		confirm_mdp.addActionListener(this);
		modification = new Button("Lancer la modification"); 
		add(modification); 
		modification.addActionListener(this);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		// Ici on testera les différentes actions qui seront réalisées
		
	}

}

