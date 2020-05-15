package statistique;

/**
 * <b> Permet de créer le pdf compte rendu avec les donnés traité statistiquements</b>
 * <p>Les données nécessaire à cette assemblage sont les suivantes:</p>
 * <ul>
 * <li> Une liste contenant les nombres d'individus total par espéce durant la simulation. </li>
 * <li> Une liste comprenant les moyennnes age par espéce sur la durée de simulation. </li>
 * <li> Une liste comprenant les moyennes d'age à la mort par espéce. </li>
 * <li> La raisons de la fin de la simulation. </li>
 * <li> La duree de la simulation prévue. </li>
 * <li> La duree reel de la simulation. </li>
 * <li> Le nombre d'espece en début de simulation. </li>
 * <li> Le nombre d'espece en fin de simulation. </li>
 * <li> Une liste comprenant les nombres d'individus par espece en début de simulation.</li>
 * <li> Une liste comprenant les nombres d'individus par espece en fin de simulation. </li>
 * <li> Une liste comprenant les nombres moyen de naissance par espece et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de mort par espece et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de mort de faim par espece et par jour.</li>
 * <li> Une liste comprenant les nombres moyen de mort de soif par espece et par jour.</li>
 * <li> Une liste comprenant les nombres moyen de mort par chasse par esepece et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de nouveau ne par femelle par espece sur toute la durée de la simulation. </li>
 * </ul>
 * <p> Les moyens sont effectué sur la durée réel de la simulation<p>
 * 
 * @author Mélodia
 *
 */

public class Donnees {
	
	/**
	 * Liste contenant le nombre d'individus par espéce sur toute la simulation par convention la position 0 correspond aux herbivores 1 pour Carnivore 3 pour Charognard.
	 */
	public int []nbIndividus= new int [3];
	
	/**
	 * Liste de type int contenant les moyenne d'age pour chaque espece à la fin de la simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int[] moyenAgeParEspece=new int [3];
	
	/**
	 * Liste contenant les moyenne d'age à la mort de chaque espece.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] moyenAgeALaMort = new int [3];
	
	/**
	 * Décrit les raisons pour l'arret de la simulation.
	 */
	public String causeFinSimulation;
	
	/**
	 * Indique le temps de la simulation.
	 */
	public String tSimulation;
	
	/**
	 * Indique le nombre d'espece en début de simulation.
	 */
	public int nbEspeceDebut;
	
	/**
	 * Le nombre d'espece en fin de simulation. 
	 */
	public int nbEspeceFin;
	
	/**
	 * Liste contenant le nombre d'individu par espéce en début de simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbIndividuDebut = new int [3];
	
	/**
	 * Liste contenant le nombre d'individue par espece en fin de simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbIndividuFin = new int [3];
	
	/**
	 * Liste contnant le nombre moyen de naissance durant la simulation par espece.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public float[] nbMoyenNaissance = new float [3];
	
	/**
	 * Nombre de nouveau Individus par espece durant toute la simulation
	 */
	public int [] nbNaissance = new int [3];
	
	/**
	 * Nombre de mort total par espece durant la simulation
	 */
	public int [] nbMort = new int [3];
	
	/**
	 * Liste contenant le nombre de mort normal lors de la simulation par espece.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortNorm =new int [3];
	
	/**
	 * Liste contenant le nombre de Mort du à la faim par espece durant la simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortFaim = new int [3];
	
	/**
	 * Liste indiquant le nombre de mort de soif par espece  durant le simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortSoif = new int [3];
	
	/**
	 * Liste contenant le le nombre de mort causé par la chasse par espece durant le simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortChasse = new int [3];
	
	/**
	 * Liste contenant le nombre moyen de nouveau née par femelle.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	//public int [] nbMoyenPetit = new int [3];
	
	/**
	 * Nombre total d'individus lors de la simulation.
	 */
	public int nbTotalIndividus;
	
	/**
	 * Nombre total de Mort pendant la simulation.
	 */
	public int nbTotalMort;
	
	/**
	 * Nombre total de mort par viellesse.
	 */
	public int nbTotalMortNorm;
	
	/**
	 * Nombre total d'individus mort par faim.
	 */
	public int nbTotalMortFaim;
	/**
	 * Nombre total de mort par manque d'eau.
	 */
	public int nbTotalMortSoif;
	
	/**
	 * Nombre total d'individus mort du à la chasse.
	 */
	public int nbTotalMortChasse;
	
