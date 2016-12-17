import static org.junit.Assert.*;



import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore; 
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult; 


public class LengthOneIsInSeq{
//BinarySearch bs = new BinarySearch();
SearchResult sr = new SearchResult();


	@Before
	public void init(){
		//when(searchResult.isFound()).thenReturn(true);
		//when(searchResult.getPosition().thenReturn(2));
		
		int position = sr.getPosition();
		
		
		
	}
	@Test
	public void oneIsInSeq(){
		int position = sr.getPosition();
		assertEquals("true",sr.isFound());
		assertEquals(position,sr.getPosition());
	}
		
	
}