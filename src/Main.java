public class Main {
    public static void main(String[] args) {
        SimpleText simpleText = new SimpleText();

        CryptText cryptText = new CryptText(simpleText);
        cryptText.setText("Hello World");
        cryptText.show();

        CompressText compressText = new CompressText(simpleText);
        compressText.setText("      Hello World    ");
        compressText.show();

        TimeText timeText = new TimeText(simpleText);
        timeText.setText("Hello World");
        timeText.show();

        InitialsText initialsText = new InitialsText(simpleText);
        initialsText.setText("Hello World");
        initialsText.show();
    }
}