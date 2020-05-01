package affichage;




import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Image;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class CodeGrille extends JPanel {
	
	
	
	public final static int NB_LIGNES = 5;
	public final static int NB_COLONNES = 5;
 
	private int[][] grid = new int[NB_LIGNES][NB_COLONNES];
 
	private Image[] images;
 
	public CodeGrille() throws InterruptedException {
		
		images = new Image[5]; 
		images[0] = lireImage("images/lapin.jpg"); // attention à la manière d'aller chercher ce fichier (ceci peut fonctionner ou pas selon l'emplacement du fichier) : 
		images[1] = lireImage("images/lion.jpg");
		images[2] = lireImage("images/poussin.jpg");
		images[3] = lireImage("images/herbe.jpg");
		images[4] = lireImage("images/eau.jpg");
		
		
		for (int i = 0; i < NB_LIGNES; i++) {
			for (int j = 0; j < NB_COLONNES; j++) {
				grid[i][j] = 3 ;    //(int) (Math.random() * images.length)
			}
		}
	}
 
	private Image lireImage(String string) {
 
		try {
 
			return ImageIO.read(new File(string));
 
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
 
	}
 
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		drawGrid(g);
	}
 

	
	 
	private void drawGrid(Graphics g) {
	 
			int width = getWidth();
			int height = getHeight();
			int largeur = width / NB_COLONNES;
			int hauteur = height / NB_LIGNES;
	 
			for (int i = 0; i < NB_LIGNES; i++) {
				for (int j = 0; j < NB_COLONNES; j++) {
					int x = j * largeur;
					int y = i * hauteur;
	                                Image image = images[grid[i][j]];
	                                if ( image!=null ) { // on est sur au moins comme ça que si le fichier n'a pas été trouvé, on plante pas
					       g.drawImage(image, x, y, largeur, hauteur, this); 
	                                }
				}
			}
			//(int) Math.random() * (NB_COLONNES);
			//int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
			int j_animal=ThreadLocalRandom.current().nextInt(0, NB_COLONNES );
			int i_animal=ThreadLocalRandom.current().nextInt(0, NB_LIGNES );
			int x_an = j_animal * largeur;
			int y_an = i_animal * hauteur;
			Image image_an = images[1];
			g.drawImage(image_an, x_an, y_an, largeur, hauteur, this);
			
			///
	 
	                // on dessine la grille après pour qu'elle soit dessinée par dessus les images
	                g.setColor(Color.BLUE); // par exemple pour dessiner la grille en blanc
	 
	                for (int i = 0; i <= width; i += largeur) {  
	                    g.drawLine(i, 0, i, height);  
	                } 
	 
	                for (int i = 0; i <= height; i+=hauteur) { 
	                   g.drawLine(0, i, width, i); 
	                } 
	 
	 
	}
	}



	

	