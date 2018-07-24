package de.drippinger;

import com.sun.org.apache.xpath.internal.operations.Mult;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Dennis Rippinger (msg systems ag) 2018
 */
public class MultiplierTest {

    private Multiplier multiplier = new Multiplier();

    @Test
    public void test_multiply_simple() {
        Integer result = multiplier.multiply(2, 1);

        assertThat(result, is(2));
    }

    @Test
    public void test_multiply_complex() {
        Integer result = multiplier.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE);

        assertThat(result, is(Integer.MAX_VALUE *  Integer.MAX_VALUE));
    }
}
