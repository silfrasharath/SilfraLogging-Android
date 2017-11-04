					NILA SOFTWARES
				     ANDROID TEST PROJECT
			      Android Library for Logging Options
Introduction
The main objective of the project is to create a public Android library that can be called
by other projects using Gradle.

Project requirements
The idea is to create a simple Android Logging library that can be called by other
Android projects through Gradle. Consider, the library has three public methods taking in ‘String’ type as their parameters.
o	 logDebug(String text)
o 	logError(String text)
o 	logInfo(String text)

When these methods are called by the implementing app, the ‘String text’ passed as a
parameter gets logged based on the method that was called.

Adding Library to Android App

To get this library in this project,

Step1: Add your Jitpack Repository to your Build.gradle (Project Level) file

	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}

Step2: Add the dependency to the Module.Gradle (app level) file

	compile 'com.github.silfrasharath:SilfraLogging-Android:83c3875c30'

Step3: Now Sync the project with gradle.
Now you will be able to use the methods of the library as shone in below section
How to use methods of this Library

1.	To print your message on a LogCat Debug:

		LogDebug.silfraLogs(YOUR_ACTIVITY,"Message");


2.	To print your message on a LogCat Info:

		LogError.silfraLogs(YOUR_ACTIVITY,"Message");


3.	To print your message on a LogCat Error:
		
		LogInfo.silfraLogs(YOUR_ACTIVITY,"Message");


Arg(2) : You can pass Your Activity name (Eg: MainActivity.this) in place of YOUR_ACTIVITY

Arg(2) : Any String or a String Variable can be passed on in place of “Message”


Thank You…

