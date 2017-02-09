package com.theincorrectclock.spinwords;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpinWordsTest {

    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
        assertEquals("No spin here", new SpinWords().spinWords("No spin here"));
    }

}
