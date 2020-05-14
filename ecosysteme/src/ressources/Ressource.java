package ressources;

/**
 * <b> ressource qui peut être mangée par les individus de type animal.</b>
 * <p>
 * Une ressource est caractérisée par les variables suivantes:
 * <ul>
 * <li> Son type attribué à sa création et pouvant être modifié.</li>
 * <li> Son sous_type attribué à la création et modifiable.</li>
 * <li> Sa position en X est donné à la création et est non modifiable.</li>
 * <li> Sa position en Y est donné à la création et est non modifiable.</li>
 * <li> Sa couleur attribuée à sa création en fonction de son sous type.</li>
 * <li> Sa quantité de ressource accessible pour un animal. Elle est définie selon le sous-type et diminue si un animal l'utilise.</li>
 * <li> Son état de vie qui est vrai par défaut mais modifiable.</li>
 * </ul>
 * 
 * @author Augustin
 * @version 2.0
 *
 */

public class Ressource {
	
	/**
	 * Le type de la ressource. Modifiable.
	 */
	public String type;
	
	/**
	 * Le sous-type de la resssouce. Modifiable.
	 */
	public String sous_type;
	
	/**
	 * Position en X. Non modifiable.
	 */
	public int posx;
	
	/**
	 * Position en Y. Non modifiable.
	 */
	public int posy;
	
	/**
	 * Couleur de la ressource. Modifiable.
	 */
	public String couleur;
	
	/**
	 * Quantité de ressource qu'un animal peut en tirer. Elle ne diminue que si un animal l'utilise. Valeur donnée par défaut pouvant augmenter.
	 * 
	 * @see Ressource#pousser_croitre()
	 * 
	 */
	public int quantiteRessource;
	
	/**
	 *  Boolean sur l'état de vie de la ressource pouvant être modifié.
	 *  
	 *  @see Ressource#se_faire_manger_boire()
	 *  
	 */
	public boolean estVivant;
	
	/**
	 * Constructeur Ressource
	 * <p>
	 * Les ressources sont vivantes par défaut au debut sauf Eau et Desert.
	 * <p>
	 * 
	 * 
	 * 
	 * @param type
	 * 			Type de la ressource (Vegetaux, Eau).
	 * @param sous_type
	 * 			Sous type de la ressource( herber, lac...).
	 * @param posx
	 * 			position fixée en X.
	 * @param posy
	 * 			position fixée en Y.
	 * @param couleur
	 * 			Couleur de la ressource.
	 * @param quantiteRessource
	 * 			Quantité de ressource disponible pour les individus.
	 */
	
	public Ressource(String type,String sous_type,int posx,int posy, String couleur,int quantiteRessource) {
		
		this.type = type;
		this.sous_type=sous_type;
		this.posx = posx;
		this.posy = posy;
		this.couleur = couleur;
		this.quantiteRessource = quantiteRessource;
		this.estVivant = true;
		
		}
	
	/**
	 * Permet de diminuer la quantité de ressource accessible après qu'un individu ait utilisé une ressource.
	 * 
	 * @author Augustin
	 */
	public void se_faire_manger_boire() {
		
		this.quantiteRessource-=1;
		
		if(this.quantiteRessource==0) {
			
			this.couleur = "marron";
			this.estVivant = false;
			
		}
	}
	/**
	 * permet de faire se développer les ressources.
	 * 
	 * @author Augustin
	 */
	
	public void pousser_croitre() {
		
		this.quantiteRessource +=1;
		
	}
	
	/**
	 * Permet  de créer un lac.
	 * 
	 * @param NB_LIGNES
	 * 			Donnée sur la dimension de la grille modélisant l'environnement.
	 * @param NB_COLONNES
	 * 			Donnee sur la dimension de la grille modélisant l'environnement.
	 * @param presence_lac
	 * 			Id pour savoir si la ressource doit être modifiée en Lac.
	 * @return Un element de sous-type Lac
	 * 
	 * @author Augustin
	 */
	
