import java.io.IOException;

public class Assign3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        // TODO: Make a class to build csv's and insert int to Dirs

        // TODO: Read csv for parse table(State table, GOTO defs)
        // ! DONE
        csvParseReader cpr = new csvParseReader();
        cpr.csvParseRead();

        // TODO: Read file from grammer rules
        // ! DONE
        csvGrammarReader cgr = new csvGrammarReader();
        cgr.csvGrammarRead();

        // TODO: Scanner to read user input
        // ! DONE
        userScanner us = new userScanner();
        // us. string calls and initiates the scanner and build an Array out of the string
        us.goCheck();
        us.splitString();

        // TODO: Check if "GO" conditions are met....otherwise return ERROR.
        // parseDecision
        // parseDecision now initializes the scanner (userScanner)
        // parseDecision pd = new parseDecision();
        // pd.goCheck();

        // TODO: From stream and decision map.....output either accept or error

        // TODO: Output stack trace for debugging!

        // System.out.println(cpr.returnList().get(0).getAction1());
        // cpr.printTable();
        // cgr.printTable();
    }
}