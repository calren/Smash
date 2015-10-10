package vote;

//*********************************************************
//VoteCounterPanel.java
//
//Demonstrates a graphical user interface and event listeners to
//tally votes for two candidates, Joe and Sam.
//*********************************************************
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VoteCounterPanel extends JPanel {
	private int votesForJoe;
	private JButton joe;
	private JLabel labelJoe;

	// ----------------------------------------------
	// Constructor: Sets up the GUI.
	// ----------------------------------------------
	public VoteCounterPanel() {
		votesForJoe = 0;

		joe = new JButton("Vote for Joe");
		joe.addActionListener(new JoeButtonListener());

		labelJoe = new JLabel("Votes for Joe: " + votesForJoe);

		add(joe);
		add(labelJoe);

		setPreferredSize(new Dimension(300, 40));
		setBackground(Color.cyan);
	}

	// ***************************************************
	// Represents a listener for button push (action) events
	// ***************************************************
	private class JoeButtonListener implements ActionListener {
		// ----------------------------------------------
		// Updates the counter and label when Vote for Joe
		// button is pushed
		// ----------------------------------------------
		@Override
		public void actionPerformed(ActionEvent event) {
			votesForJoe++;
			labelJoe.setText("Votes for Joe: " + votesForJoe);
		}
	}
}
