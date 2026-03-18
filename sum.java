import java.util.Scanner;
class sum{
    public static void main(String args[]){
        System.out.println("Enter your range of natural numbers to print sum for:");
        Scanner obj=new Scanner(System.in);
        int range=obj.nextInt();
        int i=1;
        int sum=0;
        while(i<=range){
            sum=sum+i;
            i++;
        }
        System.out.printf("The sum is %d",sum);
        
    }
}