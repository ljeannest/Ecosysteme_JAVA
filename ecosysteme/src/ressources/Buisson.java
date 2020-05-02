
package ressources;

public class Buisson extends Vegetaux {
	
	int dimension;
	boolean fruitier;
	
	public Buisson (String type, int quantiteRessouce,int posX, int posY, int dimension, boolean fruitier) {
		
		super(type, "vert fonce", 50, posX, posY);
		
		this.dimension = dimension;
		this.fruitier= fruitier;
	}

}
