package arrays2d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class ColorGridTemplate {

	public static void main(String[] args) {
		new ColorGridTemplate();
	}

	public ColorGridTemplate() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException ex) {
				}

				JFrame frame = new JFrame("Testing");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(new BorderLayout());
				frame.add(new TestPane());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	public class TestPane extends JPanel {

		public TestPane() {
			setLayout(new GridBagLayout());

			CellPane[][] cells = new CellPane[5][5];

			GridBagConstraints gbc = new GridBagConstraints();
			for (int row = 0; row < 5; row++) {
				for (int col = 0; col < 5; col++) {
					gbc.gridx = col;
					gbc.gridy = row;

					CellPane cellPane = new CellPane();
					cells[row][col] = cellPane;
					Border border = null;
					if (row < 4) {
						if (col < 4) {
							border = new MatteBorder(1, 1, 0, 0, Color.GRAY);
						} else {
							border = new MatteBorder(1, 1, 0, 1, Color.GRAY);
						}
					} else {
						if (col < 4) {
							border = new MatteBorder(1, 1, 1, 0, Color.GRAY);
						} else {
							border = new MatteBorder(1, 1, 1, 1, Color.GRAY);
						}
					}
					cellPane.setBorder(border);
					add(cellPane, gbc);
				}
			}

			/**
			 * TODO TODO TODO
			 * You have a 5 x 5 square. Try drawing an X by setting 
			 * certain squares to a color (it could be red, or blue, or any color you like)
			 */
			cells[3][3].setBackground(Color.RED);
			
			/**
			 * TODO TODO TODO
			 * Now try setting every other row to a certain color by using a for loop appropriately
			 * For example, all boxes in the first, third, and fifth row will be red
			 */
		}
	}

	public class CellPane extends JPanel {

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(50, 50);
		}
	}
}
