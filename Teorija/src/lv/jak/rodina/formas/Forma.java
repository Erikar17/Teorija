package lv.jak.rodina.formas;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

//Jframe mantošana, lai nodrošinātu formas aplikāciju veidošanu
public class Forma extends JFrame{
	  //Definēt visas plānotās formas un komponentes
	JLabel enterNameL; //vienkārša (statiska) teksta komponents
	JList<String> listedNames; //saraksta lauks
	JTextField enterNameTF; //ievadlauks - teksta
	JButton addBTN, clearBTN; //spiedpogas
	JPanel panel;//komponente, uz kuras tiek liktas pārējās komponentes
	
	//nepieciešams, lai aizpildītu sat\raksta lauku
	DefaultListModel<String> model = new DefaultListModel<String>();
	
	//apraksta formas parametrus izmantojot konstruktorfunkciju
	public Forma() {
		setBounds(2000, 150, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pirmā Forma");
		
		init();
		setContentPane(panel);
	}
	
	
	public void init() {
		panel = new JPanel(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel topPanel = new JPanel(new BorderLayout(10, 10));
		
		enterNameL = new JLabel("Enter a name");
		enterNameTF = new JTextField();
		enterNameTF.setSize(175, 30);
		addBTN = new JButton("Add");

		
		topPanel.add(enterNameL, BorderLayout.WEST);
		topPanel.add(enterNameTF,  BorderLayout.CENTER);
		topPanel.add(addBTN,  BorderLayout.EAST);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		
		panel.add(topPanel, c);
		
	
		
		
		listedNames = new JList<String>(model);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		
		
		//-- beigas formas centram
		
		//formas apakša
		JPanel bottomPanel = new JPanel(new BorderLayout());
        clearBTN = new JButton("Clear");
        
        bottomPanel.add(clearBTN, BorderLayout.NORTH);
        
		panel.add(topPanel, BorderLayout.NORTH);
		panel.add(new JScrollPane(listedNames), BorderLayout.CENTER);
		panel.add(bottomPanel, BorderLayout.SOUTH);
		
		
	}
}
