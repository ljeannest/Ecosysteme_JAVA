
package affichage;

import javax.swing.JFrame; 

import individus.*;


public class fenetre extends JFrame {
	
	ConteneurFenetre pan;
	
	Environnement pan1;
	
	Individus pan2;
	
	
	
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
		
//		pan1=new Environnement();
//		this.setContentPane(pan1);
//		this.setVisible(true);
		
//		pan2=new Individus(A_list);
//		this.setContentPane(pan2);
//		this.setVisible(true);
		
		
		for (int k=0;k<300;k++) {
			int n=A_list.length;
			for (int i=0;i<n;i++) {
				A_list[i].deplacementAleatoire(A_list,i,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
			}
			
			pan=new ConteneurFenetre(A_list);
			this.setContentPane(pan);
			this.setVisible(true);
			
//			pan2=new Individus(A_list);
//			this.setContentPane(pan2);
//			this.setVisible(true);
			Thread.sleep(1000);
		}
		
		
	
		

		

		
		
		
		

		

		}
	

}
