package lv.jak.rodina.formas;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormaNoLayout extends JFrame {
	
	
	JLabel enterNameL; 
	JList<String> listedNames; 
	JTextField enterNameTF; 
	JButton addBTN, clearBTN; 
	JPanel panel;
	
	DefaultListModel<String> model = new DefaultListModel<String>();
	
	
	public FormaNoLayout() {
		setBounds(100, 150, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pirmā Forma");
		
		init();
		setContentPane(panel);
		
		
		
}
	public void init() {
		panel = new JPanel(null);
		
		enterNameL = new JLabel("Enter a name:");
		enterNameL.setBounds(10, 10, 80, 30);
		
		enterNameTF = new JTextField();
		enterNameTF.setBounds(100, 10, 280, 30);
		
		addBTN = new JButton("Add");
		addBTN.setBounds(390, 10, 80, 30);
		
		listedNames = new JList<String>(model);
		listedNames.setBounds(10, 50, 460, 160);
		
		
		clearBTN = new JButton("Clear");
		clearBTN.setBounds(390, 220, 80, 30);
		
		panel.add(enterNameL); panel.add(enterNameTF); panel.add(addBTN);panel.add(listedNames);panel.add(clearBTN);
		
	}

}

