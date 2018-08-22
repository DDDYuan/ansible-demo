pipeline {
  agent any
    stage('Build') {
      steps {
        sh "./gradlew clean build"
        archiveArtifacts artifacts: "build/libs/ansible-demo-0.0.1.jar", fingerprint: true
      }
    }

    stage('Deploy') {
      steps {
        sh "ansible-playbook -v ./deployment/deploy.yml -i ./deployment/inventory"
      }
    }
  }
}