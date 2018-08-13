pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build 'continuous delivery Build'
      }
    }
    stage('Test') {
      steps {
        build 'continuous delivery Test'
      }
    }
    stage('Deploy') {
      steps {
        build 'continuous delivery Deploy'
      }
    }
    stage('End') {
      steps {
        echo 'THE END'
      }
    }
  }
}