import java.io.*;
import java.util.Scanner;
class Input{
    public static void main(String args[]) throws Exception{
    
    //4 Ways to take input from console
    // Scanner is the most flexible,(Supports String) 
    // BufferedReader is faster, (Supports String) 
    // Console is used for secure input, and (Supports String,Password) 
    // command-line arguments are used at program startup.(All types)
    
    //Command Line 
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    System.out.println(a+b);

    //Buffered Reader Class (BufferedReader Class only works with characters not bytes so InputStreamReader is used to converts bytes into characters)
    //BufferedReader stores characters in a buffer for faster and efficient reading

    BufferedReader input_data=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your name: ");
    String name=input_data.readLine();
    System.out.println("Enter your age: ");
    int age=Integer.parseInt(input_data.readLine());
    System.out.println("Your name is "+name);
    System.out.println("Your age is "+age);

    //Console Class

    Console input_data=System.console();
    String name=input_data.readLine();
    char[] password=input_data.readPassword(); 
    Char is mutable, can be erased and more secure(String is immutable,stays in memory and less secure)
    System.out.println("The name is "+name);
    System.out.println("The password is "+new String(password));

    //Scanner class (Scanner class internally uses InputStreamReader to convert bytes to characters, Scanners parses it into int, double,string,etc)
    // Parse is to read text and convert it unto a usable data type

    Scanner input_data=new Scanner(System.in);
    int age=input_data.nextInt();
    String name=input_data.next();
    System.out.println(""+name+age);

    }
}