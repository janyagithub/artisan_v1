node{
  stage('SCM Checkout'){
    git 'https://github.com/janyagithub/artisan_v1'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
  stage('SonarQube analysis') {
    withSonarQubeEnv('sonar') { // You can override the credential to be used
      sh 'mvn sonar:sonar'
    }
  }
}
