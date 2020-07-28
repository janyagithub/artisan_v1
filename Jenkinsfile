node{
  stage('SCM Checkout'){
    git 'https://github.com/janyagithub/artisan_v1'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
