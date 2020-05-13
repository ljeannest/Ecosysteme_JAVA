package individus;

import affichage.ConteneurFenetre;
import ressources.Ressource;
/**
 * <b>Individu vivant de type Animal pouvant se déplacer manger boire et se reporoduire.</b>
 * <p>
 * Un animal est caraxtérisé par les infos suivantes:
 * <ul>
 * <li> Son espece attribué de façon définitive.</li>
 * <li> Son régime alimentaire attribué sous formede chiffre de façon définitive et renvoie à la classe correspondante.</li>
 * <li> Sa position en x qui evoulue.</li>
 * <li> Sa position en y qui evolue.</li>
 * <li> Le genre de l'animal attribué définitivement.</li>
 * <li> Son age qui évolue prend plus un tous les ans. commence à zero pour les nouveau né et à l'age de repro min pour les individus au début de simulation</li>
 * <li> L'espérence de vie est non modifiable et dépend de l'espéce attribué.</li>
 * <li> Est_vivant indique l'état de vie de l'animal par un boolean toujours true à la création.</li>
 * <li>La jauge de nourriture indique la niveau de daim de l'individu. elle diminue selon le temps et augmente selon ce qui a été mangé. Chaque individue a une jauge max soit de 100/100 à sa création.Quand la jauge tombe à zero l'individu meurt.</li>
 * <li>La jauge d'eau indique le niveau de soif de l'individu. il diminue avec le temps et augmente quand l'individu boit. Chaque individu a une jauge de 100/100 à sa création. quand la jauge tombe à zero l'individu meurt.</li>
 * <li> La qautntie d'individu est un nombre qui ne bouge pas et est donnné en fonction du type.</li>
 * <li> un nombre est fixé selon l'espéce pour l'age à partir du quel l'animal peut se reproduire.</li>
 * <li> Un nombre est fixé selon l'espéce à partir du quel la reproduction de l'animal est impossible.</li>
 * </ul>
 * 
 * @author Lucie 
 * @version 2.0
 * 
 */
public class Animal {

	/**
	 * L'espece de l'aniamal. n'est pas modifiable.
	 * 
	 */
	public String espece;

	/**
	 * Le type de l'animal à savoir son régime alimentaire. n'est pas modifiable
	 * 
	 */
	public int type;

	/**
	 * Positon de l'animal en x modifiable.
	 * 
	 * @see Animal#position_libre(Animal[], int, int, int)
	 * @see Animal#deplacement()
	 */
	public int posx;

	/**
	 * Positon de l'animal en y modifiable.
	 * 
	 * @see Animal#position_libre(Animal[], int, int, int)
	 * @see Animal#deplacement()
	 */
	public int posy;

	/**
	 * Sexe de l'animal non modifiable.
	 * 
	 * @see Animal#reproduction(Animal)
	 * @see Animal#creation(int, int, int)
	 */
	public String sexe;

	/**
	 * Age de l'animal modifiable.
	 * 
	 * @see Animal#vieillir()
	 */
	int age;

	/**
	 * Espérance de vie de l'animal non modifiable.
	 * 
	 * @see Animal#mort_de_vieillesse()
	 */
	public int esp_de_vie;

	/**
	 * boolean sur l'etat de vie de l'animal pouvant être modifié.
	 * @see Animal#se_faire_manger()
	 * @see Animal#vieillir()
	 * @see Animal#reproduction(Animal)
	 * @see Animal#mort_de_vieillesse()
	 * @see Animal#manger()
	 * @see Animal#boire()
	 */
	public boolean est_vivant;

	/**
	 * Etat de faim de l'animal. Modifiable.
	 * 
	 * @see Animal#manger()
	 * @see Animal#mort_de_faim()// a créé
	 */
	int jauge_nourriture;

	/**
	 * Etat de soif de l'animal. Modifiable.
	 * 
	 * @see Animal#boire()
	 * @see Animal#mort_de_soif()
	 */
	int jauge_eau;

	/**
	 * represente la quantité de nourriture pour un autre animal. Non modifiable.
	 * @see Animal#se_faire_manger()
	 */
	public  int qte_viande;

	/**
	 * représente l'age min de reproduction. Non modifiable.
	 * 
	 * @see Animal#reproduction(Animal)
	 */
	public int ageReproMin;

	/**
	 *  représente l'age max de reproduction. Non modifiable.
	 *  
	 *  @see Animal#reproduction(Animal)
	 */
	public int ageReproMax;

