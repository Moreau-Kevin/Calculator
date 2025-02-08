package main;
import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public static double operator_detector(String operator, double a, double b)
    {
        double result=0.0;
        switch (operator) {
            case "*":
                result=a*b;
                break;
            case "+":
            result=a+b;
                break;
            case "-":
            result=a-b;
                break;
            case "/":
            result=a/b;
                break;
            case "^":
            if (b>0)
            {
                result=a;
                for (int i =1; i<b; i++)
                {
                    result*=a;
                }
            }
            else if (b==0)
            {
                result=1;
            }
            else
            {
                result=a;
                b*=-1;
                for (int i =1; i<b; i++)
                {
                    result*=a;
                }
                result=1/result;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> arrayCalcul = new ArrayList<String>();
        String strResult = "";
        String n="0";
        String strOperation="";
        double result=0.0;
        double a=0.0;
        double b=0.0;
        Scanner reader = new Scanner(System.in); // Reading from System.in
        

        while (!n.equals("")) { //n.equals car les strings n'utilisent pas == ou !=
            System.out.println("Enter a number: ");
            n = reader.nextLine(); // Scans the next token of the input as an String
            if (!n.equals("")){
                System.out.println("Add number");
                arrayCalcul.add(n);
            } else
            {
                System.out.println("close reader");
                arrayCalcul.add("");
                reader.close();
            }
        }

        
        System.out.println("--------------------------------------------");
        for (String i : arrayCalcul)
        {
            try {
                //Pour mettre un string en int 
                //Integer.parseInt(string);
                Integer.parseInt(i);
                strResult+=i;
            } catch (NumberFormatException e) 
            {
                if (strOperation.equals(""))
                {
                    a=Integer.parseInt(strResult);
                    strResult="";
                    strOperation=i;
                }
                else if (i.equals(""))
                {
                    b=Integer.parseInt(strResult);
                    strResult="";
                    result=operator_detector(strOperation,a,b);
                    a=result;
                }
                else
                {
                    if (!strOperation.equals(""))
                    {
                        b=Integer.parseInt(strResult);
                        strResult="";
                        result=operator_detector(strOperation,a,b);
                        strOperation=i;
                        a=result;
                    }
                }             
            }
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("-------------------------");
        // Once finished
        System.out.println(result);
        
    }
}
