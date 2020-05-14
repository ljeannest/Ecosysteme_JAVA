package affichage;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import individus.*;

import ressources.*;

/**
 *<b> Permet de l'affichage de l'ecosysteme et de l'actualiser selon le temps qui passe.</b>
 * <p>Les variables suivantes sont donc n�cessaire:</p>
 * <ul>
 * <li> Un tableau de type Ressources au dimension de l'ecosysteme regroupere toute les ressources pr�sente dans l'ecosysteme.</li>
 * <li> Un tableau de type Animal au dimension de l'ecosysteme qui regroupera toute les individus pr�sent dans l'ecosyteme.</li>
 * <li> Une image de type icon et de couleur verte qui servira � mod�liser l'herbe dans l'ecosyteme.</li>
 * <li> Une image de type icon et de couleur bleu clair qui servira � mod�liser l'Eau de sous-type Flaque.</li>
 * <li> Une image de type icon et de couleur bleu fonce qui servire � modeliser l'Eau de sous-type Lac et Riviere.</li>
 * <li> Une image de type icon de couleur marron clair qui servira � modeliser le Desert.</li>
 * <li> Une image de type icon representant un Lynx.</li>
 * <li> Une image de type icon representant un Lievre</li>
 * <li> Une image de type icon representant un Vautour</li>
 * <li> les borudre des cases auront des coiuleur pour un meilleur rendu visuel et faire ressortir les diff�rents type se trouvant dans l'ecosysteme.</li>
 * <li> Des varaibles permettant l'affichage d'un menu de selection pour l'utilisateur via des boutons.</li>
 * <li> La taille de la grille en X mise par d�fault � 787.</li>
 * <li> La taille de la grille en Y mise par d�fault � 650.</li>
 * <li> Le nombre de lignes du tableau repr�sentant l'ecosysteme.</li>
 * <li> Le nombre de colonne du tableau repr�sentant l'ecosysteme.</li>
 * <li> La largeur d�finit comme le rapport de la taille de la grille en X et du nombre de lignes.</li>
 * <li> La hauteur definit comme le rapport de la taille de la grille en Y et du nombre de colonnes.</li>
 * <li> Une liste array de type Ressource contenant les points d'Eau.</li>
 * <li> Une liste array de type Ressource contenant de l'herbe.</li>
 * </ul>
 *
 */


public class ConteneurFenetre extends JPanel{
	
	/**
	 * Tableau de type Ressource regroupant les ressources pr�sente dans l'ecosysteme.
	 */
	public Ressource[][] grid_ressources = new Ressource[NB_COLONNES][NB_LIGNES];
	
