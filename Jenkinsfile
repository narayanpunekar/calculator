pipeline {
    agent any 
    options { timeout(time: 30) }
    stages {
        stage("Stage One") {
            steps {
                sleep 30
                echo 'Step 1. Hello World'
            }
        }
        stage("Stage Two") {
            steps {
                echo 'Step 2. Hello Hello World'
                echo 'Step 3. Hello Hello Hello World'
            }
        }
        stage("Checkout") {
            steps {
                echo 'git url: https://github.com/narayanpunekar/calculator.git'
                git url: 'https://github.com/narayanpunekar/calculator.git'
            }
        }
        stage("Compile") {
            steps {
                sh "/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/maven363/bin/mvn clean compile"
            }
        }
    }
    post {
        always {
            mail to: 'narayan.v.punekar@gmail.com',
            subject: "Completed Pipeline: ${currentBuild.fullDisplayName}", 
            body: "Build completed, ${env.BUILD_URL}"
        }
    }
} 

