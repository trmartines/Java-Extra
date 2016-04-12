import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JFrameClickEventExample extends JFrame implements MouseListener {
	public JLabel label;
	int wins;
	//static URL url = ScrollingLetter.class.getResource("TeaNCode.png");

	public static void main(String args[]) {
		JOptionPane.showMessageDialog(null, null, "A TeaNCode Original", JOptionPane.INFORMATION_MESSAGE,
				new ImageIcon());
		new JFrameClickEventExample();
	}

	JFrameClickEventExample() {
		setSize(1100, 900);
		setTitle("Hide and Seek, Find him!");

		label = new JLabel("Where am I? click to start looking for me.", JLabel.CENTER);
		add(label);
		label.addMouseListener(this);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * can you add objects to where you click? can you draw jpegs/pngs? can you
	 * click on objects?
	 */
	int ranx = (int) (Math.random() * 1000.0);
	int rany = (int) (Math.random() * 800.0);

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			int x = e.getX();
			int y = e.getY();
			x = e.getX();
			y = e.getY();

			if (x <= ranx + 300 && y <= rany + 300 && x > ranx - 300 && y > rany - 300) {
				if (x <= ranx + 200 && y <= rany + 200 && x > ranx - 100 && y > rany - 100) {
					label.setText("Very Warm");
					if (x <= ranx + 100 && y <= rany + 100 && x >= ranx && y >= rany) {
						wins++;
						label.setText("You Found me! I ran away! (" + wins + " wins)");
						ranx = (int) (Math.random() * 1000.0);
						rany = (int) (Math.random() * 800.0);
					}
				} else if (x <= ranx + 100 && y <= rany + 100 && x >= ranx && y >= rany) {
					wins++;
					label.setText("You Found me! I ran away! (" + wins + " wins)");
					ranx = (int) (Math.random() * 1000.0);
					rany = (int) (Math.random() * 800.0);
				} else {
					label.setText("Warmer");
				}
			} else if (x <= ranx + 100 && y <= rany + 100 && x >= ranx && y >= rany) {
				wins++;
				label.setText("You Found me! I ran away! (" + wins + " wins)");
				ranx = (int) (Math.random() * 1000.0);
				rany = (int) (Math.random() * 800.0);
			} else {
				label.setText("You clicked at: " + x + ", " + y + " but hes not there! click somewhere else!");
			}

		} else if (e.getButton() == MouseEvent.BUTTON3) {
			label.setText("Please use the Left Button.");
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}
}