package net.praqma.geometry;

public class Point {
	public double x, y;
	
	public Point( double x, double y ) {
		this.x = x;
		this.y = y;
	}
	
	public Point multiply( Point other ) {
		return new Point( this.x * other.x, this.y * other.y );
	}
	
	public Point subtract( Point other ) {
		return new Point( this.x - other.x, this.y - other.y );
	}

	public double getDistance( Point other ) {
		Point i = this.subtract( other );
		return Math.sqrt( ( i.x * i.x ) + ( i.y * i.y ) );
	}
	
	public String toString() {
		return x + ", " + y;
	}
}
