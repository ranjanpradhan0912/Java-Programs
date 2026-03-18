import java.util.Scanner;
class table{
    public static void main(String args[]){
        System.out.println("Enter number for its table:");
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        System.out.printf("The table of %d is \n",num);
        for(int i=0;i<=12;i++){
            System.out.printf("%d * %d = %d \n",num,i,(num*i));
        }
    }
}