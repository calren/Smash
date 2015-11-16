package november14;

import java.awt.Color;

public class DrawSun {

	public static void main(String[] args) {

		DrawingTool pencil;
		SketchPad paper;

		paper = new SketchPad(400, 400);
		pencil = new DrawingTool(paper);

		for (int i = 0; i < 360; i++) {
			if (i % 2 == 0) {
				pencil.setColor(Color.RED);
			} else if (i % 3 == 0) {
				pencil.setColor(Color.BLUE);
			} else if (i % 5 == 0) {
				pencil.setColor(Color.GREEN);
			} else {
				pencil.setColor(Color.YELLOW);
			}

			pencil.forward(300);
			pencil.backward(300);
			pencil.turnLeft(2);
		}

	}
}
