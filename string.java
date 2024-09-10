public class string {
    

    public static void main(String[] args) {
        
        String s1 = "Vishesh" ; 
        String s2 = "Mishra" ; 

        System.err.println(s1.length());
        System.err.println(s2.charAt(3));
        System.out.println(s2.charAt(0));

        String s3 = s1.substring(0, 3) ; 
        boolean IsEqual = s3.equals(s2) ; 
        System.out.println(IsEqual);

        int res = s2.compareTo(s3) ; 
        System.err.println(res);

    }
}
