package edu.iis.mto.bsearch;

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


public class MidElem{
BinarySearch bs = new BinarySearch();
SearchResult sr = new SearchResult();
int key = 1;
int seq[] = {2,5,1,3,4};


	@Before
	public void init(){
		
		sr = BinarySearch.search(key, seq);
		
		
	
		
		
		
	}
	@Test
	public void isFound(){
		
		assertSame(true,sr.isFound());
	}
	@Test
	public void isMiddle(){
		
		assertSame("( elem at position 3 )",sr.toString());
	}
		
	
}