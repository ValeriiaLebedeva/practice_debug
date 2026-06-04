public class DebugTask4 {
    public static void main(String[] args) {
        try {
            System.out.println(isPalindrome(null));
        } catch (Exception e) {
            System.out.println("Строка равна null!");
        }
    }
    public static boolean isPalindrome(String str) throws Exception {
        if (str == null) throw new Exception("Строка равна null!");
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}