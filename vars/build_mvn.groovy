
def call (Map config = [tool: "mvn", args: ""]){
    if (config.tool == "mvn"){
        node {
            sh "mvn clean install ${config.args}"
        }
    }
}

