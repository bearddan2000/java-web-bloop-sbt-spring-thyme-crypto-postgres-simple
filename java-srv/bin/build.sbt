lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-web-sbt)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Spring Security Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  // javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-g:lines"),

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
    "org.springframework.boot" % "spring-boot-starter-thymeleaf" % "2.4.2",
    "org.thymeleaf.extras"%"thymeleaf-extras-springsecurity5"%"3.0.4.RELEASE",
		"org.springframework.boot"%"spring-boot-devtools"%"2.4.2",
    "org.springframework.security"%"spring-security-web"%"5.0.0.RELEASE",
    "org.springframework.security"%"spring-security-core"%"5.0.0.RELEASE",
    "org.springframework.security"%"spring-security-config"%"5.0.0.RELEASE",
    "org.springframework.security"%"spring-security-crypto"%"5.3.2.RELEASE",
    "org.springframework.boot"%"spring-boot-starter-websocket"%"2.4.2",
    "commons-codec" % "commons-codec" % "1.15",
    "javax.xml.bind" % "jaxb-api" % "2.3.1",
    "org.bouncycastle" % "bcpkix-jdk15on" % "1.65",
    "org.webjars" % "webjars-locator-core" % "0.46",
		"org.webjars"%"sockjs-client"%"1.0.2",
		"org.webjars"%"stomp-websocket"%"2.3.3",
		"org.webjars"%"bootstrap"%"3.3.7",
		"org.webjars"%"jquery"%"3.1.1-1",
		"org.postgresql"%"postgresql"%"42.2.19",
		"org.springframework.boot"%"spring-boot-starter-data-jpa"%"2.4.2"
   ),

  mainClass := Some("example.Main")
)
