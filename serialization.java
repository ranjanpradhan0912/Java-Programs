// Serialization is converting an object into a file(or byte stream) so we can save it or send it 
import java.io.*;

public class serialization {

    // Inner class
    static class Student implements Serializable {
        String name;
        transient int age; //transient value is not saved so default value is assigned by Java(Should be use in case of passwords field)

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) throws Exception {

        // Create object
        Student s1 = new Student("Ravi", 20);

        // Serialization (Save object)
        FileOutputStream file = new FileOutputStream("student.txt");
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(s1);

        out.close();
        file.close();

        System.out.println("Object saved successfully!");

        // --------- Deserialization ---------
        FileInputStream fileIn = new FileInputStream("student.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        Student s2 = (Student) in.readObject();  // reading object
        //type casting to Student object as be default readObject returns it as type object and not a particular object.

        in.close();
        fileIn.close();

        System.out.println("Object read successfully!");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}