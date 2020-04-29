
package affichage;

import javax.swing.JFrame;

public class fenetre extends JFrame {
	
	ConteneurFenetre pan;
	
	public fenetre() {
		super();
		
		proprietesFenetre();
		
		
	}
	
	
	private void proprietesFenetre() {
		this.setSize(500,500);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		pan=new ConteneurFenetre();
		this.setContentPane(pan);
	
	}

}