	/**
	 * Nombre total de nouveaux individus.
	 */
	public int nbTotalNaissance;
	
	/**
	 * Nombre total d'individu au début de la simulation.
	 */
	
	public int nbTotalIndivDebut;
	
	/**
	 * Nombre total d'individu a la fin de la simulation.
	 */
	public int nbTotalIndiFin;
	

	
	/**
	 * Constructeur de la classe.
	 * 
	 * @param nbIndividus
	 * 			Liste comprenant le nombre d'individus par espéce sur toute la simulation.
	 * @param moyenAgeParEspece
	 * 			Liste des moyennes d'age par espéce à la fin de la simulation.
	 * @param moyenAgeALaMort
	 * 			Liste des moyenne d'age a la mort par espéce.
	 * @param causeFinSimulation
	 * 			Cause de fin de simulation.
	 * @param tSimulation
	 * 			Temps de la simulation.
	 * @param nbEspeceDebut
	 * 			Nombre d'espece au début de la simulation.
	 * @param nbEspeceFin
	 * 			Nombre d'espece a la fin de la simulation.
	 * @param nbIndividuDebut
	 * 			Liste du ombre d'individu au début de la simulation par espece.
	 * @param nbIndividuFin
	 * 			Liste du nombre d'individue a la fin de la simulation par espece.
	 * @param nbMoyenNaissance
	 * 			Liste des nombres moyen de naissance par espece.
	 * @param nbNaissance
	 * 			Liste du nombre de naissance par espece.
	 * @param nbMortNorm
	 * 			Liste du nombre de mort naturelle par espece.
	 * @param nbMortFaim
	 * 			Liste du nombre de mort par faim par espece.
	 * @param nbMortSoif
	 * 			Liste du nombre de mort par manque d'eau par espece.
	 * @param nbMortChasse
	 * 			Liste du nombre de mort par chasse par espece.
	 * @param nbMoyenPetit
	 * 			Liste du nombre de nouveau nee par espece.
	 */
	public Donnees(int[] nbIndividus,int [] moyenAgeParEspece,int [] moyenAgeALaMort,String causeFinSimulation,String tSimulation,int nbEspeceDebut,int nbEspeceFin,int [] nbIndividuDebut, int[] nbIndividuFin,float [] nbMoyenNaissance, int [] nbNaissance ,int [] nbMortNorm,int [] nbMortFaim ,int [] nbMortSoif,int [] nbMortChasse, int [] nbMort) {
		
		this.nbIndividus = nbIndividus;
		this.moyenAgeParEspece = moyenAgeParEspece;
		this.moyenAgeALaMort = moyenAgeALaMort;
		this.causeFinSimulation = causeFinSimulation;
		this.tSimulation = tSimulation;
		this.nbEspeceDebut = nbEspeceDebut;
		this.nbEspeceFin = nbEspeceFin;
		this.nbIndividuDebut = nbIndividuDebut;
		this.nbIndividuFin = nbIndividuFin;
		this.nbMoyenNaissance = nbMoyenNaissance;
		this.nbNaissance = nbNaissance;
		this.nbMortNorm = nbMortNorm;
		this.nbMortFaim = nbMortFaim ;
		this.nbMortSoif = nbMortSoif;
		this.nbMortChasse = nbMortChasse;
		//this.nbMoyenPetit = nbMoyenPetit;
		this.nbMort= nbMort;
		this.nbTotalIndividus = this.nbIndividus[0] + this.nbIndividus[1] + this.nbIndividus[2];
		this.nbTotalMortNorm = this.nbMortNorm[0] + this.nbMortNorm[1] + this.nbMortNorm[2];
		this.nbTotalMortFaim = this.nbMortFaim[0] + this.nbMortFaim[1] + this.nbMortFaim[2];
		this.nbTotalMortSoif = this.nbMortSoif[0] + this.nbMortSoif[1] + this.nbMortSoif[2];
		this.nbTotalMortChasse = this.nbMortChasse[0] + this.nbMortChasse[1] + this.nbMortChasse[2];
		this.nbTotalNaissance = this.nbNaissance[0] + this.nbNaissance[1] + this.nbNaissance[2];
		this.nbTotalIndivDebut = this.nbIndividuDebut[0] + this.nbIndividuDebut[1] + this.nbIndividuDebut[2];
		this.nbTotalIndiFin = this.nbIndividuFin[0] + this.nbIndividuFin[1] + this.nbIndividuFin[2];
		
	}
	

}
