
package affichage;

import javax.swing.JFrame;

import individus.Animal;


public class fenetre extends JFrame {
	
	
	ConteneurFenetre pan;
	
	
	
	
	public fenetre(Animal A) throws InterruptedException {
		super();
		
		proprietesFenetre(A);}
		


	private void proprietesFenetre(Animal A) throws InterruptedException {
		
	
		this.setSize(800,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		
		pan=new ConteneurFenetre(A);
		this.setContentPane(pan);
		
		
		for (int k=0;k<10;k++) {
			A.deplacementaleatoire(ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
			pan=new ConteneurFenetre(A);
			this.setContentPane(pan);
			this.setVisible(true);
			Thread.sleep(500);
		}
		
		
	
		

		

		
		
		
		

		

		}
	

}
