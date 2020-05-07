
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
		
		int nb_flaque=(int)(Math.random()*6)+4;
		int[] posx=new int[nb_flaque+2];
		int[] posy=new int[nb_flaque+2];
		for (int k=0; k<nb_flaque+2;k++) {
			posx[k]= (int)(Math.random()*ConteneurFenetre.NB_LIGNES);
			posy[k]= (int)(Math.random()*ConteneurFenetre.NB_COLONNES);
		}
		
		pan=new ConteneurFenetre(A_list,posx,posy);
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
			
			pan=new ConteneurFenetre(A_list,posx,posy);
			this.setContentPane(pan);
			this.setVisible(true);
			
//			pan2=new Individus(A_list);
//			this.setContentPane(pan2);
//			this.setVisible(true);
			Thread.sleep(1000);
		}
		
		
	
		

		

		
		
		
		

		

		}
	

}
