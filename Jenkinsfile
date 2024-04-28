pipeline{
    agent any
    tools{
        gradle 'gradle_8_7'
    }
    stages{
        stage('Build'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/mcmvambodo/deploy-spring-to-aws']])
                sh '''
                ./gradlew clean build
                '''
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    def dockerHome = tool 'docker-aws'
                    env.PATH = "${dockerHome}/bin:${env.PATH}"
                    sh '''
                    docker build -t mcmvambodo/spring-aws-plain .
                    '''
                }
            }
        }
    }
}