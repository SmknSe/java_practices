package practice21_22;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        System.out.println("new text");
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("open text");
        return new TextDocument();
    }
}
