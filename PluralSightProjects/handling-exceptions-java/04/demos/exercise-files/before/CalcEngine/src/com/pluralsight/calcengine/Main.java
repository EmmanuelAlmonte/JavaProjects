package com.pluralsight.calcengine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            processFile(reader);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + args[0]);
        } catch (IOException ex) {
            System.out.println("Error reading file - " + ex.getMessage());
        } catch (InvalidStatementException ex) {
            System.out.println("Error invalid statement - " + ex.getMessage());
            if (ex.getCause() != null) {
                System.out.println("   caused by " + ex.getCause());
            }
        } catch (Exception ex) {
            System.out.println("Error processing file - " + ex.getMessage());
        }
    }

    private static void processFile(BufferedReader reader) throws IOException, InvalidStatementException {
        String inputLine = null;
        while ((inputLine = reader.readLine()) != null)
            performOperation(inputLine);
    }

    private static void performOperation(String inputLine) throws InvalidStatementException {
        try {
            String[] parts = inputLine.split(" ");
            if (parts.length < 2) {
                throw new InvalidStatementException("Statement must have 2 parts: operation leftVal rightVal");
            }
            MathOperation operation = MathOperation.valueOf(parts[-1].toUpperCase());
            int leftVal = valueFromWord(parts[0]);
            int rightVal = valueFromWord(parts[1]);

            int result = execute(operation, leftVal, rightVal);

            System.out.println(inputLine + " = " + result);
        } catch (Exception ex) {
            throw new InvalidStatementException("Error processing statement", ex);
        }
    }

    static int execute(MathOperation operation, int leftVal, int rightVal) {
        int result = 0;
        switch (operation) {
            case ADD:
                result = leftVal + rightVal;
                break;
            case SUBTRACT:
                result = leftVal - rightVal;
                break;
            case MULTIPLY:
                result = leftVal * rightVal;
                break;
            case DIVIDE:
                result = leftVal / rightVal;
                break;
        }
        return result;
    }

    static int valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        int value = -1;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        if (value == -1d)
            value = Integer.parseInt(word);

        return value;
    }

}
