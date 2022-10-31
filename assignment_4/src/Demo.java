import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ColorStore demo = new ColorStore();
        int choice,red,blue,green;
        Scanner sc = new Scanner(System.in);

        while (true){
            choice = minu();
            if(choice == 1){
                System.out.print("Enter red :");
                red = sc.nextInt();
                System.out.print("Enter green :");
                green = sc.nextInt();
                System.out.print("Enter blue :");
                blue = sc.nextInt();
                demo.addColor(red,green, blue);
            }
            else if (choice == 2) {
                System.out.print("Enter red :");
                red = sc.nextInt();
                System.out.print("Enter green :");
                green = sc.nextInt();
                System.out.print("Enter blue :");
                blue = sc.nextInt();
                String result = demo.getColorName(red,green,blue);
                System.out.println(result);
            }
            else if (choice == 3) {
                break;
            }
            else {
                System.out.println("Wrong input..");
            }
        }

    }
    static int minu(){
        System.out.println("Enter 1 to add color.");
        System.out.println("Enter 2 to get color name.");
        System.out.println("Enter 3 to exit.");
        System.out.print("Your choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
}
