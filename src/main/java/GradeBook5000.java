import java.util.Random;
public class GradeBook5000 {
    public static void main(String[] args) {
        Random rand = new Random();
        int grade = rand.nextInt(100);
        System.out.println("Random grade is: " + grade);
        if (grade >= 90) {
            System.out.println("You got a A");
        }
        else if (grade >= 80 && grade <= 89) {
            System.out.println("You got a B");
        }
        else if (grade >= 70 && grade <= 79) {
            System.out.println("You got a C");
        }
        else if (grade >= 60 && grade <= 69 ) {
            System.out.println("You got a D");
        }
        else if(grade < 60){
            System.out.println("You Failed");
        }
    }
}