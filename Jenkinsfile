// Jenkinsfile
// ----------------------------------------------------------------------
// This is as simple as it gets with declarative pipeline
// ----------------------------------------------------------------------
pipeline {
   agent any
   stages {
      stage('compile') {
         steps {
            sh "mvn comiple"
         }
      }
        stage('test') {
         steps {
            sh "mvn test"
         }
      }
        stage('install') {
         steps {
            sh "mvn istall"
         }
      }
   }
  
}
