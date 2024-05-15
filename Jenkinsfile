pipeline{
    environment{
        registry = '1190514/javajenkinsaws'
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }
    agent any
    tools{
        gradle 'gradle_8_8'
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
                    sh '''
                    docker build -t 1190514/spring-aws-plain .
                    '''
                }
            }
        }
        stage('Push image to Docker Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhub-pwd')]) {
                        sh 'docker login -u 1190514 -p ${dockerhub-pwd}'
                        sh 'docker push 1190514/spring-aws-plain'
                     }
                }
            }
        }

    }
}