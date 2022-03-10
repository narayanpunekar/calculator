pipeline {
    agent any  
    options { timeout(time: 30) }
    stages {
        stage("Stage One") {
            steps {
                sleep 30
            }
        }
        stage("Stage Two") {
            steps {
                echo 'Step 1. Hello World'
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
		//stage("Unit test") {
		//	steps { 
		//		sh "/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/maven363/bin/mvn test" 
		//	}
		//} 
		stage("Package") {
			steps {
				sh "/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/maven363/bin/mvn package"
			}
		}
		stage("Docker build") {
			steps {
				sh "docker build -f ExecDockerfile -t npunekar/calculator ."
			}
		}
		stage("Docker push") {
			steps {
				sh "cat ./password | docker login --username npunekar --password-stdin"  
				sh "docker push npunekar/calculator"
				sh "docker logout" 
			}
		}
		stage("Deploy to staging") {
			steps { 
				//sh "docker container rm -f calculator-app" 
				//sh "docker rmi \$(docker images -f \"dangling=true\" -q)" 
				//sh "docker run -d -p 8761:8080 -e JAVA_OPTS='-Xms512M -Xmx1024M' --name calculator-app npunekar/calculator"
				sh "docker-compose up -f ExecDockerfile -d" 
			}
		}
    }
    post {
        always {
			//sh "docker-compose down" 
            mail to: 'narayan.v.punekar@gmail.com',
            subject: "Completed Pipeline: ${currentBuild.fullDisplayName}", 
            body: "Build completed, ${env.BUILD_URL}"
        }
    }
} 

