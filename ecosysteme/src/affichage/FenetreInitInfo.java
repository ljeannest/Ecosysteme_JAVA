package affichage;

public class FenetreInitInfo {
	
	public int nb_lievre;
	public int nb_lynx;
	public int nb_vautour;
	public int nb_flaques;
	public int duree;
	public int presence_riviere;
	public int presence_lac;
	
	public FenetreInitInfo() {}
	
	public FenetreInitInfo(int nb_lievre,int nb_lynx,int nb_vautour,int nb_flaques, int duree,String riv,String lac) {
		this.nb_lievre=nb_lievre;
		this.nb_lynx=nb_lynx;
		this.nb_vautour=nb_vautour;
		this.nb_flaques=nb_flaques;
		this.duree=duree;
		if (riv=="oui") {
			this.presence_riviere=1;
		}
		else {
			this.presence_riviere=0;
		}
		if (lac=="oui") {
			this.presence_lac=1;
		}
		else {
			this.presence_lac=0;
		}
	}
	
	public String toString() {
		String str;
		String lac;
		String riviere;
		if(this.nb_lievre!=0 && this.nb_lynx!=0 && this.nb_vautour!=0 && this.nb_flaques!=0 && this.duree!=0){
			if (presence_lac==1) {
				lac="oui";
			}
			else {
				lac = "non";
			}
			if (presence_riviere==1) {
				riviere="oui";
			}
			else {
				riviere = "non";
			}
			str = "Verification des parametres \n\n\n";
			str+= "Nombre de lievres : "+this.nb_lievre +"\n";
			str+= "Nombre de lynxs : "+this.nb_lynx +"\n";
			str+= "Nombre de vautours : "+this.nb_vautour +"\n\n";
			str+= "Présence de rivière : " + riviere + "\n";
			str+= "Présence de lac : " + lac+"\n";
			str+= "Nombre de flaques : "+this.nb_flaques +"\n\n";
			str+= "Duree de la simulation : "+this.duree +" ans\n\n";

		}
		else {
			str="Aucune Information !";
		}
		return str;
	}
	
}
