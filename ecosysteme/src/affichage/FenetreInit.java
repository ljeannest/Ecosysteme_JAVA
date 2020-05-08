package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class FenetreInit extends JDialog {
	private FenetreInitInfo info= new FenetreInitInfo();
	private boolean sendData;
	private JLabel lapinLabel, lynxLabel, vautourLabel, flaqueLabel, dureeLabel,anLabel;
	private JComboBox lapin,lynx,vautour,flaque,duree;
	
	public FenetreInit(JFrame parent,String titre, boolean modal) {
		super(parent, titre, modal);
		this.setSize(700,250);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		this.Contenu_init();
	}
	
	public FenetreInitInfo showFII() {
		this.sendData=false;
		this.setVisible(true);
		return this.info;
	}
	
	private void Contenu_init() {
		
		// creation du panel individus
		JPanel pan_individus = new JPanel();
		pan_individus.setBackground(Color.white);
		pan_individus.setPreferredSize(new Dimension(650,80));
		pan_individus.setBorder(BorderFactory.createTitledBorder("Individus"));
		
		//lapins
		JPanel pan_lapin= new JPanel();
		pan_lapin.setBackground(Color.white);
		pan_lapin.setPreferredSize(new Dimension(190,80));
		lapin=new JComboBox();
		for (int k=1;k<=20;k++) {
			lapin.addItem(k);
		}
		lapinLabel=new JLabel("Nombre de lapins : ");
		pan_lapin.add(lapinLabel);
		pan_lapin.add(lapin);
		
		//lynx
		JPanel pan_lynx= new JPanel();
		pan_lynx.setBackground(Color.white);
		pan_lynx.setPreferredSize(new Dimension(190,80));
		lynx=new JComboBox();
		for (int k=1;k<=30;k++) {
			lynx.addItem(k);
		}
		lynxLabel=new JLabel("Nombre de lynx : ");
		pan_lynx.add(lynxLabel);
		pan_lynx.add(lynx);
		
		//vautour
		JPanel pan_vautour= new JPanel();
		pan_vautour.setBackground(Color.white);
		pan_vautour.setPreferredSize(new Dimension(190,80));
		vautour=new JComboBox();
		for (int k=1;k<=10;k++) {
			vautour.addItem(k);
		}
		vautourLabel=new JLabel("Nombre de vautours : ");
		pan_vautour.add(vautourLabel);
		pan_vautour.add(vautour);
		
		//remplissage du panel individus
		pan_individus.add(pan_lapin);
		pan_individus.add(pan_lynx);
		pan_individus.add(pan_vautour);
		
		
		//creation du panel environnement
		JPanel pan_environnement=new JPanel();
		pan_environnement.setBackground(Color.white);
		pan_environnement.setPreferredSize(new Dimension(325,80));
		pan_environnement.setBorder(BorderFactory.createTitledBorder("Environnement"));
		
		//Nombre de flaques
		flaque=new JComboBox();
		for (int k=4; k<=10;k++) {
			flaque.addItem(k);
		}
		flaqueLabel=new JLabel ("Nombre de flaques : ");
		
		//Remplissage du panel environnement
		pan_environnement.add(flaqueLabel);
		pan_environnement.add(flaque);
		
		
		//creation du panel simulation
		JPanel pan_simulation= new JPanel();
		pan_simulation.setBackground(Color.white);
		pan_simulation.setPreferredSize(new Dimension(325,80));
		pan_simulation.setBorder(BorderFactory.createTitledBorder("Simulation"));
		
		//duree de la simulation
		duree=new JComboBox();
		for (int k=2;k<=100;k++) {
			duree.addItem(k);
		}
		dureeLabel=new JLabel ("Duree de la simulation : ");
		anLabel=new JLabel (" ans");
		
		//Remplissage du panel Simulation
		pan_simulation.add(dureeLabel);
		pan_simulation.add(duree);
		pan_simulation.add(anLabel);
		
		
		// JPanel General
		JPanel Contenu = new JPanel();
		Contenu.setBackground(Color.white);
		Contenu.add(pan_individus,BorderLayout.NORTH);
		Contenu.add(pan_environnement,BorderLayout.WEST);
		Contenu.add(pan_simulation, BorderLayout.EAST);
		
		
		// JPanel controle
		JPanel controle= new JPanel();
		JButton okBouton = new JButton("OK");
		okBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info = new FenetreInitInfo((int)lapin.getSelectedItem(),(int)lynx.getSelectedItem(),(int)vautour.getSelectedItem(),(int)flaque.getSelectedItem(),(int)duree.getSelectedItem());
				setVisible(false);
			}
		});
		JButton cancelBouton = new JButton("Annuler");
		cancelBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		
		controle.add(okBouton);
		controle.add(cancelBouton);
		
		this.getContentPane().add(Contenu,BorderLayout.CENTER);
		this.getContentPane().add(controle,BorderLayout.SOUTH);
	}
}
