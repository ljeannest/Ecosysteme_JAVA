package individus;

public class Animal {

	public String espece;
	int type;
	public int posx;
	public int posy;
	String sexe;
	int age;
	int esp_de_vie;
	public boolean est_vivant;
	int jauge_nourriture;
	int jauge_eau;
	int qte_viande;
	
	public Animal(String espece, int type, int posx,int posy, String sexe, int age, int esp_de_vie,int jauge_nourriture,int jauge_eau,int qte_viande) {
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
			if (this.sexe=="M") {
				if (A.sexe=="F") {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				if (A.sexe=="M") {
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
	
	public void deplacementaleatoire(Animal[] A_list,int pos,int maxX,int maxY) {
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
