import java.util.Scanner;

public class Main{
  static int sum(int a,int b){
  return a + b;
}
  
  public static void main(String[] args){
     
     System.out.println("Hello world ") ;
    /* multiline comments
    variables are used to stores values
     like int char float int string
      boolean
      syntax - <datatype> <variable name>
       =  <value> ; */
       
      /* String name = "Komal";
       System.out.println(name);
       int a = 56 , x = 34, y = 34;
        /* declaring more variable in single line */
      /* float b = 43.35f ;
       boolean isadult = false ;
       System.out.println(y);
       System.out.println(b);
       System.out.println(isadult) ; */
       
       /* rules for declaring variable in java
       1.can contain alphabets numbers 
       underscores doller signs
       2.should starts with alphabets
        underscores or $
        3 can not contain reserved keywords
        4 should not contain whitespaces
        5 java is case sensitive that means 
        komal and Komal are not equal
        */
        
        /* data types
        1. primitive - byte , short, char
           float, double, string , boolean
           int
        2. non  primitive  */
        
        /* operators in java
        1. arithmetic operators
        2. logical operators
        3. comparison operator 
        4. assignment operator */
        
       /* int num1 = 35, num2 = 56;
        System.out.println
        (" The value of num1 + num2" +" " +(  num1+ num2));
        
        System.out.println(" The value of num1 - num2" + " "+ ( num1 - num2));
        
        System.out.println(" The value of num1 * num2" + " "+ ( num1 * num2));
        
        System.out.println(" The value of num1 / num2"+ " " + ( num1 / num2 ));
        
        System.out.println(" The value of num1 % num2" + " " + ( num1 % num2));
        
        //increment and decrement opertors
        // post increment and decrement
        System.out.println(num1 ++);
        
        System.out.println(num1 --);
        
        // pre increment and decrement
        System.out.println(++num1);
        System.out.println(--num1 ); */
        
        /* comparison operators
        = = ,<,>,<=,>=,!= */
        
        /* logical operators
         1 && - returns true when all are true
         2 || - returns true when any are true
         3 ! = returns true of false and false of true
          */ 
        
        
        // taking input in java 
         //Scanner scan = new Scanner(System.in);
         /*System.out.println("enter your input ");
         String input = scan.nextLine() ;
         System.out.println(input);
         
         int out = scan.nextInt();
         System.out.println(out); */
         
         /*// String methods
         
         String name = "Komal" ;
         String college_name = "JMSIT" ;
         
         System.out.println(name + " from " + college_name);
         
         System.out.println(name.length()) ;
         System.out.println(name.toUpperCase()) ;
         System.out.println(name.toLowerCase()) ;
         System.out.println(name.contains("fak")) ;
         System.out.println(name.charAt(2));
         System.out.println(name.endsWith("mal")) ;
         System.out.println(name.indexOf("a")) ; */
         
         // math functions
         /*
         int num1 = 5,num2 = 7;
         System.out.println(Math.max(num1,num2));
         System.out.println(Math.min(num1,num2));
         System.out.println(Math.sqrt(64));
         System.out.println(Math.random()); // generate no between 0 and 1 not 1 
         System.out.println(4 + (8-4 )*Math.random()); // generate number between 4 and 8
         */
         
         // if else conditionals
         /*
         Scanner sc = new Scanner(System.in);
         int age = sc.nextInt();
         
         if (age > 55) {
           System.out.println("you are elder");
         }
         else if (age > 20) {
           System.out.println("you  are not a kid ");
         }
         else{
           System.out.println("you are a kid ") ;
         }
         
         
         switch(age){
           case 35 : System.out.println("you are 35 years old");
                     break ;
           case 56 : System.out.println("You are 56 years old");
                     break ;
            default : System.out.println("you are not in cases");
                      break;
           
         }
         
         */
         
         /*
         Scanner sc = new Scanner(System.in);
         System.out.println("enter week day");
         String  day = sc.nextLine();
         
         switch(day) {
           case "Monday" : System.out.println(" start of week");
                           break ;
           case "Thursday" : System.out.println("Mid week");
                              break;
           case "Friday" : System.out.println("weekend is coming");
                           break ;
           default : System.out.println("week days");
         }
         
        */
        
        // loops - while loops
        /*
        
        int i = 1;
        while(i<11){
          System.out.println("5 X " + i + " = " + 5*i);
          i ++ ;
        }
        
        // do while loops - it will run loop body atatements atleast once 
       
        int j = 0;
        do{
          System.out.println(j);
          j += 2;
        } while( j < 11);
        
        
        // for loops
        
        for ( int k = 0; k<11; k ++){
          if(k == 5 ){
            break ;
          }
          System.out.println(k);
          
        } 
        
        for ( int k = 0; k<11; k ++){
          if(k == 5 ){
            continue ;
          }
          System.out.println(k);
          
        } */
        
        // java arrays
        /*
        int [] marks  = {34,66,29,8};
        System.out.println(marks[1]);
        // arrays value can be updated
        marks[1] = 3 ;
        System.out.println(marks[1]) ;
        
        
        // classical way to iterate a loop
        for ( int i = 0; i < marks.length ; i ++){
          System.out.println(marks[i]) ;
        } 
        
        int [][] matrix = {{1,2,3},{2,4,5}};
        System.out.println(matrix[0][2]);
        
        Sfor ( int k = 0; k<11; k ++){
          if(k == 5 ){
            break ;
          }
          System.out.println(k);
          
        }
        String[] cars  = {"Maruti","Suzuki","tata","farari"};
        for (int i = 0; i< cars.length; i ++) {
          System.out.println(cars[i]);
        }
        */
        
        //try amd catch
        
        
         String[] cars  = {"Maruti","Suzuki","tata","farari"};
         try {
            System.out.println(cars[5]);
         }
         catch ( Exception e){
           System.out.println(e) ;
         }
         
         System.out.println(" masoom");
         System.out.println(sum(5,6));
       
       float num_1,num_2 ;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter first number ");
       num_1 = sc.nextFloat();
       
       System.out.println("Enter second number");
       num_2 = sc.nextFloat();
       String prompt = "enter 0 for addition , 1 for subtraction, " +
                      "  2 for multiplication,3 for division";
       System.out.println(prompt);
       
       int input = sc.nextInt();
       switch(input){
         case 0 : System.out.println("Adding these numbers");
                  System.out.print("the result is ");
                  System.out.println(num_1+ num_2);
                  break;
         case 1 : System.out.println("subtracting these numbers");
                  System.out.print("the result is ");
                  System.out.println(num_1 - num_2);
                  break;   
         case 2: System.out.println("Multiplying these numbers");
                  System.out.print("the result is ");
                  System.out.println(num_1 * num_2); 
                  break;
         case 3 : System.out.println("Dividing these numbers");
                  System.out.print("the result is   ");
                  System.out.println(num_1 / num_2); 
                  break;   
       }
       
       
  }
}
