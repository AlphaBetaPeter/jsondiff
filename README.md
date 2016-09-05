#Build
mvn clean compile assembly:single

# Usage
java -jar target/jsondiff-1.0-jar-with-dependencies.jar [expectedFile] [actualFile] [strictmode(true/false)]
