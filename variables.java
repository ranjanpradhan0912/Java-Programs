class Variables{

    int number2=10; //Instance Variable
    static int number3=20; // Class Variable

    int instance_variable;
    static int class_variable;


    public static void main(String args[]){
        
        int number1 =5 ; // Local Variable
        System.out.println("Local Variable: "+ number1);

        Variables obj=new Variables();
        System.out.println("Instance Variable: "+ obj.number2);

        System.out.println("Class Variable: "+ Variables.number3);

        //Only Local Variable has to be initialized
        int loc_variable;
        
        // System.out.println(loc_variable);
        System.out.println("Default Value of Instance Variable is "+ obj.instance_variable);
        System.out.println("Default Value of Class Variable is "+class_variable);




    }
}