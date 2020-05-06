package ressources;

public class Riviere extends Eau{
	
	int posXDebut;
	int posYDebut;
	int posXFin;
	int posYFin;
	
	public Riviere ( int posXDebut, int posYDebut, int posXFin, int posYFin) {
		
		super("riviere", 10000);
		
		this.posXDebut = posXDebut;
		this.posYDebut = posYDebut;
		this.posXFin = posXFin;
		this.posYFin = posYFin;
		
	}

}
