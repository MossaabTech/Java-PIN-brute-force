import java.util.Scanner;

public class PINCracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the hash of the target PIN: ");
        String target = input.nextLine();

        boolean found = false;
        String password = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            password = String.format("%04d", i);
            

            if (password.equals(target)) {
                found = true;
                break;
            }
        }

        if (found) {
            long end = System.currentTimeMillis();
            System.out.println("The PIN is: " + password);
            System.out.println("execution time : " + (end-start));
        } else {
            System.out.println("Password not found.");
            
        }
    }

    
}
