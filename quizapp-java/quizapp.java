import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        String[] questions = {
            "1. What is the capital of France?",
            "2. Who is the author of 'Harry Potter'?",
            "3. What is the output of 3 + 2 * 2?",
            "4. What keyword is used to define a class in Java?",
            "5. Which data type is used to create a variable that should store text?"
        };

        String[][] options = {
            {"a) Paris", "b) Berlin", "c) Rome", "d) Madrid"},
            {"a) J.R.R. Tolkien", "b) J.K. Rowling", "c) Stephen King", "d) Agatha Christie"},
            {"a) 10", "b) 7", "c) 8", "d) 9"},
            {"a) define", "b) class", "c) struct", "d) object"},
            {"a) int", "b) char", "c) String", "d) boolean"}
        };

        char[] answers = {'a', 'b', 'b', 'b', 'c'};

        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Console Quiz!");
        System.out.println("---------------------------------\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (a/b/c/d): ");
            char userAnswer = scanner.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect! The correct answer is: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        scanner.close();
    }
}
