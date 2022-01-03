@Library('pipeline_lib') _

pipeline{
    agent any
    paramters{
        string(name: 'release_number', defaultValue: '0.0.0.1', description: 'Release Number for the Application')
    }
    stages{
        stage("Initialize Pipeline"){
            steps{
                sayHello "Dave"
            }
        }
        stage("Build"){
            steps{
                build [tool: "maven", args: "-Drelease_number=${params.release_number}"]
            }
        }
    }
}