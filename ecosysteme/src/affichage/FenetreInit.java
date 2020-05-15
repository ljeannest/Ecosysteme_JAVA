package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
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
import javax.swing.border.Border;



/**
 * <b> Ouvre une premiere fenetre permettant à l'utilisateur de choisir les parametres de la simulation <b>
 * <p> Les variables suivantes sont donc necessaires : <p>
 * <ul>
 * <li> Un element info de type FenetreInitInfo qui permettra de récuperer toutes les donnees indiquees par l'utilisateur <li>
 * <li> un booleen sendData, qui servira a envoyer ou non les donnees dans info <li>
 * <li> Un JLabel lievreLabel, qui contiendra un texte concernant les lievres à afficher dans la fenetre <li>
 * <li> Un JLabel lynxLabel, qui contiendra un texte concernant les lynxs à afficher dans la fenetre <li>
 * <li> Un JLabel vautourLabel, qui contiendra un texte concernant les vautours à afficher dans la fenetre <li>
 * <li> Un JLabel flaqueLabel, qui contiendra un texte concernant les flaques à afficher dans la fenetre <li> 
 * <li> Un JLabel dureeLabel, qui contiendra un texte concernant la duree de la simulation à afficher dans la fenetre <li> 
 * <li> Un JLabel anLabel, qui contiendra un texte concernant l'echelle de temps(an) à afficher dans la fenetre <li> 
 * <li> Un JLabel lacLabel, qui contiendra un texte concernant les lacs à afficher dans la fenetre <li> 
 * <li> Un JLabel riviereLabel, qui contiendra un texte concernant les rivieres à afficher dans la fenetre <li> 
 * <li> Un JLabel tailleLabel, qui contiendra un texte concernant la taille de l'ecosysteme à afficher dans la fenetre <li> 
 * <li> Un JLabel foretLabel, qui contiendra un texte concernant les forets à afficher dans la fenetre <li>
 * <li> Un JLabel compterenduLabel, qui contiendra un texte concernant les compte_rendus à afficher dans la fenetre <li> 
 * <li> Un JComboBox lievre qui contiendra les differentes options concernant le nombre de lievres <li>
 * <li> Un JComboBox lynx qui contiendra les differentes options concernant le nombre de lynxs <li>
 * <li> Un JComboBox vautour qui contiendra les differentes options concernant le nombre de vautours <li>
 * <li> Un JComboBox flaque qui contiendra les differentes options concernant le nombre de flaques <li>
 * <li> Un JComboBox duree qui contiendra les differentes options concernant la duree de la simulation <li>
 * <li> Un JComboBox lac qui contiendra les differentes options concernant le nombre de lacs <li>
 * <li> Un JComboBox riviere qui contiendra les differentes options concernant la presence de rivieres <li>
 * <li> Un JComboBox size qui contiendra les differentes options concernant la taille de l'ecosysteme <li>
 * <li> Un JComboBox foret qui contiendra les differentes options concernant la presence de forets <li>
 * <li> Un JComboBox compterendu qui contiendra les differentes options concernant la presence d'un compte rendu <li>
 * <li> Un JLabel lievreIcon qui contiendra un icone representant un lievre <li>
 * <li> Un JLabel lynxIcon qui contiendra un icone representant un lynx <li>
 * <li> Un JLabel vautourIcon qui contiendra un icone representant un vautour <li>
 * <li> Un JLabel eauIcon qui contiendra un icone representant une case d'eau <li>
 * <li> Un JLabel tempsIcon qui contiendra un icone representant une horloge <li>
 * <li> Un JLabel sizeIcon qui contiendra un icone representant la taille de l'ecosysteme <li>
 * <li> Un JLabel foretIcon qui contiendra un icone representant une case de foret <li>
 * <li> Un ImageIcon icon_eau_claire qui represente une case d'eau claire <li>
 * <li> Un ImageIcon icon_eau_foncee qui represente une case d'eau foncee <li>
 * <li> Un ImageIcon icon_lynx qui represente un individu de type lynx <li>
 * <li> Un ImageIcon icon_lievre qui represente un individu de type lievre <li>
 * <li> Un ImageIcon icon_vautour qui represente un individu de type vautour <li>
 * <li> Un ImageIcon icon_temps qui represente une horloge <li>
 * <li> Un ImageIcon icon_size qui represente une taille <li>
 * <li> Un ImageIcon icon_foret qui represente une case de foret <li>
 * <li> Une Border redline qui est un contour de couleur rouge <li>
 * <li> Une Border blackline qui est un contour de couleur noire <li>
 * <li> Une Border whiteline qui est un contour de couleur blanche <li>
 * <ul>
 * @author Lucie
 *
 */
