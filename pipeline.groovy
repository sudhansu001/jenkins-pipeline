@Library('pipeline_lib')
pipeline{
    agent any
    stages{
        stage("Initialize Pipeline"){
            steps{
                echo "Initialize"
            }
        }
        stage("Build"){
            steps{
                echo "Build code"
            }
        }
        stage("Code Quality"){
            steps{
                echo "Run Code quality"
            }
        }
        stage("Artifactory"){
            steps{
                echo "Upload Artifact to Artifactory"
            }
        }
        stage("IAC Provision"){
            steps{
                echo "Provision Architecture"
            }
        }
        stage("IAC Deploy"){
            steps{
                echo "Deploy Container"
            }
        }
        stage("IAC Destroy"){
            steps{
                echo "Destroy Container"
            }
        }
    }
}