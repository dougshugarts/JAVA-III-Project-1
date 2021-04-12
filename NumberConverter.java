// driver
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class NumberConverter implements ActionListener {

	// initialize gui
	private NumberConverterUI appUI = new NumberConverterUI(); 
		
	// parameterless constructor
	NumberConverter () {
		
		// add listeners to appUI buttons
		this.appUI.getBinToDec().addActionListener(this);
		this.appUI.getBinToHex().addActionListener(this);
		this.appUI.getHexToDec().addActionListener(this);
		this.appUI.getHexToBin().addActionListener(this);
		this.appUI.getDecToBin().addActionListener(this);
		this.appUI.getDecToHex().addActionListener(this);
		
	} // terminates constructor
	
	// event handlers
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(this.appUI.getHexToDec())) {
			
			String inputMessage = JOptionPane.showInputDialog(this.appUI.getAlertWindow(),"Enter a hexidecimal number:");
			
			if (!(inputMessage == null)) {
				
				try (DecimalNumberConverter decConvert = new DecimalNumberConverter()) {
					
					decConvert.convertFromHex(inputMessage);
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), "The decimal number is: " + decConvert.getConvertedNumber());
				}
				
				catch (NumberConverterException error) {
					
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
				}
				
				catch (Exception error) {
					
					// memory release error via AutoCloseable interface
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
				}
			}
		}
		
		if (e.getSource().equals(this.appUI.getBinToDec())) {
			
			String inputMessage =JOptionPane.showInputDialog(this.appUI.getAlertWindow(),"Enter a binary number:");
			
			if (!(inputMessage == null)) {
				
				try (DecimalNumberConverter decConvert = new DecimalNumberConverter()) {
					
					decConvert.convertFromBinary(inputMessage);
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), "The decimal number is: " + decConvert.getConvertedNumber());
				}
				
				catch (NumberConverterException error) {
					
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
				}
				
				catch (Exception error) {
					
					// memory release error via AutoCloseable interface
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
				}
				
			}
		}
		
		if (e.getSource().equals(this.appUI.getHexToBin())) {
			
			String inputMessage =JOptionPane.showInputDialog(this.appUI.getAlertWindow(),"Enter a hexidecimal number:");
			
			if (!(inputMessage == null)) {
				
				try (BinaryNumberConverter binConvert = new BinaryNumberConverter()) {
					
					binConvert.convertFromHex(inputMessage);
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), "The binary number is: " + binConvert.getConvertedNumber());
				}
				
				catch (NumberConverterException error) {
					
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
				}
				
				catch (Exception error) {
					
					// memory release error via AutoCloseable interface
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
				}
			}
		}
			
		if (e.getSource().equals(this.appUI.getDecToBin())) {
			
			String inputMessage =JOptionPane.showInputDialog(this.appUI.getAlertWindow(),"Enter an integer:");
			
			if (!(inputMessage == null)) {
				
				try (BinaryNumberConverter binConvert = new BinaryNumberConverter()) {
					
					binConvert.convertFromDecimal(inputMessage);
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), "The binary number is: " + binConvert.getConvertedNumber());
				}
				
				catch (NumberConverterException error) {
					
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
				}
				
				catch (Exception error) {
					
					// memory release error via AutoCloseable interface
					JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
				}	
			}
		}
	
		if (e.getSource().equals(this.appUI.getBinToHex())) {
			
			String inputMessage = JOptionPane.showInputDialog(this.appUI.getAlertWindow(),"Enter a binary number:");
			
			if (!(inputMessage == null)) {
			
			try (HexNumberConverter hexConvert = new HexNumberConverter()) {
				
				hexConvert.convertFromBinary(inputMessage);
				JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), "The hexadecimal number is: " + hexConvert.getConvertedNumber());
			}
			
			catch (NumberConverterException error) {
				
				JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
			}
			
			catch (Exception error) {
				
				// memory release error via AutoCloseable interface
				JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
			}
		}
			
		} 
			
		if (e.getSource().equals(this.appUI.getDecToHex())) {
			
			String inputMessage = JOptionPane.showInputDialog(this.appUI.getAlertWindow(),"Enter an integer:");
			
			if (!(inputMessage == null)) {
			
			try (HexNumberConverter hexConvert = new HexNumberConverter()) {
				
				hexConvert.convertFromDecimal(inputMessage);
				JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), "The hexadecimal number is: " + hexConvert.getConvertedNumber());
			}
			
			catch (NumberConverterException error) {
				
				JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
			}
			
			catch (Exception error) {
				
				// memory release error via AutoCloseable interface
				JOptionPane.showMessageDialog(this.appUI.getAlertWindow(), error.getMessage());
			}
		}
		
		}
		
	}
	
	// launch app
	public static void main (String[] args) {
		
		NumberConverter launchApp = new NumberConverter();

	}

}
