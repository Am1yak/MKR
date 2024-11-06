public class SimpleText implements TextEdit {
    private String text;

    @Override
    public void show(){
        System.out.println(text);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
