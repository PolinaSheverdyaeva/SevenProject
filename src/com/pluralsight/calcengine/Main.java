package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        double value1 = 100.0d;
//        double value2 = 0.0d;
//        double result = 0.0d;
//        char opCode = 'd';

//        if (opCode == 'a')
//            result = value1 + value2;
//         else if (opCode == 's')
//            result = value1 - value2;
//         else if (opCode == 'm')
//            result = value1 * value2;
//         else if (opCode == 'd') {
//            if (value2 != 0)
//                result = value1 / value2;
//        }
//            else {
//            System.out.println("Invalid opCode: " + opCode);
//            result = 0.0d;
//        }
//        System.out.println(result);

        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCode = {'d', 'a', 's', 'm'};
        double[] results = new double[opCode.length];

        if (args.length == 0) {
            for (int i = 0; i < opCode.length; i++) {
                results[i] = execute(opCode[i], leftVals[i], rightVals[i]);
            }


            for (double currentResult : results) {
                System.out.println(currentResult);
            }
        } else if(args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide an operation code and 2 numeric values");


    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);


    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
//                if (value2 != 0)
//                    result = value1 / value2;
                //result = value2 != 0 ? value1 / value2 : 0.0d;
                result = leftVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }
}
