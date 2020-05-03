package test;

import javax.swing.JFrame; 

import affichage.ConteneurFenetre;
import affichage.fenetre;
import individus.Animal;
import individus.Lievre;

public class Fenetrebis extends JFrame{
	
	ContenuFenetreBis pan;
	
	
	public Fenetrebis(Animal A) throws InterruptedException {
		super();
		
		proprietesFenetre(A);}
		


	private void proprietesFenetre(Animal A) throws InterruptedException {
		
	
		this.setSize(800,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		
		pan=new ContenuFenetreBis(A);
		this.setContentPane(pan);
		
		for (int k=0;k<1;k++) {
			A.deplacementaleatoire(ContenuFenetreBis.NB_LIGNES,ContenuFenetreBis.NB_COLONNES);
			pan=new ContenuFenetreBis(A);
			this.setContentPane(pan);
			this.setVisible(true);
			Thread.sleep(500);
		}
	}
}
