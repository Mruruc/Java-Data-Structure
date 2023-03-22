package Additional_Task;

import java.util.Scanner;

public class AdditionalTask1 {
    public static void main(String[] args){

//First Task;
            //With for loop;
     /*  for(int i=20; i>=0; i-=2){
            System.out.print(i +"\t");
        }*/
        // With while loop;
    /*   int i=20;
        while(i>=0){
            System.out.print(i+"\t");
            i-=2;
        }*/
// Second task;

    /*    Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a number; ");
        boolean forcondition=!false;
        while(forcondition){
            int number=scan.nextInt();
            if(number != 0){
                System.out.println("Here are your number;");
                System.out.println(number);
            } else {
                System.out.println("Sorry you exit the program;");
                forcondition=false;
            }
            scan.close();
        }*/

 //Third task;

       // With for loop;
    /*  for(int i=0; i<=100;i++){
           if(i%13==0 && i%2==0)
        //   if(i%13==0){
               System.out.println(i);
         //  }
       }*/

       //With While loop;
    /*    int i=0;
       while(i<=100){
           if(i %2==0 && i % 13==0){
               System.out.println(i);
           }
           i++;
       }*/

  // Fourth task;

/*    int [] array=new int[10]; /// declaration of array

  for(int i=0; i< array.length; i++){ /// filling array;
      array[i]=(int)(Math.random()*100);
  }
  for(int i: array){ // displayed array
      System.out.print(i + " ");
  }
     int sum=0;
  for(int i=0; i<array.length; i++){
      sum=sum+array[i];  // sum of array
  }
        System.out.println("\n"+sum);*/

 //Fifth task;

     /*   int [] arr=new int[20]; //declaration of array;

        for(int i=0; i<arr.length; i++){
            /// filing array
            arr[i]=(int)(Math.random()*9);
        }
        // displayed array
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();

         int counter=0;
          //duplicate array
        int [] duplicaarray =new int[arr.length];

          for(int i=0; i<arr.length;i++){
            for(int j=i+1; j< arr.length;j++) {

                if (arr[i] == arr[j]) {
                    counter++; //

                     duplicaarray[i]=arr[i];
                }
            }
          }
        System.out.println("\n"+ "The number of duplicate element; "+counter);

        for(int i: duplicaarray){ // "Print duplicate array;"
            System.out.print( i + " ");
        }*/
//==========================================================================
 //Sixth Task;
    /*    int length = (int) ((Math.random() * 3) + 5);
        char [] arr=new char[length];

        for(int i=0; i< arr.length;i++) {
            arr[i] =  (char)((int)(Math.random()*25)+97);
        }
        for(char i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int sum;
        sum = arr[0] - arr[length - 1];
        System.out.println("Sum of distance; " + Math.abs(sum));*/

//==========================================================================
   //VII.Task;
     /*   for (int i = 5 , i <10 , i ++) // it will not compile because of incorrect syntax
        System . out . println ( i ) ; /// instead of comma should be semicolon.*/
//=====================================================================
// VIII.Task;
     /*  int [] bat = new int [10];  // result it will be address of array variable from memory.
         System . out . println (bat);*/

//=====================================================================
// IX.Task;
 /*       char [] tab = new char [0];
        System . out . println ( tab [0]) ;*/
    //compiler will not compile and will give error because of this array,
        // has no element (in another way the length of array is zero).

//=====================================================================
// X.Task;
      /*  double [] tab = new double [10];
        System .out.println(tab[0]) ;*/
    // The result will be zero point zero(0.0) because,
        // firstly this array type is double if type would be int the result it will be just zero(0).
        // secondly because we did not assign any value to zero index,
        // that is way it tell us that zero index(first element) has no value.

//=====================================================================
    //XI.Task;
 /*       int [] bat = new int [10];
        for (int index = 0; index < bat . length ; index ++)
            System . out . print ( bat [ index ] + " ") ;*/
    //it will zero (0) as much as length number.
        // and each represent first element to last element,
        //and also each zero refer to this index has no value.

//=====================================================================
  // XII.Task;
    /*
       char [] chacha = {’a’ ; ’b’ ; ’c’};
        System . out . print ( chacha [2]) ;*/
    // compile will error that illegal character because incorrect syntax,
     // instead of semicolon it should be comma and also it need single quotation mark.

//=====================================================================
    // XIII.Task;
     /*    long [] tab = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8};
        for (  index = 0; index <= tab . length ; index ++)
            System . out . print ( tab [ index ]) ;
        System . out . println () ;*/
    // it will not compile because of counter type did not specify
        // after specifying counter type it will print array element and also
        // compile will give Exception thread because counter it is out of bounds
        //it should be less than array length.

//=====================================================================
       // XIV. Task;
     /*   for (int i = 5; i <10; i ++) ;
            System . out . println ( i ) ;*/
        // compile will give error because of incorrect for loop syntax,
        // after for loop there is one more semicolon and it should be removed.

//=====================================================================
    // XV.Task;
     /*   int [] t1 = {1 , 2 , 3 , 4};
        int [][] t2D = { {1 , 2} , t1 , t1 };
        for (int i = 0; i < t2D . length ; i ++)
            System . out . println ( t2D [ i ] ) ;*/
        // the result will be three different address from memory.
        //because of two-dimensional array is array of array,
        //this address is two-dimensional array object whose contain one-dimensional arrays


//=====================================================================
   // XVI. Task;
     /*   int [] t1 = {1 , 2 , 3 , 4};
        int [][] t2D = { {1 , 2} , t1 , t1 };
        for (int i = 0; i < t2D . length ; i ++) {
            for (int j = 0; j < t2D . length ; j ++)
                System . out . print ( t2D [ i ][ j ]) ;
            System . out . println () ;
        }*/
       // firstly it will print first inner array element (1,2) and,
       // compile will give error because  for second inner loop we did not specify inner arrays length.
        /// it should be like that; j<t2D[i].length instead of j<t2D.length.

//=====================================================================
   //XVII.
     /*   int [] t1 = {1 , 2 , 3 , 4};
        int [][] t2D = { {1 , 2} , { t1 . length } , t1 };
        for (int i = 0; i < t2D . length ; i ++) {
            for (int j = 0; j < t2D [ i ]. length ; j ++)
                System . out . print ( t2D [ i ][ j ]) ;
            System . out . println () ;
        }*/
        // basiclly it will print two-dimensional array,
                      //12
                      //4
                      //1234

//=====================================================================
   //XVIII.Task;
     /*   Scanner scan = new Scanner(System.in);

        System.out.println(" Please enter a length for your array: ");

        int n =scan.nextInt();

        char[][] array = new char[n][n];

        for (int c = 0; c <= array.length/2; c += 2) {

            int m = array.length - c;

            for (int i = c; i < m; i++) {

                for (int j = c; j < m; j++) {

                    if (i == c || i == m - 1)
                        array[i][j] = 'x';

                    else if (j == c || j == m - 1)
                        array[i][j] = 'x';

                    else
                        array[i][j] = 'o';
                }
            }
        }
        scan.close();
        printCharArray(array);*/


// =====================================================================
//last task;
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter the length of 2D array; ");
        int length= scan.nextInt();
        int [][] userArray=new int[length][length];

        fillArray(userArray);
        AdditionalTask1.printIntArray(userArray);
        //    Shiftby1totheright(userArray);

        //   Shiftby2totheright(userArray);

        //   Shiftby1tothedownandright(userArray);

        //    Shiftby2tothedownandright(userArray);

        AdditionalTask1.printIntArray(userArray);

// =====================================================================
    }
   static void printCharArray(char [][] arr2D){
        for (int i = 0; i < arr2D . length ; i ++){
            for (int j = 0; j < arr2D [i]. length ; j ++){
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printIntArray(int [][] arr2D){
        for (int i = 0; i < arr2D . length ; i ++){
            for (int j = 0; j < arr2D [i]. length ; j ++){
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillArray(int [][] t2Darr) {
        for (int i = 0; i < t2Darr.length; i++) {   //filling array.
            for (int j = 0; j < t2Darr[i].length; j++) {
                t2Darr[i][j] = (int) (Math.random() * 100);
            }
        }
    }
    public static void Shiftby1totheright(int [][] array){
        int tmp;                                    //first method
        for (int i = 0; i < array . length ; i ++){
            for (int j = 0; j < array [i].length ; j ++){
                tmp=array[i][j];
                array[i][j]=array[i][array.length-1];
                array[i][array.length-1]=tmp;
            }
            System.out.println();
        }
    }
    public static void Shiftby2totheright(int [][] arr){
        int tmp;
        for(int i=0; i< arr.length;i++){           //second Method
            for(int j=0; j<arr[i].length-1;j++){
                tmp=arr[i][j];
                arr[i][j]=arr[i][j+1];
                arr[i][j+1]=tmp;
            }
            System.out.println();
        }
    }
    public static void Shiftby1tothedownandright(int [][] arr){
        int tmp;                        //third method
        for (int i = 0; i < arr . length ; i ++){
            for (int j = 0; j < arr [i].length-1 ; j ++){
                tmp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1];
                arr[i][arr.length-1]=tmp;
            }
            System.out.println();
        }
        int[] tmp2;
        for(int i=0; i<arr.length-1;i++){
            tmp2=arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1]=tmp2;
        }
    }
    public static void Shiftby2tothedownandright(int [][] array){
        int tmp;
        for(int i=0; i<array.length; i++){
            for(int j=0; j< array[i].length-1; j++){
                tmp=array[i][j];
                array[i][j]=array[i][j+1];
                array[i][j+1]=tmp;
            }
            System.out.println();
        }
        int [] tmp2;
        for(int i=0; i< array.length-1;i++){
            tmp2=array[i];
            array[i]=array[i+1];
            array[i+1]=tmp2;
        }
    }





}
