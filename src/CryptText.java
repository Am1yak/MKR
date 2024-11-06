public class CryptText extends TextEditDecorator {
    public CryptText(TextEdit textEdit) {
        super(textEdit);
    }

    @Override
    public void show(){
        super.show();
    };

    @Override
    public void setText(String text){
        String cryptedmes = "";
        for(char c : text.toCharArray()){
            cryptedmes += "*";
        };
        super.setText(cryptedmes + " message crypted");
    }
}
