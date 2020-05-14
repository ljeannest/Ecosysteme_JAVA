
package affichage;

import java.util.ArrayList;

import javax.swing.JFrame;  

import individus.*;
import ressources.Ressource;


public class fenetre extends JFrame {
	
	ConteneurFenetre pan;
	
	
	public fenetre(ArrayList<Animal> A_list, Ressource[] ressource,int duree) throws InterruptedException {
		super();
		
		proprietesFenetre(A_list,ressource,duree);
	}
		


	private void proprietesFenetre(ArrayList<Animal> A_list,Ressource[] ressource ,int duree) throws InterruptedException {
		
	
		this.setSize(800,1200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		
		ArrayList<Animal> A_list_mort = new ArrayList<Animal>(0);
		int duree_ecoulee=0;
		int n=A_list.size();
		for (int i=0;i<n;i++) {
			A_list.get(i).deplacementAleatoire(A_list,ressource,i,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
		}
		pan=new ConteneurFenetre(A_list,ressource,duree_ecoulee);
		this.setContentPane(pan);
		this.setVisible(true);
		
		Fenetre_timer fenetretime = new Fenetre_timer(duree_ecoulee);
		fenetretime.setVisible(true);
		
		
		for (int k=0;k<duree*365;k++) {
			duree_ecoulee++;
			n=A_list.size();
			int i=0;
			while (i<n) {
				if (A_list.get(i).est_vivant==true) {
					A_list.get(i).degradation_besoin();
					A_list.get(i).mort_naturelle(duree_ecoulee);
					A_list.get(i).deplacement(A_list,ressource,i,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
					A_list.get(i).vieillir();
				}
				else {
					A_list.get(i).decomposition(ressource);
					A_list.get(i).disparition(A_list,A_list_mort,i);
				}
				i++;
				n=A_list.size();
			}
			ressource = Ressource.devient_desert(ressource);
			
			pan=new ConteneurFenetre(A_list,ressource,duree_ecoulee);
			this.setContentPane(pan);
			this.setVisible(true);
			
			fenetretime.maj_pan(duree_ecoulee);
			fenetretime.setVisible(true);

			Thread.sleep(10);
		}
		
		
	
		

		

		
		
		
		

		

		}
	

}
