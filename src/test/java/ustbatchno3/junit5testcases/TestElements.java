package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestElements {

	
	  @Test
	  public void counttesting1() {
	  	String s="agk";
	  	int expected1=3;
	  	int actual1=ElementsCount.collection(s);

	  	assertEquals(expected1,actual1);
	  	
	  }
}
