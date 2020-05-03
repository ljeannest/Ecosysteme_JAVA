package test;

import test.Principalebis;

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

import individus.Animal;


public class ContenuFenetreBis extends JPanel{
	
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
	
	public final static int taille_grille_x=787;
	public final static int taille_grille_y=650;
	
	public final static int NB_LIGNES = 15;
	public final static int NB_COLONNES = 15;
 
	public final static int largeur = taille_grille_x/ NB_COLONNES;
	public final static int hauteur = taille_grille_y/ NB_LIGNES;
	
	
	public ContenuFenetreBis(Animal A) throws InterruptedException {
		
		super();
		
		this.proprietesConteneur(A);

	}
	
	private void proprietesConteneur(Animal A) throws InterruptedException {
		
		this.setLayout(null);
		this.setGrille(A);

		
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

	
	private  void setGrille(Animal A) throws InterruptedException {
		

		grille = new JPanel (new GridLayout (NB_LIGNES,NB_COLONNES));

		for(int i = 0; i<NB_LIGNES;i++){
			for(int j = 0; j<NB_COLONNES;j++){
		
				if (i==NB_LIGNES-A.posy-1 && j==A.posx) {
					
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
