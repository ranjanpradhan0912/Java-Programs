import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

class Stream{

 public static void main(String args[]){
    
    //Reads input from a file as a stream of yb
    try{
        FileInputStream file=new FileInputStream("read.txt");
        System.setIn(file); //Changing Source of Input for System.in(Standard Input Stream reads from Keyboard)
        Scanner sc=new Scanner(System.in); //Scanner object takes input, breaks it into tokens and converts tokens into required data types
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
    catch(FileNotFoundException e){
        System.out.println(e);
    } 

    //Reads input from a file as a stream of bytes using an internal buffer, improving performance by reducing disk access
    try{
        FileInputStream file=new FileInputStream("read.txt");
        BufferedInputStream buffered_file=new BufferedInputStream(file); // Filtere Stream wraps around another stream to improve performance 
        int data;
        while((data=buffered_file.read())!=-1){
            System.out.print((char)data);
        }
        buffered_file.close();
    }
    catch(IOException e){
        System.out.println(e);
    } 


    //Redirects output to a file instead of printing it in console
    try{
       PrintStream output=new PrintStream("write.txt");
       System.setOut(output); //Changing Source of Input for System.out(Standard Output Stream outputs to console)
       System.out.println("This is the Output");
             
    }
    catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }



 
 }
}