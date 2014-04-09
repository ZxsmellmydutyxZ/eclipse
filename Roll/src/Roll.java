import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Elam Barnett
 */

public class Roll implements ActionListener
{
	
	JFrame frame;
	JPanel contentPane;
	JButton roll;
	JLabel Face, Face1;
	
	public Roll()	{
		frame = new JFrame ("Roll");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder (20, 20, 20, 20));
		contentPane.setBackground(Color.black);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		Face = new JLabel(new ImageIcon("die1.gif"));
		Face.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		Face.setBorder(BorderFactory.createEmptyBorder (0, 0, 10, 0));
		contentPane.add(Face);
		
		Face1 = new JLabel(new ImageIcon("die1.gif"));
		Face1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		Face1.setBorder(BorderFactory.createEmptyBorder (0, 0, 10, 0));
		contentPane.add(Face1);
		
		roll = new JButton("Roll Die");
		roll.setAlignmentX(JButton.CENTER_ALIGNMENT);
		roll.addActionListener(this);
		contentPane.add(roll);
		
		frame.setContentPane(contentPane);		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		
		Random rand = new Random();
		int newRoll, newRoll1;
		newRoll = rand.nextInt(6) + 1;
		if (newRoll == 1) {
		Face.setIcon(new ImageIcon("die1.gif"));
		} else if (newRoll == 2) {
		Face.setIcon(new ImageIcon("die2.gif"));
		} else if (newRoll == 3) {
		Face.setIcon(new ImageIcon("die3.gif"));
		} else if (newRoll == 4) {
		Face.setIcon(new ImageIcon("die4.gif"));
		} else if (newRoll == 5) {
		Face.setIcon(new ImageIcon("die5.gif"));
		} else if (newRoll== 6) {
		Face.setIcon(new ImageIcon("die6.gif"));
		}
		
		newRoll1 = rand.nextInt(6) + 1;
		if (newRoll1 == 1) {
		Face1.setIcon(new ImageIcon("die1.gif"));
		} else if (newRoll1 == 2) {
		Face1.setIcon(new ImageIcon("die2.gif"));
		} else if (newRoll1 == 3) {
		Face1.setIcon(new ImageIcon("die3.gif"));
		} else if (newRoll1 == 4) {
		Face1.setIcon(new ImageIcon("die4.gif"));
		} else if (newRoll1 == 5) {
		Face1.setIcon(new ImageIcon("die5.gif"));
		} else if (newRoll1 == 6) {
		Face1.setIcon(new ImageIcon("die6.gif"));
		}
	}
	
	private static void actionPerformed(){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		Roll die = new Roll();
	}
	public static void main (String[] args){
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() { 
			public void run() {
				
			actionPerformed();	}}
		);
		
	}

}

