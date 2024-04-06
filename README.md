# **Selenium Tutorials with JAVA**
### Overview
This repository serves as a comprehensive guide to working with Selenium WebDriver using Java. Whether you're a beginner looking to get started with Selenium for automated testing or an experienced developer seeking advanced browser handling techniques, this repository has something for everyone.

### Getting Started
Follow these steps to set up your development environment and start using Selenium with Java

### Prerequisites

1. [Java JDK](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)
2. Choose one of the following IDE:
    - [Eclipse](https://www.eclipse.org/downloads/packages/release/2024-03/r/eclipse-ide-java-developers)
    - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
    - [Spring Tools](https://spring.io/tools)
3. [Apache Maven](https://maven.apache.org/download.cgi)

### Installation

1. Java JDK
    - Download the installer from the [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html) page.
    - Run the installer and set up the JDK.
2. IDE
    - Download and install your preferred IDE.
3. Apache Maven
    - Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
    - Follow installation instructions.
  
### Setting Up Java JDK

1. Download the JDK installer from Oracle.
2. Run the installer and select your installation folder.
3. Set up JAVA_HOME and PATH environment variables:
         - Open System Properties.
         - Navigate to Environment Variables.
         - Add JAVA_HOME with the JDK installation path.
         - Update the PATH variable to include %JAVA_HOME%\bin.
4. Verify Java installation by running java --version in a terminal.

### Setting Up Spring Tools

1. Download Spring Tools from the [official website](https://spring.io/tools).
2. Run the installer and select the package to install.
3. Choose your installation folder and complete the setup.
4. Launch Spring Tools to start using it.

### Installing Apache Maven

1. Check if you have Java installed by running java --version.
2. Download Apache Maven from the [official website](https://maven.apache.org/download.cgi).
3. Extract the archive to your desired location.
4. Set up M2_HOME and MAVEN_HOME environment variables:
    - Create M2_HOME and point it to the Maven installation directory.
    - Update the PATH variable to include %M2_HOME%\bin.
5. Verify Maven installation by running mvn --version in a terminal.

### Built With

1. [Java JDK](https://www.oracle.com/java/) - Java Development Kit
2. [Spring Tools](https://spring.io/tools/) - IDE for Spring applications
3. [Apache Maven](https://maven.apache.org/) - Dependency Management

### Installation Steps
To start using the framework:

1. [Fork](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java.git) the repository.
2. Clone, i.e, download your copy of the repository to your local machine using
```
git clone https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java.git
```
3. Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, or Spring Tools).
4. Make any desired changes or additions to the project.

##### Maven Dependencies

###### Selenium TestNG Webdriver Manager

```xml
<dependencies>
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.13.0</version>
		</dependency>
		<!--
		https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
		<dependency>
			<groupId>io.github.bonigarcia</groupId>
			<artifactId>webdrivermanager</artifactId>
			<version>5.5.3</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.8.0</version>
			<scope>test</scope>
		</dependency>
		
	</dependencies>
```

## Overview

### Introduction

Writing your first automation test is a lot of fun.

Java is one of the most popular programming languages. Java offers both object oriented and functional programming features. Selenium can be used for screen scraping and automating repeated tasks on browser.

In this series, you will learn Automation Testing with Selenium. 

### Requirements
- You should have the ability to learn while having fun!
- Connectivity to Internet to download various tools needed.

## Step Wise Details

### 00 - Launching Browsers
- 00 - 00 [How to run Selenium Tests using Chrome](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/browserhanding/ChromeBrowserInSelenium.java) 
- 00 - 01 [How to run Selenium Tests using Firefox](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/browserhanding/FirefoxBrowserInSelenium.java)
- 00 - 02 [How to run Selenium Tests using Edge](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/browserhanding/EdgeBrowserInSelenium.java)
- 00 - 03 [How to run Selenium Tests using Safari](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/browserhanding/SafariBrowserInSelenium.java)
- 00 - 04 [How to Configure cross browser in Selenium](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/browserhanding/CrossBrowserConfiguration.java)

### 01 - Launching Browsers In Headless Mode
- 01 - 00 [How to run Chrome tests in headless mode in Selenium](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/headlessbrowserhandle/HeadlessChromeBrowserInSelenium.java)
- 01 - 01 [How to run Firefox tests in headless mode in Selenium](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/headlessbrowserhandle/HeadlessFirefoxBrowserInSelenium.java)
- 01 - 02 [How to run Edge tests in headless mode in Selenium](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/headlessbrowserhandle/HeadlessEdgeBrowserInSelenium.java)

### 02 - Locators in Selenium
- 02 - 00 [Locate by ID](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/LocateByIDAttribute.java)
- 02 - 01 [Locate by Name](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/LocateByNameAttribute.java)
- 02 - 02 [Locate by Class Name](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/LocateByClassNameAttribute.java)
- 02 - 03 [Locate by CSS Selector](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/LocateByCssSelectorAttribute.java)
- 02 - 04 [Locate by Link Text](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/LocateByLinkTextAttribute.java)
- 02 - 05 [Locate by Partial Link Text](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/LocateByPartialLinkTextAttribute.java)
- 02 - 06 [Locate by Tag Name](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/LocateByTagNameAttribute.java)
- 02 - 07 [Locate by Absolute XPath](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByAbsoluteXPath.java)
- 02 - 08 [Locate by Relative XPath](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByRelativeXPath.java)
- 02 - 09 [Locate by Text](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByText.java)
- 02 - 10 [Locate by Starts With](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByStartsWith.java)
- 02 - 11 [Locate by Preceding](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByPreceding.java)
- 02 - 12 [Locate by Position](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByPosition.java)
- 02 - 13 [Locate by OR Expression](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByOrExpression.java)
- 02 - 14 [Locate by AND Expression](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByAndExpression.java)
- 02 - 15 [Locate by Contains](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByContains.java)
- 02 - 16 [Locate by Last](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/locators/dynamicxpath/LocateByLast.java)

### 03 - WebDriver Browser Commands
- 03 - 00 [Retrieve Title Of Current WebPage](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivergetcommands/RetrieveTitleOfCurrentWebPage.java)
- 03 - 01 [Retrieve Current URL Of Current WebPage](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivergetcommands/RetrieveCurrentURLOfCurrentWebPage.java)
- 03 - 02 [Retrieve Attribute Value By Get Attribute](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivergetcommands/RetrieveAttributeValueByGetAttributeMethod.java)
- 03 - 03 [Retrieve The Class Object](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivergetcommands/RetrieveTheClassObject.java)
- 03 - 04 [Retrieve Text By Get](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivergetcommands/RetrieveTextByGetTextMethod.java)
- 03 - 05 [Retrieve Page Source Of Current WebPage](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivergetcommands/RetrievePageSourceOfCurrentWebPage.java)
- 03 - 06 [Retrieve Location By Get Location](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivergetcommands/RetrieveLocationByGetLocationMethod.java)

### 04 - WebDriver Navigation Commands
- 04 - 00 [Navigate To](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivernavigationcommands/NavigateToCommand.java)
- 04 - 01 [Refresh](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivernavigationcommands/RefreshCommand.java)
- 04 - 02 [Back](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivernavigationcommands/BackCommand.java)
- 04 - 03 [Forward](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java/blob/main/src/test/java/webdrivernavigationcommands/ForwardCommand.java)


### Acknowledgments
Special thanks to the contributors and the Selenium community for their valuable resources and tutorials.

### Contact
For questions or feedback, please feel free to reach out:

1. Maintainer: [Md. Ebrahim Hossain](https://github.com/ebrahimhossaincse)
2. Project Link:[Selenium-Tutorials-Java](https://github.com/ebrahimhossaincse/Selenium-Tutorials-Java) 