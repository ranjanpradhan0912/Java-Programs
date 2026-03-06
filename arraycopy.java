import java.util.Arrays;
class Arraycopy{
    String name;
    Arraycopy(String name){
        this.name=name;
    }
    public static void main(String args[]){

        //01. Clone Function 

        //For primitives clone function copies all elements and  changing copy does not affectt the original array
              
        int[] original={45,54,65,76,64};
        int[] copy=original.clone(); 
        copy[0]=99;  
        System.out.println("Clone Function in Primitive Types");
        System.out.println("Original Array Element at 0th Position:"+original[0]);
        System.out.println("Copied Array Element at 0th Position:"+copy[0]);
        System.out.println("\n");


        //For objects clone function only copies object references and not the elements(Shallow Copy)
        //Here changing copy affects the original array
        Arraycopy[] arr1={
            new Arraycopy("Ranjan"),
            new Arraycopy("Ash")
        };

        Arraycopy[] arr2=arr1.clone();

        arr2[0].name="Copied";
        System.out.println("Clone Function in Object Types");
        System.out.println("Original Array Element at 0th Position:"+arr1[0].name);
        System.out.println("Copied Array Element at 0th Position:"+arr2[0].name);
        System.out.println("\n");

        // 02. System.arraycopy() Function allows partial copy of array 

        //For Primitives elements are copied so the original array is unaffected when a copy is changed

        int[] num={23,42,5,54,53,13,58};
        int[] num_copy=new int[3];
        System.arraycopy(num,0,num_copy,0,3);
        System.out.println(num_copy);
        System.out.println("Partial Copied Array"+Arrays.toString(num_copy)); // Convert array into a readable string  format
        num_copy[0]=99;
        System.out.println("System.array Function in Primitive Types");
        System.out.println("Original Array Element at 0th Position:"+num[0]);
        System.out.println("Copied Array Element at 0th Position:"+num_copy[0]);
        System.out.println("\n");


       // Similar to clone function as in objects are not duplicated so changing copy affects original array
       Arraycopy[] arr3={
            new Arraycopy("Ranjan"),
            new Arraycopy("Ash")
        };

        Arraycopy[] arr4=new Arraycopy[4];
        System.arraycopy(arr3,0,arr4,0,2);

        arr4[0].name="Ashley";
        System.out.println("System.array Function in Object Types");
        System.out.println("Original Array Element at 0th Position:"+arr3[0].name);
        System.out.println("Copied Array Element at 0th Position:"+arr4[0].name);
        System.out.println("\n");

        //03. Arrays.copyOf() Function 

        int[] numbers = {2, 4, 6, 8};
        int[] numbers_copy = Arrays.copyOf(numbers, numbers.length);
        numbers_copy[0] = 99;
        System.out.println("Arrays.copyOf Function in Primitive Types");
        System.out.println("Original Array Element at 0th Position:"+numbers[0]);
        System.out.println("Copied Array Element at 0th Position:"+numbers_copy[0]);
        System.out.println("\n");

        // Similar to clone function as in objects are not duplicated so changing copy affects original array
        Arraycopy[] arr5={
            new Arraycopy("Ranjan"),
            new Arraycopy("Ash")
        };

        Arraycopy[] arr6=Arrays.copyOf(arr5, arr5.length);
        arr6[0].name="Pooja";
        System.out.println("System.array Function in Object Types");
        System.out.println("Original Array Element at 0th Position:"+arr5[0].name);
        System.out.println("Copied Array Element at 0th Position:"+arr6[0].name);
        System.out.println("\n");

        
        //Arrays.copyOfRange()
        int[] new_arr = {11, 22, 33, 44, 55};
        int[] copy_new_arr = Arrays.copyOfRange(new_arr, 2, 5);

        System.out.println(Arrays.toString(copy_new_arr));
        

        

    }
}