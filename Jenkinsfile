pipeline {
  agent {
    docker {
      image 'maven:3.5-jdk-8-alpine'
    }
    
  }
  stages {
    stage('Inicialize') {
      steps {
        echo 'Hello Pipeline'
        sh 'mvn clean '
      }
    }
  }
}