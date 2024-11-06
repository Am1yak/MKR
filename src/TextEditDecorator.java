abstract class TextEditDecorator implements TextEdit{
    protected TextEdit textEdit;

    public TextEditDecorator(TextEdit textEdit){
        this.textEdit = textEdit;
    }

    @Override
    public void show(){
        textEdit.show();
    };

    @Override
    public void setText(String text){
        textEdit.setText(text);
    }
}
