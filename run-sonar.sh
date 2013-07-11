sh /home/dipin/Desktop/SONAR/sonar-3.5.1/bin/linux-x86-32/sonar.sh stop
mvn clean install
cp /home/dipin/Desktop/SONAR/sonar-objective-c/target/sonar-objective-c-plugin-0.5.0-SNAPSHOT.jar /home/dipin/Desktop/SONAR/sonar-3.5.1/extensions/plugins
sh /home/dipin/Desktop/SONAR/sonar-3.5.1/bin/linux-x86-32/sonar.sh start
