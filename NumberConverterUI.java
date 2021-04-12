// app gui
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NumberConverterUI {
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	
	private JButton binToHex = new JButton("Bin to Hex");
	private JButton binToDec = new JButton("Bin to Dec");
	private JButton hexToBin = new JButton("Hex to Bin");
	private JButton hexToDec= new JButton("Hex to Dec");
	private JButton decToHex = new JButton("Dec to Hex");
	private JButton decToBin= new JButton("Dec to Bin");
	
	private JPanel alertPanel = new JPanel();
	private JFrame alertWindow = new JFrame();

	// parameterless constructor
	NumberConverterUI () {
		
		this.panel.add(this.binToHex);
		this.panel.add(this.binToDec);
		this.panel.add(this.hexToBin);
		this.panel.add(this.hexToDec);
		this.panel.add(this.decToHex);
		this.panel.add(this.decToBin);
				
		this.frame.add(this.panel);
		this.frame.pack();
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLocationRelativeTo(null);
		this.frame.setVisible(true);
		
		this.alertWindow.add(this.alertPanel);
		this.alertWindow.pack();
		this.alertWindow.setLocationRelativeTo(null);
		this.alertWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.alertWindow.setVisible(false);
		
	}

	// button and alert window getters
	public JButton getBinToHex () {
		
		return this.binToHex;
	}
	
	public JButton getBinToDec () {
		
		return this.binToDec;
	}
	
	public JButton getHexToBin () {
		
		return this.hexToBin;
	}
	
	public JButton getHexToDec () {
		
		return this.hexToDec;
	}
	
	public JButton getDecToHex () {
		
		return this.decToHex;
	}
	
	public JButton getDecToBin () {
		
		return this.decToBin;
	}

	public JFrame getAlertWindow () {
		
		return this.alertWindow;
	}
}
