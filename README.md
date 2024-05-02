# Jenkins Pipeline for Automated CI/CD

## Introduction
This Jenkins pipeline is designed to automate Continuous Integration (CI) and Continuous Deployment (CD) processes for a software project. It integrates with GitHub and sends email notifications upon completion of each stage.

## Author
- Abdul Mueez
- Created on: 02/05/2024

## Pipeline Stages
1. **Build**: Compiles and packages the code using Maven.
2. **Unit and Integration Tests**: Runs unit and integration tests to ensure code functionality.
3. **Code Analysis**: Performs code analysis using tools like SonarQube or Checkstyle.
4. **Security Scan**: Scans the code for vulnerabilities using tools like OWASP Dependency-Check or SonarQube.
5. **Deploy to Staging**: Deploys the application to a staging server (e.g., AWS EC2 instance).
6. **Integration Tests on Staging**: Runs integration tests on the staging environment.
7. **Deploy to Production**: Deploys the application to a production server (e.g., AWS EC2 instance).

## Usage
1. Create a Jenkins job and configure it to use this Jenkinsfile.
2. Make sure to replace the example commands in the script with actual commands relevant to your project and tools.
3. Configure Jenkins to send email notifications by setting up the SMTP server details in Jenkins configuration.
4. Ensure that the specified email address in the pipeline matches your desired recipient for notification emails.

## Demo
video : 

