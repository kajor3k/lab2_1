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
BinarySearch bs = new BinarySearch();
SearchResult sr = new SearchResult();
int key = 1;
int seq[] = {1};


	@Before
	public void init(){
		
		sr = BinarySearch.search(key, seq);
		
		
	
		
		
		
	}
	@Test
	public void oneIsOut(){
		
		assertSame(true,sr.isFound());
	}
		
	
}