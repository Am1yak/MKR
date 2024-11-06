public class CompressText extends TextEditDecorator{
    public CompressText(TextEdit textEdit) {
        super(textEdit);
    }

    @Override
    public void show(){
        super.show();
    };

    @Override
    public void setText(String text){
        super.setText(text.strip());
    }
}
