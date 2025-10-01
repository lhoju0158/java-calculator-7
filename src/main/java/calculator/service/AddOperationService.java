package calculator.service;


import calculator.util.Parser;

public class AddOperationService implements OperationService {

    public void calculate(String input) {
        if (Parser.isValid(input)) {
            throw new IllegalArgumentException(CustomError.INVALID_INPUT.getMessage());
        }
    }


}
