import javax.swing.*;
public class Name {

	/**
	 * Elam Barnett
	 */
	public static class DisplayName {
		JFrame frame;
		JPanel contentPane;
		JLabel label;
	
	public DisplayName(){
		frame = new JFrame("My Name is...");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		label = new JLabel("Elam Barnett");
		contentPane.add(label);
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setSize(200,100);
		frame.setVisible(true);
}		
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		DisplayName name = new DisplayName();
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


