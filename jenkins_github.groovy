pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                script {
                    // Use Maven to build the code
                    echo "Building the code using Maven"
                    // Example Maven command:
                    // sh 'mvn clean install'
                }
            }
        }
        stage('Unit and Integration Tests') {
            steps {
                script {
                    // Use a test automation tool like JUnit or TestNG for unit and integration tests
                    echo "Running unit and integration tests"
                    // Example test command:
                    // sh 'mvn test'
                }
            }
        }
        stage('Code Analysis') {
            steps {
                script {
                    // Integrate a code analysis tool like SonarQube or Checkstyle
                    echo "Performing code analysis"
                    // Example code analysis command:
                    // sh 'sonar-scanner'
                }
            }
        }
        stage('Security Scan') {
            steps {
                script {
                    // Integrate a security scanning tool like OWASP Dependency-Check or SonarQube
                    echo "Performing security scan"
                    // Example security scan command:
                    // sh 'dependency-check.sh'
                }
            }
        }
        stage('Deploy to Staging') {
            steps {
                script {
                    // Deploy the application to a staging server (e.g., AWS EC2 instance)
                    echo "Deploying to staging server"
                    // Example deployment command:
                    // sh 'aws deploy'
                }
            }
        }
        stage('Integration Tests on Staging') {
            steps {
                script {
                    // Run integration tests on the staging environment
                    echo "Running integration tests on staging"
                    // Example integration test command:
                    // sh 'run_integration_tests.sh'
                }
            }
        }
        stage('Deploy to Production') {
            steps {
                script {
                    // Deploy the application to a production server (e.g., AWS EC2 instance)
                    echo "Deploying to production server"
                    // Example deployment command:
                    // sh 'aws deploy'
                }
            }
        }
    }
    
    post {
        success {
            // Send notification email on success
            always{
                   mail to: "abdulmueezgujjar@gmail.com",
                   body: "Pipeline execution successful",
                   subject: "Pipeline Success Notification"
            }
        }
        failure {
            // Send notification email on failure
            always{
                     mail to: "abdulmueezgujjar@gmail.com",
                     body: "Pipeline execution failed",
                     subject: "Pipeline Failure Notification"
            }

        }
    }
}