	public static Ressource[] lac(int NB_LIGNES, int NB_COLONNES,int presence_lac) {
		int k=0;
		Ressource[] lac = new Ressource[37];
		int posx = (int) (Math.random()*NB_LIGNES);
		int posy = (int) (Math.random()*NB_COLONNES);
		if (presence_lac==1) {
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if (posx+i<NB_LIGNES && posy+j<NB_COLONNES && i+j<4) {
						lac[k]=new Lac(i,j,100);
						k++;
					}
				}
			}
		}
		else {
			for (int l=0;l<37;l++) {
				lac[l]=new Lac(-1,-1,100);
			}
		}
		return lac;
	}
	
	/**
	 * 
	 * Permet de créer une riviere.
	 * 
	 * @param posx
	 * 			Position en X donnée à la création.
	 * @param posy
	 * 			Position en Y donnée à la création.
	 * @param NB_LIGNES
	 * 			Donnée sur la dimension de la grille modélisant l'environnement.
	 * @param NB_COLONNES
	 * 			Donnée sur la dimension de la grille modélisant l'environnement.
	 * 
	 * @return Un élément de sous-type Riviere.
	 */
	public static Ressource[] riviere(int posx, int posy,int NB_LIGNES, int NB_COLONNES) {
		int k=0;
		Ressource[] riviere = new Ressource[posx+posy];
		for (int i=0;i<posy;i++) {
			riviere[k]=new Riviere(posx,i,"bleu clair",1000);	
		}
		for (int j=0;j<posx;j++) {
			riviere[k]=new Riviere(j,posy,"bleu clair",1000);
		}
		return riviere;
	}
	
	
	public static boolean is_in(Ressource[] R, int posx, int posy) {
		int n = R.length;
		if (n==0) {
			return false;
		}
		for (int k=0;k<n;k++) {
			if (posx==R[k].posx && posy==R[k].posy) {
				return true;
			}
		}
		return false;
	}
	

	
	public static Ressource[] devient_desert(Ressource[] ressource) {
		int n = ressource.length;
		for (int k=0;k<n;k++) {
			if (ressource[k].quantiteRessource<=0) {
				ressource[k]=new Desert(ressource[k].posx,ressource[k].posy);
			}
		}
		return ressource;
	}
	
	

	/**
	 * Permet de créer l'ensemble des ressources présente dans l'environnement.
	 * 
	 * @param nb_flaque
	 * 			Donne le nombre de flaques à modéliser.
	 * @param presence_lac
	 * 			Indique si un lac doit être créé par la valeur 1 sinon 0.
	 * @param presence_riviere
	 * 			Indique si une riviere doit être présente par la valeur 1 sinon 0.
	 * @param NB_LIGNES
	 * 			Donnée sur la dimension de la grille modélisant l'environnement.
	 * @param NB_COLONNES
	 * 			Donnée sur la dimension de la grille modélisant l'environnement.
	 * 
	 * @return	renvoie une liste contenant les ressources présentes dans l'écosystème.
	 */

	public static Ressource[] creation(int nb_flaque, int presence_lac, int presence_riviere,int NB_LIGNES, int NB_COLONNES) {
		
		boolean plein = false;
		
		int posx_lac = (int) (Math.random()*NB_LIGNES);
		int posy_lac = (int) (Math.random()*NB_COLONNES);
		
		int posx_riviere = (int) (Math.random()*NB_LIGNES);
		int posy_riviere = (int) (Math.random()*NB_COLONNES);
		
		int[] posx_flaque = new int[nb_flaque];
		int[] posy_flaque = new int[nb_flaque];
		
		for (int k=0;k<nb_flaque;k++) {
			posx_flaque[k] = (int) (Math.random()*NB_LIGNES);
			posy_flaque[k] = (int) (Math.random()*NB_COLONNES);
		}
		
		
		
		Ressource[] ressource = new Ressource[NB_LIGNES*NB_COLONNES];
		int k=0;
		for (int i=0;i<NB_LIGNES;i++) {
			for (int j=0;j<NB_COLONNES;j++) {
				plein=false;
				if (plein==false) {
					if (presence_lac==1) {
						for (int a=0;a<4;a++) {
							for (int b=0;b<4;b++) {
								if (posx_lac+a<NB_LIGNES && posy_lac+b<NB_COLONNES && a+b<=4) {
									if (posx_lac+a==i && posy_lac+b==j) {
										ressource[k]=new Lac (i,j,1000);
										plein = true;
									}
								}
								if (posx_lac-a>=0 && posy_lac+b<NB_COLONNES && a+b<=4) {
									if (posx_lac-a==i && posy_lac+b==j) {
										ressource[k]=new Lac (i,j,1000);
										plein = true;
									}
								}
								if (posx_lac+a<NB_LIGNES && posy_lac-b>=0 && a+b<=4) {
									if (posx_lac+a==i && posy_lac-b==j) {
										ressource[k]=new Lac (i,j,1000);
										plein = true;
									}
								}
								if (posx_lac-a>=0 && posy_lac-b>=0 && a+b<=4) {
									if (posx_lac-a==i && posy_lac-b==j) {
										ressource[k]=new Lac (i,j,1000);
										plein = true;
									}
								}
							}
						}
					}
				}
				if (plein==false) {
					if (presence_riviere == 1) {
						for (int a=0;a<=posx_riviere;a++) {
							if (a==i && posy_riviere==j) {
								ressource[k]=new Riviere (i,j,"bleu clair",1000);
								plein = true;
							}
						}
						for (int b=0;b<=posy_riviere;b++) {
							if (posx_riviere==i && b==j) {
								ressource[k]=new Riviere (i,j,"bleu clair",1000);
								plein = true;
							}
						}
					}
				}
				if (plein==false) {
					for (int a=0; a<nb_flaque;a++) {
						if (posx_flaque[a]==i && posy_flaque[a]==j) {
							ressource[k]=new Flaque (i,j,"bleu clair",50);
							plein=true;
						}
					}
				}
				if (plein==false) {
					ressource[k]= new Herbe (i,j,"vert clair",100);
				}
				k++;
			}
		}
		
		return ressource;
	}
	
}
