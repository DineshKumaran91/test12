pipeline{
    agent none
    stages {
        stage('Build Tags') {
            when {
                tag "release-*"
            }
            steps {
                echo "Hello Build Tags"
            }
        }
    }
}