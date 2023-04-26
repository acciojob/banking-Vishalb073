package com.driver;

public class AccountNumberCannotBeGeneratedException extends Throwable {
    public AccountNumberCannotBeGeneratedException(String msg) {
        super(msg);
    }
}
