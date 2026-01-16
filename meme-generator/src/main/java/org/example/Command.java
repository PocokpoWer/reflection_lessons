package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface Command<T> {
    T execute() throws IOException, InterruptedException;
}