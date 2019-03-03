import java.io.IOException;

public class Assign3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        // TODO: Read csv for parse table(State table, GOTO defs)
        // ! DONE
        csvParseReader cpr = new csvParseReader();
        cpr.csvParseRead();

        // TODO: Read file from grammer rules
        // ! DONE
        // csvGrammarReader cgr = new csvGrammarReader();
        // cgr.csvGrammarRead();

        // TODO: Scanner to read user input
        // ! DONE
        userScanner us = new userScanner();
        // us. string calls and initiates the scanner and build an Array out of the string
        // will check if "go conditions are met, return string if pass, if fail, will give reason why"
        us.goCheck();



        // TODO: Output stack trace for debugging!


    }
}