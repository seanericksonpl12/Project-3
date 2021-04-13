// --== CS400 File Header Information ==--
// Name: Shupeng Tang
// Email: stang72@wisc.edu
// Team: HG Blue
// Role: frontend developer
// TA: Hang
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

/*
 * This class 
 */
public class Frontend {
//scanner and backend objects used throughout the class.
 static Scanner scan = new Scanner(System.in);
 public static Backend back;
 
 /**
  * This initializes the backend which allows the frontend code to implement its methods.
  * 
  * @param b
  */
 public void backend(Backend b) {
   this.back = b;
 }
 
 /**
  * This method is where the main menu has been written. It prompts the user to enter an input that
  * will take them to one of the other various methods.
  */
 public static void run() {
   //prints out welcome prompt
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("Welcome to the Connecting Flights app");
   System.out.println("");
   System.out.println("From this main menu you can choose if you want");
   System.out.println("to get the shortest-path or the cheapest-path");
   System.out.println("----------------------------------------------");
   System.out.println("Please select: ");
   System.out.println("S - to go in to shortest-path sub menu");
   System.out.println("C - to go in to cheapest-path sub menu");
   System.out.println("A - to get a list of available airports");
   System.out.println("D - to get the shortest distance between two airports");
   System.out.println("exit - to exit the program");
   //recognize user command and act accordingly
   String command = scan.nextLine();//strings that takes user input from scanner
   // while the input is not x, there are various cases based on input that will take the user to
   // other menus.
   while(!command.equals("exit")){
   if(command.equals("exit")) {
     break;
   }
   if (command.equals("A")) {
     getAirports();
   }
   else if (command.equals("D")) {
     getDistance();
   }
   else if(command.equals("S")) {
       getShortest();
     }
     
   else if(command.equals("C")) {
       getCheapest();
     }
   else {
       System.out.println("Not a valid input. Please enter a valid command.");
       run();
   }

   }  
   //exit program
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("Thank you for using the Connecting Flight app. Come back soon!");
   scan.close();  
  // System.exit(0);
 }
 
 /**
  * This is the sub-menu that is outputs the shortest paths of flights
  */
 public static void getShortest() {
   //display the sub menu
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("You have chosen to get the shortest path");
   System.out.println("Enter x to get back to the main page");
   System.out.println("");
   //prompt user to enter starting point
   System.out.println("please enter your starting point");
   String start = scan.nextLine();
   //if user entered x, return to main menu 

   if(start.equals("x")) { 
     run();   
     return;
   }
   start = start.toUpperCase();
   //prompt user to enter ending point
   System.out.println("please enter your ending point");
   String end = scan.nextLine();
   if(end.equals("x")) {
     run();    
     return;
   }
   end = end.toUpperCase();
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("The shortest path between " + start +" and "+ end +" is: ");
   //get the shortest path
   try {
   System.out.println(back.getShortestPath(start, end));}
   //if there is NoSuchelement exception, prompt user that there is no available path
   catch(NoSuchElementException e){
     System.out.println("");
     System.out.println("Sorry, there is no available path between selected airports.");
   }
   System.out.println("");
 
 }
 
 /**
  * This is the sub-menu that is outputs the cheapest paths of flights
  */
 
 public static void getCheapest() {
   //display the sub menu
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("You have chosen to get the cheapest path");
   System.out.println("Enter x to get back to the main page");
   System.out.println("");
   //prompt user to enter starting point
   System.out.println("please enter your starting point");
   String start = scan.nextLine();
   //if user entered x, return to main menu 
   if(start.equals("x")) {run();}
   start = start.toUpperCase();
   //prompt user to enter ending point
   System.out.println("please enter your ending point");
   String end = scan.nextLine();
   if(end.equals("x")) {run();}
   end = end.toUpperCase();
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("The cheapest path between " + start +" and "+ end +" is: ");
   System.out.println("");
   //get the cheapest path
   try {
   System.out.println(back.getCheapestPath(start, end));}
   //if there is NoSuchelement exception, prompt user that there is no available path
   catch(NoSuchElementException e){
   System.out.println("");
   System.out.println("Sorry, there is no available path between selected airports.");
   }
   System.out.println("");
 }
 
 /**
  * This method displays the shortest distance between two airports
  */
 public static void getDistance() {
   //display the sub menu
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("You have entered the distance menu ");
   System.out.println("Enter x to get back to the main page");
   System.out.println("");
   //prompt user to enter starting point
   System.out.println("please enter your starting point");
   String start = scan.nextLine();
   //if user entered x, return to main menu 
   if(start.equals("x")) { run();}
   start = start.toUpperCase();
   //prompt user to enter ending point
   System.out.println("please enter your ending point");
   String end = scan.nextLine();
   if(end.equals("x")) {run();}
   end = end.toUpperCase();
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("The shortest distance between " + start +" and "+ end +" is: ");
   System.out.println("");
   //get the shortest distance
   try {
   System.out.println(back.getDistance(start, end));}
   //if there is NoSuchelement exception, prompt user that there is no available path
   catch(NoSuchElementException e){
   System.out.println("");
   System.out.println("Sorry, there is no available path between selected airports.");
   }
   System.out.println("");
 }
 
 /**
  * This method displays a list of all available airports
  */
 public static void getAirports() {
   System.out.println("----------------------------------------------");
   System.out.println("");
   System.out.println("The available airports are: ");
   System.out.println(back.listAirports());
   run();
 }
 
 
 /**
  * This initializes the backend and checks for its exceptions before moving on. It then runs the
  * program.
  * 
  * @param args
  */
 public static void main(String[] args) {
  try {
   Frontend F = new Frontend();
   back = new Backend();
   F.run();
  }
  catch(Exception e) {
   System.exit(0);// runs the program.
  }
 }
 
}
