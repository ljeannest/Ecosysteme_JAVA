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
	public int[][] grid = new int[NB_COLONNES][NB_LIGNES];
	public int[][] grid_animaux = new int[NB_COLONNES][NB_LIGNES];
	
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
	
	public final static int NB_LIGNES = 30;
	public final static int NB_COLONNES = 30;
 
	public final static int largeur = taille_grille_x/ NB_COLONNES;
	public final static int hauteur = taille_grille_y/ NB_LIGNES;
	
	
	//private int[][] grid = new int[NB_LIGNES][NB_COLONNES];
	//private Image[] images;
	
	public ConteneurFenetre(Animal[] A_list,int[] posx, int[] posy,int presencelac, int presenceriviere) throws InterruptedException {
		
		super();
		
		//int a = 1, b = 15;
		//while (a < b) {
		//Thread.sleep(1000);
		this.proprietesConteneur(A_list,posx,posy,presencelac,presenceriviere);

	}
	
	private void proprietesConteneur(Animal[] A_list,int[] posx, int[] posy,int presencelac,int presenceriviere) throws InterruptedException {
		
		this.setLayout(null);
		//this.proprietesEtiquette();
		//this.propBouton();
		//this.propChampTexte();
		//this.affichImage();
		this.Set_grille_env(posx, posy,presencelac,presenceriviere);
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
	
	private void Set_lac(int posx , int posy) {
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;j++) {
				if (posx+i<NB_LIGNES && posy+j<NB_COLONNES && i+j<=4) {
					this.grid[posx+i][posy+j]=-1;
				}
				if (posx-i>=0 && posy-j>=0 && i+j<=4) {
					this.grid[posx-i][posy-j]=-1;
				}
				if (posx+i<NB_LIGNES && posy-j>=0 && i+j<=4) {
					this.grid[posx+i][posy-j]=-1;
				}
				if (posx-i>=0 && posy+j<NB_COLONNES && i+j<=4) {
					this.grid[posx-i][posy+j]=-1;
				}
			}
		}
	}
	
	private void Set_riviere(int posx, int posy) {
		for (int i=0;i<=posy;i++) {
			this.grid[posx][i]=-1;
		}
		for (int j=0;j<=posx;j++) {
			this.grid[j][posy]=-1;
		}
	}
	
	private void Set_flaque(int posx,int posy) {
		this.grid[posx][posy]=-1;
	}
	
	private void Set_grille_position(Animal[] A_list) {
		for(int i = 0; i<NB_LIGNES;i++){
			for(int j = 0; j<NB_COLONNES;j++){
				this.grid_animaux[i][j]=this.grid[i][j];//environnement
			
			}
		}
		int n = A_list.length;
		for (int k=0; k<n; k++) {
			if (A_list[k].espece=="Lynx") {
				this.grid_animaux[A_list[k].posx][A_list[k].posy]=1;}
			
			if (A_list[k].espece=="Lievre") {
				this.grid_animaux[A_list[k].posx][A_list[k].posy]=2;}
		
			if (A_list[k].espece=="Vautour") {
				this.grid_animaux[A_list[k].posx][A_list[k].posy]=3;}
			}
		}
	
	private void Set_grille_env(int[] posx, int[] posy, int presencelac, int presenceriviere) {
		for(int i = 0; i<NB_LIGNES;i++){
			for(int j = 0; j<NB_COLONNES;j++){
				this.grid[i][j]=0;//herbe par defaut
			
			}
		}
		if (presencelac==1 && presenceriviere ==1) {
			this.Set_lac(posx[0],posy[0]);
			this.Set_riviere(posx[1],posy[1]);
		
			int n = posx.length;
			for (int k=2;k<n;k++) {
				this.Set_flaque(posx[k], posy[k]);
			}
		}
		else if (presencelac==1 && presenceriviere ==0) {
			this.Set_lac(posx[0],posy[0]);
		
			int n = posx.length;
			for (int k=1;k<n;k++) {
				this.Set_flaque(posx[k], posy[k]);
			}
		}
		else if (presencelac==0 && presenceriviere ==1) {
			this.Set_riviere(posx[0],posy[0]);
		
			int n = posx.length;
			for (int k=1;k<n;k++) {
				this.Set_flaque(posx[k], posy[k]);
			}
		}
		else {
			int n = posx.length;
			for (int k=1;k<n;k++) {
				this.Set_flaque(posx[k], posy[k]);
			}
		}
	}
	

	
	private  void setGrille() throws InterruptedException {
		

		grille = new JPanel (new GridLayout (NB_COLONNES,NB_LIGNES));
		
		
		
		for(int i = 0; i<NB_LIGNES;i++){
			for(int j = 0; j<NB_COLONNES;j++){
		
				int valeur_emplacement = grid_animaux[j][NB_LIGNES-i-1];
				
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
					
				else if (valeur_emplacement==-1) {
					
					JLabel emplacement = new JLabel(icon_eau);
					   
					emplacement.setBorder(blueline);	
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
	

	

