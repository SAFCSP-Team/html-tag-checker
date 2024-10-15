import java.util.regex.Pattern;


class Tag {
  String name;
  boolean isClosing;
  boolean isSelfClosing;
  String[] att;
  public Tag(String name, boolean isClosing, boolean isSelfClosing) {
      this.name = name;
      this.isClosing = isClosing;
      this.isSelfClosing = isSelfClosing;

  }
  public String toString() {
    return (isClosing ? "</" : "<") ;
}}