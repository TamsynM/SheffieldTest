# SheffieldTest

# Maven
To be able to run maven from the command line locally, you need to have it installed (I have installed Apache Maven 3.8.1).
Type in `mvn --version` in the command lineto check your current version.
To run the tests type in 'mvn clean test'.

# Java JDK
I have used java 12.0.2 for this project so you might want to have it installed if you have a lower version.
Type in 'java --version' in the command line to check your current version.

# Notes
I have used TestNG and Maven as we have used this a lot in my current project alongside Selenium and Cucumber tests. I like TestNG as it's nice and lightweight compared to full cucumber testing. I have also used intelliJ for this project as it's what I am used to using.
When running these tests through the commandline it's not picking up the Copyright Icon correctly so the test fails, however it passes if run manually.
I couldn't figure out how to add the screenshot into the assertion failure itself.
I didn't know what the login page looking like or the URL so have guessed and added a URL to assert so we could get a test failure.
