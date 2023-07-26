# PIN Generator Library
This project contains a Java library that generates a batch of 1000 unique 4-digit PINs.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Running the Tests](#running-the-tests)

## Installation

This is a Java project which requires Java 8 (or newer) installed on your machine. 

This project doesn't have any additional dependencies beyond the standard Java libraries.

## Usage

The main class in the project is `PINGenerator`, which provides the functionality to generate a batch of 1000 unique 4-digit PINs.

Here's an example usage:

```java
PINGenerator pinGenerator = new PINGenerator();
Set<String> pinBatch = pinGenerator.generateBatch();
```

After these lines are executed, pinBatch will contain 1000 unique 4-digit PINs.


## Running the Tests

The project includes a unit test for the `PINGenerator` class. The test is written using the JUnit testing framework.

To run the test, navigate to the project root directory in your terminal and run the following command (assuming you're using Maven as your build tool):

```bash
mvn test
```

This will run `PINGeneratorTest`, which contains a test method `testPinGeneration`. This test ensures that all generated PINs are unique and have the correct length.

### Test Command output

```bash
rupesh@rupesh number-generator % mvn test
[WARNING] 
[WARNING] Some problems were encountered while building the effective settings
[WARNING] Unrecognised tag: 'nonProxyHosts' (position: START_TAG seen ...</activeProfiles>\n\n  <nonProxyHosts>... @62:18)  @ /Users/rupesh/.m2/settings.xml, line 62, column 18
[WARNING] 
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------< com.rupesh.pingenerator:com.rupesh.pingenerator >-----------
[INFO] Building com.rupesh.pingenerator 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ com.rupesh.pingenerator ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ com.rupesh.pingenerator ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/rupesh/Documents/GitHub/number-generator/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ com.rupesh.pingenerator ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ com.rupesh.pingenerator ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /Users/rupesh/Documents/GitHub/number-generator/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ com.rupesh.pingenerator ---
[INFO] Surefire report directory: /Users/rupesh/Documents/GitHub/number-generator/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.rupesh.pingenerator.PINGeneratorTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.04 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.321 s
[INFO] Finished at: 2023-07-26T15:53:07+08:00
[INFO] ------------------------------------------------------------------------
rupesh@rupesh number-generator % 
```

