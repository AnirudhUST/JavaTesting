package ustbatchno3.junit5testcases;

import java.util.ArrayList;
import java.util.*;

public class ElementsCount {
	
	public static int collection(String s)
    { 
		ArrayList <String>l=new ArrayList<String>();
		l.add("agk");
		l.add("abk");
		l.add("agk");
		l.add("agk");
		return(Collections.frequency(l, s));
		 
    }
	      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="agk";
			System.out.println(collection(s));
					

	}

}
