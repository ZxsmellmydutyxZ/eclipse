import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


	
	public class SunFlower implements ActionListener{
		public static String LATIN = "Helianthus";
		public static String ENGLISH = "Sunflower";
		JFrame frame;
		JPanel contentPane;
		JLabel label;
		JButton button;
		JButton button1;
	
		public SunFlower(){
		frame = new JFrame("Sunflower");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		label = new JLabel(ENGLISH);
		label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		contentPane.add(label);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		contentPane.setBorder(BorderFactory.createEmptyBorder(10,30,60,30));
		
		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);
		
		button = new JButton("English");
		button.setActionCommand("Eng");
		button.addActionListener(this);
		contentPane.add(button);
		
		
		button1 = new JButton("Latin");
		button1.setActionCommand("Lat");
		button1.addActionListener(this);
		contentPane.add(button1);
		
		
}		
		
		public void actionPerformed(ActionEvent event){
			String eventClick = event.getActionCommand();
				
				if(eventClick.equals("Lat")){
					label.setText(LATIN);
				}else if(eventClick.equals("Eng")){
					label.setText(ENGLISH);
				}
				
				
				
		}
		
		private static void runGUI(){
			JFrame.setDefaultLookAndFeelDecorated(true);
			new SunFlower();
		}

		
		public static void main(String[] args) {
			javax.swing.SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					runGUI();
				}
			});
		}

}
