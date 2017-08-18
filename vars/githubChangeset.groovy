// vars/githubChangeset.groovy
// Iterates over commits since the last build and outputs them 
// in the following format via echo:
//    - Commit message [author]

def call() {
	def changeString = ""
 	def changeLogSets = currentBuild.changeSets
 	
 	// Iterate over changes and add them to changeString
 	for (int i = 0; i < changeLogSets.size(); i++) {
		def entries = changeLogSets[i].items
 		for (int j = 0; j < entries.length; j++) {
 			def entry = entries[j]
 			changeString += " - ${entry.msg} [${entry.author}]\n"
 		}
 	}

 	if (!changeString) {
 		changeString = " - No new changes\n"
 	}
 	
 	changeString = "SCM Changes:\n------------------------------------------------------------\n" + 
 		changeString + "-------------------------------------------------------------";
 	echo changeString
}