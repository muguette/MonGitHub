package main;

public class Kperson  {

	int salaire=0;
	
	public Kperson(String nom, String prenom,int salaire) {

		this.salaire = salaire;
	}
			public int getSalaire() {
				return salaire;
			}
			public void setSalaire(int salaire) {
				this.salaire = salaire;
			}
			@Override
			public String toString() {
				return super.toString()+" salaire = "+salaire;
			}
			
	}


