# springboot-aws-secret

This Spring Boot application demonstrates different methods to connect to AWS to retrieve AWS secrets.

## Methods Demonstrated

This project showcases various approaches to retrieve AWS secrets within a Spring Boot environment.

## Setup

Ensure you have the following prerequisites:
- Java Development Kit (JDK) installed.
- AWS credentials set up and configured.

# AWS Login
Please refer to:
https://docs.aws.amazon.com/signin/latest/userguide/command-line-sign-in.html 

## Running the Application

1. Clone this repository.
2. Run the application using Maven:

```bash
mvn spring-boot:run
```

## Tutorial Video
For detailed implementation, refer to the provided AWS Secrets Retrieval Tutorial Video.
https://youtu.be/1j028KYS4ps?si=tuILDHmxy5Nne_oM

## Grant access over user Using IAM AWS
1. Open the IAM Dashboard by searching for IAM on the AWS Search Bar.
2. Click on "Users" or "Roles" on the left side.
3. Search for the user or role and open it.
4. Click "Add Permissions" or "Attach Policies".
For users, click "Attach existing policies directly". (Roles don't need this step.)
If you search and can't find a suitable policy, click "Create Policy".
5. Choose "Secrets Manager" as the service and "GetSecretValue" as Action (You can search for these on each step.)
6. Click "Add" then "Next: Tags" then "Next: Review".
Enter a name within the constraints, and click "Create policy".
7. Go back to the Attach Policy page and click the Refresh button (just above the table, on the right side).
8. Search for your policy, click the checkbox, and click "Attach policy".
9. Test your application again.

