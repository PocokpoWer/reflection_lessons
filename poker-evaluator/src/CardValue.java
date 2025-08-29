public enum CardValue {
    HETES("7"),
    NYOLCAS("8"),
    KILENCES("9"),
    TIZES("10"),
    ALSO("A"),
    FELSO("F"),
    KIRALY("K"),
    ASZ("ASZ");
    private final String code;

    CardValue(String code) {
        this.code = code;
    }

    public static CardValue fromCode(String code) {
        for (CardValue v : values()) {
            if (v.code.equals(code)) return v;
        }
        throw new IllegalArgumentException("Invalid card value");
    }
}
