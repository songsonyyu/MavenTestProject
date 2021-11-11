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
            publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: './doc/html', reportFiles: 'index.html', reportName: 'Device Automation Framework', reportTitles: 'Device Test Framework'])
            emailext body: 'Summary of pipeline status', subject: 'pipeline status', to: 'songsonyyu@gmail.com'
        }
    }
}
