Lab 4 - Creating a REST API
Part 1: Establishing connections with tables
I created entities and repositories for the following tables:

Table Name	Entity Link	Repository Link
CUSTOMER_DETAILS	CustomerDetails.java	CustomerDetailsRepository.java
CUSTOMER_IDENTIFICATION	CustomerIdentification.java	CustomerIdentificationRepository.java
CUSTOMER_CONTACT_INFORMATION	CustomerContactInformation.java	CustomerContactInformationRepository.java
CUSTOMER_PROOF_OF_ID	CustomerProofOfId.java	CustomerProofOfIdRepository.java

Part 2: Setting up basic GET and POST requests
I created services for these 4 entities, that allow me to send a GET request to fetch all data, and a POST request to add records to the tables.

Table Name	Service Link	Controller Link
CUSTOMER_DETAILS	CustomerDetailsService.java	CustomerDetailsController.java
CUSTOMER_IDENTIFICATION	CustomerIdentificationService.java	CustomerIdentificationController.java
CUSTOMER_CONTACT_INFORMATION	CustomerContactInformationService.java	CustomerContactInformationController.java
CUSTOMER_PROOF_OF_ID	CustomerProofOfIdService.java	CustomerProofOfIdController.java
Tests
