pipeline {
    agent any
    tools {
        maven 'Maven_Home'
    }
    stages {
        stage('Checkout') {
            steps {
                git ''
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
