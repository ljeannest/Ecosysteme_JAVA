
package affichage;

import javax.swing.JFrame;

public class fenetre extends JFrame {
	
	
	ConteneurFenetre pan;
	CodeGrille grille;
	
	//int a = 1, b = 15;
	//while (a < b) {
	
	public fenetre() throws InterruptedException {
		super();
		
	
		proprietesFenetre();
		
		
		
		
	}
	//Thread.sleep(2000);
	


	private void proprietesFenetre() throws InterruptedException {
		int a = 1, b = 15;
	
		this.setSize(800,800);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		//pan=new ConteneurFenetre();
		
		
		grille=new CodeGrille();
		

		

		
		
		
		//this.setContentPane(pan);
		this.setContentPane(grille);
		

		}
	

}
