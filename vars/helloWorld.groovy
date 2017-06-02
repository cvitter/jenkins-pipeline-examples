// vars/helloWorld.groovy
// Basic Hello World Shared Library Example
// Shamelessly stolen from:
// https://github.com/beedemo/workflowLibs/blob/master/vars/helloWorld.groovy
def call(name) {
   echo "Hello ${name}"
   echo "Have a great day!"
}
