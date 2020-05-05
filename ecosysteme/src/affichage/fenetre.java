
package affichage;

import javax.swing.JFrame; 

import individus.*;


public class fenetre extends JFrame {
	
	
	ConteneurFenetre pan;
	
	
	
	
	public fenetre(Animal[] A_list) throws InterruptedException {
		super();
		
		proprietesFenetre(A_list);}
		


	private void proprietesFenetre(Animal[] A_list) throws InterruptedException {
		
	
		this.setSize(800,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		
		pan=new ConteneurFenetre(A_list);
		this.setContentPane(pan);
		this.setVisible(true);
		
		
		for (int k=0;k<10;k++) {
			int n=A_list.length;
			for (int i=0;i<n;i++) {
				A_list[i].deplacementaleatoire(A_list,i,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
			}
			
			pan=new ConteneurFenetre(A_list);
			this.setContentPane(pan);
			this.setVisible(true);
			Thread.sleep(500);
		}
		
		
	
		

		

		
		
		
		

		

		}
	

}
