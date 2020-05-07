//vérif5
package affichage;

import individus.*;



public class principale {

	public static void main(String[] args) throws InterruptedException {
		

		//int a = 1, b = 15;
		//while (a < b) {
		
		Lievre Herb1 = new Lievre (1,5,"M",0);
		Lynx Carn1 = new Lynx (1,1,"F",0);
		Vautour Char1 = new Vautour (2,4,"M",0);
		Animal[] A_list = {Herb1,Carn1,Char1};
		fenetre fenetrePrincipale = new fenetre(A_list);
		fenetrePrincipale.setVisible(true);
		//Thread.sleep(1000);
	
		
	}
  
}











