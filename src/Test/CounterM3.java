package Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import org.junit.Test;
import org.w3c.dom.css.Counter;


public class CounterM3 {

	@Test
	public void test3() {
		Integer first,mockedFirst;
		Integer second,mockedSecond;
		
		Counter count = new Counter();
		Counter mockedCounter= mock(Counter.class);
		
		when(mockedCounter.getValue(1)).thenReturn(1).thenReturn(2);
		when(mockedCounter.getValue(2)).thenReturn(2).thenReturn(4);
		
		first = count.getValue(1);
		second = count.getValue(2);
		
		mockedFirst= mockedCounter.getValue(1);
		mockedSecond= mockedCounter.getValue(2);
		
		assertEquals("First firstwrongeAnswer !",first , mockedFirst);
		assertEquals("First second WrongeAnswer !",second , mockedSecond);
		
		first = count.getValue(1);
		second = count.getValue(2);
		
		mockedFirst= mockedCounter.getValue(1);
		mockedSecond= mockedCounter.getValue(2);
		
		assertEquals("Second first Answer !",first , mockedFirst);
		assertEquals("Second secondAnswer !",second , mockedSecond);
	}

	
}
