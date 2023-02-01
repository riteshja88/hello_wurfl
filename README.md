# hello_wurfl

```
cd hello_wurfl/my-app
mvn clean package
java -cp "wurfl-1.12.8.0.jar:target/my-app-1.0-SNAPSHOT.jar:./lib/*" com.mycompany.app.App
```


```
$ ls hello_wurfl/my-app/lib
commons-collections-3.2.2.jar  commons-lang3-3.12.0.jar  gson-2.8.9.jar                    jakarta.servlet-api-5.0.0.jar   jsr107cache-1.1.jar      servlet-api-2.4.jar   slf4j-simple-1.7.35.jar
commons-io-2.11.0.jar          ehcache-core-2.4.3.jar    jakarta.activation-api-1.2.2.jar  jakarta.xml.bind-api-2.3.3.jar  logback-core-1.2.10.jar  slf4j-api-1.7.35.jar

$ ls hello_wurfl/my-app/wurfl-1.12.8.0.jar
hello_wurfl/my-app/wurfl-1.12.8.0.jar

$ ls hello_wurfl/my-app/wurfl.zip
hello_wurfl/my-app/wurfl.zip
```


```
$ cat ua|java -cp "wurfl-1.12.8.0.jar:target/my-app-1.0-SNAPSHOT.jar:./lib/*" com.mycompany.app.App
[main] INFO com.scientiamobile.wurfl.core.resource.FileLoader - closing input stream: ZipInputStream
[main] INFO com.scientiamobile.wurfl.core.resource.DefaultWURFLModel - WURFLModel version: Root:file:/hello_wurfl/my-app/wurfl.zip:data.scientiamobile.com - 2023-01-29 04:30:54; devices: 96809 root devices: 34522; families: 55; generic devices: 3981
[main] INFO com.scientiamobile.wurfl.core.matchers.MatcherManager - model devices: 96809
[main] INFO com.scientiamobile.wurfl.core.matchers.MatcherManager - model devices filtered: 93453
[main] INFO com.scientiamobile.wurfl.core.DefaultWURFLService - DefaultWURFLService created
false Mozilla/5.0 (Linux; Android 12; Pixel 6 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.74 Mobile Safari/537.36
false Mozilla/5.0 (Linux; Android 12; Pixel 6 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.74 Mobile Safari/537.36
false Mozilla/5.0 (Linux; Android 12; Pixel 6 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.74 Mobile Safari/537.36
false Mozilla/5.0 (Linux; Android 12; Pixel 6 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.74 Mobile Safari/537.36
false Mozilla/5.0 (Linux; Android 12; Pixel 6 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.74 Mobile Safari/537.36
false Mozilla/5.0 (Linux; Android 12; Pixel 6 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/95.0.4638.74 Mobile Safari/537.36
```