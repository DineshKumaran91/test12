pipeline{
    agent none
    stages {
        stage('Build Tags') {
            when {
                tag "2.0"
            }
            steps {
                echo "Hello Build Tags"
            }
        }
    }
}