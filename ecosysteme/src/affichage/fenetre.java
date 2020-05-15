
package affichage;

import java.util.ArrayList;

import javax.swing.JFrame;  

import individus.*;
import ressources.Ressource;

/**
 * <b> Cree la fenetre principale de notre ecosysteme et la met a jour au fil du temps qui passe <b>
 * <p> Pour cela, nous avons besoin des variables suivantes<p>
 * <ul>
 * <li> un ConteneurFenetre pan qui sera mis à jour a chaque instant de la simulation<li>
 * <ul>
 * 
 * @author Lucie & Augustin
 *
 */

public class fenetre extends JFrame {
	
	ConteneurFenetre pan;
	public int duree_ecoulee;
	
	/**
	 * Constructeur de la classe.
	 * 
	 * @param A_list
	 * 			Liste Array de type Animal regroupant les individus à modéliser.
	 * @param A_list_mort
	 * 			Liste Array de type Animal regroupant les individus morts de la simulation
	 * @param ressource
	 * 			Liste Array de type Ressource regroupant les ressources à modéliser.
	 * @param duree_ecoulee
	 * 			Duree ecoulee depuis le début de la simulation
	 * @param duree
	 * 			Duree de la modélisation.
	 * @throws InterruptedException
	 */
	public fenetre(ArrayList<Animal> A_list, ArrayList<Animal> A_list_mort, Ressource[] ressource,int duree_ecoulee,int duree) throws InterruptedException {
		super();
		this.duree_ecoulee=duree_ecoulee;
		this.duree_ecoulee=proprietesFenetre(A_list,A_list_mort,ressource,duree_ecoulee,duree);
	}
		

	/**
	 * Détermine le contenu de la fenetre, et permet a la simulation de se dérouler convenablement
	 * 
	 * @param A_list
	 * 			Liste Array de type Animal regroupant les individus à modéliser.
	 * @param A_list_mort
	 * 			Liste Array de type Animal regroupant les individus morts pendant la simulation
	 * @param ressource
	 * 			Liste Array de type Ressource regroupant les ressources à modéliser.
	 * @param duree_ecoulee
	 * 			Duree ecoulee depuis le debut de la simulation
	 * @param duree
	 * 			Duree de la modélisation.
	 * @return
	 * 			Duree ecoulee
	 * @throws InterruptedException
	 */
	private int proprietesFenetre(ArrayList<Animal> A_list,ArrayList<Animal> A_list_mort,Ressource[] ressource ,int duree_ecoulee, int duree) throws InterruptedException {
		
	
		this.setSize(800,1200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		
		int n=A_list.size();
		for (int i=0;i<n;i++) {
			A_list.get(i).deplacementAleatoire(A_list,ressource,i,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
		}
		
		pan=new ConteneurFenetre(A_list,ressource,duree_ecoulee);
		this.setContentPane(pan);
		this.setVisible(true);
		
		Fenetre_timer fenetretime = new Fenetre_timer(duree_ecoulee);
		fenetretime.setVisible(true);
		
		
		while (duree_ecoulee<duree*365 && A_list.size()>0) {
			duree_ecoulee++;
			n=A_list.size();
			int i=0;
			while (i<n) {
				if (A_list.get(i).est_vivant==true) {
					A_list.get(i).degradation_besoin();
					A_list.get(i).mort_naturelle(duree_ecoulee);
					A_list.get(i).deplacement(A_list,ressource,i,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES,duree_ecoulee);
					A_list.get(i).vieillir();
					if (A_list.get(i).est_enceinte==true){
						A_list.get(i).duree_ecoulee_gestation+=1;
						A_list.get(i).accouchement(A_list, ressource, duree_ecoulee);
					}
				}
				else {
					A_list.get(i).decomposition(ressource);
					A_list.get(i).disparition(A_list,A_list_mort,i);
				}
				i++;
				n=A_list.size();
			}
			ressource = Ressource.devient_desert(ressource);
			ressource = Ressource.regeneration(ressource);
			
			pan=new ConteneurFenetre(A_list,ressource,duree_ecoulee);
			this.setContentPane(pan);
			this.setVisible(true);
			
			fenetretime.maj_pan(duree_ecoulee);
			fenetretime.setVisible(true);

			Thread.sleep(10);
		}
		
		
	fenetretime.setVisible(false);
	this.setVisible(false);
	
	return duree_ecoulee;
	}
}
