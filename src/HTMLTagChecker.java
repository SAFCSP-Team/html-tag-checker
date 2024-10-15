import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class HTMLTagChecker {
    int k = 0;
    Stack<Tag> stack = new Stack<>();

    public void readFile(String file) {
       
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String c;
         
            while ((c = reader.readLine()) != null) {
               check(c);
            }
         

            if (stack.isEmpty()) {
                System.out.println("The HTML file is correctly nested.");
                
            } else {
                System.out.println("Error: Found mismatched closing tag: ");
            }stack.clear();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   


    private void check(String c) {
        Pattern pattern = Pattern.compile("<(/?)(\\w+)([^>]*)>");
        Matcher matcher = pattern.matcher(c);
        while (matcher.find()) {
            boolean isClosingTag = !matcher.group(1).isEmpty();
            String tagName = matcher.group(2);
            boolean isSelfClosingTag = matcher.group(3).contains("/");
            Tag tag = new Tag(tagName, isClosingTag, isSelfClosingTag);
            tag.att = matcher.group(3).trim().split("\\s+");

            
            

            
             handleTag(tag);
       
             
        }
    }

    private void handleTag(Tag tag) {
        if(tag.isSelfClosing){
            return;
        }

        if (tag.isClosing) {
            if (!stack.isEmpty() && stack.peek().name.equals(tag.name)) {
                stack.pop();}
            // } else{
            //     stack.push(tag);
            // }
        } else {
            stack.push(tag);
      

        }
    }

    
}

