public enum CardColour {
    PIROS('P'),
    TOK('T'),
    ZOLD('Z'),
    MAKK('M');

    private final char code;

    CardColour(char code) {
        this.code = code;
    }

    public static CardColour fromCode(char code) {
        for (CardColour c : values()) {
            if (c.code == code) return c;
        }
        throw new IllegalArgumentException("Invalid card color");
    }
}
