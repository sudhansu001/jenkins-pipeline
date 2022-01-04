
def call (Map config = [tool: "mvn", args: ""]){
    if (config.tool == "mvn"){
        def scmUrl = scm.getUserRemoteConfigs()[0].getUrl()
        node {
            bat "git clone ${scmUrl} ."

            bat "mvn clean install ${config.args}"
        }
    }
}

