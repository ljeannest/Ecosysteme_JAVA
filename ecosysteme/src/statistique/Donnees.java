package statistique;

/**
 * <b> Permet de cr�er le pdf compte rendu avec les donn�es trait�es statistiquement</b>
 * <p>Les donn�es n�cessaires � cette assemblage sont les suivantes:</p>
 * <ul>
 * <li> Une liste contenant les nombres d'individus total par esp�ce durant la simulation. </li>
 * <li> Une liste comprenant les moyennes des �ge par esp�ce sur la dur�e de la simulation. </li>
 * <li> Une liste comprenant les moyennes d'�ge � la mort par esp�ce. </li>
 * <li> La raisons de la fin de la simulation. </li>
 * <li> La dur�e de la simulation pr�vue. </li>
 * <li> La dur�e r�elle de la simulation. </li>
 * <li> Le nombre d'esp�ces en d�but de simulation. </li>
 * <li> Le nombre d'esp�ces en fin de simulation. </li>
 * <li> Une liste comprenant les nombres d'individus par esp�ce en d�but de simulation.</li>
 * <li> Une liste comprenant les nombres d'individus par esp�ce en fin de simulation. </li>
 * <li> Une liste comprenant les nombres moyen de naissances par esp�ce et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de morts par esp�ce et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de morts de faim par esp�ce et par jour.</li>
 * <li> Une liste comprenant les nombres moyen de morts de soif par esp�ce et par jour.</li>
 * <li> Une liste comprenant les nombres moyen de morts par chasse par esp�ce et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de nouveaux n�s par femelle par esp�ce sur toute la dur�e de la simulation. </li>
 * </ul>
 * <p> Les moyennes sont effectu�s sur la dur�e r�elle de la simulation<p>
 * 
 * @author M�lodia
 *
 */

public class Donnees {
	
	/**
	 * Liste contenant le nombre d'individus par esp�ce sur toute la simulation par convention la position 0 correspond aux herbivores 1 pour Carnivore 3 pour Charognard.
	 */
	public int []nbIndividus= new int [3];
	
	/**
	 * Liste de type int contenant les moyennes d'�ge pour chaque esp�ce � la fin de la simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int[] moyenAgeParEspece=new int [3];
	
	/**
	 * Liste contenant les moyennes d'�ge � la mort de chaque esp�ce.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] moyenAgeALaMort = new int [3];
	
	/**
	 * D�crit les raisons pour l'arr�t de la simulation.
	 */
	public String causeFinSimulation;
	
	/**
	 * Indique le temps de la simulation.
	 */
	public String tSimulation;
	
	/**
	 * Indique le nombre d'esp�ce en d�but de simulation.
	 */
	public int nbEspeceDebut;
	
	/**
	 * Le nombre d'esp�ce en fin de simulation. 
	 */
	public int nbEspeceFin;
	
	/**
	 * Liste contenant le nombre d'individus par esp�ce en d�but de simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbIndividuDebut = new int [3];
	
	/**
	 * Liste contenant le nombre d'individus par esp�ce en fin de simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbIndividuFin = new int [3];
	
	/**
	 * Liste contnant le nombre moyen de naissances durant la simulation par esp�ce.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public float[] nbMoyenNaissance = new float [3];
	
	/**
	 * Nombre de nouveaux individus par esp�ce durant toute la simulation.
	 */
	public int [] nbNaissance = new int [3];
	
	/**
	 * Nombre total de morts par esp�ce durant la simulation.
	 */
	public int [] nbMort = new int [3];
	
	/**
	 * Liste contenant le nombre de morts normal lors de la simulation par esp�ce.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortNorm =new int [3];
	
	/**
	 * Liste contenant le nombre de morts dus � la faim par esp�ce durant la simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortFaim = new int [3];
	
	/**
	 * Liste indiquant le nombre de morts de soif par esp�ce  durant la simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortSoif = new int [3];
	
	/**
	 * Liste contenant le nombre de morts caus�es par la chasse par esp�ce durant le simulation.
	 * <p> pour l'ordre de rangement regarder:</p>
	 * @see Assemblage#nbIndividus
	 */
	public int [] nbMortChasse = new int [3];
	
	/**
	 * Liste contenant le nombre moyen de nouveaux n�s par femelle.
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
	 * Nombre total d'individus morts dus � la chasse.
	 */
	public int nbTotalMortChasse;
	
	/**
	 * Nombre total de nouveaux individus.
	 */
	public int nbTotalNaissance;
	
	/**
	 * Nombre total d'individus au d�but de la simulation.
	 */
	
	public int nbTotalIndivDebut;
	
	/**
	 * Nombre total d'individus � la fin de la simulation.
	 */
	public int nbTotalIndiFin;
	

	/**
	 * 
	 * @param nbIndividus
	 * 			Liste comprenant le nombre d'individus par esp�ce sur toute la simulation.
	 * @param moyenAgeParEspece
	 * 			Liste des moyennes d'�ge par esp�ce � la fin de la simulation.
	 * @param moyenAgeALaMort
	 * 			Liste des moyenne d'�ge � la mort par esp�ce.
	 * @param causeFinSimulation
	 * 			Cause de fin de simulation.
	 * @param tSimulation
	 * 			Temps de la simulation.
	 * @param nbEspeceDebut
	 * 			Nombre d'esp�ces au d�but de la simulation.
	 * @param nbEspeceFin
	 * 			Nombre d'esp�ces � la fin de la simulation.
	 * @param nbIndividuDebut
	 * 			Liste du nombre d'individus au d�but de la simulation par esp�ce.
	 * @param nbIndividuFin
	 * 			Liste du nombre d'individus � la fin de la simulation par esp�ce.
	 * @param nbMoyenNaissance
	 * 			Liste des nombres moyen de naissances par esp�ce.
	 * @param nbNaissance
	 * 			Liste du nombre de naissances par esp�ce.
	 * @param nbMortNorm
	 * 			Liste du nombre de morts naturelles par esp�ce.
	 * @param nbMortFaim
	 * 			Liste du nombre de morts par faim par esp�ce.
	 * @param nbMortSoif
	 * 			Liste du nombre de morts par manque d'eau par esp�ce.
	 * @param nbMortChasse
				Liste du nombre de mort par chasse par espece.
	 * @param nbMort
	 * 			Liste du nombre de mort total par espece
	 * @param nbMoyenPetit
	 * 			Liste du nombre de nouveaux n�s par esp�ce.
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
