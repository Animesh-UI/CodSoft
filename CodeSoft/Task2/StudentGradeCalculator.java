import java.util.Scanner;

public class StudentGradeCalculator 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hi,Enter the Number of Subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++)
        {
            System.out.print("Enter marks obtained in each Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        System.out.println("You have your result Here:");
        System.out.println("Your Total Marks: " + totalMarks);
        System.out.println("Percentage Obtained: " + averagePercentage + "%");

        String grade = calculateGrade(averagePercentage);
        System.out.println("Grade Secured: " + grade);
        

        sc.close();
    }

    public static String calculateGrade(double percentage)
    {
        if (percentage >= 90) 
        {
            return "A+ (Great well done!!) ";
        }
        else if (percentage >= 80)
        {
            return "A (Well done!!) ";
        }
        else if (percentage >= 70)
        {
            return "B (Nice Score!!) ";
        }
        else if (percentage >= 60)
        {
            return "C (Good !! keep it high for further)";
        } 
        else if (percentage >= 50) 
        {
            return "D (Passed !! can be improved)";
        } 
        else 
        {
            return "F";
        }
    }
}
