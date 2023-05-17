////////////////////////////////////////////////////////////////////
// Osama Chelhaoui 2042333
// Giovanni Ponso 2000558
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {
    
    @Test
    public void testInit(){
        IntegerToRoman test = new IntegerToRoman();
        assertEquals(null, test.convert(0));
    }
}