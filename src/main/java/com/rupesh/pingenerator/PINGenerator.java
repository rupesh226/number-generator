package com.rupesh.pingenerator;

//Importing the necessary classes
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PINGenerator {
	// Define constants for the length of the PIN and the batch size
	private static final int PIN_LENGTH = 4;
	private static final int BATCH_SIZE = 1000;

	// Create a Random object to generate random numbers
	private static final Random random = new Random();

	// Method to generate a batch of unique PINs
	public Set<String> generateBatch() {
		// Create a Set to hold the generated PINs. Using Set ensures uniqueness.
		Set<String> pinBatch = new HashSet<String>();

		// Keep generating PINs until the batch size is reached
		while (pinBatch.size() < BATCH_SIZE) {
			pinBatch.add(generatePin());
		}
		return pinBatch;
	}

	// Method to generate a single PIN
	private String generatePin() {
		// Use StringBuilder to build the PIN
		StringBuilder pin = new StringBuilder(PIN_LENGTH);

		// Generate a 4-digit PIN
		for (int i = 0; i < PIN_LENGTH; i++) {
			pin.append(random.nextInt(10)); // generates a random digit from 0 to 9
		}
		return pin.toString();
	}
}
