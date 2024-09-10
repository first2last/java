public class string_buffer {
    public static void main(String[] args) {
        
        // Create a StringBuilder object
        StringBuilder s1 = new StringBuilder("hello");
        System.out.println(s1);

        // Convert StringBuilder to String
        String str = s1.toString();  // Convert to String and store in a String variable

        // You can now use str as a String, but s1 remains a StringBuilder
        System.out.println(str);  // Output will be "hello"
    }
}
