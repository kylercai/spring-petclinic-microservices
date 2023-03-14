##You might want to inspect the code of the messaging-emulator microservice. Take a look at:
#The dependencies for the Service Bus in the pom.xml file.
#The PetClinicVisitRequestSender and PetClinicMessageResponsesReceiver classes in the service folder. These are the classes that enable sending and receiving of messages to and from a queue using JMS.
#The PetClinicMessageRequest and PetClinicMessageResponse classes in the entity folder. These are the messages being sent back and forth.
#The MessagingConfig class in the config folder. This class provides conversion to and from JSON.
#The AzureServiceBusResource class in the web folder. This class makes use of the above classed to send a message to the Service Bus.