	/**
	 * Tableau de type Animal regroupant les animaux present dans l'ecosysteme.
	 */
	public Animal[][] grid_animaux = new Animal[NB_COLONNES][NB_LIGNES];// �a
	
	
	/**
	 * Icon repr�sentant l'herbe.
	 */
	ImageIcon icon_herbe = new ImageIcon(new ImageIcon("images/vert.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant de l'eau clair.
	 */
	ImageIcon icon_eau_claire = new ImageIcon(new ImageIcon("images/bleu clair.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icone repr�sentant de l'eau fonc�.
	 */
	ImageIcon icon_eau_foncee = new ImageIcon(new ImageIcon("images/bleu fonce.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant le desert.
	 */
	ImageIcon icon_desert = new ImageIcon (new ImageIcon("images/marron clair.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant un Lynx
	 */
	ImageIcon icon_lynx = new ImageIcon(new ImageIcon("images/lynx.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/** 
	 * Icon repr�sentant un Lievre.
	 */
	ImageIcon icon_lievre = new ImageIcon(new ImageIcon("images/lievre.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon representant un Vautour.
	 */
	ImageIcon icon_vautour = new ImageIcon(new ImageIcon("images/vautour.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon representant un Lievre mort.
	 */
	ImageIcon icon_lievre_mort = new ImageIcon(new ImageIcon("images/lievre_mort.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon representant un Lynx mort.
	 */
	ImageIcon icon_lynx_mort = new ImageIcon(new ImageIcon("images/lynx_mort.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon representant un Vautour.
	 */
	ImageIcon icon_vautour_mort = new ImageIcon(new ImageIcon("images/vautour_mort.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	
	/**
	 * Bordure de case de couleur grise.
	 */
	Border grayline = BorderFactory.createLineBorder(Color.GRAY,1); 

	
	/**
	 * Bordure de case de couleurer noir.
	 */
	Border blackline = BorderFactory.createLineBorder(Color.black,1); 
	
	/**
	 * Bordure de case de couleur bleu.
	 */

	Border blueline = BorderFactory.createLineBorder(Color.blue,1); 
	
	/**
	 * Bordure de case de couleur rouge.
	 */
	Border redline = BorderFactory.createLineBorder(Color.red,1); 
	Border whiteline = BorderFactory.createLineBorder(Color.white,1);
	Border greenline = BorderFactory.createLineBorder(Color.green,1);
	

	private JPanel grille;
	

	
	/**
	 * Taille de la grille en X.
	 */
	public final static int taille_grille_x=787;
	
	/**
	 * taille de la grille en Y
	 */
	public final static int taille_grille_y=650;
	
	
	/**
	 * Nombre de lignes dans le tableau.
	 */
	public static int NB_LIGNES = 30;
	
	/**
	 * Nombre de colonnes dans le tableau.
	 */
	public static int NB_COLONNES = 30;
 
	
	/**
	 * Largeur de la fentre.
	 */
	public static int largeur = taille_grille_x/ NB_COLONNES;
	
	/**
	 * hauteur de la fenetre
	 */
	public static int hauteur = taille_grille_y/ NB_LIGNES;
	
	
	/**
	 * Liste Array de type Ressource regroupant les points d'eau dans l'ecosysteme.
	 */
	public  ArrayList<Ressource> point_eau;
	
	/**
	 * Liste Aray de type Ressource  regroupant l'herbe.
	 */
	public static ArrayList<Ressource> herbe;
	
	//private int[][] grid = new int[NB_LIGNES][NB_COLONNES];
	//private Image[] images;
	
	/**
	 * Constructeur de la classe.
	 * 
	 * @param A_list
	 * 			Liste Array de type Animal regroupant les individus � mod�liser.
	 * @param ressource
	 * 			Liste Array de type Ressource regroupant les ressources � mod�liser.
	 * @param duree_ecoulee
	 * 			Duree de la mod�lisation.
	 * @throws InterruptedException
	 */
	public ConteneurFenetre(ArrayList<Animal> A_list,Ressource[] ressource,int duree_ecoulee) throws InterruptedException {
		
		super();
		
		//int a = 1, b = 15;
		//while (a < b) {
		//Thread.sleep(1000);
		this.proprietesConteneur(A_list,ressource);
		
		String tempsec = duree_ecoulee/365 + " an et " + duree_ecoulee %365 + " jours";
		JPanel pan_temps = new JPanel();
		pan_temps.setBackground(Color.white);
		pan_temps.setPreferredSize(new Dimension(750,50));
		pan_temps.setBorder(BorderFactory.createTitledBorder("Temps �coul�"));
		JLabel temps_ecoule=new JLabel(tempsec);
		
		pan_temps.add(temps_ecoule);
		this.add(pan_temps,BorderLayout.SOUTH);


	}
	
	private void proprietesConteneur(ArrayList<Animal> A_list,Ressource[] ressource) throws InterruptedException {
		
		this.setLayout(null);
		//this.proprietesEtiquette();
		//this.propBouton();
		//this.propChampTexte();
		//this.affichImage();
		this.setGrilleEnv(ressource);
		this.Set_grille_position(A_list);
		this.setGrille();
		
	}
	

	
	private void Set_grille_position(ArrayList<Animal> a_list) {
		int n = a_list.size();
		for (int k=0; k<n; k++) {
				this.grid_animaux[a_list.get(k).posx][a_list.get(k).posy]=a_list.get(k);}//=A_list[k].espece
			}
		
	

	
	private void setGrilleEnv(Ressource[] ressource) {
		int n = ressource.length;
		for (int k=0; k<n; k++) {
				this.grid_ressources[ressource[k].posx][ressource[k].posy]=ressource[k];
		}
	}
	

	
	private  void setGrille() throws InterruptedException {
		
		
		grille = new JPanel (new GridLayout (NB_COLONNES,NB_LIGNES));
		
		
		
		for(int i = 0; i<NB_LIGNES;i++){
			for(int j = 0; j<NB_COLONNES;j++){
				JLabel emplacement=new JLabel(icon_herbe);//par d�fault comme bcp de herbe
				
				
				Animal animal_emplacement = grid_animaux[j][NB_LIGNES-i-1];
				
				Ressource ressource_emplacement = grid_ressources[j][NB_LIGNES-i-1];
				
				if (animal_emplacement!=null) {
				
				if (animal_emplacement.espece=="Lynx") {
					if (animal_emplacement.est_vivant==true) {
					 	emplacement = new JLabel(icon_lynx);
					 	emplacement.setBorder(redline);
					}
					else {
						emplacement = new JLabel(icon_lynx_mort);
					 	emplacement.setBorder(redline);
					}
				}
				else if (animal_emplacement.espece=="Lievre") {
					if (animal_emplacement.est_vivant == true) {
						emplacement = new JLabel(icon_lievre);
						emplacement.setBorder(whiteline);
					}
					else {
						emplacement = new JLabel(icon_lievre_mort);
					 	emplacement.setBorder(whiteline);
					}
				}
				else if (animal_emplacement.espece=="Vautour") {
					if (animal_emplacement.est_vivant == true) {
						emplacement = new JLabel(icon_vautour);
						emplacement.setBorder(blackline);	
					}
					else {
						emplacement = new JLabel(icon_vautour_mort);
					 	emplacement.setBorder(blackline);
					}
									
				}
				   
						}
					
				
				
					
				else  {
					
					if (ressource_emplacement.couleur=="bleu clair") {
					 	emplacement = new JLabel(icon_eau_claire);
					 	//emplacement.setBorder(blueline);
					 	
				}
					
					else if(ressource_emplacement.couleur=="bleu fonce") {
						emplacement = new JLabel(icon_eau_foncee);
						//emplacement.setBorder(blueline);
					}
					
					   
						
						
				
				else if (ressource_emplacement.type=="Vegetaux") {
					
					emplacement.setBorder(grayline);}
					
				}
					
					emplacement.setSize(largeur, hauteur);
					
					grille.add(emplacement);
				
				}
			}


		grille.setBorder(blackline);
		this.grille.setBounds(0, 0, taille_grille_x, taille_grille_y);
		this.add(grille);
		
		
		
		this.setVisible(true);
		
		//Thread.sleep(1000);
	}
}
	

	

