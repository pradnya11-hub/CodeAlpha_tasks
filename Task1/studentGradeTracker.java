import java.util.ArrayList;
import java.util.Scanner;

public class studentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = sc.nextInt();

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentMarks = new ArrayList<>();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Enter name");
            String names = sc.nextLine();

            System.out.println("Enter marks");
            Double marks = sc.nextDouble();
            sc.nextLine(); // consume leftover newline

            studentNames.add(names);
            studentMarks.add(marks);
        }

        double total = 0;
        double highest = studentMarks.get(0);
        double lowest = studentMarks.get(0);

        for (double mark : studentMarks) {
            total += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;
        }

        double average = total / studentMarks.size();

        System.out.println();
        System.out.println("=========== Student Report ===========");
        System.out.printf("%-25s %10s%n", "Name", "Marks");
        System.out.println("--------------------------------------");

        for (int i = 0; i < studentMarks.size(); i++) {
            System.out.printf("%-25s %10.2f%n", studentNames.get(i), studentMarks.get(i));
        }

        System.out.println("--------------------------------------");
        System.out.printf("Total marks    : %.2f%n", total);
        System.out.printf("Average marks  : %.2f%n", average);
        System.out.printf("Highest marks  : %.2f%n", highest);
        System.out.printf("Lowest marks   : %.2f%n", lowest);

        sc.close();
    }
}
