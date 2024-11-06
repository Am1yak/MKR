public class InitialsText extends TextEditDecorator{
    public InitialsText(TextEdit textEdit) {
        super(textEdit);
    }

    @Override
    public void show(){
        super.show();
    };

    @Override
    public void setText(String text){
        super.setText(text + " by Artemiy Moroz Olehovych");
    }
}
