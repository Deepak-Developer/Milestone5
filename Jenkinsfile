pipeline {
    agent any
    tools {
        maven 'M2'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Deepak-Developer/Milestone5.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }
}