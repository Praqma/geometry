package net.praqma.geometry;

import static org.junit.Assert.*;

import net.praqma.geometry.Geometry.GeometricSide;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class TestLine {

	@Test
	public void distance() {
		Line l = (Line) new Line().addPoint( 0, 0 ).addPoint( 0, 1 );
		Point p1 = new Point( 1, 0 );
		Point p2 = new Point( 10, 0 );
		
		assertThat( l.getDistance( p1 ), is( 1.0 ) );
		assertThat( l.getDistance( p2 ), is( 10.0 ) );
	}
	
	@Test
	public void geometricSide() {
		Line l = (Line) new Line().addPoint( 0, 0 ).addPoint( 0, 1 );
		Point p1 = new Point( 1, 0 );
		Point p2 = new Point( -1, 0 );
		Point p3 = new Point( 0, 0 );
		
		assertThat( l.getGeometricSide( p1 ), is( GeometricSide.RIGHT ) );
		assertThat( l.getGeometricSide( p2 ), is( GeometricSide.LEFT ) );
		assertThat( l.getGeometricSide( p3 ), is( GeometricSide.COINCIDENT ) );
	}
}
