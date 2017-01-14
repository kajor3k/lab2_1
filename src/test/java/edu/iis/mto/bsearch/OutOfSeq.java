package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore; 
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult; 


public class OutOfSeq{
BinarySearch bs = new BinarySearch();
SearchResult sr = new SearchResult();
private int position = -1;
int response;
int key = 6;
int seq[] = {2,5,3,1,4};


	@Before
	public void init(){
		
		sr = BinarySearch.search(key, seq);
		
		
		response = sr.getPosition();
	
		
		
		
	}
	@Test
	public void isNotFound(){
		
		assertThat(sr.isFound(), is(false));
	}
	@Test
	public void isOut(){
		
		assertThat(position, is(response));
	}

	
}