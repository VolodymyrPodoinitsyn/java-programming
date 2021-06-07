package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {

    public static void main(String[] args) {

        int score  = 0;

        if (score >= 1 && score <= 40) {
            System.out.println(score + " grade D");
        } else if (score >= 41 && score <= 60) {
            System.out.println(score + " grade B");
        } else if (score >= 61 && score <= 90) {
            System.out.println(score + " grade C");
        } else if (score >= 91 && score <= 100) {
            System.out.println(score + " grade A");
        } else { // else if (score < = 0 || score >= 100 )
            System.out.println(score + " invalid score");
        }
    }

}
