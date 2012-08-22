package net.praqma.geometry;

public class Line extends Geometry {

	public double getDistance( Point point ) {
		Point p1 = this.points.get( 0 );
		Point p2 = this.points.get( 1 );
		
		double d = ( p2.x - p1.x ) * ( p1.y - point.y ) - ( p1.x - point.x ) * ( p2.y - p1.y );
		double d2 = p1.getDistance( p2 );
		if( d2 != 0 ) {
			return d / d2;
		} else {
			return 0; /* Points are coincident */
		}
	}
	
	public GeometricSide getGeometricSide( Point point ) {
		Point p1 = this.points.get( 0 );
		Point p2 = this.points.get( 1 );
		
		double d = ( point.y - p1.y ) * ( p2.x - p1.x ) - ( point.x - p1.x ) * ( p2.y - p1.y );
		
		if( d > 0 ) {
			return GeometricSide.LEFT;
		} else if( d < 0 ) {
			return GeometricSide.RIGHT;
		} else {
			return GeometricSide.COINCIDENT;
		}
	}
}
