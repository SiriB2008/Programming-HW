import java.util.Random;

class GradeCalculator {
    public static void main(String[] args) {
        
    
        //For loop to run through every index of the list to then test the if statement
    for (int i=0; i<5; i++) {
        //create the random number
        Random randomNum = new Random();
        int showMe = randomNum.nextInt(100);
        //Define variables used in the if statement
        System.out.println(showMe);
        String grade = "";
        int score = showMe;

        //If statement for each number grade and its letter grade
        if (score >=90) {
            grade = "A";
        } else if (score >=80){
            grade = "B";
        } else if (score >=70){
            grade = "C";
        } else if (score >=60){
            grade = "D";
        } else {
            grade = "F";
        }

        //output Score and letter Grade
        System.out.println("Your Score is " + score + " and your letter grade is " + grade);
    }

    }
}
