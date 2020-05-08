package ressources;

public class Riviere extends Eau{
	
	int posX;
	
	
	int posY;
	
	public Riviere ( int posX, int posY) {
		
		super("riviere", 10000, posX, posY);
		
		this.posX = posX;
		this.posY = posY;
		
		
	}

}
