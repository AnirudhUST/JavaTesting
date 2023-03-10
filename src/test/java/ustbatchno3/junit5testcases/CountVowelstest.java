package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountVowelstest {

	 

	 @Test

	 public void counttesting() {

	 

	 String input ="sharath";

	 

	 int expected=2;

	 int actual=Vowel.vowelscount(input);
	 
	 
	 assertEquals(expected,actual);}
	  @Test
	  public void counttesting1() {
	  	String input1 ="shaaarath";
	  	int expected1=4;
	  	int actual1=Vowel.vowelscount(input1);

	  	assertEquals(expected1,actual1);

	 

	 }}