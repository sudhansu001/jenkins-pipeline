
def call (Map config = [tool: "mvn", args: ""]){
    if (config.tool == "mvn"){
        def scmUrl = scm.getUserRemoteConfigs()[0].getUrl()
        node {
            bat """
                 git init
                 git remote add origin ${scmUrl}
                 git pull origin master
                 """
            bat "mvn clean install ${config.args}"
        }
    }
}

