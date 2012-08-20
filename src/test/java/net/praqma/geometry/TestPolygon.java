package net.praqma.geometry;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;


public class TestPolygon extends Geometry {
	
	@Test
	public void isPointInside() {
		
		Polygon p = new Polygon();
		p.addPoint( 0, 0 ).addPoint( 1, 0 ).addPoint( 1, 1 ).addPoint( 0, 1 );
		p.endPolygon();
		
		/* In the middle */
		Point p1 = new Point( 0.5, 0.5 );
		
		/* On edges */
		Point p2_bottom = new Point( 0.5, 0 );
		Point p2_right = new Point( 1, 0.5 );
		Point p2_top = new Point( 0.5, 1 );
		Point p2_left = new Point( 0, 0.5 );
		
		/* On vertexes */
		Point p3_bl = new Point( 0, 0 );
		Point p3_br = new Point( 1, 0 );
		Point p3_tr = new Point( 1, 1 );
		Point p3_tl = new Point( 0, 1 );
		
		/*  */
		Point p4_1 = new Point( -0.5, 0.5 );
		Point p4_2 = new Point( 0.5, -0.5 );
		Point p4_3 = new Point( 1.5, 0.5 );
		Point p4_4 = new Point( 0.5, 1.5 );

		
		assertThat( p.isInside( p1 ), is( true ) );
		
		assertThat( p.isInside( p2_bottom ), is( false ) );
		assertThat( p.isInside( p2_right ), is( true ) );
		assertThat( p.isInside( p2_top ), is( true ) );
		assertThat( p.isInside( p2_left ), is( false ) );
		
		assertThat( p.isInside( p3_bl ), is( false ) );
		assertThat( p.isInside( p3_br ), is( false ) );
		assertThat( p.isInside( p3_tr ), is( true ) );
		assertThat( p.isInside( p3_tl ), is( false ) );
		
		System.out.println( "----------------------Other" );
		assertThat( p.isInside( p4_1 ), is( false ) );
		assertThat( p.isInside( p4_2 ), is( false ) );
		assertThat( p.isInside( p4_3 ), is( false ) );
		assertThat( p.isInside( p4_4 ), is( false ) );
	}
}
