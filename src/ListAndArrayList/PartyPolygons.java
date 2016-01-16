
// for Point2D.Double
import java.awt.geom.Point2D;
import java.util.ArrayList; // for ArrayList

// http://pavao.org/compsci/gpdraw/html/gpdraw/DrawingTool.html

/*
 * The program should use the Drawing Tool to draw the polygon
 * by joining adjacent points with a line segment,
 * and then closing it up by joining the end and start points.
 */
public class PartyPolygons {

	static SketchPad paper = new SketchPad(400, 400);
	static DrawingTool pencil = new DrawingTool(paper);

	private static ArrayList<Point2D.Double> myPolygon = new ArrayList<>();

	public static void main() {
		// add some points
		add(new Point2D.Double(30, 20));
		add(new Point2D.Double(60, 30));
		add(new Point2D.Double(100, -10));
		draw();
	}

	public static void add(Point2D.Double aPoint) {
		myPolygon.add(aPoint);
	}

	public static void draw() {
		for (Point2D.Double point : myPolygon) {
			pencil.move(point.getX(), point.getY());
		}
		pencil.move(0, 0);
	}

}