import java.io.IOException;
import java.util.List;
import java.io.FileNotFoundException;

public class Assign3 {
    public static void main(String[] args) throws IOException {
        // System.out.println("Hello, World!");

        // TODO: Read csv for parse table(State table, GOTO defs)
        csvReader cr = new csvReader();
        cr.csvRead();
        cr.printTable();
        // TODO: Read file from grammer rules

        // TODO: Scanner to read user input

        // ? Stream scanner
        // ? IF stream, use functional approach to decision map for input

        // TODO: From stream and decision map.....output either accept or error

        // TODO: Output stack trace for debugging!

    }
}
