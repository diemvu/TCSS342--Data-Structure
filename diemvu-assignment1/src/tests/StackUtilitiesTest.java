/**
 * 
 */

package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import program.StackUtilities;

/**
 * @author Diem Vu
 * @version 1.0
 */
public class StackUtilitiesTest {
    /**
     * @throws java.lang.Exception nothing.
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test method for {@link program.StackUtilities#decimalToBinary(int)}.
     */
    @Test
    public void testDecimalToBinary() {
        assertEquals("Can't convert a nonpositive integer",
                     StackUtilities.decimalToBinary(-5));
        assertEquals("Can't convert a nonpositive integer", StackUtilities.decimalToBinary(0));
        assertEquals("1", StackUtilities.decimalToBinary(1));
    }

}
