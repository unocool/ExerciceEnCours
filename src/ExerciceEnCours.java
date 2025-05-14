import java.util.Arrays;
import java.util.Random;

public class ExerciceEnCours {

	public static void main(String[] args) {
		ListeDocuments biblio = new ListeDocuments();
		biblio.ajouterDoc(new Livre("LeSeigneurdesAnneaux", "tolkien", 1000));
		biblio.ajouterDoc(new Livre("Harrypotter", "rowlin", 1500));
		biblio.afficherdoc();
	}
}
