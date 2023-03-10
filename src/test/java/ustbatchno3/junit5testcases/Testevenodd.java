package ustbatchno3.junit5testcases;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Testevenodd {
	@Test
	
	public void testeven()
	{
		int n=10;
		boolean result =Iseven(n);
		assertTrue(result);
	}
	public void testodd()
	{
		int n=1;
		boolean result =Iseven(n);
		assertFalse(result);
	}
	public boolean Iseven(int n)
	{
		return n%2==0;
	}

//	public boolean Isodd(int n)
//	{
//		return n%2!=0;
//	}

}


