
package affichage;

import javax.swing.JFrame; 

import individus.*;


public class fenetre extends JFrame {
	
	ConteneurFenetre pan;
	
	
	public fenetre(Animal[] A_list, int nb_flaque,int presencelac,int presenceriviere,int duree) throws InterruptedException {
		super();
		
		proprietesFenetre(A_list,nb_flaque,presencelac,presenceriviere,duree);}
		


	private void proprietesFenetre(Animal[] A_list, int nb_flaque,int presencelac,int presenceriviere,int duree) throws InterruptedException {
		
	
		this.setSize(800,1200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		
		int[] posx=new int[nb_flaque+presencelac+presenceriviere];
		int[] posy=new int[nb_flaque+presencelac+presenceriviere];
		for (int k=0; k<nb_flaque+presencelac+presenceriviere;k++) {
			posx[k]= (int)(Math.random()*ConteneurFenetre.NB_LIGNES);
			posy[k]= (int)(Math.random()*ConteneurFenetre.NB_COLONNES);
		}
		
		int duree_ecoulee=0;
		pan=new ConteneurFenetre(A_list,posx,posy,presencelac,presenceriviere,duree_ecoulee);
		this.setContentPane(pan);
		this.setVisible(true);
		
		Fenetre_timer fenetretime = new Fenetre_timer(duree_ecoulee);
		fenetretime.setVisible(true);
		
		
		for (int k=0;k<duree*365;k++) {
			duree_ecoulee++;
			int n=A_list.length;
			for (int i=0;i<n;i++) {
				A_list[i].deplacementAleatoire(A_list,i,ConteneurFenetre.NB_LIGNES,ConteneurFenetre.NB_COLONNES);
			}
			
			pan=new ConteneurFenetre(A_list,posx,posy,presencelac,presenceriviere,duree_ecoulee);
			this.setContentPane(pan);
			this.setVisible(true);
			
			fenetretime.maj_pan(duree_ecoulee);
			fenetretime.setVisible(true);
			
//			pan2=new Individus(A_list);
//			this.setContentPane(pan2);
//			this.setVisible(true);
			Thread.sleep(50);
		}
		
		
	
		

		

		
		
		
		

		

		}
	

}
