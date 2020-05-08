package affichage;

public class FenetreInitInfo {
	
	int nb_lapin,nb_lynx,nb_vautour,nb_flaques,duree;
	
	public FenetreInitInfo() {}
	
	public FenetreInitInfo(int nb_lapin,int nb_lynx,int nb_vautour,int nb_flaques, int duree) {
		this.nb_lapin=nb_lapin;
		this.nb_lynx=nb_lynx;
		this.nb_vautour=nb_vautour;
		this.nb_flaques=nb_flaques;
		this.duree=duree;
	}
	
	public String toString() {
		String str;
		if(this.nb_lapin!=0 && this.nb_lynx!=0 && this.nb_vautour!=0 && this.nb_flaques!=0 && this.duree!=0){
			str = "Verification des parametres \n\n\n";
			str+= "Nombre de lapins : "+this.nb_lapin +"\n";
			str+= "Nombre de lynxs : "+this.nb_lynx +"\n";
			str+= "Nombre de vautours : "+this.nb_vautour +"\n\n";
			str+= "Nombre de flaques : "+this.nb_flaques +"\n\n";
			str+= "Duree de la simulation : "+this.duree +" ans";
		}
		else {
			str="Aucune Information !";
		}
		return str;
	}
}
