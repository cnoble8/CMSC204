import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	GradeBook g1;
	GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(80);
		g1.addScore(75);
		g1.addScore(90);
		
		
		g2.addScore(100);
		g2.addScore(60);
		g2.addScore(80);

	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		
	}
	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("80.0 75.0 90.0 0.0 0.0 "));
		assertTrue(g2.toString().equals("100.0 60.0 80.0 0.0 0.0 "));
		assertEquals(3,g1.getScoreSize(), .0001);
		assertEquals(3,g2.getScoreSize(), .0001);
	}

	@Test
	public void testSum() {
		assertEquals(245,g1.sum(), .0001);
		assertEquals(240,g2.sum(), .0001);
	}
	@Test
	public void testMinimum() {
		assertEquals(75,g1.minimum(), .0001);
		assertEquals(60,g2.minimum(), .0001);
	}
	@Test
	public void testFinalScore() {
		assertEquals(170,g1.finalScore(), .0001);
		assertEquals(180,g2.finalScore(), .0001);
	}
	

}
