package com.tp.jenkins;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testMessage() {
        assertEquals("Hello Jenkins CI Pipeline", App.message());
    }
}
