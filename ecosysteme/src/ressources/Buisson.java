
package ressources;

public class Buisson extends Vegetaux {
	
	//int dimension;
	boolean fruitier;
	
	public Buisson (int posx, int posy,String couleur, int quantiteRessource) {
		
		super("Buisson",posx,posy,"vert clair", quantiteRessource);
	
		
		//this.dimension = dimension;
		this.fruitier= true;
	}

}
