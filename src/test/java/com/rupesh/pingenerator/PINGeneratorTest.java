package com.rupesh.pingenerator;

//Import the necessary classes for testing
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Set;


public class PINGeneratorTest {
	@Test
    public void testPinGeneration() {
        // Create a PinGenerator object
        PINGenerator pinGenerator = new PINGenerator();
        
        // Generate a batch of PINs
        Set<String> pinBatch = pinGenerator.generateBatch();
        
        // Test that the batch size is as expected
        assertEquals(1000, pinBatch.size());
        
        // Test that each PIN is of the expected length
        for (String pin : pinBatch) {
            assertEquals(4, pin.length());
        }
    }
}