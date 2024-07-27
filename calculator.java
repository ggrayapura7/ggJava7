import java.util.Scanner;
public class calculator
{
    public static void main(String args[])
    {
        String operator;
        int num1,num2,result;
        Scanner myObj = new Scanner (System.in);
        System.out.println("choose an operator:");
        operator = myObj.next();
        System.out.println("Enter first number");
        num1 = myObj.nextInt();
        System.out.println("Enter second number");
        num2 = myObj.nextInt();
        switch(operator)
        {
            case "+": 
            result = num1 + num2 ;
             System.out.println(result);
            break;
            case "-":
            result = num1 - num2 ;
             System.out.println(result);
            break;
            case "*":
            result = num1 * num2 ;
             System.out.println(result);
            break;
            case "/":
            result = num1 / num2 ;
             System.out.println(result);
            break;
            default:
            System.out.println("Invalid operator");
        }
        myObj.close();
    }

}
