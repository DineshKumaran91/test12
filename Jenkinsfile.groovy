pipeline{
    agent none
    stages {
        stage('Build Tags') {
            when {
                buildingTag()
            }
            steps {
                echo "Hello Build Tags"
            }
        }
    }
}