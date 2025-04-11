import java.util.Arrays;

public class ExerciceEnCours {

	public static void main(String[] args) {
		sortNegativePositiveArray();
	}

	private static void sortNegativePositiveArray() {
		int tailleTableauPositifNul = 0, tailleTableauNegatif = 0;
		double[] tableau = {1.2, 5.6, 0, -2};
		for(int i = 0; i < tableau.length ; i++) {
			if (tableau[i] < 0) {
				tailleTableauNegatif++;
			}
			else {
				tailleTableauPositifNul++;
			}
		}
		double[] tableau1 = new double[tailleTableauNegatif];
		double[] tableau2 = new double[tailleTableauPositifNul];
		int compteur1 = 0, compteur2 = 0;
		for(int i = 0; i < tableau.length ; i++) {
			if (tableau[i] < 0) {
				tableau1[compteur1] = tableau[i];
				compteur1++;
			}
			else {
				tableau2[compteur2] = tableau[i];
				compteur2++;
			}
		}
		System.out.println(tailleTableauNegatif+" "+Arrays.toString(tableau1)+" "
				+tailleTableauPositifNul+" "+Arrays.toString(tableau2));
	}
	

}
