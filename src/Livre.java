
public class Livre extends Documents {
private String auteur;
private int nbPage;

public Livre(String titre, String auteur, int nbPage) {
	super(titre);
	this.auteur = auteur;
	this.nbPage = nbPage;
}

public String getAuteur() {
	return auteur;
}

public void setAuteur(String auteur) {
	this.auteur = auteur;
}

public int getNbpage() {
	return nbPage;
}

public void setAuteur(int nbPage) {
	this.nbPage = nbPage;
}

}
