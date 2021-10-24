pipeline{
    agent any
    tools {
        Maven Maven
    }
    stages{
        stage("create build"){
            steps{
                sh "mvn clean install"
            }
            post{
                always{
                    echo "========Stage create build done========"
                }
                success{
                    echo "========Build created successfullt========"
                }
                failure{
                    echo "========Build creation failed========"
                }
            }
        }
        stage("deploy"){
            steps{
                sh "mvn deploy"
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}