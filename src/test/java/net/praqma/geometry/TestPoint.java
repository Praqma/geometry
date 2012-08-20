package net.praqma.geometry;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class TestPoint {
	
	@Test
	public void distance() {
		Point p1 = new Point( 0, 0 );
		Point p2 = new Point( 1, 0 );
		Point p3 = new Point( 0.5, 0 );
		Point p4 = new Point( 10.0, 0 );
		Point p5 = new Point( -10.0, 0 );
		
		assertThat( p1.getDistance( p2 ), is( 1.0 ) );
		assertThat( p1.getDistance( p3 ), is( 0.5 ) );
		assertThat( p1.getDistance( p4 ), is( 10.0 ) );
		assertThat( p1.getDistance( p5 ), is( 10.0 ) );
	}
}
