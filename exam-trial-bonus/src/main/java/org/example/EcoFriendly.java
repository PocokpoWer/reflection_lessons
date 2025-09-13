package org.example;

public interface EcoFriendly {
    boolean isEcoFriendly();

    default String ecoFriendlyLabel() {
        return isEcoFriendly() ? "true" : "false";
    }
}
