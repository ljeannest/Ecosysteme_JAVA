package affichage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre_timer extends JFrame {

	
	public Fenetre_timer(int temps_ecoule) {
		super();
		proprietes_fenetre_timer(temps_ecoule);
		
	}

	public void proprietes_fenetre_timer(int temps_ecoule) {
		this.setTitle("Timer");
		this.setSize(300,100);
		this.setResizable(false);
//		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setAlwaysOnTop(true);
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.white);
		pan.setPreferredSize(new Dimension(250,50));
		pan.setBorder(BorderFactory.createTitledBorder("Temps écoulé"));
		
		JLabel tempsLabel = new JLabel(temps_ecoule/365 + " an(s) "+ (temps_ecoule%365)/30 + " moi(s) " +(temps_ecoule%365)%30 + " jours");
		
		pan.add(tempsLabel);
		
		this.setContentPane(pan);
	}
	
	public void maj_pan(int temps_ecoule) {
		JPanel pan = new JPanel();
		pan.setBackground(Color.white);
		pan.setPreferredSize(new Dimension(250,50));
		pan.setBorder(BorderFactory.createTitledBorder("Temps écoulé"));
		
		JLabel tempsLabel = new JLabel(temps_ecoule/365 + " an(s) "+ (temps_ecoule%365)/30 + " mois " +(temps_ecoule%365)%30 + " jour(s)");
		
		pan.add(tempsLabel);
		
		this.setContentPane(pan);
	}
	
}
