
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
		
		
		int duree_ecoulee=0;
		pan=new ConteneurFenetre(A_list,ressource,duree_ecoulee);
		this.setContentPane(pan);
		this.setVisible(true);
		
		Fenetre_timer fenetretime = new Fenetre_timer(duree_ecoulee);
		fenetretime.setVisible(true);
		String orientation="E";
		
		
		for (int k=0;k<duree*365;k++) {
			duree_ecoulee++;
			int n=A_list.size();
			for (int i=0;i<n;i++) {
				orientation=A_list.get(i).setOrientationEau(ressource);
				A_list.get(i).deplacement(A_list,ressource,i,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES,orientation);
			}
			
			pan=new ConteneurFenetre(A_list,ressource,duree_ecoulee);
			this.setContentPane(pan);
			this.setVisible(true);
			
			fenetretime.maj_pan(duree_ecoulee);
			fenetretime.setVisible(true);

			Thread.sleep(10);
		}
		
		
	
		

		

		
		
		
		

		

		}
	

}
