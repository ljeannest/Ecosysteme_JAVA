package individus;
//commit gus
import java.util.ArrayList;

import Reproduction.repro;
import affichage.ConteneurFenetre;
import ressources.Lac;
import ressources.Ressource;
/**
 * <b> Individu vivant de type Animal pouvant se déplacer manger boire et se reproduire.</b>
 * <p>
 * Un animal est caractérisé par les infos suivantes:
 * <ul>
 * <li> Son espèce attribuée de façon définitive.</li>
 * <li> Son régime alimentaire attribué sous forme de chiffre de façon définitive et renvoie à la classe correspondante.</li>
 * <li> Sa position en x qui évolue.</li>
 * <li> Sa position en y qui évolue.</li>
 * <li> Le genre de l'animal attribué définitivement.</li>
 * <li> Son âge qui évolue prend plus un tous les ans. Commence à zero pour les nouveaux nés et à l'âge de repro min pour les individus au début de simulation.</li>
 * <li> L'espérence de vie est non modifiable et dépend de l'espèce attribuée.</li>
 * <li> Est_vivant indique l'état de vie de l'animal par un boolean toujours true à la création.</li>
 * <li> La jauge de nourriture indique la niveau de faim de l'individu. Elle diminue selon le temps et augmente selon ce qui a été mangé. Chaque individue a une jauge max soit de 100/100 à sa création. Quand la jauge tombe à zero l'individu meurt.</li>
 * <li> La jauge d'eau indique le niveau de soif de l'individu. Elle diminue avec le temps et augmente quand l'individu boit. Chaque individu a une jauge de 100/100 à sa création. Quand la jauge tombe à zero l'individu meurt.</li>
 * <li> La quantité d'individu est un nombre qui ne bouge pas et est donnné en fonction du type.</li>
 * <li> un nombre est fixé selon l'espèce pour l'âge à partir duquel l'animal peut se reproduire.</li>
 * <li> Un nombre est fixé selon l'espèce à partir duquel la reproduction de l'animal est impossible.</li>
 * </ul>
 * 
 * @author Lucie 
 * @version 2.0
 * 
 */
public class Animal {

	/**
	 * L'espèce de l'animal. Non modifiable.
	 * 
	 */
	public String espece;

	/**
	 * Le type de l'animal à savoir son régime alimentaire. Non modifiable.
	 * 
	 */
	public int type;

	/**
	 * Position de l'animal en x. Modifiable.
	 * 
	 * @see Animal#position_libre(Animal[], int, int, int)
	 * @see Animal#deplacement()
	 */
	public int posx;

	/**
	 * Position de l'animal en y. Modifiable.
	 * 
	 * @see Animal#position_libre(Animal[], int, int, int)
	 * @see Animal#deplacement()
	 */
	public int posy;

	/**
	 * Sexe de l'animal. Non modifiable.
	 * 
	 * @see Animal#reproduction(Animal)
	 * @see Animal#creation(int, int, int)
	 */
	public String sexe;

	/**
	 * Age de l'animal. Modifiable.
	 * 
	 * @see Animal#vieillir()
	 */
	public int age;

	/**
	 * Espérance de vie de l'animal. Non modifiable.
	 * 
	 * @see Animal#mort_de_vieillesse()
	 */
	public int esp_de_vie;

	/**
	 * boolean sur l'état de vie de l'animal. Peut être modifié.
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
	public int jauge_nourriture;

	/**
	 * Etat de soif de l'animal. Modifiable.
	 * 
	 * @see Animal#boire()
	 * @see Animal#mort_de_soif()
	 */
	public int jauge_eau;

	/**
	 * représente la quantité de nourriture pour un autre animal. Non modifiable.
	 * @see Animal#se_faire_manger()
	 */
	public  int qte_viande;

	/**
	 * représente l'âge min de reproduction. Non modifiable.
	 * 
	 * @see Animal#reproduction(Animal)
	 */
	public int ageReproMin;

	/**
	 *  représente l'âge max de reproduction. Non modifiable.
	 *  
	 *  @see Animal#reproduction(Animal)
	 */
	public int ageReproMax;
	
	public int date_naissance;
	
