import java.util.ArrayList;

public class ListeDocuments {
	private ArrayList<Documents> docs;
	
	public ListeDocuments(){
		docs = new ArrayList<Documents>();
	}
	
	public void afficherdoc() {
		for (int i = 0 ; i < docs.size() ; i++) {
			System.out.println(docs.get(i)+" & "+docs.get(i).getNumenregistrement());
		}
	}
	
	public void afficherNumNom() {
		for (int i = 0 ; i < docs.size() ; i++) {
			if (docs.get(i) instanceof Livre) {
				System.out.println("Le numéro du document est "+docs.get(i).getNumenregistrement()+"et le nom de l'auteur est "
						+((Livre)docs.get(i)).getAuteur()+".");
			}
		}
	}
	
	public void ajouterDoc(Documents doc) {
		docs.add(doc);
	}
	
	public void afficherAuteur(String auteur) {
		System.out.println("L'auteur "+auteur+" possèdes les livres :");
		for (int i = 0 ;  i < docs.size() ; i++) {
			if (docs.get(i) instanceof Livre) {
				if(auteur.equals(((Livre) docs.get(i)).getAuteur())) {
					System.out.println(((Livre)docs.get(i)).getTitre());
				}
			}
		}
	}
	
	public void supprimerDoc(int numEnregistrement) {
		docs.removeIf(doc -> doc.getNumenregistrement() == numEnregistrement);
	}
}
