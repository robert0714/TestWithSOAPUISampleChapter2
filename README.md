# TestWithSOAPUISampleChapter2
Web Services Testing with soapUI
Copyright © 2012 Packt Publishing

Chapter 02 smaple in Maven
( code-first web service development)


specially notice:


	<dependency>
			<groupId>com.smartbear.soapui</groupId>
			<artifactId>soapui-maven-plugin</artifactId>
			<version>5.1.1</version>
			<scope>test</scope>
	</dependency>
	<build>
		<plugin>
				<groupId>com.smartbear.soapui</groupId>
				<artifactId>soapui-pro-maven-plugin</artifactId>
				<version>5.1.1</version>
				<configuration>
				</configuration>
				<dependencies>
					<dependency>
						<groupId>org.reflections</groupId>
						<artifactId>reflections</artifactId>
						<version>0.9.9-RC1</version>
					</dependency>
					<dependency>
						<groupId>org.apache.poi</groupId>
						<artifactId>poi-ooxml</artifactId>
						<version>3.10-FINAL</version>
					</dependency>
				</dependencies>
			</plugin>
	</build>
	<repositories>
		<repository>
			<id>central</id>
			<name>Maven Repository Switchboard</name>
			<layout>default</layout>
			<url>http://repo1.maven.org/maven2</url>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
		</repository>
		<repository>
			<id>smartbearsoftware</id>
			<url>http://smartbearsoftware.com/repository/maven2/</url>
		</repository>
	</repositories>
	<pluginRepositories>
		<pluginRepository>
			<id>central</id>
			<name>Maven Plugin Repository</name>
			<url>http://repo1.maven.org/maven2</url>
			<layout>default</layout>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
			<releases>
				<updatePolicy>never</updatePolicy>
			</releases>
		</pluginRepository>
		<pluginRepository>
			<id>smartbear-sweden-plugin-repository</id>
			<url>http://www.soapui.org/repository/maven2/</url>
		</pluginRepository>
	</pluginRepositories>

 