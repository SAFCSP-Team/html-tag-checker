import java.io.IOException;

public class Main {
    public static  void main(String args[])throws IOException
    {
        HTMLTagChecker x = new HTMLTagChecker();
        x.readFile("src/Correct.html");
        x.readFile("src/Incorrect.html");

 
    }
}
