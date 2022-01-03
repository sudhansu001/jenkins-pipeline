pipeline{
    agent any
    stages{
        stage("hello"){
            steps{
                cmd_exec('echo "Hello World!"')
            }
        }
    }
}