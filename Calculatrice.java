import java.awt.*; // Graphique
import java.applet.*; // Applet
import java.awt.event.*;
import java.util.*;
import java.util.Scanner;

public class Calculatrice {

	int val_a, val_b;
	static boolean flag = true;
	static String choix = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (flag == true) {
			System.out.println("Bienvenue dans notre calculatrice !");
			System.out.println("1. Somme de deux entiers");
			System.out.println("2. Soustraction de deux entiers");
			System.out.println("3. Multiplication de deux entiers");
			System.out.println("4. Division de deux entiers");
			System.out.println("5. Sortie du programme");
			System.out.println("Saisissez le nombre entre 1 et 5 correspondant � l'action voulue :");

			String choix = sc.nextLine(); // le choix de l'op�rateur est la prochaine ligne 

			if (choix.equals("5")) { // si le choix est �gal a 5 on sort de l'application 
				System.out.println("Sortie de l'application");
				System.exit(0);
				flag = false;
				sc.close();
			} else { // sinon on demande les entiers pour l'op�ration
				flag = true;
				System.out.println(
						"Saisissez maintenant les deux entiers de l'op�ration � effectuer, s�par�s par une entr�e");

				String entier1 = sc.nextLine();
				String entier2 = sc.nextLine();

				int val_a = Integer.parseInt(entier1);
				int val_b = Integer.parseInt(entier2);
				String resultat = "";

				switch (choix) { // on r�alise l'op�ration avec les param�tres rentr�s
				case ("1"):
					resultat = "" + (val_a + val_b);
					System.out.println("" + val_a + "+" + val_b + "=" + resultat);
					break;
				case ("2"):
					resultat = "" + (val_a - val_b);
					System.out.println("" + val_a + "-" + val_b + "=" + resultat);
					break;
				case ("3"):
					resultat = "" + (val_a * val_b);
					System.out.println("" + val_a + "x" + val_b + "=" + resultat);
					break;
				case ("4"):
					if (val_b != 0) {
						resultat = "" + ((double) val_a / val_b);
						System.out.println("" + val_a + "/" + val_b + "=" + resultat);
					} else {
						resultat = "Division par 0 impossible";
						System.out.println("" + resultat);
					}
					break;

				default:
					break;
				}

			}
		}
		sc.close();

	}
}
