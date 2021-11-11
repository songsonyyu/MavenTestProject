pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build H1 Firmware'
            }
        }
        stage('Flash') {
            steps {
                echo 'Flash Artifacts'
            }
        }
        stage('Test') {
            steps {
                echo 'Run Tests'
            }
        }
    }
    post {
        always {
            emailext body: 'Summary of pipeline status', subject: 'pipeline status', to: 'songsonyyu@gmail.com'
        }
    }
}
