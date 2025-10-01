package calculator.service;

public enum CustomError {

    INVALID_INPUT("유효하지 않은 입력입니다.");

    private final String message;

    CustomError(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

}