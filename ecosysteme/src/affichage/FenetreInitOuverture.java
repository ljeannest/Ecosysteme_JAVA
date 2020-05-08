package affichage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FenetreInitOuverture extends JFrame{
	private JButton bouton = new JButton("Choisir les parametres de la simulation");

	public FenetreInitInfo FII;
	
	public FenetreInitOuverture() {
		this.setTitle("Initialisation");
		this.setSize(300,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(bouton);
		bouton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FenetreInit FI=new FenetreInit(null,"Paramètres de la simulation",true);
				FenetreInitInfo FII = FI.showFII();
				JOptionPane jop=new JOptionPane();
				jop.showMessageDialog(null,FII.toString(),"Recapitulatif",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		this.setVisible(true);
	}
	
	public static int[] recuperation_info() {
		int[] info = new int[7];
		FenetreInit FI=new FenetreInit(null,"Paramètres de la simulation",true);
		FenetreInitInfo FII = FI.showFII();
		JOptionPane jop=new JOptionPane();
		jop.showMessageDialog(null,FII.toString(),"Recapitulatif",JOptionPane.INFORMATION_MESSAGE);
		info[0]=FII.nb_lievre;
		info[1]=FII.nb_lynx;
		info[2]=FII.nb_vautour;
		info[3]=FII.nb_flaques;
		info[4]=FII.duree;
		info[5]=FII.presence_lac;
		info[6]=FII.presence_riviere;
		return info;
		
	}
	
}
