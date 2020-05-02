// verife gus5
package affichage;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;



import javax.swing.BorderFactory;
import javax.swing.ImageIcon; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ConteneurFenetre extends JPanel{
	
	
	ImageIcon icon_herbe = new ImageIcon(new ImageIcon("images/vert.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	ImageIcon icon_eau = new ImageIcon(new ImageIcon("images/bleu.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	ImageIcon icon_lapin = new ImageIcon(new ImageIcon("images/lapin.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	ImageIcon icon_lion = new ImageIcon(new ImageIcon("images/lion.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	Border grayline = BorderFactory.createLineBorder(Color.GRAY,1); 
	Border blackline = BorderFactory.createLineBorder(Color.black,2); 
	Border blueline = BorderFactory.createLineBorder(Color.blue,1); 
	Border redline = BorderFactory.createLineBorder(Color.red,1); 
	
	private JLabel etiquette ;
	private JButton bouton;
	private JTextField champTexte;
	private JPanel grille;
	
	public final static int pos_x=3;//position animal en x
	public final static int pos_y=3;//position animal en y
	
	
	public final static int taille_grille_x=787;
	public final static int taille_grille_y=650;
	
	public final static int NB_LIGNES = 15;
	public final static int NB_COLONNES = 15;
 
	public final static int largeur = taille_grille_x/ NB_COLONNES;
	public final static int hauteur = taille_grille_y/ NB_LIGNES;
	
	
	//private int[][] grid = new int[NB_LIGNES][NB_COLONNES];
	//private Image[] images;
	
	public ConteneurFenetre() throws InterruptedException {
		
		super();
		
		//int a = 1, b = 15;
		//while (a < b) {
		//Thread.sleep(1000);
		this.proprietesConteneur();

	}
	
	private void proprietesConteneur() throws InterruptedException {
		
		this.setLayout(null);
		//this.proprietesEtiquette();
		//this.propBouton();
		//this.propChampTexte();
		//this.affichImage();
		this.setGrille();

		
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
	//private void affichImage() {
		

		
		//imageLb1= new JLabel();
		//iconPhoto = new ImageIcon("images/lapin_60-43.jpg");
		//this.imageLb1.setBounds(100, 100, 60, 43);
		//this.imageLb1.setIcon(iconPhoto);
		//this.add(imageLb1);
		
		
		
	//}

	
	private  void setGrille() throws InterruptedException {
		

		grille = new JPanel (new GridLayout (NB_LIGNES,NB_COLONNES));
		

		
		for(int i = 0; i<NB_LIGNES;i++){
			for(int j = 0; j<NB_COLONNES;j++){
		
				if (i==NB_LIGNES-pos_y-1 && j==pos_x) {
					
					JLabel emplacement = new JLabel(icon_lapin);
					   
					emplacement.setBorder(redline);	
					emplacement.setSize(largeur, hauteur);
					
					grille.add(emplacement);
					
				}
				else {
					JLabel emplacement = new JLabel(icon_herbe);
					   
					emplacement.setBorder(grayline);
					emplacement.setSize(largeur, hauteur);
						
					grille.add(emplacement);
				}}}

	
		grille.setBorder(blackline);
		this.grille.setBounds(0, 0, taille_grille_x, taille_grille_y);
		this.add(grille);
		this.setVisible(true);
		
		//Thread.sleep(1000);
	}
}
	

	

