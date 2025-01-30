import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public void operator_detector(String operator)
    {
        switch (operator) {
            case "*":
                break;
            case "+":
                break;
            case "-":
                break;
            case "/":
                break;
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arrayCalcul = new ArrayList<String>();
        String strResult = "";
        String n="0";
        String strOperation="";
        double result=0.0;
        Scanner reader = new Scanner(System.in); // Reading from System.in
        int in=0;
        while (!n.equals("")) { //n.equals car les strings n'utilisent pas == ou !=
            System.out.println("Enter a number: ");
            n = reader.nextLine(); // Scans the next token of the input as an String
            if (!n.equals("")){
                System.out.println("Add number");
                arrayCalcul.add(n);
            } else
            {
                System.out.println("close reader");
                reader.close();
            }
            in++;
        }
        System.out.println("--------------------------------------------");
        for (int i=0;i<arrayCalcul.size();i++){
            System.out.print(arrayCalcul.get(i));
            try {
                //Pour mettre un string en int 
                //Integer.parseInt(string);
                Integer.parseInt(arrayCalcul.get(i));
                strResult+=(arrayCalcul.get(i));
            } catch (NumberFormatException e) {
                // TODO: handle exception
                result=Integer.parseInt(strResult);
                System.err.println("Something went wrong");
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
