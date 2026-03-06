class Javastringpool{
    //Java string pool is a space in the heap memory where string literals are stored
    //Whenever a new String object is created without using the new keyword the string is compared in String Pool if it matches same object is referenced which points to that string.
    public static void main(String args[]){
    String name1="Ranjan Pradhan";
    String name2="Ranjan Pradhan";
    //String object created using new keyword is provided a separate memory space
    String name3=new String("Ranjan Pradhan");
    System.out.println(name1==name2);
    System.out.println(name2==name3);
    System.out.println(name3==name1);

    }

}