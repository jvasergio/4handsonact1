import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        BloodData bd;
        System.out.print("Enter blood type of Patient: ");
        String input1 = scan.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String input2 = scan.nextLine();
        String input= input1 + input2;
        if (input.equals("")){
            bd = new BloodData();
            bd.display();
        }
        else if (input.equals("A+")||input.equals("B+")||input.equals("O+")||input.equals("AB+")||input.equals("A-")||input.equals("B-")||input.equals("O-")||input.equals("AB-")){
            bd = new BloodData(input1,input2);
            bd.display();
        }
        else {
            System.out.print("Invalid input.");
        }
        scan.close();
    }
}