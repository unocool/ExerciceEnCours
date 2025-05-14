
public class Documents {
private int numEnregistrement;
private String titre;
private static int identifiant = 0;

public Documents (String titre) {
	this.numEnregistrement = getIdentifiant();
	this.titre = titre;
	identifiant++;
}

public int getNumenregistrement() {
	return numEnregistrement;
}

public void setNumenregistrement(int numEnregistrement) {
	this.numEnregistrement = numEnregistrement;
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public static int getIdentifiant() {
	return identifiant;
}

}
