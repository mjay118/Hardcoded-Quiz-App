import QuestionService.QuestionService;

public class Main{
    public static void main (String args[]){
        QuestionService qs = new QuestionService();
        System.out.println("hello");
        qs.displayQuestions();
        qs.calculateScore();
    }
}
