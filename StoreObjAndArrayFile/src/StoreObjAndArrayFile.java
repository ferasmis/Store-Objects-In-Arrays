/*******************************************************************************
* Name: Feras
* Description: A program that stores an Array, a Date object for the 
* current time ,the double value, and then read and display the data
 ******************************************************************************/

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
public class StoreObjAndArrayFile {
    public static void main(String[] args) 
            throws IOException,ClassNotFoundException{
        
        //create and ArrayList to store int numbers
        ArrayList<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(1);
        intNumbers.add(2);
        intNumbers.add(3);
        intNumbers.add(4);
        intNumbers.add(5);
        
        try (//try-with-resources 
              //Create an output stream for file Assignment8.dat
             ObjectOutputStream output = 
               new ObjectOutputStream(new FileOutputStream("Assignment8.dat"));
            ){
                //write data to the file
                output.writeObject(intNumbers);
                output.writeObject(new Date());
                output.writeDouble(5.5);
            }
        
        try (//try-with-resources 
              //Create an input stream for file Assignment8.dat
                ObjectInputStream input = 
                 new ObjectInputStream(new FileInputStream("Assignment8.dat"));
            ){
            // Read data from the file
            System.out.println(input.readObject());
            System.out.println(input.readObject());
            System.out.println(input.readDouble());
            }
        
    }//end main 
}//end class
