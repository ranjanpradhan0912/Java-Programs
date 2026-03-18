import java.util.Scanner;
class loops{
    public static void main(String args[]){

        // IF-ELSE STATEMENT

        System.out.println("Enter your age:");
        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();
        if (age>=18){
        System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are ineligible to vote");
        }

        // ELSEIF STATEMENT
        System.out.println("Enter  your first number");
        Scanner obj=new Scanner(System.in);
        int first=obj.nextInt();
        System.out.println("Enter your second number");
        Scanner obj1=new Scanner(System.in);
        int second=obj1.nextInt();
        if (first==second){
            System.out.println("Numbers are equal");
        }
        else if(first>second){
            System.out.println("First number is greater");
        }
        else{
            System.out.println("Second number is greater");
        }


        //SWITCH STATEMENT
        System.out.println("Enter your Choice:\n1.Hello \n2.Namaste \n3.Bonjour");
        Scanner obj=new Scanner(System.in);
        int choice=obj.nextInt();
        switch(choice){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break; 
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Wrong choice");
        }
        
        // FOR LOOPS

        for(int i=0;i<=10;i++){
            System.out.println(i);
        }

        //While Loops
        int i=15;
        while(i<=0){
            System.out.println(i);
            i++;
        }

        // Do While Loops
        int j=0;
        do{
            System.out.println(j);
            j++;
        }while(j<=10);

    }
}

 