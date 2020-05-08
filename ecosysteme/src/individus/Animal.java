package individus;

import affichage.ConteneurFenetre;

public class Animal {

	public String espece;
	public int type;
	public int posx;
	public int posy;
	public String sexe;
	int age;
	public int esp_de_vie;
	public boolean est_vivant;
	int jauge_nourriture;
	int jauge_eau;
	public  int qte_viande;
	public int ageReproMin;
	public int ageReproMax;
	
	public Animal(String espece, int type, int posx,int posy, String sexe, int age, int esp_de_vie,int jauge_nourriture,int jauge_eau,int qte_viande, int ageReproMin, int ageReproMax) {
		this.espece = espece;
		this.type = type;
		this.posx = posx;
		this.posy=posy;
		this.sexe = sexe;
		this.age = age;
		this.esp_de_vie = esp_de_vie;
		this.est_vivant=true;
		this.jauge_nourriture=jauge_nourriture;
		this.jauge_eau=jauge_eau;
		this.qte_viande=qte_viande;
		this.ageReproMin = ageReproMin;
		this.ageReproMax = ageReproMax;
	}
	
	public String toString() {
		String type = "";
		if (this.type==0) {
			type="Herbivore";
		}
		if (this.type==1) {
			type="Carnivore";
		}
		if (this.type==2) {
			type="Charognard";
		}
		String text ="Type : "+type+"\n";
		text+="Espece : "+this.espece+"\n";
		text+="Sexe : "+this.sexe+"\n";
		text+="Age : "+this.age + " ans"+"\n";
		text+="Position : ("+this.posx+","+this.posy+")";
		return text;
	}
	
	
	public static Animal[] creation(int nb_lievre,int nb_lynx, int nb_vautour) {
		int n = nb_lievre+nb_lynx+nb_vautour;
		String sexeanimal;
		Animal[] individus= new Animal[n];
		for (int k=0;k<n;k++) {
			if (k<nb_lievre) {
				int posx = (int)(Math.random()*ConteneurFenetre.NB_LIGNES);
				int posy = (int)(Math.random()*ConteneurFenetre.NB_COLONNES);
				if (k%2==0) {
					sexeanimal = "M";
				}
				else {
					sexeanimal = "F";
				}
				individus[k]=new Lievre(posx, posy, sexeanimal, 0);
			}
			else if (k<nb_lievre+nb_lynx) {
				int posx = (int)(Math.random()*ConteneurFenetre.NB_LIGNES);
				int posy = (int)(Math.random()*ConteneurFenetre.NB_COLONNES);
				if (k%2==0) {
					sexeanimal = "M";
				}
				else {
					sexeanimal = "F";
				}
				individus[k]=new Lynx(posx, posy, sexeanimal, 0);
			}
			else {
				int posx = (int)(Math.random()*ConteneurFenetre.NB_LIGNES);
				int posy = (int)(Math.random()*ConteneurFenetre.NB_COLONNES);
				if (k%2==0) {
					sexeanimal = "M";
				}
				else {
					sexeanimal = "F";
				}
				individus[k]=new Vautour(posx, posy, sexeanimal, 0);
			}
		}
		return individus;
	}
	
	
	public void vieillir() {
		this.age+=1;
	}
	

	
	public boolean mort_de_vieillesse() {
		if (this.age>=this.esp_de_vie) {// on devrait rajouter une condition de probabilité genre on tire au hasard un chifffre s'il est sup à 0,5 alors true else false
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean reproduction(Animal A) {
		if (this.espece==A.espece) {
			if (this.sexe== A.sexe) {
					return false;
			}
				
			else {
				if (this.age>this.ageReproMin && this.age<this.ageReproMax && A.age>A.ageReproMin && A.age<A.ageReproMax) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		else {
			return false;
		}
		
	}
	
	public void deplacementAleatoire(Animal[] A_list,int pos,int maxX,int maxY) {
		boolean est_libre=false;
		//while (est_libre==false) {
			this.posx = (int)(Math.random()*maxX);
			this.posy = (int)(Math.random()*maxY);
			//est_libre=position_libre(A_list,pos,this.posx,this.posy);
		//}
	}
	
	

	public void manger() {
		
		if (this.est_vivant==true) {
		this.jauge_nourriture+=1;}
	}
	
	
	
	public void boire() {
		if (this.est_vivant==true) {
		this.jauge_eau+=1;}
	}
	
	public void se_faire_manger() {
		
		this.qte_viande+=(-1);
		
	}
	
	public boolean position_libre (Animal[] A,int pos, int posx, int posy) {
		if (pos==0) {
			return true;
		}
		for (int k=0;k<pos;k++) {
			if (A[k].posx==posx && A[k].posy==posy) {
				return false;
			}
		}
		return true;
	}
	
}
