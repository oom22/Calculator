
package calculator;

import java.util.Scanner;

public class Calculator {
    
    

    public static int addition()
    {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        System.out.println("\nResult\n"+ num1+" + "+ num2+" = "+(num1+num2));
        return 0;

    }
    
    public static int subtraction()
    { 

        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        System.out.println("\nResult\n"+ num1+" - "+ num2+" = "+(num1-num2));
        return 0;

    }
    
    public static int multiplication()
    {

        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        System.out.println("\nResult\n"+ num1+" * "+ num2+" = "+(num1*num2));
        return 0;

    }
    
    public static int division()
    {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        System.out.println("\nResult\n"+ num1+" / "+ num2+" = "+(num1/num2));
        return 0;

    }
    
    public static int modulus()
    {
        Scanner sc = new Scanner(System.in);
        double num1, num2,num3;
        System.out.print("Enter first number:");
        num1 = sc.nextDouble();
        System.out.print("Enter second number:");
        num2 = sc.nextDouble();
        System.out.println("\nResult\n"+ num1+" % "+ num2+" = "+(num1%num2));
        return 0;
    }
    
    public static int power()
    {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter Base number:");
        num1 = sc.nextDouble();
        System.out.print("Enter Exponent number:");
        num2 = sc.nextDouble();
        System.out.println("\nResult\n"+ num1+"^"+ num2+" = "+(Math.pow(num1, num2)));
        return 0;
    }
        public static int squreroot()
    {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter a number:");
        num1 = sc.nextDouble();
        System.out.println("\nResult\nSquare of a Given Number = "+(Math.pow(num1, 0.5)));
        return 0;
    }
    
    public static int factorial()
    {
        Scanner sc = new Scanner(System.in);
        int num1,fact=1;
        System.out.print("Enter A Number To Find Factorial: ");
        num1 = sc.nextInt();
        if (num1<0)
        {
            System.out.println("Invalid Number\n");
            return 0;
        }               
        for(int i=1;i<=num1;i++)
            fact *= i;
        System.out.println("\nResult\n"+ num1+"! = "+fact);
        return 0;
    }          
public static int logn()
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Enter The Value Of N: ");
        num1 = sc.nextInt();
        double result = (double)(Math.log(num1) / Math.log(2));
        System.out.println("\nResult\n Log("+ num1+") = "+result);
        return 0;
    }
    public static int Sinx()
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Enter The Value Of X: ");
        num1 = sc.nextInt();
        double num2 = Math.toRadians(num1); 
        double num3 = (Math.sin(num2)); 
        System.out.println("\nResult\n Sin("+ num1+") = "+num3);
        return 0;
    }
public static int Absolute()
    {
        Scanner sc = new Scanner(System.in);
        double num1;
        System.out.print("Enter The Value : ");
        num1 = sc.nextInt();
        System.out.println("\nResult\nAbsolute Value Of "+ num1+" = "+(Math.abs(num1)));
        return 0;
    }
    public static int ArrayAvg()
    {
        System.out.println("How Many Numbers You want To Enter In Array? ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for(int i=0; i<arr.length; i++){
                System.out.print("Enter Element No."+(i+1)+": ");
                arr[i] = sc.nextDouble();
        }
        for(int i=0; i<arr.length; i++){
                total += arr[i];
        }
        double average = total / arr.length;
        System.out.println("\nResult\nAverage Of Given Number In Array :"+average);
        return 0;
    }
        public static void main(String[] args) {
     
    
    
    
    
     int op;
        
     System.out.println("\n-----------------*****Menu*****-----------------");
        System.out.println("1.Addition Of Two Numbers");
        System.out.println("2.Subtraction Of Two Numbers");
        System.out.println("3.Multiplication Of Two Numbers");
        System.out.println("4.Division Of Two Numbers");
        System.out.println("5.Modulus");
        System.out.println("6.Power");
        System.out.println("7.Squre root");
        System.out.println("8.Factorial of a Number");
        System.out.println("9.Log(n)");
        System.out.println("10.Sin(x)");
        System.out.println("11.Absolute value");
        System.out.println("12.Average of given number in array");
        System.out.println("0. Enter 0 to exit");
        System.out.println("-------------%%%%%%%%END%%%%%%%%-------------");
     while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice :");
            op = sc.nextInt();
            switch(op)
            {
                case 1: Calculator.addition();
                          break;
                case 2: Calculator.subtraction();
                          break;
                case 3: Calculator.multiplication();
                          break;
                case 4: Calculator.division();
                          break;
                case 5: Calculator.modulus();
                          break;
                case 6: Calculator.power();
                          break;
                case 7: Calculator.squreroot();
                          break;
                case 8: Calculator.factorial();
                          break;
                case 9: Calculator.logn();
                          break;
                case 10:Calculator.Sinx();
                          break;
                case 11:Calculator.Absolute();
                          break;
                case 12:Calculator.ArrayAvg();
                          break;
                case 0: System.exit(0);
                          break;
                default : System.out.println("Invalid Option");    
            }
        }
        }
}