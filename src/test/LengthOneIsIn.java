import static org.junit.Assert.*;



import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore; 
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure; 


public class LengthOneIsIn{
BinarySearch bs = new BinarySearch();
SearchResult sr = new SearchResult();


	@Before
	void init(){
		//when(searchResult.isFound()).thenReturn(true);
		//when(searchResult.getPosition().thenReturn(2));
		int key = 1;
		int seq[]=null;
		
	}
	@Test
	void oneIsInSeq(){
		assertEquals("true",searchResult.isFound());
		assertEquals(2,searchResult.getPosition());
	}
		
	
}
