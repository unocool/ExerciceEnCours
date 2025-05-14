public class Compte {
	
		private int solde;
		private String titulaire;
		
		public Compte() {
			this.titulaire = "bonbon";
		}
		
		public Compte(String titulaire) {
			this.titulaire = titulaire;
		}

			public void depot(int montant)
				{
				solde = solde + montant;
				}
			public void retrait(int montant)
				{
				solde = solde - montant;
				}
			public void virement(int montant, Compte autre)
				{
				autre.retrait(montant);
				this.depot(montant);
				}
			public void afficher()
				{
				System.out.println("le nouveau solde de "+titulaire+" est de: " + solde);
				}
			public int getSolde() {
				return solde;
			}
			public void setSolde(int solde) {
				this.solde = solde;
			}
			public String getTitulaire() {
				return titulaire;
			}
			public void setTitulaire(String titulaire) {
				this.titulaire = titulaire;
			}
			public void gererDepenses() {
				if (solde > 3000) {
					System.out.println("Vous pouvez dépenser votre argent");
				}
				else if (solde <= 700) {
					System.out.println("Vous ne pouvez pas faire des dépenses");
				}
				else {
					System.out.println("Attention, vos dépenses doivent être réfléchies");
				}
			}
}
