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
		this.setAlwaysOnTop(false);
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.white);
		pan.setPreferredSize(new Dimension(250,50));
		pan.setBorder(BorderFactory.createTitledBorder("Temps écoulé"));

		String time = str_time(temps_ecoule);
		
		JLabel tempsLabel = new JLabel(time);
		
		pan.add(tempsLabel);
		
		this.setContentPane(pan);
	}
	
	public void maj_pan(int temps_ecoule) {
		JPanel pan = new JPanel();
		pan.setBackground(Color.white);
		pan.setPreferredSize(new Dimension(250,50));
		pan.setBorder(BorderFactory.createTitledBorder("Temps écoulé"));
		
		String time = str_time(temps_ecoule);
		
		JLabel tempsLabel = new JLabel(time);
		
		pan.add(tempsLabel);
		
		this.setContentPane(pan);
	}
	
	public String str_time (int temps_ecoule) {
		int an = temps_ecoule/365;
		int mois = 0;
		int jours = temps_ecoule%365;
		
		if (jours>31 && jours<=59) {
			mois = 1;
			jours = jours - 31;
		}
		else if (jours>59 && jours<=90) {
			mois = 2;
			jours = jours - 59;
		}
		else if (jours>90 && jours<=120) {
			mois = 3;
			jours = jours - 90;
		}
		else if (jours>120 && jours<=151) {
			mois = 4;
			jours = jours - 120;
		}
		else if (jours>151 && jours<=181) {
			mois = 5;
			jours = jours - 151;
		}
		else if (jours>181 && jours<=212) {
			mois = 6;
			jours = jours - 181;
		}
		else if (jours>212 && jours<=243) {
			mois = 7;
			jours = jours - 212;
		}
		else if (jours>243 && jours<=273) {
			mois = 8;
			jours = jours - 243;
		}
		else if (jours>273 && jours<=304) {
			mois = 9;
			jours = jours - 273;
		}
		else if (jours>304 && jours<=334) {
			mois = 10;
			jours = jours - 304;
		}
		else if (jours>334) {
			mois = 11;
			jours = jours - 334;
		}
		
		String an_str = " ans ";
		String jour_str = " jours ";
		if (an==1) {
			an_str=" an ";
		}
		if (jours==1) {
			jour_str = " jour ";
		}
		return (an + an_str+ mois+ " mois " +jours+ jour_str);
	}
	
}
