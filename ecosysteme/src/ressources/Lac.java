package ressources;

public class Lac extends Eau{
	
	public int posX;
	public int posY;
	
	public Lac (int posX, int posY) {
		
		super("lac",100000,posX,posY);
		this.posX = posX;
		this.posY = posY;
	}

}
