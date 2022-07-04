package com.learning.fundamentalstructure;
 /*
  TODO : Add this in Documentation ->
  Operators
  Strings

 */
public class StringsInJava {
    public static void main(String[] args) {
        String name = "Owais Athar";
        name="DDd";
        StringBuilder username = new StringBuilder("owaisathar");
        int age = 20;
//        System.out.println(name.substring(0,5)); //Substring
//        System.out.println(name.equals("Owais")); // Equality of Strings
//        System.out.println(name.charAt(2));
//        System.out.println(name.codePoints());
//        System.out.println("".isEmpty()); //
//        System.out.println(name.startsWith("Owais"));
//        System.out.println(name.endsWith("Athar"));
//        System.out.println(name.indexOf("s"));
//        System.out.println(String.join("@",username + Integer.toString(age),"gmail.com"));
//        System.out.println();

//        String text_block = """
//                Hello
//                World!
//                """;
//        System.out.println(text_block); // Text Block

//        String prompt = """
//        Hello, my name is Hal.
//        Please enter your name: """;

        String html = """
        <div class="Warning">
            Beware of those who say "Hello" to the world
        </div>""";

        System.out.println(html);
    }
}
