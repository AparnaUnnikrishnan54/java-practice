import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // questions
        String[] questions = {
                "Which keyword is used to create an object in Java?",
                "Which data type is used to store whole numbers?",
                "What is the first index of an array?",
                "Which property is used to find the size of an array?",
                "Which loop is used to access every element of an array?"
        };
        // options
        String[][] options = {
                { "A. class", "B. new", "C. object", "D. create" },
                { "A. double", "B. String", "C. int", "D. boolean" },
                { "A. 0", "B. 1", "C. -1", "D. 2" },
                { "A. size()", "B. length()", "C. length", "D. count" },
                { "A. for-each", "B. switch", "C. if", "D. try-catch" }
        };
        // answers
        String[] answers = { "B", "C", "A", "C", "A" };

        int score=0;
        String guess;

        //display questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n"+(i+1)+". "+questions[i]);

            //display options for each question
            for (String option : options[i]) {
                System.out.println(option);
            }

            //get user's guess
            System.out.print("\nEnter your guess: ");
            guess=scanner.nextLine();


            //check answer
            if(guess.equalsIgnoreCase(answers[i])){
                System.out.println("CORRECT ANSWER!!");
                score++;
            }
            else{
                System.out.println("WRONG ANSWER!!");
            }

        }
        // Display final score
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Total Score (out of 5) :"+score);

        scanner.close();
    }
}
