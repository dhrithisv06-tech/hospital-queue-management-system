# hospital-queue-management-system
Java Project using multithreading, JDBC and XAMPP 

##Problem statement
-Hospitals face long waiting queues
-Emergency patients may not get priority
-Manual management is inefficient

##Objectives
-Manage patient queue efficiently
-Handle emergency cases first
-Simulate real-time hospital environment
-Store patient data in database

##Features
-Add Patients
-View Patients
-Book appointments
-View appointments

##Technologies used
-Java
-JDBC
-XAMPP(for MYSQL database)

##How system works
-Patient is added
-Stored in priority queue
-Doctor thread picks patient
-Treatment simulated
-Data stored in database
-Log saved in file

##How to Run
-Setup MySQL database using XAMPP
-Update DB credentials in DatabaseHandler.java
-Compile and run MainNew.java
