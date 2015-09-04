# TestWithSOAPUISampleChapter2
Web Services Testing with soapUI
Copyright © 2012 Packt Publishing

sample chapter 02 smaple in Maven

Project pre-requisites
Before starting to implement the project, let's make the project environment ready.
Java We are going to develop the sample project using Java. Therefore, make sure to
install JDK1.6 or later version in your machine.
Apache Ant We will be using Apache Ant to build our project. Of course, you may use any build
tool you prefer.
You can download the latest version of Apache Ant from http://ant.apache.org/
bindownload.cgi and follow the installation guide to set up Ant on your machine.
MySQL MySQL will be used as the database management system in our sample project.
All data used in sample hotel reservation system will be stored in a MySQL database.
Therefore, we should set up MySQL in our machines. We can download MySQL
from http://www.mysql.com/downloads/mysql/ and follow the instructions
given in the installation guide to set it up on your machine.
Setting up Apache Axis2 
There are numerous web service frameworks which can be used in web services
development and deployment. Apache CXF (http://cxf.apache.org/) and
Apache Axis2 (http://axis.apache.org/axis2/java/core/) are two examples
of popular open source web service frameworks. The pure RESTful web service
frameworks such as RESTeasy (https://www.jboss.org/resteasy/) can also
be used in web services implementation.

We will use Apache Axis2 web services framework in our sample project because
Apache Axis2 is primarily a SOAP based web services engine and our sample project
is focused on a set of SOAP-based web services. Let's set up Axis2 on our machine
according to the following steps:

Designing the web services
Our sample hotel reservation system is implemented using SOAP-based web
services. As per the three basic entities used in the system, we can plan to have
three web services explained as follows:
•	 GuestManagementService:
GuestManagementService will be used to add, delete, or retrieve the details
of guests in system. This web service consists of the following methods:
°° addGuest (name, address, age)
°° getGuestDetails (name)
°° deleteGuest (name)
•	 RoomManagementService:
Adding, deleting, and retrieving the details of rooms are managed by
the RoomManagementService which includes the following methods:
°° addRoom (roomNumber, roomType, roomSize)
°° getRoomDetails (roomNumber)
°° deleteRoom (roomNumber)
•	 ReservationService:
ReservationService is used to manage the room reservations of the system,
such as creating a new reservation, finding out the reservation details of
a particular room, and removing an existing reservation. The following
methods are included in this web service:
°° addReservation (roomNumber, guestName, reserved_from,
    reserved_to)
°° getReservationDetails (roomNumber)
°° removeReservation (reservationID)