	public int date_mort;
	
	public boolean est_enceinte;
	
	public int duree_ecoulee_gestation;
	
	public int duree_gestation;

	/**
	 * Constructeur Animal
	 * <p>
	 * A la construction l'animal est vivant donc le paramètre est_vivant est fixé à true.
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
	 *        Quantité de nourriture de cet animal pour un autre animal .
	 * @param ageReproMin
	 *        Age minimal pour la reproduction.
	 * @param ageReproMax
	 *        Age maximal pour la reproduction.
	 *        
	 *
	 */

	public Animal(String espece, int type, int posx,int posy, String sexe, int age, int esp_de_vie,int jauge_nourriture,int jauge_eau,int qte_viande, int ageReproMin, int ageReproMax,int date_naissance, int duree_gestation) {
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
		this.date_naissance=date_naissance;
		this.date_mort=date_naissance+esp_de_vie;
		this.est_enceinte=false;
		this.duree_ecoulee_gestation=0;
		this.duree_gestation=duree_gestation;
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
		text+="Age : "+this.age + " jours"+"\n";
		text+="Position : ("+this.posx+","+this.posy+")\n";
		text+="Jauge nourriture : "+this.jauge_nourriture+"\n";
		text+="Jauge eau : "+this.jauge_eau+"\n";
		text+="Est Vivant : "+this.est_vivant+"\n";
		text+="Date de naissance : "+this.date_naissance+" jours écoulés \n";
		text+="Date de mort : "+this.date_mort+" jours écoulés \n";
		return text;
	}


