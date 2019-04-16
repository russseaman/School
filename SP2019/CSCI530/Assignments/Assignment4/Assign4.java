public class Assign4{
    public static void main(String[] args) {
        
        byte    BYTE    = 0;
        int     INT     = 0;
        double  DOUBLE  = 0.0d;
        short   SHORT   = 0;
        long    LONG    = 0L;
        float   FLOAT   = 0.0f;
        char    CHAR    = 0;
        boolean BOOLEAN = false;

       /*---OBJECTS CLASS-- */ 
        String  STRING  = null;

        Coke coke = new Coke("cherry");
        Coke coke2 = new Coke("cherry");

        String result = coke.equals(coke2) ? "EQUAL" : "NOT EQUAL";

        System.out.println(result);


        // BYTE COMPARE
        // BYTE = INT;      ERROR  
        // BYTE = DOUBLE;   ERROR
        // BYTE = SHORT;    ERROR
        // BYTE = LONG;     ERROR
        // BYTE = FLOAT;    ERROR
        // BYTE = CHAR;     ERROR
        // BYTE = BOOLEAN;  ERROR
        // BYTE = STRING;   ERROR
       
        //INT COMPARE
        INT = BYTE;
        // INT = DOUBLE;    ERROR
        INT = SHORT;
        // INT = LONG;      ERROR
        // INT = FLOAT;     ERROR
        INT = CHAR;
        // INT = BOOLEAN;   ERROR
        // INT = STRING;    ERROR

        //DOUBLE COMPARE
        DOUBLE = BYTE;
        DOUBLE = INT;
        DOUBLE = SHORT;
        DOUBLE = LONG;
        DOUBLE = FLOAT;
        DOUBLE = CHAR;
        // DOUBLE = BOOLEAN; ERROR
        // DOUBLE = STRING;  ERROR

        //SHORT COMPARE
        SHORT = BYTE;
        // SHORT = DOUBLE;  ERROR
        // SHORT = INT;     ERROR
        // SHORT = LONG;    ERROR
        // SHORT = FLOAT;   ERROR
        // SHORT = CHAR;    ERROR
        // SHORT = BOOLEAN; ERROR
        // SHORT = STRING;  ERROR

        //LONG COMPARE
        LONG = BYTE;
        // LONG = DOUBLE;   ERROR
        LONG = INT;
        LONG = SHORT;
        // LONG = FLOAT;    ERROR
        LONG = CHAR;
        // LONG = BOOLEAN;  ERROR
        // LONG = STRING;   ERROR

        //FLOAT COMPARE
        FLOAT = BYTE;
        // FLOAT = DOUBLE;  ERROR
        FLOAT = INT;
        FLOAT = SHORT;
        FLOAT = LONG;
        FLOAT = CHAR;
        // FLOAT = BOOLEAN; ERROR
        // FLOAT = STRING;  ERROR

        //CHAR COMPARE
        // CHAR = BYTE;     ERROR
        // CHAR = DOUBLE;   ERROR
        // CHAR = INT;      ERROR
        // CHAR = SHORT;    ERROR
        // CHAR = LONG;     ERROR
        // CHAR = FLOAT;    ERROR
        // CHAR = BOOLEAN;  ERROR
        // CHAR = STRING;   ERROR

        //BOOLEAN COMPARE
        // BOOLEAN = BYTE;  ERROR
        // BOOLEAN = DOUBLE;ERROR
        // BOOLEAN = INT;   ERROR
        // BOOLEAN = SHORT; ERROR
        // BOOLEAN = LONG;  ERROR
        // BOOLEAN = FLOAT; ERROR
        // BOOLEAN = CHAR;  ERROR
        // BOOLEAN = STRING;ERROR
        
        //STRING COMPARE 
        // STRING = BYTE;   ERROR
        // STRING = DOUBLE; ERROR
        // STRING = INT;    ERROR
        // STRING = SHORT;  ERROR
        // STRING = LONG;   ERROR
        // STRING = FLOAT;  ERROR
        // STRING = CHAR;   ERROR
        // STRING = BOOLEAN;ERROR
    }
}
