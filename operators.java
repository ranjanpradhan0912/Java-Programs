class Operators {
    public static void main(String args[]) {
    // Arithmetic Operators
    int a=15;
    int b=10;
    System.out.println(a*b);
    
    //Unary Operator needs only one operand to perform operations
    int c=12;
    c=-c;
    System.out.println(c);

    int d=17;
    d--;
    System.out.println(d);

    int e=19;
    e++;
    System.out.println(e);
    
    boolean can_vote=true;
    System.out.println(!can_vote);

    //Assignment Operator
    int f=24;
    
    f+=20;
    System.out.println(f);
    

    //Logical Operator used for short circuiting
    int g=10;
    int h=12;
    int i=17;
    if((i>h)&&(i>g)){
        System.out.println("I is the greatest number");
    }
    else{
         if((h>g)&&(h>i)){
        System.out.println("H is the greatest number");
        }
        else{
        System.out.println("G is the greatest number");
        }
    }

    //Ternary operator

    int j=50;
    int k=60;
    int res=(j>k)?j:k;
    System.out.println(res);

    //Bitwise Operator
    //>> Signed Right Shift While Dividing by 2 (So Negative Number Remains Negative)
    //>>> Unsigned Right Shift(Negative number is converted to large positive number)(0 is added for the leftmost bit for negative mumbers)
    //<< Shifts bits left by 1(0 is added at the right)
    int l=-17;
    int m=1;
    System.out.println((l&m));
    System.out.println((m<<2));
    System.out.println((l>>>3));
    System.out.println((l>>>m));

    //Instance of operator is used for type checking
    Operators obj=new Operators();
    System.out.println(obj instanceof Operators);

    Operators obj1=new Operators();
    System.out.println(obj1);

}
}