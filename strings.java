class strings{
    public static void main(String args[]){
    //String are immutable(No threadoperation in a string)
    String name="Ranjan";
    name.concat("Pradhan"); //New String Object is created instead of name being modified
    System.out.println("Name: "+ name);

    //String Buffer are mutable (Stringbuffer is threadsafe as two threads cant call methods of StringBuffer Simultaneously)
    StringBuffer address=new StringBuffer("Bijanbari");
    address.append("Darjeeling"); // Same String Object is modified
    System.out.println("Address: "+ address);

    //StringBuilder are mutable
    StringBuilder designation=new StringBuilder("Software");
    designation.append("Design Intern"); // Same String Object is modified
    System.out.println("Designation: "+ designation);

    }
}