import java.io.*;

public class NBOcc {

	public static void main(String[] args) throws IOException {

		File file = new File("toto.txt"); // Le fichier d'entrée
		String[] mots = null; // Initialiser le tableau de mot

		FileReader fr = new FileReader(file); // Créer l'objet File Reader

		BufferedReader br = new BufferedReader(fr); // Créer l'objet BufferedReader

		String str;

		String search = "il"; // Mot à rechercher

		int compteur = 0; // Initialise le compteur de mots à zéro

		while ((str = br.readLine()) != null) { // Lire le contenu du fichier

			mots = str.split(" "); // Divisez le mot en utilisant l'espace

			for (String word : mots) { // Chercher le mot

				if (word.equals(search)) { // Si présent, incrémenter le nombre

					compteur++;
				}
			}
		}
		System.out.println("Java NBOcc " + file + " " + search);
		if (compteur != 0) {
			System.out.println("Le mot " + search + " est présent " + compteur + " fois dans le fichier " + file);
		} else {
			System.out.println("Le mot ne se trouve pas dans le fichier!");
		}
		fr.close();
	}
}