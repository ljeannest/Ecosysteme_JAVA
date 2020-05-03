package test;

import javax.swing.JFrame;
import affichage.fenetre;
import individus.Lievre;

public class Principalebis extends JFrame{
	

	
	public static void main(String args[]) throws InterruptedException {
		Lievre L1 = new Lievre (0,0,"M",0) ;
		Fenetrebis fenetrePrincipale = new Fenetrebis(L1);
		fenetrePrincipale.setVisible(true);
	}

}
