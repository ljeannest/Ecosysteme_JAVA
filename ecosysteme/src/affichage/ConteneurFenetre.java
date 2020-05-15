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
 *<b> Permet l'affichage de l'�cosyst�me et l'actualisation selon le temps qui passe.</b>
 * <p> Les variables suivantes sont donc n�cessaires:</p>
 * <ul>
 * <li> Un tableau de type Ressources aux dimensions de l'�cosyst�me regroupera toutes les ressources pr�sentes dans l'�cosyst�me.</li>
 * <li> Un tableau de type Animal aux dimensions de l'�cosyst�me qui regroupera tous les individus pr�sents dans l'�cosyst�me.</li>
 * <li> Une image de type icon et de couleur verte qui servira � mod�liser l'herbe dans l'�cosyst�me.</li>
 * <li> Une image de type icon et de couleur bleu clair qui servira � mod�liser l'Eau de sous-type Flaque.</li>
 * <li> Une image de type icon et de couleur bleu fonce qui servire � modeliser l'Eau de sous-type Lac et Riviere.</li>
 * <li> Une image de type icon de couleur marron clair qui servira � modeliser le Desert.</li>
 * <li> Une image de type icon repr�sentant un Lynx.</li>
 * <li> Une image de type icon repr�sentant un Lievre</li>
 * <li> Une image de type icon repr�sentant un Vautour</li>
 * <li> les bordures des cases auront des couleurs pour un meilleur rendu visuel et pour faire ressortir les diff�rents types se trouvant dans l'�cosyst�me.</li>
 * <li> Des variables permettant l'affichage d'un menu de selection pour l'utilisateur via des boutons.</li>
 * <li> La taille de la grille en X mise par d�faut � 787.</li>
 * <li> La taille de la grille en Y mise par d�faut � 650.</li>
 * <li> Le nombre de lignes du tableau repr�sentant l'�cosyst�me.</li>
 * <li> Le nombre de colonne du tableau repr�sentant l'�cosyst�me.</li>
 * <li> La largeur d�finit comme le rapport de la taille de la grille en X et du nombre de lignes.</li>
 * <li> La hauteur definit comme le rapport de la taille de la grille en Y et du nombre de colonnes.</li>
 * <li> Une liste array de type Ressource contenant les points d'Eau.</li>
 * <li> Une liste array de type Ressource contenant de l'herbe.</li>
 * </ul>
 *
 */


public class ConteneurFenetre extends JPanel{
	
	/**
	 * Tableau de type Ressource regroupant les ressources pr�sentes dans l'�cosyst�me.
	 */
	public Ressource[][] grid_ressources = new Ressource[NB_COLONNES][NB_LIGNES];
	
