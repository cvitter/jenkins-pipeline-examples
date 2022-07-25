// Jenkinsfile
// ----------------------------------------------------------------------
// This is as simple as it gets with declarative pipeline
// ----------------------------------------------------------------------
pipeline {
   agent any
   environment{
    MAVEN_HOME="/home/ec2-user/apache-maven-3.8.6/bin:$PATH"
   }
    stages {
      stage('Say Hello') {
         steps {
            echo 'Hello World!'
         }
      }
       
   }
}
