package statistique;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <b> On créée les graphisques issu du traitement statistiques de la modélisation. </b>
 * @author Mélodia
 *
 */

public class CreateGraph extends JFrame {

	private JPanel pnl; 

	  public CreateGraph() { 
	    addWindowListener(new WindowAdapter() { 
	      public void windowClosing(WindowEvent e) { 
	        dispose(); 
	        System.exit(0); 
	      } 
	    }); 
	    pnl = new JPanel(new BorderLayout()); 
	    setContentPane(pnl); 
	    setSize(400, 250); 


	    //DefaultPieDataset pieDataset = new DefaultPieDataset(); 
	   // pieDataset.setValue("Valeur1", 10); 
	   // pieDataset.setValue("Valeur2", 3); 
	    //pieDataset.setValue("Valeur3", 50); 
	    //pieDataset.setValue("Valeur4", 5); 


	    //JFreeChart pieChart = ChartFactory.createPieChart("Test camembert", 
	      //pieDataset, true, true, true); 
	    //ChartPanel cPanel = new ChartPanel(pieChart); 
	   //pnl.add(cPanel); 
	 // } 

	  //public static void main(String args[]) { 
	    //TestPieChart tpc = new TestPieChart(); 
	    //tpc.setVisible(true); 
	  } 
}
