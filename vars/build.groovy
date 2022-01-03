
def call (Map config){
    if (config.tool == "mvn"){
        node {
            sh "mvn clean install ${config.args}"
        }
    }
}

