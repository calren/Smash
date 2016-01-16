
// for Point2D.Double
import java.awt.geom.Point2D;
import java.util.ArrayList; // for ArrayList

// http://pavao.org/compsci/gpdraw/html/gpdraw/DrawingTool.html

/*
 * The program should use the Drawing Tool to draw the polygon
 * by joining adjacent points with a line segment,
 * and then closing it up by joining the end and start points.
 */
public class PartyPolygonsTemplate {

	static SketchPad paper = new SketchPad(400, 400);
	static DrawingTool pencil = new DrawingTool(paper);

	private static ArrayList<Point2D.Double> myPolygon = new ArrayList<>();

	public static void main() {
		// add some points by calling the add function

		draw();
	}

	/*
	 * This function should add point to myPolygon
	 */
	public static void add(Point2D.Double point) {
	}

	/*
	 * This function should use a for loop to go through all the points in
	 * myPolygon and move the pencil there for each point
	 *
	 * At the end, it should close the polygon
	 */
	public static void draw() {
	}

}