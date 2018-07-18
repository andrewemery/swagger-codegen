package io.swagger.codegen.utils;

import io.swagger.codegen.v3.utils.SemVer;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SemVerTest {

    @Test(enabled = false)
    public void parsingAndPrinting() {
        assertEquals("4.3.0", new SemVer("4.3").toString());
    }

    @Test(enabled = false)
    public void atLeast() {
        assertTrue(new SemVer("3.2.1").atLeast("3.2.1"));
        assertTrue(new SemVer("3.2.1").atLeast("2.3.4"));
        assertFalse(new SemVer("3.2.1").atLeast("3.3.0"));
    }

}
