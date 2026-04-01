class Pattern{
    public static void main(String args[]){
        // Pattern 1 
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");

        // }

        //Pattern 2
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<5;j++){
        //       System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Pattern 3
        // for(int i=1;i<=4;i++){
        //     if((i==1)||(i==4)){
        //         for(int j=1;j<=5;j++){
        //             System.out.print("*");
        //         }
        //     }
        //     else{
        //         for(int j=1;j<=5;j++){
        //             if((j==1)||(j==5)){
        //                 System.out.print("*");

        //             }
        //             else{
        //                 System.out.print(" ");

        //             }

        //         }
        //     }
        //     System.out.println();
        // }

        // Pattern 4
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //       if((i==1)||(i==4)||(j==1)||(j==5)){
        //         System.out.print("*");
        //       }
        //       else{
        //         System.out.print(" ");
        //       }
        //     }
        //     System.out.println();
        // } 

        //Pattern 5
        // for(int i=4;i>=1;i--){
        //   for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }

        //Pattern 6
        // for(int i=1;i<=4;i++){
        //   for(int j=1;j<=4-i;j++){
        //     System.out.print(" ");
        //   }
        //   for(int k=1;k<=i;k++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }

        //Pattern 7
        // for(int i=1;i<=5;i++){
        //   for(int j=1;j<=i;j++){
        //      System.out.print(j+" ");
        //   }
        //   System.out.println();
        // }

        //Pattern 8
        //   for(int i=1;i<=5;i++){
        //   for(int j=1;j<=5-i+1;j++){
        //      System.out.print(j+" ");
        //   }
        //   System.out.println();
        // }

        //Pattern 9 
        // int j=1;

        // for(int i=1;i<=5;i++){
        //    int count=1;
        //    while(count<=i){
        //     System.out.print(j+" ");
        //     j++;
        //     count++;
        //    }
        //    System.out.println();
        // }

        //Pattern 10
        // int n=5;
        // int number=1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        //Pattern 11
        // int number=1;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if(number%2==0){
        //             System.out.print("0");
        //         }
        //         else{
        //             System.out.print("1");

        //         }
        //         number++;

        //     }
        //     System.out.println();

        // }

        //Pattern 12
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1");
        //         }
        //         else{
        //             System.out.print("0");

        //         }
                

        //     }
        //     System.out.println();

        // }
        
        // Pattern 13 (Butterfly)
        //Upper half
       
        //  for(int i=1;i<=4;i++){
        //     int nos=2*(4-i);
        //      //first part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //Spaces
        //     for(int k=1;k<=nos;k++){
        //         System.out.print(" ");
        //     }
        //     //second part
        //     for(int l=1;l<=i;l++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        //  }
             
        // for(int i=4;i>=1;i--){
        //     int nos=2*(4-i);
        //     //first part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //spaces
        //     for(int k=1;k<=nos;k++){
        //         System.out.print(" ");
        //     }
        //     second part
        //     for(int l=1;l<=i;l++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        //  }
      
      //Pattern 14(Rhombus)
    //   int n=5;
    //   for(int i=1;i<=n;i++){
    //     int nos=n-i;
    //     //Spaces
    //     for(int j=1;j<=nos;j++){
    //         System.out.print(" ");
    //     }
    //     //Stars
    //     for(int k=1;k<=n;k++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //   }

    //Pattern 15(Hollow Rhombus)
    //     int n=5;
    //   for(int i=1;i<=n;i++){
    //     int nos=n-i;
    //     //Spaces
    //     for(int j=1;j<=nos;j++){
    //         System.out.print(" ");
    //     }
    //     //Stars
    //     if((i==1) || (i==5)){
    //        for(int k=1;k<=n;k++){
    //             System.out.print("*");
    //        }
    //     }
    //     else{
    //         System.out.print("*");
    //          for(int k=1;k<=n-2;k++){
    //             System.out.print(" ");
    //          }
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //   }

    //Pattern 16
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     int nos=n-i;
    //     for(int j=1;j<=nos;j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=1;k<=i;k++){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }

    // Pattern 17
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     int nos=n-i;
    //     for(int j=1;j<=nos;j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=i;k>=1;k--){
    //         System.out.print(k);
    //     }
        
    //     for(int l=2;l<=i;l++){
    //          System.out.print(l);
    //     }
        
    //     System.out.println();
    // }

    // Pattern 18 (Diamond)
    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=2;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
        
    // }
    // for(int i=4;i>=1;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     for(int j=2;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
        
    // }
    
    //Pattern 18 (Diamond Pattern)
    int n=4;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
      
        System.out.println();
        
    }
    for(int i=4;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
        
    }
    

    }
}   