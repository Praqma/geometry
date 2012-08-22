package net.praqma.geometry;

public class Polygon extends Geometry {
	
	public Geometry endPolygon() {
		this.points.add( this.points.get( 0 ) );
		
		return this;
	}
	
	public boolean contains( Point point ) {
		
		/* TODO: Should we test the size? */
		
		int counter = 0;
		Point p1 = points.get( 0 ), p2 = null;
		
		/* Iterate all edges */
		for( int i = 1 ; i < points.size() ; i++ ) {
			p2 = points.get( i );
			
			/* Point is within the y axis */
			if( ( point.y > Math.min( p1.y, p2.y ) ) && ( point.y <= Math.max( p1.y, p2.y ) ) ) {
				
				/* Point is before the x axis */
				if( point.x <= Math.max( p1.x, p2.x ) ) {
					
					/* The y axis of the two points cannot be the same */
					if( p1.y != p2.y ) {
						double d = ( point.y - p1.y ) * ( p2.x - p1.x ) - ( point.x - p1.x ) * ( p2.y - p1.y );
						if( p1.x == p2.x || d > 0 ) {
							counter++;
						}
					}
				}
			}
			
			p1 = p2;
		}
		
		if( counter % 2 == 0 ) {
			return false;
		} else {
			return true;
		}
		  
	}
}
