package InstructionSet;
/*moved to package*/
import java.util.Scanner;

public class InstructionSet_Broken {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opCode = input.nextLine();
        long result = 0;
        while (!opCode.equals("END")) {
            String[] codeArgs = opCode.split("\\s+");


            switch (codeArgs[0]) {
                case "INC": {
                	/*change to long*/
                    long operandOne = Integer.parseInt(codeArgs[1]);
                    /* ++ must be before operandOne*/
                    result = ++operandOne;
                    break;
                }
                case "DEC": {
                	/*change to long*/
                    long operandOne = Integer.parseInt(codeArgs[1]);
                    /* -- must be before operandOne*/
                    result = --operandOne;
                    break;
                }
                case "ADD": {
                	/*change to long*/
                    long operandOne  = Integer.parseInt(codeArgs[1]);
                    long operandTwo = Integer.parseInt(codeArgs[2]);
                    result = operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                    long operandOne  = Integer.parseInt(codeArgs[1]);
                    long operandTwo = Integer.parseInt(codeArgs[2]);
                    /*add explicit to both*/
                    result = operandOne * operandTwo;
                    break;
                }
                default:
                    break;

            }
            System.out.println(result);
            /* add new line read*/
            opCode = input.nextLine();

        }
    }            
}
