pipeline {
    agent any
    stages {
        stage('Static Analysis') {
            steps {
                sh 'mvn checkstyle:check'
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy to Nexus') {
            when { branch 'master' }
            steps {
                sh 'mvn package'
            }
        }
    }
}