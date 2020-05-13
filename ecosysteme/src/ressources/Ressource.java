package ressources;

public class Ressource {

	public String type;
	public String sous_type;
	public int posx;
	public int posy;
	public String couleur;
	public int quantiteRessource;
	public boolean estVivant;
	
	public Ressource(String type,String sous_type,int posx,int posy, String couleur,int quantiteRessource) {
		
		this.type = type;
		this.sous_type=sous_type;
		this.posx = posx;
		this.posy = posy;
		this.couleur = couleur;
		this.quantiteRessource = quantiteRessource;
		this.estVivant = true;
		
		}
	
	
	public void se_faire_manger_boire() {
		
		this.quantiteRessource-=1;
		
		if(this.quantiteRessource==0) {
			
			this.couleur = "marron";
			this.estVivant = false;
			
		}
	}
	
	public void pousser_croitre() {
		
		this.quantiteRessource +=1;
		
	}
	
	public static Ressource[] lac(int NB_LIGNES, int NB_COLONNES,int presence_lac) {
		int k=0;
		Ressource[] lac = new Ressource[37];
		int posx = (int) (Math.random()*NB_LIGNES);
		int posy = (int) (Math.random()*NB_COLONNES);
		if (presence_lac==1) {
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if (posx+i<NB_LIGNES && posy+j<NB_COLONNES && i+j<4) {
						lac[k]=new Lac(i,j,"bleu foncé",100);
						k++;
					}
				}
			}
		}
		else {
			for (int l=0;l<37;l++) {
				lac[l]=new Lac(-1,-1,"bleu",100);
			}
		}
		return lac;
	}
	
	
	public static Ressource[] riviere(int posx, int posy,int NB_LIGNES, int NB_COLONNES) {
		int k=0;
		Ressource[] riviere = new Ressource[posx+posy];
		for (int i=0;i<posy;i++) {
			riviere[k]=new Riviere(posx,i,"bleu clair",100);	
		}
		for (int j=0;j<posx;j++) {
			riviere[k]=new Riviere(j,posy,"bleu clair",100);
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
										ressource[k]=new Lac (i,j,"bleu fonce",100);
										plein = true;
									}
								}
								else if (posx_lac-a>=0 && posy_lac+b<NB_COLONNES && a+b<=4) {
									if (posx_lac-a==i && posy_lac+b==j) {
										ressource[k]=new Lac (i,j,"bleu fonce",100);
										plein = true;
									}
								}
								else if (posx_lac+a<NB_LIGNES && posy_lac-b>=0 && a+b<=4) {
									if (posx_lac+a==i && posy_lac-b==j) {
										ressource[k]=new Lac (i,j,"bleu fonce",100);
										plein = true;
									}
								}
								else if (posx_lac-a>=0 && posy_lac-b>=0 && a+b<=4) {
									if (posx_lac-a==i && posy_lac-b==j) {
										ressource[k]=new Lac (i,j,"bleu fonce",100);
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
								ressource[k]=new Riviere (i,j,"bleu clair",100);
								plein = true;
							}
						}
						for (int b=0;b<=posy_riviere;b++) {
							if (posx_riviere==i && b==j) {
								ressource[k]=new Riviere (i,j,"bleu clair",100);
								plein = true;
							}
						}
					}
				}
				if (plein==false) {
					for (int a=0; a<nb_flaque;a++) {
						if (posx_flaque[a]==i && posy_flaque[a]==j) {
							ressource[k]=new Flaque (i,j,"bleu clair",100);
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
