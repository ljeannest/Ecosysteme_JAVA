package ressources;

public class Riviere extends Eau{
	
	int posXDebut;
	int posYDebut;
	int posXFin;
	int posYFin;
	
	public Riviere (String type, int quantiteRessource, int posXDebut, int posYDebut, int posXFin, int posYFin) {
		
		super(type, 10000);
		
		this.posXDebut = posXDebut;
		this.posYDebut = posYDebut;
		this.posXFin = posXFin;
		this.posYFin = posYFin;
		
	}

}
