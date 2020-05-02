
package affichage;

import javax.swing.JFrame;

public class fenetre extends JFrame {
	
	
	ConteneurFenetre pan;
	
	
	
	
	public fenetre() throws InterruptedException {
		super();
		
		proprietesFenetre();}
		


	private void proprietesFenetre() throws InterruptedException {
		
	
		this.setSize(800,700);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		
		pan=new ConteneurFenetre();
		this.setContentPane(pan);
		
		
	
		

		

		
		
		
		

		

		}
	

}
