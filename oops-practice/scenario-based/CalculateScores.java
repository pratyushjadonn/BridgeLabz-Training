package scenario.based;

public class CalculateScores {
    static String[] correctAnswers={"A","B","C","D","A","C","B","D","A","B"};
    static String[] studentAnswers={"A","b","C","a","A","C","D","D","A","B"};

    public static int calculateScore(String[] c,String[] s){
        int score=0;
        for(int i=0;i<c.length;i++){
            if(c[i].equalsIgnoreCase(s[i])){
                score++;
            }
        }
        return score;
    }

    public static void feedback(String[] c,String[] s){
        for(int i=0;i<c.length;i++){
            if(c[i].equalsIgnoreCase(s[i])){
                System.out.println("Question "+(i+1)+": Correct");
            }else{
                System.out.println("Question "+(i+1)+": Incorrect");
            }
        }
    }

    public static void main(String[] args){
        feedback(correctAnswers,studentAnswers);
        int score=calculateScore(correctAnswers,studentAnswers);
        int total=correctAnswers.length;
        double percent=(score*100.0)/total;
        System.out.println("Score: "+score+"/"+total);
        System.out.println("Percentage: "+percent+"%");
        if(percent>=40){
            System.out.println("Result: Pass");
        }else{
            System.out.println("Result: Fail");
        }
    }
}