	/**
	 * Constructeur Animal
	 * <p>
	 * A la cosntruction l'animal est vivant donc le paramétre est_vivant est fixé à true.
	 * </p>
	 * 
	 * 
	 * @param espece
	 * 	      Espece de l'animal.
	 * @param type
	 *        Regime alimentaire.
	 * @param posx
	 *        Position en X.
	 * @param posy
	 *        Position en Y.
	 * @param sexe
	 *        Genre de l'animal.
	 * @param age
	 *        Age de l'animal
	 * @param esp_de_vie
	 *        Temps de vie max de l'animal.
	 * @param jauge_nourriture
	 *        Etat de faim de l'animal.
	 * @param jauge_eau
	 *        Etat de soif de l'animal.
	 * @param qte_viande
	 *        Quantité de nourriture pour un autre animal de cet animal.
	 * @param ageReproMin
	 *        Age minimal pour la reproduction.
	 * @param ageReproMax
	 *        Age maximal pour la reproduction.
	 *        
	 *
	 */

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

	/**
	 * 
	 */

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


	/**
	 * Permet de génerer le nombre d'animaux nécessaire à la simulation.
	 * 
	 * @param nb_lievre
	 *         Nombre de lievre voulu par l'utilisateur ou par default.
	 * @param nb_lynx
	 *         Nombre de lynx voulu par l'utilisateur ou par default.
	 * @param nb_vautour
	 *         Nombre de vautour voulu par l'utiliateur ou par default.
	 * @return Une liste d'individus de type animal.
	 */
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

	/**
	 * Fait viellir l'animal
	 * 
	 */
	public void vieillir() {
		this.age+=1;
	}


	/**
	 * Indique si l'animal doit mourir de vielliesse. 
	 * attention vérifier que l'animal n'est pas déja mort avant utilisation.
	 * 
	 * 
	 * @return un boolean true si l'animal doit mourir
	 */
	public boolean mort_de_vieillesse() {
		if (this.age>=this.esp_de_vie) {// on devrait rajouter une condition de probabilité genre on tire au hasard un chifffre s'il est sup à 0,5 alors true else false
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Verifie que la reproduction entre deux animaux est possible.
	 * 
	 * @param A
	 * 		prend un l'animal avec lequel on veut accouplé un autre animal.
	 * @param est_vivant
	 * 
	 * @return un boolean true si l'accouplement est possible false sinon.
	 */
	public boolean reproduction(Animal A) {
		if (this.est_vivant==true && A.est_vivant==false) {

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
		else {
			return false;
		}

	}

	/**
	 * Fait se déplacer aléatoirement un animal.
	 * 
	 * @param A_list
	 * 			list de type animal a deplacer de maniere aleatoire.
	 * @param pos
	 *          position de l'animal à déplacer dans la liste.
	 * @param maxX
	 * 			limite en X de la position.
	 * @param maxY
	 * 			Limite en Y de la position.
	 */
	public void deplacementAleatoire(Animal[] A_list,Ressource[] ressource ,int pos, int maxX,int maxY) {
		boolean est_libre=false;
		while (est_libre==false) {
			this.posx = (int)(Math.random()*maxX);
			this.posy = (int)(Math.random()*maxY);
			est_libre = pos_libre(A_list,ressource,pos, this.posx,this.posy);
		}
	}

	/**
	 *Permet de faire déplacer un animal selon ses besoins en nourriture ou en eau 
	 *
	 */

	public void deplacement() {
		if (this.jauge_nourriture<=50) {
			if (this.jauge_eau<=50) {
				//this.deplacement_eau();
			}
		}
	}



	/**
	 * Permet de nourrir l'animal vivant en augmantant jauge_nourriture
	 */

	public void manger() {

		if (this.est_vivant==true) {
			this.jauge_nourriture+=1;}
	}

	/**
	 * Permet de faire boire l'animal vivant en augmentant jauge_eau.
	 */
	public void boire() {
		if (this.est_vivant==true) {
			this.jauge_eau+=1;}
	}

	/**
	 * Permet de modifier la quantité de nourriture d'un animal quand il se fait manger.
	 */


	public void se_faire_manger() {

		this.qte_viande+=(-1);

	}
	/**
	 * Permet de vérifier si les animaux qui précéde l'animal à bouger n'est pas sur l'emplacement visé.
	 * 
	 * @param A
	 * 			liste des individus présent dans la modélisation
	 * @param pos
	 * 			Position de l'animal que l'on doit déplacer.
	 * @param posx
	 * 			Position en x que l'on souhaite vérifier.
	 * @param posy
	 * 			Position en Y que l'on souhaite vérifier.
	 * @return Boolean true si l'emplacement est vide sinon false.
	 */


	public boolean pos_libre (Animal[] A,Ressource[] ressource, int pos, int posx, int posy) {
		int n = ressource.length;
		for (int k=0;k<n;k++) {
			if(ressource[k].posx==posx && ressource[k].posy==posy) {
				if (ressource[k].type=="Eau") {
					return false;
				}
			}
		}
		int p= A.length;
		for (int k=0;k<p;k++) {
			if (A[k].posx==posx && A[k].posy==posy && k!=pos) {
				return false;
			}
		}
		return true;
	}

}
