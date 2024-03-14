package QuestionService;

import java.util.Scanner;

import Question.Question;

public class QuestionService {

    Question questions[] = new Question[3];
    String selection[] = new String[3];

    public QuestionService() {
        questions[0] = new Question(
                1,
                "Which of the following is NOT written by Munshi Premchand?",
                "Gaban",
                "Godan",
                "Guide",
                "Manasorovar",
                "Guide");
        questions[1] = new Question(
                2,
                "Who is the father of English Poetry?",
                "Milton",
                "Wordsworth",
                "Chaucer",
                "Charles Dickens",
                "Chaucer");
        questions[2] = new Question(
                3,
                "Who wrote 'War and Peace'?",
                "Leo Tolstoy",
                "Mahatma Gandhi",
                "Kipling",
                "Charles Dickens",
                "Leo Tolstoy");
    }

    public void displayQuestions() {
        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getOpt1());
            System.out.println(questions[i].getOpt2());
            System.out.println(questions[i].getOpt3());
            System.out.println(questions[i].getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
        }
    }

    public void calculateScore(){
        int score = 0;
        for(int i=0;i<questions.length;i++){
        String answerChosen = selection[i];
        String correctAnswer = questions[i].getAnswer();
        if(answerChosen.equals(correctAnswer)){
            score++;
        }
        }
        System.out.println("Score : " + score);
    }
}
