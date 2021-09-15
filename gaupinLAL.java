/*********************************************************************
 Author    : Luc Gaupin 
 Course    : COP 3804
 Professor : Michael Robinson 
 Program # : Program 2
             { Learn how to create, insert data, and use the data in an ArrayList method }

 Due Date  : 06/19/2021


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Luc Gaupin }..........
*********************************************************************/

import java.util.*; //import inorder to use the ArrayList 

public class gaupinLAL { //begin gaupinLAL class

  public static void main( String[] args ) //begin main() method
  {
    theArrayList( ); //calls theArrayList() method in order for the program to run
  }// end public static void main( String[] args )

  public static void theArrayList( ) //begin theArrayList() method
  {
    ArrayList<Object> theList = new ArrayList<Object>( ); //ArrayList<> theList declaration


    System.out.printf("\n\n");
    System.out.printf( "--------------------------------------\n" );
    System.out.printf( "Adding data to ArrayList<>...\n" );
    System.out.printf( "--------------------------------------\n" );
    System.out.printf( "Success!\n\n" );

    theList.add( 123 ); //adding "123" to ArrayList theList<>
    theList.add( "Java" ); //adding "Java" to ArrayList theList<>
    theList.add( 3.75 ); //adding "3.75" to ArrayList theList<>
    theList.add( "Summer C" ); //adding "Summer C" to ArrayList theList<>
    theList.add( 2021 ); //adding "2021" to ArrayList theList<>

    System.out.printf( "--------------------------------------\n" );
    System.out.printf( "Printing theList<> with all data\n" );
    System.out.printf( "--------------------------------------\n" );

    
    for( int x = 0; x < theList.size( ); x++ ) //for loop to check the size of the list and then print everything inside the list
    {
      System.out.printf( "%s\t", theList.get( x ) ); //displays everything in the list
    }// end for() loop
    System.out.printf("\n\n"); //added for formatting

    theList.remove( 4 ); //this removes index 4 
    theList.remove( 1 ); //this removes index 1

    System.out.printf( "--------------------------------------\n" );
    System.out.printf( "Printing theList<> with removed data\n" );
    System.out.printf( "--------------------------------------\n" );

    for( int x = 0; x < theList.size(); x++ ) //for loop to check the size of the list and then print everything inside the list again
    {
      System.out.printf( "%s\t", theList.get( x ) ); //displays everything in the list AFTER the removal of index 4 and index 1 (which is #5 and #2)
    }// end for() loop
    System.out.printf("\n\n"); //added for formatting
  } //end public static void theArrayList( )
} //end public class gaupinLAL
