class Wrapper_class {
    
    public static void main(String args[]) {

        // Wrapper Classes are used to convert primitive types to objects so they can be used in collections, generics and object-based APIs

        int x = 5;

        // Boxing
        Integer x_obj=Integer.valueOf(x); 
         
        // Autoboxing
        Integer x_obj1=x;
        
        System.out.println(x_obj);
        System.out.println(x_obj1);

        if (x_obj instanceof Integer) {
             System.out.println("x_obj is a Integer");
        }

        // Unboxing 
        int y = x_obj.intValue();  

        //Autounboxing
        int y1=x_obj;

        System.out.println(y);
        System.out.println(y1);

    }
    
}