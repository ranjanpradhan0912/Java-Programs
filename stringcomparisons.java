class Stringcomparisons{
    public static void main(String args[]){
    String name="Ranjan";
    String name1="Ranjan";
    System.out.println(name.equals(name1)); // True since equals compares content
    
    String lastname="Pradhan"; // new object created, string literal saved in string pool
    String lastname1=new String("Pradhan"); //new object created in heap memory
    System.out.println((lastname==lastname1)); // False since == compares memory address



    }
}