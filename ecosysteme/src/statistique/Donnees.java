package statistique;

/**
 * <b> Permet de créer le pdf compte rendu avec les données traitées statistiquement</b>
 * <p>Les données nécessaires à cette assemblage sont les suivantes:</p>
 * <ul>
 * <li> Une liste contenant les nombres d'individus total par espèce durant la simulation. </li>
 * <li> Une liste comprenant les moyennes des âge par espèce sur la durée de la simulation. </li>
 * <li> Une liste comprenant les moyennes d'âge à la mort par espèce. </li>
 * <li> La raisons de la fin de la simulation. </li>
 * <li> La durée de la simulation prévue. </li>
 * <li> La durée réelle de la simulation. </li>
 * <li> Le nombre d'espèces en début de simulation. </li>
 * <li> Le nombre d'espèces en fin de simulation. </li>
 * <li> Une liste comprenant les nombres d'individus par espèce en début de simulation.</li>
 * <li> Une liste comprenant les nombres d'individus par espèce en fin de simulation. </li>
 * <li> Une liste comprenant les nombres moyen de naissances par espèce et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de morts par espèce et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de morts de faim par espèce et par jour.</li>
 * <li> Une liste comprenant les nombres moyen de morts de soif par espèce et par jour.</li>
 * <li> Une liste comprenant les nombres moyen de morts par chasse par espèce et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de nouveaux nés par femelle par espèce sur toute la durée de la simulation. </li>
 * </ul>
 * <p> Les moyennes sont effectués sur la durée réelle de la simulation<p>
 * 
 * @author Mélodia
 *
 */

public class Donnees {
	
	/**
	 * Liste contenant le nombre d'individus par espèce sur toute la simulation par convention la position 0 correspond aux herbivores 1 pour Carnivore 3 pour Charognard.
	 */
	public int []nbIndividus= new int [3];
	
	/**
	 * Liste de type int contenant les moyennes d'âge pour chaque espèce à la fin de la simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int[] moyenAgeParEspece=new int [3];
	
	/**
	 * Liste contenant les moyennes d'âge à la mort de chaque espèce.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] moyenAgeALaMort = new int [3];
	
	/**
	 * Décrit les raisons pour l'arrêt de la simulation.
	 */
	public String causeFinSimulation;
	
	/**
	 * Indique le temps de la simulation.
	 */
	public String tSimulation;
	
	/**
	 * Indique le nombre d'espèce en début de simulation.
	 */
	public int nbEspeceDebut;
	
	/**
	 * Le nombre d'espèce en fin de simulation. 
	 */
	public int nbEspeceFin;
	
	/**
	 * Liste contenant le nombre d'individus par espèce en début de simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbIndividuDebut = new int [3];
	
	/**
	 * Liste contenant le nombre d'individus par espèce en fin de simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbIndividuFin = new int [3];
	
	/**
	 * Liste contnant le nombre moyen de naissances durant la simulation par espèce.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public float[] nbMoyenNaissance = new float [3];
	
	/**
	 * Nombre de nouveaux individus par espèce durant toute la simulation.
	 */
	public int [] nbNaissance = new int [3];
	
	/**
	 * Nombre total de morts par espèce durant la simulation.
	 */
	public int [] nbMort = new int [3];
	
	/**
	 * Liste contenant le nombre de morts normal lors de la simulation par espèce.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortNorm =new int [3];
	
	/**
	 * Liste contenant le nombre de morts dus à la faim par espèce durant la simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortFaim = new int [3];
	
	/**
	 * Liste indiquant le nombre de morts de soif par espèce  durant la simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortSoif = new int [3];
	
	/**
	 * Liste contenant le nombre de morts causées par la chasse par espèce durant le simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortChasse = new int [3];
	
	/**
	 * Liste contenant le nombre moyen de nouveaux nés par femelle.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public float [] nbMoyenPetit = new float [3];
	
	/**
	 * Nombre total d'individus lors de la simulation.
	 */
	public int nbTotalIndividus;
	
	/**
	 * Nombre total de morts pendant la simulation.
	 */
	public int nbTotalMort;
	
	/**
	 * Nombre total de morts par viellesse.
	 */
	public int nbTotalMortNorm;
	
	/**
	 * Nombre total d'individus morts par faim.
	 */
	public int nbTotalMortFaim;
	/**
	 * Nombre total de morts par manque d'eau.
	 */
	public int nbTotalMortSoif;
	
	/**
	 * Nombre total d'individus morts dus à la chasse.
	 */
	public int nbTotalMortChasse;
	
	/**
	 * Nombre total de nouveaux individus.
	 */
	public int nbTotalNaissance;
	
	/**
	 * Nombre total d'individus au début de la simulation.
	 */
	
	public int nbTotalIndivDebut;
	
	/**
	 * Nombre total d'individus à la fin de la simulation.
	 */
	public int nbTotalIndiFin;
	

	/**
	 * 
	 * @param nbIndividus
	 * 			Liste comprenant le nombre d'individus par espèce sur toute la simulation.
	 * @param moyenAgeParEspece
	 * 			Liste des moyennes d'âge par espèce à la fin de la simulation.
	 * @param moyenAgeALaMort
	 * 			Liste des moyenne d'âge à la mort par espèce.
	 * @param causeFinSimulation
	 * 			Cause de fin de simulation.
	 * @param tSimulation
	 * 			Temps de la simulation.
	 * @param nbEspeceDebut
	 * 			Nombre d'espèces au début de la simulation.
	 * @param nbEspeceFin
	 * 			Nombre d'espèces à la fin de la simulation.
	 * @param nbIndividuDebut
	 * 			Liste du nombre d'individus au début de la simulation par espèce.
	 * @param nbIndividuFin
	 * 			Liste du nombre d'individus à la fin de la simulation par espèce.
	 * @param nbMoyenNaissance
	 * 			Liste des nombres moyen de naissances par espèce.
	 * @param nbNaissance
	 * 			Liste du nombre de naissances par espèce.
	 * @param nbMortNorm
	 * 			Liste du nombre de morts naturelles par espèce.
	 * @param nbMortFaim
	 * 			Liste du nombre de morts par faim par espèce.
	 * @param nbMortSoif
	 * 			Liste du nombre de morts par manque d'eau par espèce.
	 * @param nbMortChasse
				Liste du nombre de mort par chasse par espece.
	 * @param nbMort
	 * 			Liste du nombre de mort total par espece
	 * @param nbMoyenPetit
	 * 			Liste du nombre de nouveaux nés par espèce.
	 */
	public Donnees(int[] nbIndividus,int [] moyenAgeParEspece,int [] moyenAgeALaMort,String causeFinSimulation,String tSimulation,int nbEspeceDebut,int nbEspeceFin,int [] nbIndividuDebut, int[] nbIndividuFin,float [] nbMoyenNaissance, int [] nbNaissance ,int [] nbMortNorm,int [] nbMortFaim ,int [] nbMortSoif,int [] nbMortChasse, int [] nbMort, float [] nbMoyenPetit) {
		
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
		this.nbMoyenPetit = nbMoyenPetit;
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
