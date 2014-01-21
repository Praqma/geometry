package net.praqma.geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class Geometry {

	public enum GeometricSide {
		LEFT,
		RIGHT,
		COINCIDENT
	}

	protected List<Point> points = new ArrayList<Point>();

	public Geometry() {
		
	}

	public List<Point> getPoints() {
		return points;
	}

	public Geometry addPoint( Point p ) {
		points.add( p );

		return this;
	}

	public Geometry addPoint( double x, double y ) {
		points.add( new Point( x, y ) );

		return this;
	}
}
