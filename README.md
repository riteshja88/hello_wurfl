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

```
$ cat sua|java -cp "wurfl-1.12.8.0.jar:target/my-app-1.0-SNAPSHOT.jar:./lib/*" com.mycompany.app.App
[main] INFO com.scientiamobile.wurfl.core.resource.FileLoader - closing input stream: ZipInputStream
[main] INFO com.scientiamobile.wurfl.core.resource.DefaultWURFLModel - WURFLModel version: Root:file:/home/ritesh/wurfl/hello_wurfl/my-app_sua/wurfl.zip:data.scientiamobile.com - 2023-01-29 04:30:54; devices: 96809 root devices: 34522; families: 55; generic devices: 3981
[main] INFO com.scientiamobile.wurfl.core.matchers.MatcherManager - model devices: 96809
[main] INFO com.scientiamobile.wurfl.core.matchers.MatcherManager - model devices filtered: 93453
[main] INFO com.scientiamobile.wurfl.core.DefaultWURFLService - DefaultWURFLService created
HEADER_QUALITY_FULL {"browsers":[{"brand":"Mozilla","version":["5","0"]},{"brand":"AppleWebKit","version":["605","1","15"]},{"brand":"Mobile","version":["20A380"]}],"platform":{"brand":"iPhone","version":["16","0","2"]},"mobile":1,"bitness":"64","model":"iPhone","source":3}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Mozilla","version":["5","0"]},{"brand":"AppleWebKit","version":["537","36"]},{"brand":"Version","version":["4","0"]},{"brand":"Chrome","version":["109","0","5414","118"]},{"brand":"Mobile Safari","version":["537","36"]}],"platform":{"brand":"Android","version":["13"]},"mobile":1,"bitness":"64","model":"SM-S908U","source":3}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Mozilla","version":["5","0"]},{"brand":"AppleWebKit","version":["537","36"]},{"brand":"Version","version":["4","0"]},{"brand":"Chrome","version":["109","0","5414","118"]},{"brand":"Mobile Safari","version":["537","36"]}],"platform":{"brand":"Android","version":["13"]},"mobile":1,"bitness":"64","model":"SM-N986U","source":3}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Mozilla","version":["5","0"]},{"brand":"AppleWebKit","version":["605","1","15"]},{"brand":"Version","version":["16","1"]},{"brand":"Mobile","version":["15E148"]},{"brand":"Safari","version":["604","1"]}],"platform":{"brand":"iPhone","version":["16","1","1"]},"mobile":1,"bitness":"64","model":"iPhone","source":3}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Mozilla","version":["5","0"]},{"brand":"AppleWebKit","version":["605","1","15"]},{"brand":"Mobile","version":["15E148"]}],"platform":{"brand":"iPhone","version":["14","4","2"]},"mobile":1,"bitness":"64","model":"iPhone","source":3}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Mozilla","version":["5","0"]},{"brand":"AppleWebKit","version":["605","1","15"]},{"brand":"Version","version":["14","1","2"]},{"brand":"Safari","version":["605","1","15"]}],"platform":{"brand":"Macintosh","version":["10","15","7"]},"mobile":0,"bitness":"64","source":3}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Mozilla","version":["5","0"]},{"brand":"AppleWebKit","version":["537","36"]},{"brand":"Version","version":["4","0"]},{"brand":"Chrome","version":["109","0","5414","85"]},{"brand":"Mobile Safari","version":["537","36"]}],"platform":{"brand":"Android","version":["12"]},"mobile":1,"bitness":"64","model":"SM-A526U","source":3}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Not_A Brand","version":["99","0","0","0"]},{"brand":"Google Chrome","version":["109","0","5414","120"]},{"brand":"Chromium","version":["109","0","5414","120"]}],"platform":{"brand":"Windows","version":["10","0","0"]},"mobile":0,"architecture":"x86","bitness":"64","source":2}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Mozilla","version":["5","0"]},{"brand":"AppleWebKit","version":["605","1","15"]},{"brand":"Version","version":["16","0"]},{"brand":"Safari","version":["605","1","15"]}],"platform":{"brand":"Macintosh","version":["10","15","7"]},"mobile":0,"bitness":"64","source":3}
HEADER_QUALITY_FULL {"browsers":[{"brand":"Not_A Brand","version":["99","0","0","0"]},{"brand":"Google Chrome","version":["109","0","5414","119"]},{"brand":"Chromium","version":["109","0","5414","119"]}],"platform":{"brand":"macOS","version":["13","1","0"]},"mobile":0,"architecture":"x86","bitness":"64","source":2}
```
