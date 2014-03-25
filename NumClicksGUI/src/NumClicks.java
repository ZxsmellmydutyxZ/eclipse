import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	
	public class NumClicks implements ActionListener{
		int clicks = 0;
		JFrame frame;
		JPanel contentPane;
		JLabel label;
		JButton button;
	
		public NumClicks(){
		frame = new JFrame("NumClicks");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		label = new JLabel();
		contentPane.add(label);
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setSize(210,70);
		frame.setVisible(true);
		
		
		button = new JButton("You have clicked " + clicks + " times.");
		button.setActionCommand("Click");
		button.addActionListener(this);
		contentPane.add(button);
		
		
}		
		
		public void actionPerformed(ActionEvent event){
			String eventClick = event.getActionCommand();
			
			if(eventClick.equals("Click")){
				clicks = clicks +1;
			}
			if(eventClick.equals("Click")){
				button.setText("You have clicked " + clicks + " times.");
			}
		}
		
		private static void runGUI(){
			JFrame.setDefaultLookAndFeelDecorated(true);
			new NumClicks();
		}

		
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					runGUI();
				}
			});
		}

}
