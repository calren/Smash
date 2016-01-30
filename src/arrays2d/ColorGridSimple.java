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

public class ColorGridSimple {

	public static void main(String[] args) {
		new ColorGridSimple();
	}

	public ColorGridSimple() {
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

			cells[3][3].setBackground(Color.RED);
		}
	}

	public class CellPane extends JPanel {

		private Color defaultBackground;

		public CellPane() {
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					defaultBackground = getBackground();
					setBackground(Color.BLUE);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					setBackground(defaultBackground);
				}
			});
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(50, 50);
		}
	}
}
