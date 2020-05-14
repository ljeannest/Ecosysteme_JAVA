package individus;

import ressources.*;

/**
 * <b> Individus de type Animal mais ne mangeant que les ressources de type herbe.</b>
 * 
 * <p> Il est identifié par l'id 0 dans type.</p>
 * 
 *@see Animal
 *
 * @author Lucie
 * @version 2.0
 *
 */
public class Herbivore extends Animal {
	
	/**
	 * Constructeur du type Herbivore
	 * 
	 * @param espece
	 * 			Espece d'herbivore.
	 * @param posx
	 * 			Position en X.
	 * @param posy
	 * 			Position en Y.
	 * @param sexe
	 * 			Genre de l'animal('F' ou 'M').
	 * @param age
	 * 			Age.
	 * @param esp_de_vie
	 * 			Espérance de vie.
	 * @param qte_viande
	 * 			Quantite que l'individue représente en viande.
	 * @param ageReproMin
	 * 			Age minimal pour la reproduction.
	 * @param ageReproMax
	 * 			Age maximal pour la reproduction.
	 */

	public Herbivore(String espece, int posx, int posy, String sexe, int age, int esp_de_vie,int qte_viande, int ageReproMin, int ageReproMax,int date_naissance,int duree_gestation) {
		super(espece, 0, posx, posy, sexe, age, esp_de_vie,100,100, qte_viande, ageReproMin, ageReproMax,date_naissance,duree_gestation);
	}
	

	
	
}
