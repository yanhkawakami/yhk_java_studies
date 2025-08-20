// Expressions: An expressions computes to a single value
// Statement: Standalone units of work
// Code Blocks: Set of zero, one, or more statements, usually grouped together in some way to achieve a single goal

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double kilometers = (100 * 1.6099344); // Entire line is a statement, meanwhile from kilometer until semicolon is an expression

        int highScore = 50; // // Entire line is a statement, meanwhile from highScore until semicolon is an expression

        if (highScore > 25){ // if keyword is a Statement
            highScore = 1000 + highScore;
        } // {} signs that we are talking about a Code Block

        int health = 100;

        if ((health < 25) && (highScore > 1000)){
            highScore = highScore - 1000;
        }
    }
}