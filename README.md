# Java

COMP 228: JAVA PROGRAMMING
LAB TEST #1
Full Marks: 100
Time allowed: 2 hours counted from the starting time
NAME:_______________________________________________________________________
[Provide necessary screenshots and copy the entire code into a Word document and Save As in following format: first 3 letters of your last name followed by the word LTest1. For example, if your last name is Yamin, your file name should be YamLTest1. Do not submit any java file, any zipped file, or a file in any format other than MS Word document. DO NOT drop more than one file. Violation of any one of these instructions would earn a 0 grade for this lab test. Drop one Word document into the drop box titled as LabTest#1. No late submission is allowed.] 

General Scenario:
You are creating an interactive application that gets input from the keyboard and  keeps track of the records of students of Centennial College. In order to develop this application, you will be using an abstract class and use that class to create a concrete class. Your application should have overridden toString() at appropriate places so that you could display the object state, i.e., the string representation of the objects that you created by simply using the following command: System.out.println(object).

Follow the following instructions:
1.	Create an abstract class named Student. This class contains three instance variables, one constructor, and three abstract methods.
a.	Instance variables: studentId, name, and address (Use appropriate data type.)
b.	Constructor: one constructor that would help constructing an object in its subclass with all the student information.
c.	Three abstract methods: getId, getName, and getAddress. Each of these methods, when sub classed into concrete ones, should return the respective values of the instance variables studentId, name, and address.
                                                                                                                 [25 marks]

2.	Create a concrete class named CentStudent that makes use of the abstract class Student. This class has two instance variables of its own, one constructor, and two methods of its own.
a.	Instance variables: dept and tutionFee. (Use appropriate data type).
b.	Constructor: one constructor that constructs a CentStudent object with all the centStudent information (studentId, name, address, department, and tutionFee) supplied during the centStudent object creation. 
c.	Methods: getDept and getTuition that return the values of the two instance variables of this level individually.
d.	Take necessary action to make this class a concrete class.
[35 marks]

3.	Create a driver class named TestX (replace XXX by three letters of your last name) that would continuously ask for student Id, name, address, department, and tuition fees from the user and displays each record as you provide all the information about each of them. Make sure to use a loop that only stops when you enter -1 as an input when asked for student id. If you enter -1 at this point, the application should display particular information as shown in the test run below and quit by displaying a message also shown in the test run.    
                                                                                                                       [40 marks]

Your test run should look like the following:

Centennial Student Tracking Application
Enter student Id (enter -1 to quit):  1123
Enter name: Syed Yamin
Enter address: 123 Dreamland, Ontario
Enter department: SETAS
Enter tuition Paid: 1200.00
      The Complete Student Record:
      Student Id: 1123
      Name: Syed Yamin
      Address: 123 Dreamland, Ontario
      Department: SETAS
      Tuition paid: 1200.00
      
Enter student Id (enter -1 to quit):  2234
Enter name: Ilia Nika
Enter address: 324 Rossland, Quebec
Enter department: ICET
Enter tuition Paid: 500.00
      The Complete Student Record:
      Student Id: 2234
      Name: Ilia Nika
      Department: ICET
      Address: 324 Rossland, Quebec
      Tuition paid: 500.00

Enter student id (enter -1 to quit): -1 
      Syed Yamin’s  student Id as entered is: 1123
      Syed Yamin’s address as entered is: 123 Dreamland, Ontario
      Ilia Nika’s department as entered is: ICET
      Ilia Nika’s tuition fees as entered is: 500.00
      Bye now. Have a nice day.
