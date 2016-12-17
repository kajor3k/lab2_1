package org.junit.jupiter.api;
import org.mockito.Mock;
import com.example.mockito.MockitoExtension;



public class LengthOneIsInSeq {
	@Before
	void init(@Mock SearchResult searchResult ){
		when(searchResult.isFound()).thenReturn(true);
		when(searchResult.getPosition().thenReturn(2))
	}
	void oneIsInSeq(){
		assertTrue(searchResult.isFound()&&searchResult.getPosition())
	}
		
	
}
