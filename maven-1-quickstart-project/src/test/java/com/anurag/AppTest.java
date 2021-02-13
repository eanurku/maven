package com.anurag;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    private static final String INPUT = "12345";
    @Test
    public void testLength() {

        String expected="5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5";
        String val = App.sha256hex(INPUT);
        Assert.assertEquals(expected,val);
    }
}
