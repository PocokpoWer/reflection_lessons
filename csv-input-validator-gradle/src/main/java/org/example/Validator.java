package org.example;

public interface Validator<T> {
    boolean isValid(T input);
}
