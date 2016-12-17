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


public class LengthOneIsOut{
BinarySearch bs = new BinarySearch();
SearchResult sr = new SearchResult();


	@Before
	public void init(){
		
		
		
		
		
	}
	@Test
	public void oneIsInSeq(){
		int position = sr.getPosition();
		assertEquals(false,sr.isFound());
		assertEquals(position,sr.getPosition());
	}
		
	
}