pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Repo already cloned by Jenkins'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t cicd-demo .'
            }
        }

        stage('Run Container') {
            steps {
                sh '''
                docker stop cicd-demo-container || true
                docker rm cicd-demo-container || true
                docker run -d -p 8080:8080 --name cicd-demo-container cicd-demo
                '''
            }
        }
    }
}