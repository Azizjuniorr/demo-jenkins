pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/username/demo-jenkins.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        failure {
            echo "Build échoué — vérifier les tests ou compilation."
        }
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            echo "Build réussi et artefact archivé."
        }
    }
}