	/**
	 * Permet de générer le nombre d'animaux nécessaires à la simulation.
	 * 
	 * @param nb_lievre
	 *         Nombre de lievres voulu par l'utilisateur ou par défaut.
	 * @param nb_lynx
	 *         Nombre de lynx voulu par l'utilisateur ou par défaut.
	 * @param nb_vautour
	 *         Nombre de vautours voulu par l'utilisateur ou par défaut.
	 * @return Une liste d'individus de type animal.
	 * 
	 * @author Lucie
	 */
	public static ArrayList<Animal> creation(int nb_lievre,int nb_lynx, int nb_vautour) {
		int n = nb_lievre+nb_lynx+nb_vautour;
		String sexeanimal;
		ArrayList<Animal> individus= new ArrayList<Animal>();
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
				individus.add(new Lievre(posx, posy, sexeanimal, 365/2,0));
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
				individus.add(new Lynx(posx, posy, sexeanimal, 2*365,0));
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
				individus.add(new Vautour(posx, posy, sexeanimal, 5*365,0));
			}
		}
		return individus;
	}
	
	/**
	 * Dégrade les besoins de l'animal
	 * 
	 * @author Lucie
	 * 
	 */
	public void degradation_besoin() {
		this.jauge_eau-=1;
		if (this.type==0) {
			this.jauge_nourriture-=1;
		}
		else if (this.type==1) {
			this.jauge_nourriture-=1;
		}
		else {
			this.jauge_nourriture-=1;
		}
	}
	
	
	/**
	 * Fait vieillir l'animal
	 * 
	 * @author Lucie
	 * 
	 */
	public void vieillir() {
		this.age+=1;
	}
	

	/**
	 * Permet de faire mourir l'animal quand il atteint son la fin de son espérance de vie
	 * 
	 */
	public void mort_naturelle(int duree_ecoulee) {
		if (this.mort_de_vieillesse()||this.mort_de_manque()) {
			this.est_vivant=false;
			this.date_mort=duree_ecoulee;
		}
	}

	/**
	 * Indique si l'animal doit mourir de vieillesse. 
	 * Attention vérifier que l'animal n'est pas déjà mort avant utilisation.
	 * 
	 * 
	 * @return un boolean true si l'animal doit mourir.
	 * 
	 * @author Lucie
	 */
	
	public boolean mort_de_vieillesse() {
		if (this.age>=this.esp_de_vie) {// on devrait rajouter une condition de probabilité genre on tire au hasard un chifffre s'il est sup à 0,5 alors true else false
			this.est_vivant=false;
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Indique si l'animal doit mourir de faim ou de soif.
	 * Attention vérifier que l'animal n'est pas déjà mort avant utilisation.
	 * 
	 * 
	 * @return un boolean true si l'animal doit mourir.
	 * 
	 * @author Lucie
	 */
	public boolean mort_de_manque() {
		if (this.jauge_nourriture<=0||this.jauge_eau<=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Fait la reproduction entre deux animaux
	 * 
	 * @param A
	 * 		prend un l'animal avec lequel on veut accoupler un autre animal.
	 * @param est_vivant
	 * 
	 * @author Mélodia
	 */
	public void reproduction(Animal A) {
		if (this.sexe=="F") {
			this.est_enceinte=true;
			this.duree_ecoulee_gestation=0;
		}
		else {
			A.est_enceinte=true;
			A.duree_ecoulee_gestation=0;
		}
	}

	/**
	 * Fait déplacer aléatoirement un animal.
	 * 
	 * @param A_list
	 * 			list de type animal à déplacer de manière aléatoire.
	 * @param pos
	 *          position de l'animal à déplacer dans la liste.
	 * @param maxX
	 * 			limite en X de la position.
	 * @param maxY
	 * 			Limite en Y de la position.
	 * 
	 * @author Lucie
	 */

	public void deplacementAleatoire(ArrayList<Animal> A_list,Ressource[] ressource ,int pos, int maxX,int maxY) {
		boolean est_libre=false;
		while (est_libre==false) {
			this.posx = (int)(Math.random()*maxX);
			this.posy = (int)(Math.random()*maxY);
			est_libre = pos_libre(A_list,ressource,pos, this.posx,this.posy);
		}
	}
	
	/**
	 *Permet de faire déplacer un animal selon ses besoins en nourriture ou en eau.
	 *
	 *@author Lucie
	 *
	 */
	
	public void deplacement(ArrayList<Animal> A_list, Ressource[] ressource, int pos, int maxX, int maxY,int duree_ecoulee) {
		int[] ori_obj;
		if (this.jauge_eau>60 && this.jauge_nourriture>60 && this.est_enceinte==false && this.age>=this.ageReproMin && this.age<=this.ageReproMax) {
			ori_obj = this.setOrientationRepro(A_list);
		}
		else if (this.jauge_eau<=this.jauge_nourriture) {
			ori_obj = this.setOrientationEau(ressource);
		}
		else {
			ori_obj = this.setOrientationNourriture(A_list,ressource,duree_ecoulee);
		}
		this.deplacement_orientation(A_list, ressource, pos, maxX, maxY, str_ori(ori_obj[0]),ori_obj[1],ori_obj[2]);
	}
	
	/**
	 * Permet de faire le lien entre les directions en int et en string (0:"";1:"E";2:"W";3:"N";4:"S")
	 * 
	 * @author Lucie
	 */
	
	public String str_ori(int ori) {
		String orientation="";
		if (ori==1) {
			orientation = "E";
		}
		else if (ori==2) {
			orientation = "W";
		}
		else if (ori==3) {
			orientation = "N";
		}
		else if (ori==4) {
			orientation = "S";
		}
		return orientation;
	}
	
	
	
	/**
	 *Permet de faire déplacer un animal dans une direction donnée.
	 *
	 *@author Augustin
	 *
	 */

	public void deplacement_orientation(ArrayList<Animal> A_list,Ressource[] ressource, int pos, int maxX,int maxY,String orientation,int posx_obj, int posy_obj) {
	
		int newX=this.posx;
		int newY=this.posy;
	
		if (this.est_vivant==true) {
		

			if (orientation=="N"&& (ConteneurFenetre.NB_LIGNES-1)>this.posy&& pos_libre (A_list,ressource,pos,posx,posy+1)==true) {
				newX=this.posx;
				newY=this.posy+1;}
		
			else if (orientation=="S"&& this.posy>0 && pos_libre (A_list,ressource,pos,posx,posy-1)==true) {
				newX=this.posx;
				newY=this.posy-1;}
		
			else if (orientation=="E"&& (ConteneurFenetre.NB_COLONNES-1)>this.posx && pos_libre (A_list,ressource,pos,posx+1,posy)==true) {
				newX=this.posx+1;
				newY=this.posy;}
		
			else if (orientation=="W"&& this.posx>0 && pos_libre (A_list,ressource,pos,posx-1,posy)==true) {
				newX=this.posx-1;
				newY=this.posy;}
			
			else {
				int[] pos_suiv = this.contournement(A_list,ressource,pos, posx_obj, posy_obj);
				newX=pos_suiv[0];
				newY=pos_suiv[1];
			}
		}
		
		this.posx=newX;
		this.posy=newY;
		
	}
	
	/**
	 *Permet de définir la direction que va emprunter l'animal à l'instant t+1 pour se reproduire.
	 *
	 *@author Lucie
	 *
	 */
	
	public int[] contournement (ArrayList<Animal> A_list,Ressource[] ressource,int pos, int posx_obj, int posy_obj) {
		int[] pos_suiv = new int[2];
		if(posx_obj>this.posx && pos_libre (A_list,ressource,pos,this.posx+1,this.posy)==true && this.posx+1<ConteneurFenetre.NB_LIGNES) {
			pos_suiv[0]=this.posx+1;
			pos_suiv[1]=this.posy;
		}
		else if (posx_obj<this.posx && pos_libre (A_list,ressource,pos,this.posx-1,this.posy)==true && this.posx>0) {
			pos_suiv[0]=this.posx-1;
			pos_suiv[1]=this.posy;
		}
		else if (posy_obj<this.posy && pos_libre (A_list,ressource,pos,this.posx,this.posy-1)==true && this.posy>0) {
			pos_suiv[0]=this.posx;
			pos_suiv[1]=this.posy-1;
		}
		else if (posy_obj>this.posy && pos_libre (A_list,ressource,pos,this.posx,this.posy+1)==true && this.posy+1<ConteneurFenetre.NB_COLONNES){
			pos_suiv[0]=this.posx;
			pos_suiv[1]=this.posy+1;
		}
		else {
			if (pos_libre (A_list,ressource,pos,this.posx+1,this.posy)==true && this.posx+1<ConteneurFenetre.NB_LIGNES) {
				pos_suiv[0]=this.posx+1;
				pos_suiv[1]=this.posy;
			}
			else if (pos_libre (A_list,ressource,pos,this.posx-1,this.posy)==true && this.posx>0) {
				pos_suiv[0]=this.posx-1;
				pos_suiv[1]=this.posy;
			}
			else if (pos_libre (A_list,ressource,pos,this.posx,this.posy-1)==true && this.posy>0) {
				pos_suiv[0]=this.posx;
				pos_suiv[1]=this.posy-1;
			}
			else if (pos_libre (A_list,ressource,pos,this.posx,this.posy+1)==true && this.posy+1<ConteneurFenetre.NB_COLONNES){
				pos_suiv[0]=this.posx;
				pos_suiv[1]=this.posy+1;
			}
			else {
				pos_suiv[0]=this.posx;
				pos_suiv[1]=this.posy;
			}
		}
		return pos_suiv;
	}
	
	/**
	 *Permet de définir la direction que va emprunter l'animal à l'instant t+1 pour se reproduire.
	 *
	 *@author Lucie
	 *
	 */
	
	public int[] setOrientationRepro(ArrayList<Animal> A_list) {
		int[] ori_obj = new int[3];
		int[] pos_animal= this.ppcompagnon(A_list);
		ori_obj[1]=pos_animal[0];
		ori_obj[2]=pos_animal[1];
		if ((pos_animal[0]==posx && (pos_animal[1]==posy+1||pos_animal[1]==posy-1))||(pos_animal[1]==posy && (pos_animal[0]==posx+1||pos_animal[0]==posx-1))) {
			this.reproduction(A_list.get(pos_animal[2]));
			ori_obj[0]=0;
			ori_obj[1]=this.posx;
			ori_obj[2]=this.posy;
		}
		else if(pos_animal[0]>this.posx) {
			ori_obj[0]=1;
		}
		else if (pos_animal[0]<this.posx) {
			ori_obj[0]=2;
		}
		else if (pos_animal[1]<this.posy) {
			ori_obj[0]=4;
		}
		else if (pos_animal[1]>this.posy){
			ori_obj[0]=3;
		}
		return ori_obj;
	}
	
	
	
	
	public int[] ppcompagnon(ArrayList<Animal> A_list) {
		int[] pos_animal = new int[3];
		int n = A_list.size();
		double dist_min=1000;
		pos_animal[0]=this.posx;//pos en x
		pos_animal[1]=this.posy;//pos en y
		pos_animal[2]=0;//position de la case dans la liste des animaux
		for (int k=0;k<n;k++) {
			if (A_list.get(k).espece==this.espece && A_list.get(k).est_vivant==true && A_list.get(k).sexe!=this.sexe && this.est_enceinte==false) {
				if (this.age>this.ageReproMin && this.age<this.ageReproMax && A_list.get(k).age>A_list.get(k).ageReproMin && A_list.get(k).age<A_list.get(k).ageReproMax) {
					double dist = Math.sqrt((this.posx-A_list.get(k).posx)*(this.posx-A_list.get(k).posx)+(this.posy-A_list.get(k).posy)*(this.posy-A_list.get(k).posy));
					if (dist<dist_min && dist >0) {
						dist_min = dist;
						pos_animal[0]=A_list.get(k).posx;
						pos_animal[1]=A_list.get(k).posy;
						pos_animal[2]=k;
					}
				}
			}
		}
		return pos_animal;
	}
	
	/**
	 *Permet de définir la direction que va emprunter l'animal à l'instant t+1 s'il a faim.
	 *
	 *@author Lucie
	 *
	 */
	
	public int[] setOrientationNourriture(ArrayList<Animal> A_list,Ressource[] ressource,int duree_ecoulee) {
		int[] ori_obj = new int[3];
		if (this.type==0) {
			int[] pos_veg= this.ppvegetaux(ressource);
			ori_obj[1]=pos_veg[0];
			ori_obj[2]=pos_veg[1];
			if (pos_veg[0]==posx && pos_veg[1]==posy) {
				this.manger_herb(ressource[pos_veg[2]]);
				ori_obj[0]=0;
				ori_obj[1]=this.posx;
				ori_obj[2]=this.posy;
			}
			else if(pos_veg[0]>this.posx) {
				ori_obj[0]=1;
			}
			else if (pos_veg[0]<this.posx) {
				ori_obj[0]=2;
			}
			else if (pos_veg[1]<this.posy) {
				ori_obj[0]=4;
			}
			else if (pos_veg[1]>this.posy){
				ori_obj[0]=3;
			}
			return ori_obj;
		}
		else if (this.type==1) {
			int[] pos_herb= this.ppherbivore(A_list);
			if ((pos_herb[0]==posx && (pos_herb[1]==posy+1||pos_herb[1]==posy-1))||(pos_herb[1]==posy && (pos_herb[0]==posx+1||pos_herb[0]==posx-1))) {
				this.manger_carn(A_list.get(pos_herb[2]),duree_ecoulee);
				ori_obj[0]=0;
				ori_obj[1]=this.posx;
				ori_obj[2]=this.posy;
			}
			else if(pos_herb[0]>this.posx) {
				ori_obj[0]=1;
			}
			else if (pos_herb[0]<this.posx) {
				ori_obj[0]=2;
			}
			else if (pos_herb[1]<this.posy) {
				ori_obj[0]=4;
			}
			else if (pos_herb[1]>this.posy){
				ori_obj[0]=3;
			}
			return ori_obj;
		}
		else if (this.type==2) {
			int[] pos_cad= this.ppcadavre(A_list);
			if ((pos_cad[0]==posx && (pos_cad[1]==posy+1||pos_cad[1]==posy-1))||(pos_cad[1]==posy && (pos_cad[0]==posx+1||pos_cad[0]==posx-1))) {
				this.manger_char(A_list.get(pos_cad[2]));
				ori_obj[0]=0;
				ori_obj[1]=this.posx;
				ori_obj[2]=this.posy;
			}
			else if(pos_cad[0]>this.posx) {
				ori_obj[0]=1;
			}
			else if (pos_cad[0]<this.posx) {
				ori_obj[0]=2;
			}
			else if (pos_cad[1]<this.posy) {
				ori_obj[0]=4;
			}
			else if (pos_cad[1]>this.posy){
				ori_obj[0]=3;
			}
			return ori_obj;
		}
		return ori_obj;
	}
	
	/**
	 *Permet de déterminer la zone d'herbe la plus proche.
	 *
	 *@author Lucie
	 *
	 */
	
	public int[] ppvegetaux(Ressource[] ressource) {
		int n = ressource.length;
		int[] pos_veg = new int[3];
		double dist_min=1000;
		pos_veg[0]=0;//pos en x
		pos_veg[1]=0;//pos en y
		pos_veg[2]=0;//position de la case dans la liste des ressources
		for (int k=0;k<n;k++) {
			if (ressource[k].type=="Vegetaux" && ressource[k].quantiteRessource>0) {
				double dist = Math.sqrt((this.posx-ressource[k].posx)*(this.posx-ressource[k].posx)+(this.posy-ressource[k].posy)*(this.posy-ressource[k].posy));
				if (dist<dist_min) {
					dist_min = dist;
					pos_veg[0]=ressource[k].posx;
					pos_veg[1]=ressource[k].posy;
					pos_veg[2]=k;
				}
			}
		}
		return pos_veg;
	}

	/**
	 *Permet de déterminer le cadavre le plus proche.
	 *
	 *@author Lucie
	 *
	 */
	
	public int[] ppcadavre(ArrayList<Animal> A_list) {
		int n = A_list.size();
		int[] pos_cad = new int[3];
		double dist_min=1000;
		pos_cad[0]=this.posx;//pos en x
		pos_cad[1]=this.posy;//pos en y
		pos_cad[2]=0;//position de la case dans la liste des animaux
		for (int k=0;k<n;k++) {
			if (A_list.get(k).type!=2 && A_list.get(k).est_vivant==false) {
				double dist = Math.sqrt((this.posx-A_list.get(k).posx)*(this.posx-A_list.get(k).posx)+(this.posy-A_list.get(k).posy)*(this.posy-A_list.get(k).posy));
				if (dist<dist_min && dist >0) {
					dist_min = dist;
					pos_cad[0]=A_list.get(k).posx;
					pos_cad[1]=A_list.get(k).posy;
					pos_cad[2]=k;
				}
			}
		}
		return pos_cad;
	}
	
	
	/**
	 *Permet de déterminer l'herbivore le plus proche.
	 *
	 *@author Lucie
	 *
	 */
	
	public int[] ppherbivore(ArrayList<Animal> A_list) {
		int n = A_list.size();
		int[] pos_herb = new int[3];
		double dist_min=1000;
		pos_herb[0]=this.posx;//pos en x
		pos_herb[1]=this.posy;//pos en y
		pos_herb[2]=0;//position de la case dans la liste des animaux
		for (int k=0;k<n;k++) {
			if (A_list.get(k).type==0 && A_list.get(k).est_vivant==true) {
				double dist = Math.sqrt((this.posx-A_list.get(k).posx)*(this.posx-A_list.get(k).posx)+(this.posy-A_list.get(k).posy)*(this.posy-A_list.get(k).posy));
				if (dist<dist_min && dist >0) {
					dist_min = dist;
					pos_herb[0]=A_list.get(k).posx;
					pos_herb[1]=A_list.get(k).posy;
					pos_herb[2]=k;
				}
			}
		}
		return pos_herb;
	}
	
	
	/**
	 * Permet de définir la direction que va emprunter l'animal à l'instant t+1 s'il a soif.
	 * 
	 * @author Lucie
	 */
	
	public int[] setOrientationEau(Ressource[] ressource) {
		int[] ori_obj= new int[3];
		int[] pos_eau = ppeau(this.posx,this.posy,ressource);
		ori_obj[1]=pos_eau[0];
		ori_obj[2]=pos_eau[1];
		if ((pos_eau[0]==posx && (pos_eau[1]==posy+1||pos_eau[1]==posy-1))||(pos_eau[1]==posy && (pos_eau[0]==posx+1||pos_eau[0]==posx-1))) {
			this.boire(ressource[pos_eau[2]]);
			ori_obj[0]=0;
			ori_obj[1]=this.posx;
			ori_obj[2]=this.posy;
		}
		else if(pos_eau[0]>this.posx) {
			ori_obj[0]=1;
		}
		else if (pos_eau[0]<this.posx) {
			ori_obj[0]=2;
		}
		else if (pos_eau[1]<this.posy) {
			ori_obj[0]=4;
		}
		else {
			ori_obj[0]=3;
		}
		return ori_obj;
	}
	
	/**
	 * Permet de récuperer la position du point d'eau le plus proche d'un animal donné.
	 * 
	 * @author Lucie
	 */
	
	public int[] ppeau(int posx, int posy, Ressource[] ressource) {
		int n = ressource.length;
		int[] pos_eau = new int[3];
		double dist_min=1000;
		pos_eau[0]=0;//pos en x
		pos_eau[1]=0;//pos en y
		pos_eau[2]=0;//position de la case dans la liste des ressources
		for (int k=0;k<n;k++) {
			if (ressource[k].type=="Eau") {
				double dist = Math.sqrt((posx-ressource[k].posx)*(posx-ressource[k].posx)+(posy-ressource[k].posy)*(posy-ressource[k].posy));
				if (dist<dist_min) {
					dist_min = dist;
					pos_eau[0]=ressource[k].posx;
					pos_eau[1]=ressource[k].posy;
					pos_eau[2]=k;
				}
			}
		}
		return pos_eau;
	}


	/**
	 * Permet de faire boire l'animal vivant en augmentant jauge_eau.
	 * 
	 * @author Augustin
	 */
	public void boire(Ressource case_r) {
		if (this.est_vivant==true && case_r.quantiteRessource>=10 && this.jauge_eau<=90) {
			this.jauge_eau+=10;
			case_r.quantiteRessource-=10;
		}
		else if(this.est_vivant==true && case_r.quantiteRessource>0 && this.jauge_eau<=90) {
			this.jauge_eau+=case_r.quantiteRessource;
			case_r.quantiteRessource=0;
		}
		if (case_r.sous_type=="Riviere") {
			case_r.quantiteRessource+=10;
		}
	}


	/**
	 * Permet de vérifier si les animaux qui précédent l'animal à bouger ne sont pas sur l'emplacement visé.
	 * 
	 * @param A
	 * 			liste des individus présents dans la modélisation.
	 * @param pos
	 * 			Position de l'animal que l'on doit déplacer.
	 * @param posx
	 * 			Position en X que l'on souhaite vérifier.
	 * @param posy
	 * 			Position en Y que l'on souhaite vérifier.
	 * @return Boolean true si l'emplacement est vide sinon false.
	 * 
	 * @author Lucie
	 */



	public static boolean pos_libre (ArrayList<Animal> A,Ressource[] ressource, int pos, int posx, int posy) {
		int n = ressource.length;
		for (int k=0;k<n;k++) {
			if(ressource[k].posx==posx && ressource[k].posy==posy) {
				if (ressource[k].type=="Eau") {
					return false;
				}
			}
		}

		int p= A.size();
		for (int k=0;k<p;k++) {
			if (A.get(k).posx==posx && A.get(k).posy==posy && k!=pos) {

				return false;
			}
		}
		return true;
	}
	
	/**
	 * Permet à l'herbivore de  manger.
	 * 
	 * @param V
	 * 			variable Ressource de type Vegetaux que l'herbivore va manger.
	 */
	public void manger_herb(Ressource V) {
		if (this.est_vivant = true) {

			if(V.quantiteRessource>=10) {
				this.jauge_nourriture+=10;
				V.quantiteRessource-=10;	
			}	
			else if(V.quantiteRessource>0) {
				this.jauge_nourriture+=V.quantiteRessource;
				V.quantiteRessource=0;
			}		
		}
	}
	
	/**
	 * Permet de faire manger un carnivore en vérifiant qu'il est vivant.
	 * Modifie le boolean est_vivant de l'animal mangé en false.
	 * 
	 * 
	 * @param A
	 * 		Animal que le carnivore mange nécessairement de type 0.
	 * 		@see Herbivore
	 */
	public void manger_carn(Animal A,int duree_ecoulee) {
		if (A.type==0 && A.est_vivant==true) {
				A.est_vivant=false;
				A.date_mort=duree_ecoulee;
				A.qte_viande-=1;
				this.jauge_nourriture=100;
		}
	}
	
	/**
	 * Permet de faire manger un charognard en vérifiant qu'il est vivant et que l'animal mangé est mort.
	 * 
	 * 
	 * @param A
	 * 		Animal que le charognard mange nécessairement de type 0 ou 1.
	 * 		@see cadavre
	 */
	public void manger_char(Animal A) {
		if (A.type!=2 && A.est_vivant==false) {
			A.qte_viande-=1;
			this.jauge_nourriture=100;
		}
	}
	/**
	 * Permet de faire se décomposer un animal mort
	 * 
	 * @param ressource
	 * 			Tableau de type Ressource contenant l'ensemble des ressources de l'ecosysteme.
	 */
	public void decomposition(Ressource[] ressource) {
		this.qte_viande-=1;
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				if (this.posx+i<ConteneurFenetre.NB_LIGNES && this.posy+j<ConteneurFenetre.NB_COLONNES && i+j<=2) {
					for (int k=0;k<ressource.length;k++) {
						if (ressource[k].posx==this.posx+i && ressource[k].posy==this.posy+j) {
							ressource[k].quantiteRessource+=5;
						}
					}
				}
				else if (this.posx+i<ConteneurFenetre.NB_LIGNES && this.posy-j>=0 && i+j<=2) {
					for (int k=0;k<ressource.length;k++) {
						if (ressource[k].posx==this.posx+i && ressource[k].posy==this.posy-j) {
							ressource[k].quantiteRessource+=5;
						}
					}
				}
				else if (this.posx-i>=0 && this.posy+j<ConteneurFenetre.NB_COLONNES && i+j<=2) {
					for (int k=0;k<ressource.length;k++) {
						if (ressource[k].posx==this.posx-i && ressource[k].posy==this.posy+j) {
							ressource[k].quantiteRessource+=5;
						}
					}
				}
				else if (this.posx-i>=0 && this.posy-j>=0 && i+j<=2) {
					for (int k=0;k<ressource.length;k++) {
						if (ressource[k].posx==this.posx-i && ressource[k].posy==this.posy-j && ressource[k].quantiteRessource<95) {
							ressource[k].quantiteRessource+=5;
						}
					}
				}
			}
		}
	}
	/**
	 * <p>Permet de faire disparaitre les animaux après décomposition de leur cadavre. Et de les faire passer dans la liste des animaux mort.</p>
	 * @param A_list
	 * 			Liste array de type Animal. contient les animaux vivant de l'écosystème.
	 * @param A_list_mort
	 * 			Liste array de type Animal. Contient les animaux mort de l'écosystème.
	 * @param pos
	 * 			Position de l'animal à faire disparaître de la A_list vers la A_list_mort.
	 * 
	 */
	public void disparition(ArrayList<Animal> A_list,ArrayList<Animal> A_list_mort,int pos) {
		if (this.est_vivant==false && this.qte_viande<=0) {
			A_list.remove(pos);
			A_list_mort.add(this);
		}
	}
	
	
	public void accouchement (ArrayList<Animal> A_list, Ressource[] ressource, int duree_ecoulee) {
		if (this.duree_ecoulee_gestation>=this.duree_gestation) {
			this.est_enceinte=false;
			if (this.espece=="Lievre") {
				int nb_bebes = (int) (2+Math.random()*2);
				for (int k=0;k<=nb_bebes;k++) {
					repro.creationNouvelIndividu(this,A_list,ressource,duree_ecoulee);
				}
			}
			else if (this.espece=="Lynx"){
				int nb_bebes = (int) (1+Math.random());
				for (int k=0; k<=nb_bebes;k++) {
					repro.creationNouvelIndividu(this,A_list,ressource,duree_ecoulee);
				}
			}
			else {
				repro.creationNouvelIndividu(this,A_list,ressource,duree_ecoulee);
			}
		}
	}
}



