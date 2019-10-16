package lv.jak.rodina.formas;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Jframe mantošana, lai nodrošinātu formas aplikāciju veidošanu
public class Forma extends JFrame{
	  //Definēt visas plānotās formas un komponentes
	JLabel enterName; //vienkārša (statiska) teksta komponents
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
		
		setContentPane(panel);
	}
	
	
	public void init() {
		panel = new JPanel(new BorderLayout());
		
		JPanel topPanel = new JPanel(null);
		
		JLabel enterNameL = new JLabel("Enter a name");
		enterNameL.setBounds(10, 10, 250, 25);
		
		enterNameTF = new JTextField();
		enterNameTF.setBounds(170, 230, 230, 30);
		
		JButton addBIN = new JButton("Add");
		addBIN.setBounds(410, 10, 70, 30);
		
		
		
		
	}
}
