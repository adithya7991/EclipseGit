  set project = D:\Java programs\EclipseGit
  cd %project%
  set classpath = D:\Java programs\EclipseGit\lib\*
  javac %project%\Test1.java
  java org.testng.TestNG %project%testng.xml