import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        int exam1, exam2, exam3;
        double examAvg, hwAvg, finalExam, courseAvg;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your 3 test scores, separated by spaces.");
        exam1 = keyboard.nextInt();
        exam2 = keyboard.nextInt();
        exam3 = keyboard.nextInt();
        System.out.println("What's uyour name?");
        String name = keyboard.next();
        examAvg = (exam1 + exam2 + exam3) / 3.0; // Why 3.0 instead of 3?
        System.out.printf("Hi %s, your exam average is %.1f%n", name, examAvg);
    }
}