	/**
	 * Tableau de type Animal regroupant les animaux pr�sents dans l'�cosyst�me.
	 */
	public Animal[][] grid_animaux = new Animal[NB_COLONNES][NB_LIGNES];
	
	
	/**
	 * Icon repr�sentant l'herbe.
	 */
	ImageIcon icon_herbe = new ImageIcon(new ImageIcon("images/vert clair.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant la foret.
	 */
	ImageIcon icon_foret = new ImageIcon(new ImageIcon("images/vert fonce2.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant de l'eau claire.
	 */
	ImageIcon icon_eau_claire = new ImageIcon(new ImageIcon("images/bleu clair2.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icone repr�sentant de l'eau fonc�e.
	 */
	ImageIcon icon_eau_foncee = new ImageIcon(new ImageIcon("images/bleu fonce2.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icone repr�sentant le Desert.
	 */
	ImageIcon icon_desert = new ImageIcon (new ImageIcon("images/marron clair.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant un Lynx.
	 */
	ImageIcon icon_lynx = new ImageIcon(new ImageIcon("images/lynx.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/** 
	 * Icon repr�sentant un Lievre.
	 */
	ImageIcon icon_lievre = new ImageIcon(new ImageIcon("images/lievre.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant un Vautour.
	 */
	ImageIcon icon_vautour = new ImageIcon(new ImageIcon("images/vautour.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant un Lievre mort.
	 */
	ImageIcon icon_lievre_mort = new ImageIcon(new ImageIcon("images/lievre_mort.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant un Lynx mort.
	 */
	ImageIcon icon_lynx_mort = new ImageIcon(new ImageIcon("images/lynx_mort.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon r�presentant un Vautour.
	 */
	ImageIcon icon_vautour_mort = new ImageIcon(new ImageIcon("images/vautour_mort.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant un Lievre en gestation.
	 */
	ImageIcon icon_lievre_enceinte = new ImageIcon(new ImageIcon("images/lievre_enceinte.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant un Lynx en gestation.
	 */
	ImageIcon icon_lynx_enceinte = new ImageIcon(new ImageIcon("images/lynx_enceinte.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	/**
	 * Icon repr�sentant un Vautour en gestation.
	 */
	ImageIcon icon_vautour_enceinte = new ImageIcon(new ImageIcon("images/vautour_enceinte.jpg").getImage().getScaledInstance(largeur, hauteur, Image.SCALE_DEFAULT));
	
	
	
	/**
	 * Bordure de case de couleur grise.
	 */
	Border grayline = BorderFactory.createLineBorder(Color.GRAY,1); 

	
	/**
	 * Bordure de case de couleur noire.
	 */
	Border blackline = BorderFactory.createLineBorder(Color.black,1); 
	
	/**
	 * Bordure de case de couleur bleue.
	 */

	Border blueline = BorderFactory.createLineBorder(Color.blue,1); 
	
	/**
	 * Bordure de case de couleur rouge.
	 */
	Border redline = BorderFactory.createLineBorder(Color.red,1);
	
	/**
	 * Bordure de case de couleur blanche.
	 */
	Border whiteline = BorderFactory.createLineBorder(Color.white,1);
	
	/**
	 * Bordure de case de couleur verte.
	 */
	Border greenline = BorderFactory.createLineBorder(Color.green,1);
	
	/**
	 * JPanel qui contient la grille d'affichage de l'ecosysteme.
	 */
	private JPanel grille;

	
	/**
	 * Taille de la grille en X.
	 */
	public final static int taille_grille_x=787;
	
	/**
	 * taille de la grille en Y.
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
	 * Largeur de la fen�tre.
	 */
	public static int largeur = taille_grille_x/ NB_COLONNES;
	
	/**
	 * Hauteur de la fen�tre.
	 */
	public static int hauteur = taille_grille_y/ NB_LIGNES;
	
	
	/**
	 * Liste Array de type Ressource regroupant les points d'eau dans l'�cosyst�me.
	 */
	public  ArrayList<Ressource> point_eau;
	
	/**
	 * Liste Array de type Ressource regroupant l'herbe.
	 */
	public static ArrayList<Ressource> herbe;

	
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
	
	/**
	 * Permet de g�n�rer le JPanel contenant l'ecosysteme.
	 * 
	 * @param A_list
	 *         Liste des individus pr�sents dans l'ecosysteme (vivant ou mort mais non decompos�)
	 * @param ressource
	 *         Liste de toutes les ressources de l'environnement (tous les elements Ressource pr�sents dans l'ecosysteme)
	 *
	 * @throws InterruptedException
	 * 
	 * @author Lucie
	 */
	private void proprietesConteneur(ArrayList<Animal> A_list,Ressource[] ressource) throws InterruptedException {
		
		this.setLayout(null);
		this.setGrilleEnv(ressource);
		this.Set_grille_position(A_list);
		this.setGrille();
		
	}
	

	/**
	 * Permet de g�n�rer un tableau qui positionne les individus
	 * 
	 * @param A_list
	 *         Liste des individus pr�sents dans l'ecosysteme (vivant ou mort mais non decompos�)
	 * 
	 * @author Lucie
	 */
	private void Set_grille_position(ArrayList<Animal> a_list) {
		int n = a_list.size();
		for (int k=0; k<n; k++) {
				this.grid_animaux[a_list.get(k).posx][a_list.get(k).posy]=a_list.get(k);}//=A_list[k].espece
			}
		
	

	/**
	 * Permet de g�n�rer un tableau qui positionne les ressources
	 * 
	 * @param ressource
	 *         Liste des ressources pr�sentes dans l'ecosysteme
	 * 
	 * @author Lucie
	 */
	private void setGrilleEnv(Ressource[] ressource) {
		int n = ressource.length;
		for (int k=0; k<n; k++) {
				this.grid_ressources[ressource[k].posx][ressource[k].posy]=ressource[k];
		}
	}
	

	/**
	 * Cr�ation de la grille permettant l'affichage de l'ecosysteme avec ses ressources et ses individus
	 * 
	 * @author Lucie
	 */
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
							if (animal_emplacement.est_enceinte==false) {
								emplacement = new JLabel(icon_lynx);
								emplacement.setBorder(redline);
							}
							else {
								emplacement = new JLabel(icon_lynx_enceinte);
								emplacement.setBorder(redline);
							}
						}
						else {
							emplacement = new JLabel(icon_lynx_mort);
							emplacement.setBorder(redline);
						}
					}
					else if (animal_emplacement.espece=="Lievre") {
						if (animal_emplacement.est_vivant == true) {
							if (animal_emplacement.est_enceinte==false) {
								emplacement = new JLabel(icon_lievre);
								emplacement.setBorder(whiteline);
							}
							else {
								emplacement = new JLabel(icon_lievre_enceinte);
								emplacement.setBorder(whiteline);
							}
						}
						else {
							emplacement = new JLabel(icon_lievre_mort);
							emplacement.setBorder(whiteline);
						}
					}
					else if (animal_emplacement.espece=="Vautour") {
						if (animal_emplacement.est_vivant == true) {
							if (animal_emplacement.est_enceinte==false) {
								emplacement = new JLabel(icon_vautour);
								emplacement.setBorder(blackline);	
							}
							else {
								emplacement = new JLabel(icon_vautour_enceinte);
								emplacement.setBorder(blackline);	
							}
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
					
					   
					else if (ressource_emplacement.type=="Desert") {
						emplacement = new JLabel(icon_desert);
						//emplacement.setBorder(grayline);
					}
						
				
					else if (ressource_emplacement.couleur=="vert fonce") {
						emplacement = new JLabel(icon_foret);
						//emplacement.setBorder(grayline);
					}
					
				}
					
				emplacement.setSize(largeur, hauteur);
					
				grille.add(emplacement);
				
			}
		}


		grille.setBorder(blackline);
		this.grille.setBounds(0, 0, taille_grille_x, taille_grille_y);
		this.add(grille);
		this.setVisible(true);
	
	}
}
	

	

