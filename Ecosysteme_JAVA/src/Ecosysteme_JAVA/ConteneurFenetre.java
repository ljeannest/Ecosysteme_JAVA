
package Ecosysteme_JAVA;

import javax.swing.ImageIcon; 
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConteneurFenetre extends JPanel{
	
	
	private JLabel etiquette ;
	private JButton bouton;
	private JTextField champTexte;
	private JLabel imageLb1;
	private ImageIcon iconPhoto;
	
	
	public ConteneurFenetre() {
		
		super();
		this.proprietesConteneur();
		

	}
	
	private void proprietesConteneur() {
		
		this.setLayout(null);
		this.proprietesEtiquette();
		this.propBouton();
		this.propChampTexte();
		this.affichImage();
		

		
	}
	private void proprietesEtiquette() {
		
		etiquette = new JLabel();
		
		
		this.etiquette.setBounds(20,10,350,20);
		this.etiquette.setText("TEXTE");
		this.add(etiquette);
		
	
		
	}
		
	private void propBouton() {
		this.bouton= new JButton();
		this.bouton.setText("appuyer");
		this.bouton.setBounds(30, 50, 90, 20);
		this.add(bouton);
	}
	
	private void propChampTexte() {
		
		champTexte = new JTextField();
		this.champTexte.setBounds(130, 50, 100, 20);
		this.add(champTexte);
		
	}
	private void affichImage() {
		
		imageLb1= new JLabel();
		iconPhoto = new ImageIcon("images/lapin_60-43.jpg");
		this.imageLb1.setBounds(100, 100, 60, 43);
		this.imageLb1.setIcon(iconPhoto);
		this.add(imageLb1);
		
		
		
	}
	
}
