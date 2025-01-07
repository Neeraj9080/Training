import java.util.Scanner;
 class Calculator
 {
   public static void main(String args[])
   {
      System.out.println("Welcome to Calculator");
      Scanner input = new Scanner(System.in);
      int num1,num2;
      System.out.println("Enter First Number");
      num1 = input.nextInt();
      System.out.println("Enter Second Number");
      num2 = input.nextInt();
      
     System.out.println("Choose Operation");
     System.out.println("1.Addition : \n2.Subtraction : \n3.Multiplication : \n4.Division: \n5.Exit");
     int num3;
     num3 = input.nextInt();
     int result;
     
     switch(num3)
     {
          case 1:
          {
               result = num1 + num2;
               System.out.println(result);
               break;
           }
           default:
           {
            System.out.println("Please Enter valid input");
           }
     }

   }
}

