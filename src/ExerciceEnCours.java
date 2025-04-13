import java.util.Arrays;
import java.util.Random;

public class ExerciceEnCours {

	public static void main(String[] args) {
		Erastothene(50);
	}
	
	public static void Erastothene(int n) {
		final int racinneN = (int)Math.sqrt(n);
		int nb = 1; 
		int[][] tab = new int[racinneN][racinneN];
		for(int i = 0 ; i < racinneN ; i++) {
			for(int j = 0 ; j < racinneN ; j++) {
				tab[i][j] = nb;
				nb++;
			}
		}
		for
	}
}
