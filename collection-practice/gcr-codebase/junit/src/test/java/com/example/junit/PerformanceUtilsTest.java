package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class PerformanceUtilsTest {

    PerformanceUtils utils = new PerformanceUtils();

    @Test
    @Timeout(4)
    void testLongRunningTask() throws InterruptedException {
        String result = utils.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
