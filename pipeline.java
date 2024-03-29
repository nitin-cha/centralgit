pipeline {
    agent { docker { image 'maven:3.8.5-openjdk-11-slim' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}