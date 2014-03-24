import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
public class Name {

	/**
	 * Elam Barnett
	 */
	public static class DisplayName implements ActionListener{
		final static String TEXT = "Elam Barnett";
		JFrame frame;
		JPanel contentPane;
		JLabel label;
		JButton button;
		
		public DisplayName(){
		frame = new JFrame("My Name is...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		label = new JLabel(TEXT);
		contentPane.add(label);
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setSize(200,100);
		frame.setVisible(true);
		
		button = new JButton("Hide");
		button.setActionCommand("Hide");
		button.addActionListener(this);
		contentPane.add(button);
}		
	
	public void actionPerformed(ActionEvent event){
		String eventName = event.getActionCommand();
		
		if (eventName.equals("Hide")){
			label.setText(" ");
			button.setText("Show");
			button.setActionCommand("Show");
		} else {
			label.setText(TEXT);
			button.setText("Hide");
			button.setActionCommand("Show");
		}	
	}
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		new DisplayName();
	}

	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();
			}
		});
	}
	}
}


