package affichage;


/**
 * <b> Recupere les informations rentrees par l'utilisateur dans la fenetre initiale <b>
 * <p> Nous avons donc besoin des elements suivants : <p>
 * <ul>
 * <li> Un entier nb_lievre qui compte le nombre de lievres <li>
 * <li> Un entier nb_lynx qui compte le nombre de lynxs <li>
 * <li> Un entier nb_vautour qui compte le nombre de vautours <li>
 * <li> Un entier nb_flaques qui compte le nombre de flaques <li>
 * <li> Un entier duree qui recupere la duree maximale de la simulation <li>
 * <li> Un entier presence_riviere qui indique si l'utilisateur souhaite la presence d'une riviere <li>
 * <li> Un entier presence_lac qui indique si l'utilisateur souhaite la presence d'un lac <li>
 * <li> Un entier size qui indique la taille de l'ecosysteme souhaité <li>
 * <li> Un entier presence_foret qui indique si l'utilisateur souhaite la presence d'une foret <li>
 * <li> Un entier presence_compte_rendu qui indique si l'utilisateur souhaite la presence d'un compte rendu <li>
 * <ul>
 * @author Lucie
 *
 */
public class FenetreInitInfo {
	
	public int nb_lievre;
	public int nb_lynx;
	public int nb_vautour;
	public int nb_flaques;
	public int duree;
	public int presence_riviere;
	public int presence_lac;
	public int size;
	public int presence_foret;
	public int presence_compte_rendu;
	
	/**
	 * Constructeur dans le cas ou aucun argument n'est donné
	 */
	public FenetreInitInfo() {}
	
	/**
	 * Constructeur lorsque tous les parametres sont entres
	 * 
	 * @param nb_lievre
	 * @param nb_lynx
	 * @param nb_vautour
	 * @param nb_flaques
	 * @param duree
	 * @param riv
	 * @param lac
	 * @param size
	 * @param foret
	 * @param compte_rendu
	 */
	public FenetreInitInfo(int nb_lievre,int nb_lynx,int nb_vautour,int nb_flaques, int duree,String riv,String lac,int size, String foret,String compte_rendu) {
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
		if (foret=="oui") {
			this.presence_foret=1;
		}
		else {
			this.presence_foret=0;
		}
		if (compte_rendu=="oui") {
			this.presence_compte_rendu=1;
		}
		else {
			this.presence_compte_rendu=0;
		}
		this.size=size;
	}
	
	/**
	 * Permet d'afficher toutes les informations de l'element
	 */
	public String toString() {
		String str;
		String lac;
		String riviere;
		String foret;
		String compte_rendu;
		if(this.duree!=0){
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
			if (presence_foret==1) {
				foret="oui";
			}
			else {
				foret = "non";
			}
			if (presence_compte_rendu==1) {
				compte_rendu="oui";
			}
			else {
				compte_rendu="non";
			}
			str = "Verification des parametres \n\n\n";
			str+= "Nombre de lievres : "+this.nb_lievre +"\n";
			str+= "Nombre de lynxs : "+this.nb_lynx +"\n";
			str+= "Nombre de vautours : "+this.nb_vautour +"\n\n";
			str+= "Présence de foret : " + foret + "\n";
			str+= "Présence de rivière : " + riviere + "\n";
			str+= "Présence de lac : " + lac+"\n";
			str+= "Nombre de flaques : "+this.nb_flaques +"\n\n";
			str+= "Duree de la simulation : "+this.duree +" ans\n";
			str+= "Taille de la grille : "+this.size+"x"+this.size +"\n";
			str+= "Compte-rendu souhaité : "+ compte_rendu + "\n\n";

		}
		else {
			str="Aucune Information !";
		}
		return str;
	}
	
}
