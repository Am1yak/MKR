import java.time.LocalDateTime;

public class TimeText extends TextEditDecorator{
    public TimeText(TextEdit textEdit) {
        super(textEdit);
    }

    @Override
    public void show(){
        super.show();
    };

    @Override
    public void setText(String text){
        super.setText(text + " at " + LocalDateTime.now().toString());
    }
}
