// Jenkinsfile-When
// ----------------------------------------------------------------------
// This example shows a variety of ways to use 'when' for flow control
// Note: This Jenkinsfile needs to be executed as part of a
//       Multibranch Pipeline project to demonstrate the 'branch' 
//       variable in the stage("BASIC WHEN - Branch") stage
// ----------------------------------------------------------------------
pipeline {
   agent any
    
   environment {
      VALUE_ONE = '1'
      VALUE_TWO = '2'
      VALUE_THREE = '3'
   }
    
   stages {
      
      // Execute when branch = 'master'
      stage("BASIC WHEN - Branch") {
         when {
		    branch 'master'
		 }
         steps {
            echo 'BASIC WHEN - Master Branch!'
         }
      }
      
      // Expression based when example with AND
      stage('WHEN EXPRESSION with AND') {
         when {
            expression {
               VALUE_ONE == '1' && VALUE_THREE == '3'
            }
         }
         steps {
            echo 'WHEN with AND expression works!'
         }
      }
      
      // Expression based when example
      stage('WHEN EXPRESSION with OR') {
         when {
            expression {
               VALUE_ONE == '1' || VALUE_THREE == '2'
            }
         }
         steps {
            echo 'WHEN with OR expression works!'
         }
      }
      
      // When - AllOf Example
      stage("AllOf") {
        when {
            allOf {
                environment name:'VALUE_ONE', value: '1'
                environment name:'VALUE_TWO', value: '2'
            }
        }
        steps {
            echo "AllOf Works!!"
        }
      }
      
      // When - Not AnyOf Example
      stage("Not AnyOf") {
         when {
            not {
               anyOf {
                  branch "development"
                  environment name:'VALUE_TWO', value: '4'
               }
            }
         }
         steps {
            echo "Not AnyOf - Works!"
         }
      }
   }
}
