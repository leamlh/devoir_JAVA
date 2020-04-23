import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

// je n'ai pas réussi à faire cet exercice, en effet, je n'arrive pas à caster les coordonnées contenues dans le arraylist
// de plus, la méthode repaint() me fait une erreur lorsque je l'écris 

public class Trajectoire extends Applet {

	public static String message;
	public String messageAfficher = "";
	private final BufferedReader buff;
	//static ArrayList coordonnees = new ArrayList();
	static ArrayList <Integer> coordonnees = new ArrayList <Integer>();

	static int x1, y1, x2, y2;

	public void init() {
		setSize(400, 400);
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawLine(x1, y1, x2, x2);
	}

	public static void main(String[] args) throws IOException {
		Trajectoire trajectoire = new Trajectoire();
		String laLigne;
		while ((laLigne = trajectoire.readLine()) != null) {
			// System.out.println(laLigne);

			StringTokenizer st = new StringTokenizer(laLigne, ":");

			// iterate st object to get more tokens from it
			while (st.hasMoreElements()) {
				String token = st.nextElement().toString();
				System.out.println(token);
				int token_entier = Integer.parseInt(token);
				coordonnees.add(token_entier);
			}
		}
		
		System.out.println(coordonnees);
		for (int i = 0; i < coordonnees.size(); i++) {
			x1=(int) coordonnees.get(i); 
			y1=(int) coordonnees.get(i+1);
			x2=(int) coordonnees.get(i+2);
			y2=(int) coordonnees.get(i+3);
			
		}
		trajectoire.close();
	}

	public Trajectoire() throws FileNotFoundException {
		InputStream flux = new FileInputStream("positions.txt");
		InputStreamReader lecture = new InputStreamReader(flux);
		buff = new BufferedReader(lecture);
	}

	public String readLine() throws IOException {
		return buff.readLine();
	}

	public void close() throws IOException {
		buff.close();
	}

}