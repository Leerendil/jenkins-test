pipeline {
    agent any
    tools {
        maven 'Maven'
    }
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
        stage('Archive Artifact') {
            when { branch 'main' }
            steps {
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}