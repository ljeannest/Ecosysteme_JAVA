package statistique;

/**
 * <b> Permet de cr�er le pdf compte rendu avec les donn�s trait� statistiquements</b>
 * <p>Les donn�es n�cessaire � cette assemblage sont les suivantes:</p>
 * <ul>
 * <li> Une liste contenant les nombres d'individus total par esp�ce durant la simulation. </li>
 * <li> Une liste comprenant les moyennnes age par esp�ce sur la dur�e de simulation. </li>
 * <li> Une liste comprenant les moyennes d'age � la mort par esp�ce. </li>
 * <li> La raisons de la fin de la simulation. </li>
 * <li> La duree de la simulation pr�vue. </li>
 * <li> La duree reel de la simulation. </li>
 * <li> Le nombre d'espece en d�but de simulation. </li>
 * <li> Le nombre d'espece en fin de simulation. </li>
 * <li> Une liste comprenant les nombres d'individus par espece en d�but de simulation.</li>
 * <li> Une liste comprenant les nombres d'individus par espece en fin de simulation. </li>
 * <li> Une liste comprenant les nombres moyen de naissance par espece et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de mort par espece et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de mort de faim par espece et par jour.</li>
 * <li> Une liste comprenant les nombres moyen de mort de soif par espece et par jour.</li>
 * <li> Une liste comprenant les nombres moyen de mort par chasse par esepece et par jour. </li>
 * <li> Une liste comprenant les nombres moyen de nouveau ne par femelle par espece sur toute la dur�e de la simulation. </li>
 * </ul>
 * <p> Les moyens sont effectu� sur la dur�e r�el de la simulation<p>
 * 
 * @author M�lodia
 *
 */

public class Assemblage {
	
	/**
	 * Liste contenant le nombre d'individus par esp�ce sur toute la simulation par convention la position 0 correspond aux herbivores 1 pour Carnivore 3 pour Charognard.
	 */
	public int []nbIndividus= new int [3];
	/**
	 * 
	 */
	public int[] moyenAgeParEspece=new int [3];
	public int [] moyenAgeALaMort = new int [3];
	public String causeFinSimulation;
	public int tSimulation;
	public int nbEspeceDebut;
	public int nbEspeceFin;
	public int [] nbIndividuDebut = new int [3];
	public int [] nbIndividuFin = new int [3];
	public int [] nbMoyenNaissance = new int [3];
	public int [] nbMortNorm =new int [3];
	public int [] nbMortFaim = new int [3];
	public int [] nbMortSoif = new int [3];
	public int [] nbMortChasse = new int [3];
	public int [] nbMoyenPetit = new int [3];
	
	
	/**
	 * 
	 * @param nbIndividus
	 * @param moyenAgeParEspece
	 * @param moyenAgeALaMort
	 * @param causeFinSimulation
	 * @param tSimulation
	 * @param nbEspeceDebut
	 * @param nbEspeceFin
	 * @param nbIndividuDebut
	 * @param nbIndividuFin
	 * @param nbMoyenNaissance
	 * @param nbMortNorm
	 * @param nbMortFaim
	 * @param nbMortSoif
	 * @param nbMortChasse
	 * @param nbMoyenPetit
	 */
	public Assemblage(int[] nbIndividus,int [] moyenAgeParEspece,int [] moyenAgeALaMort,String causeFinSimulation,int tSimulation,int nbEspeceDebut,int nbEspeceFin,int [] nbIndividuDebut, int[] nbIndividuFin,int [] nbMoyenNaissance,int [] nbMortNorm,int [] nbMortFaim ,int [] nbMortSoif,int [] nbMortChasse,int [] nbMoyenPetit) {
		
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
		this.nbMortNorm = nbMortNorm;
		this.nbMortFaim = nbMortFaim ;
		this.nbMortSoif = nbMortSoif;
		this.nbMortChasse = nbMortChasse;
		this.nbMoyenPetit = nbMoyenPetit;
		
	}
	

}
