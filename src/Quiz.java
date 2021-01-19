import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    Scanner sc = new Scanner(System.in);
    ArrayList<Question> questions = new ArrayList<>();
    public Quiz() {

    }
    public void addQuestion() {
        System.out.print("Input question");
        String question = sc.nextLine();
        System.out.print("How many answer in this question:");
        int numberofAnswer = Integer.parseInt(sc.nextLine());
        ArrayList<String> answers = new ArrayList<>();
        for (int i = 0; i < numberofAnswer; i++) {
            System.out.println("Enter answer" + i + ":");
            String answer = sc.nextLine();
            answers.add(answer);
        }
        System.out.println("Index of answer that correct:");
        int correct = Integer.parseInt(sc.nextLine());
        Question aquestion = new Question(answers, question);
        questions.add(aquestion);
    }

    public void displayQuestion() {
        System.out.println("List Question");
        int i = 0;
        for (Question q : questions) {
            System.out.println("index = " + i +"\t"+ q.getQuestion()+"\t"+ q.getAnswer());
        }
        if (questions.isEmpty()) {
            System.out.println("There isn't any questions");
        }
    }

    public void updateQuestionAndAnswerByIndex() {
        displayQuestion();
        System.out.println("Enter index:");
        int index = Integer.parseInt(sc.nextLine());
        Question questionUpdate = findByIndex(index);
        if (questionUpdate != null) {
            System.out.println("New update question");
            System.out.print("Enter question:");
            String question = sc.nextLine();
            System.out.print("Please input how many answer in this question:");
            int numberofAnswer = Integer.parseInt(sc.nextLine());
            ArrayList<String> answers = new ArrayList<>();
            for (int i = 0; i < numberofAnswer; i++) {
                System.out.println("Enter answer" + i + ":");
                String answer = sc.nextLine();
                answers.add(answer);
            }
            System.out.println("Index of answer that correct:");
            int correct = Integer.parseInt(sc.nextLine());
            questionUpdate.setAnswer(answers);
            questionUpdate.setQuestion(question);
        } else {
            System.out.println("There is no that question at " + index);
        }
    }
    public void deleteQuestionAndAnswer() {
        displayQuestion();
        System.out.println("Enter index to delete:");
        int index = Integer.parseInt(sc.nextLine());
        Question q = findByIndex(index);
        if (q != null) {
            System.out.println("The question at index " + index + " is deleted");
            questions.remove(q);
        } else {
            System.out.println("there is no index at" + index);
        }
    }

    public Question findByIndex(int i) {
        int p = 0;
        for (Question q : questions) {
            if (i == p) {
                return q;
            }
        }
        return null;
    }
    public void readMenu() {
        System.out.println("-------------Quiz System--------------");
        System.out.println("1. Add question and answer");
        System.out.println("2. Update question and answers");
        System.out.println("3. Delete question and answers");
        System.out.println("4. Answer the quiz");
        System.out.println("5. Quit");
    }
    public static void main(String[] args) {
        int opt;
        Quiz quiz = new Quiz();
        Scanner sc = new Scanner(System.in);
        while (true) {
            quiz.readMenu();
            System.out.print("Input your option: ");
            opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 1:
                    quiz.addQuestion();
                    break;
                case 2:
                    quiz.updateQuestionAndAnswerByIndex();
                    break;
                case 3:
                    quiz.deleteQuestionAndAnswer();
                    break;
                 default:
                     System.out.println("Exit the program");
                     System.exit(0);
            }
        }
    }
}

class Question {
    String question;
    int correct;
    ArrayList<String> answers = new ArrayList<>();

    public Question() {

    }
    public void setQuestion(String s) {
        this.question = s;
    }
    public void setAnswer(ArrayList<String> answer) {
        this.answers = answer;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getAnswer() {
        return answers;
    }

    public Question(ArrayList<String> answer, String question) {
        if (answer.size() >= 2 && answer.size() <= 4) {
            this.answers = answer;
        } else {
            System.out.println("exceed range amount (2-4)");
            this.answers = null;
        }
        this.question = question;
    }

}
