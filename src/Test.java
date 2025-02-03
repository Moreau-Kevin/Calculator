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
        int in=0;
        arrayCalcul.add("4");
        arrayCalcul.add("+");
        arrayCalcul.add("2");
        arrayCalcul.add("-");
        arrayCalcul.add("6");
        arrayCalcul.add("");
        /*

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
            in++;
        }

        */
        System.out.println("--------------------------------------------");
        for (int i=0;i<arrayCalcul.size();i++){
            try {
                //Pour mettre un string en int 
                //Integer.parseInt(string);
                Integer.parseInt(arrayCalcul.get(i));
                strResult+=(arrayCalcul.get(i));
            } catch (NumberFormatException e) {
                // TODO: handle exception
                if (strOperation=="")
                {
                    a=Integer.parseInt(strResult);
                    strResult="";
                    strOperation=arrayCalcul.get(i);
                }
                else if (i==((arrayCalcul.size())-1)){
                    strOperation=arrayCalcul.get(i);
                    b=Integer.parseInt(strResult);
                    strResult="";
                    result+=operator_detector(strOperation,a,b);
                    a=result;
                }
                else
                {
                    strOperation=arrayCalcul.get(i);
                    b=Integer.parseInt(strResult);
                    strResult="";
                    result+=operator_detector(strOperation,a,b);
                    a=result;
                }
            }
        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("-------------------------");
        // Once finished
        System.out.println(result);
        System.out.println(strOperation);
        
    }
}
