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

import individus.Animal;
import test.ContenuFenetreBis;

public class ConteneurFenetre extends JPanel{
	public int[][] grid = new int[ContenuFenetreBis.NB_LIGNES][ContenuFenetreBis.NB_COLONNES];
	
	ImageIcon icon_herbe = new ImageIcon(new ImageIcon("images/vert.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	ImageIcon icon_eau = new ImageIcon(new ImageIcon("images/bleu.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	ImageIcon icon_lynx = new ImageIcon(new ImageIcon("images/lynx.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	ImageIcon icon_lievre = new ImageIcon(new ImageIcon("images/lievre.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	ImageIcon icon_vautour = new ImageIcon(new ImageIcon("images/vautour.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
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
	
	
	//private int[][] grid = new int[NB_LIGNES][NB_COLONNES];
	//private Image[] images;
	
	public ConteneurFenetre(Animal[] A_list) throws InterruptedException {
		
		super();
		
		//int a = 1, b = 15;
		//while (a < b) {
		//Thread.sleep(1000);
		this.proprietesConteneur(A_list);

	}
	
	private void proprietesConteneur(Animal[] A_list) throws InterruptedException {
		
		this.setLayout(null);
		//this.proprietesEtiquette();
		//this.propBouton();
		//this.propChampTexte();
		//this.affichImage();
		this.Set_grille_position(A_list);
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

	
	private void Set_grille_position(Animal[] A_list) {
		for(int i = 0; i<NB_LIGNES;i++){
			for(int j = 0; j<NB_COLONNES;j++){
				this.grid[i][j]=0;//herbe par defaut
			
			}
		}
		int n = A_list.length;
		for (int k=0; k<n; k++) {
			if (A_list[k].espece=="Lynx") {
				this.grid[A_list[k].posx][A_list[k].posy]=1;}
			
			if (A_list[k].espece=="Lievre") {
				this.grid[A_list[k].posx][A_list[k].posy]=2;}
		
			if (A_list[k].espece=="Vautour") {
				this.grid[A_list[k].posx][A_list[k].posy]=3;}
			}
		}
	
	
	private  void setGrille() throws InterruptedException {
		

		grille = new JPanel (new GridLayout (NB_LIGNES,NB_COLONNES));
		
		
		
		for(int i = 0; i<NB_LIGNES;i++){
			for(int j = 0; j<NB_COLONNES;j++){
		
				int valeur_emplacement = grid[j][NB_LIGNES-i-1];
				
				if (valeur_emplacement==1) {
					
					JLabel emplacement = new JLabel(icon_lynx);
					   
					emplacement.setBorder(redline);	
					emplacement.setSize(largeur, hauteur);
					
					grille.add(emplacement);}
				
				else if (valeur_emplacement==2) {
					
					JLabel emplacement = new JLabel(icon_lievre);
					   
					emplacement.setBorder(redline);	
					emplacement.setSize(largeur, hauteur);
					
					grille.add(emplacement);}	
					
				else if (valeur_emplacement==3) {
					
					JLabel emplacement = new JLabel(icon_vautour);
					   
					emplacement.setBorder(redline);	
					emplacement.setSize(largeur, hauteur);
					
					grille.add(emplacement);}
					
					
				
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
	

	

