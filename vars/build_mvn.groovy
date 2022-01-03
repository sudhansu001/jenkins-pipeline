
def call (Map config = [tool: "mvn", args: ""]){
    if (config.tool == "mvn"){
        node {
            bat "mvn clean install ${config.args}"
        }
    }
}

