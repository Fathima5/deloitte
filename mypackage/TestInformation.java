package mypackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestInformation {
	Information i = null;
	@Before
	public void setUp() {
		i = new Information(89,20,"akhil");
	}
	@After
	public void tearDown() {
		i = null;
	}

	@Test
	public void testEid() {
		assertEquals(-1, i.getEid());
	}
	
	@Test
	public void testAge( ) {
		assertEquals(-1,i.getAge());
	}
	@Test
	public void testEname( ) {
		assertNull(i.getEname());
	}

}
