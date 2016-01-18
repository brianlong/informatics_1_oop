I created a java folder in my home directory and then added this to ~/.bash_profile

```
  # Java
  CLASSPATH=/Users/brianlong/java/junit-4.12.jar:/Users/brianlong/java/hamcrest-core-1.3.jar:$CLASSPATH
  export CLASSPATH
```
Note that the CLASSPATH includes the name of the jar files.

Restart the terminal

I then downloaded the Junit files `junit.jar` & `hamcrest-core.jar` from
`https://github.com/junit-team/junit/wiki/Download-and-Install` and placed them
in to `/Users/brianlong/java`

Compile the test class with: `javac HelloWorldTest.java`

Run the test with: `java org.junit.runner.JUnitCore HelloWorldTest`