public class FenetreInit extends JDialog {
	private FenetreInitInfo info= new FenetreInitInfo();
	private boolean sendData;
	private JLabel lievreLabel, lynxLabel, vautourLabel, flaqueLabel, dureeLabel,anLabel,lacLabel,riviereLabel,sizeLabel, foretLabel,compterenduLabel;
	private JComboBox lievre,lynx,vautour,flaque,duree,lac,riviere,size, foret,compterendu;
	private JLabel lievreIcon,lynxIcon,vautourIcon,eauIcon,tempsIcon,sizeIcon, foretIcon;
	

	ImageIcon icon_eau_claire = new ImageIcon(new ImageIcon("images/bleu clair.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
	ImageIcon icon_eau_foncee = new ImageIcon(new ImageIcon("images/bleu fonce.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
	ImageIcon icon_lynx = new ImageIcon(new ImageIcon("images/lynx.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
	ImageIcon icon_lievre = new ImageIcon(new ImageIcon("images/lievre.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
	ImageIcon icon_vautour = new ImageIcon(new ImageIcon("images/vautour.jpg").getImage().getScaledInstance(50,50, Image.SCALE_DEFAULT));
	ImageIcon icon_temps = new ImageIcon(new ImageIcon("images/temps.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
	ImageIcon icon_size = new ImageIcon(new ImageIcon("images/fleche.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
	ImageIcon icon_foret = new ImageIcon(new ImageIcon("images/vert fonce.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
	
	
	Border redline = BorderFactory.createLineBorder(Color.red,1); 
	Border whiteline = BorderFactory.createLineBorder(Color.white,1);
	Border blackline = BorderFactory.createLineBorder(Color.black,1);
	
	public FenetreInit(JFrame parent,String titre, boolean modal) {
		super(parent, titre, modal);
		this.setSize(1000,490);
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
		pan_individus.setPreferredSize(new Dimension(320,410));
		pan_individus.setBorder(BorderFactory.createTitledBorder("Individus"));
		
		//lievres
		lievreIcon=new JLabel(icon_lievre);
		lievreIcon.setBorder(whiteline);
		JPanel pan_lapin= new JPanel();
		pan_lapin.setBackground(Color.white);
		pan_lapin.setPreferredSize(new Dimension(290,90));
		lievre=new JComboBox();
		for (int k=0;k<=20;k++) {
			lievre.addItem(k);
		}
		lievre.setSelectedItem(6);
		lievreLabel=new JLabel("Nombre de lievres : ");
		pan_lapin.add(lievreIcon);
		pan_lapin.add(lievreLabel);
		pan_lapin.add(lievre);
		
		//lynx
		lynxIcon=new JLabel(icon_lynx);
		lynxIcon.setBorder(redline);
		JPanel pan_lynx= new JPanel();
		pan_lynx.setBackground(Color.white);
		pan_lynx.setPreferredSize(new Dimension(290,90));
		lynx=new JComboBox();
		for (int k=0;k<=30;k++) {
			lynx.addItem(k);
		}
		lynx.setSelectedItem(9);;
		lynxLabel=new JLabel("Nombre de lynx : ");
		pan_lynx.add(lynxIcon);
		pan_lynx.add(lynxLabel);
		pan_lynx.add(lynx);
		
		//vautour
		vautourIcon=new JLabel(icon_vautour);
		vautourIcon.setBorder(blackline);
		JPanel pan_vautour= new JPanel();
		pan_vautour.setBackground(Color.white);
		pan_vautour.setPreferredSize(new Dimension(290,90));
		vautour=new JComboBox();
		for (int k=0;k<=10;k++) {
			vautour.addItem(k);
		}
		vautour.setSelectedItem(3);
		vautourLabel=new JLabel("Nombre de vautours : ");
		pan_vautour.add(vautourIcon);
		pan_vautour.add(vautourLabel);
		pan_vautour.add(vautour);
		
		//remplissage du panel individus
		pan_individus.add(pan_lapin);
		pan_individus.add(pan_lynx);
		pan_individus.add(pan_vautour);
		
		
		//creation du panel environnement
		JPanel pan_environnement=new JPanel();
		pan_environnement.setBackground(Color.white);
		pan_environnement.setPreferredSize(new Dimension(320,410));
		pan_environnement.setBorder(BorderFactory.createTitledBorder("Environnement"));
		
		//Nombre de flaques
		JPanel pan_flaque=new JPanel();
		pan_flaque.setBackground(Color.white);
		pan_flaque.setPreferredSize(new Dimension(290,90));
		eauIcon = new JLabel(icon_eau_claire);
		flaque=new JComboBox();
		for (int k=0; k<=20;k++) {
			flaque.addItem(k);
		}
		flaque.setSelectedItem(5);
		flaqueLabel=new JLabel ("Nombre de flaques : ");
		pan_flaque.add(eauIcon);
		pan_flaque.add(flaqueLabel);
		pan_flaque.add(flaque);
		
		//Presence de riviere
		JPanel pan_riviere=new JPanel();
		pan_riviere.setBackground(Color.white);
		pan_riviere.setPreferredSize(new Dimension(290,90));
		eauIcon=new JLabel(icon_eau_foncee);
		riviere=new JComboBox();
		riviere.addItem("oui");
		riviere.addItem("non");
		riviereLabel=new JLabel ("Présence de riviere ? ");
		pan_riviere.add(eauIcon);
		pan_riviere.add(riviereLabel);
		pan_riviere.add(riviere);
		
		//Presence de lac
		JPanel pan_lac=new JPanel();
		pan_lac.setBackground(Color.white);
		pan_lac.setPreferredSize(new Dimension(290,90));
		eauIcon=new JLabel(icon_eau_foncee);
		lac=new JComboBox();
		lac.addItem("oui");
		lac.addItem("non");
		lacLabel=new JLabel ("Présence de lac ? ");
		pan_lac.add(eauIcon);
		pan_lac.add(lacLabel);
		pan_lac.add(lac);
		
		//Presence de foret
		JPanel pan_foret=new JPanel();
		pan_foret.setBackground(Color.white);
		pan_foret.setPreferredSize(new Dimension(290,90));
		foretIcon=new JLabel(icon_foret);
		foret=new JComboBox();
		foret.addItem("non");
		foret.addItem("oui");
		foretLabel=new JLabel ("Présence de foret ? ");
		pan_foret.add(foretIcon);
		pan_foret.add(foretLabel);
		pan_foret.add(foret);
		
		//Remplissage du panel environnement
		pan_environnement.add(pan_foret);
		pan_environnement.add(pan_lac);
		pan_environnement.add(pan_riviere);
		pan_environnement.add(pan_flaque);
		
		
		//creation du panel simulation
		JPanel pan_simulation= new JPanel();
		pan_simulation.setBackground(Color.white);
		pan_simulation.setPreferredSize(new Dimension(320,410));
		pan_simulation.setBorder(BorderFactory.createTitledBorder("Simulation"));
		
		//duree de la simulation
		JPanel pan_temps = new JPanel();
		pan_temps.setBackground(Color.white);
		pan_temps.setPreferredSize(new Dimension(290,90));
		tempsIcon = new JLabel(icon_temps);
		duree=new JComboBox();
		for (int k=2;k<=100;k++) {
			duree.addItem(k);
		}
		dureeLabel=new JLabel ("Duree de la simulation : ");
		anLabel=new JLabel (" ans");
		
		pan_temps.add(tempsIcon);
		pan_temps.add(dureeLabel);
		pan_temps.add(duree);
		pan_temps.add(anLabel);
		
		//taille de la grille
		
		JPanel pan_size = new JPanel();
		pan_size.setBackground(Color.white);
		pan_size.setPreferredSize(new Dimension(290,90));
		sizeIcon = new JLabel (icon_size);
		size =new JComboBox();
		for (int k=30;k<61;k+=10) {
			size.addItem(k);
		}
		sizeLabel = new JLabel ("Taille de la grille : ");
				
		pan_size.add(sizeIcon);
		pan_size.add(sizeLabel);
		pan_size.add(size);
		
		//compte rendu
		
		JPanel pan_cr = new JPanel();
		pan_cr.setBackground(Color.white);
		pan_cr.setPreferredSize(new Dimension(290,90));
		compterendu = new JComboBox();
		compterendu.addItem("oui");
		compterendu.addItem("non");
		compterenduLabel = new JLabel ("Souhaitez vous un compte-rendu de la simulation ? ");
		
		pan_cr.add(compterenduLabel);
		pan_cr.add(compterendu);
		
		//Remplissage du panel Simulation
		
		pan_simulation.add(pan_temps);
		pan_simulation.add(pan_size);
		pan_simulation.add(pan_cr);
		
		
		// JPanel General
		JPanel Contenu = new JPanel();
		Contenu.setBackground(Color.white);
		Contenu.add(pan_individus);
		Contenu.add(pan_environnement);
		Contenu.add(pan_simulation);
		
		
		// JPanel controle
		JPanel controle= new JPanel();
		JButton okBouton = new JButton("OK");
		okBouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info = new FenetreInitInfo((int)lievre.getSelectedItem(),(int)lynx.getSelectedItem(),(int)vautour.getSelectedItem(),(int)flaque.getSelectedItem(),(int)duree.getSelectedItem(),(String)riviere.getSelectedItem(),(String)lac.getSelectedItem(),(int) size.getSelectedItem(),(String) foret.getSelectedItem(),(String)compterendu.getSelectedItem());
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
