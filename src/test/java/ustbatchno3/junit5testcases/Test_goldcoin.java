package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
//import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import org.junit.Test;

public class Test_goldcoin {
	@Test
	public void isgoldcoin()
	{
		
		
		@SuppressWarnings("unused")
		Getgoldcoins find= new Getgoldcoins();
		
		assertEquals("****",find.findgold(LocalDate.of(2022,1,21)));
		
		
		
	}

}

