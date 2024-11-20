public class FindPermutation {
    public static void getPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // after taking the curr char i want to delete this char so i can ignore using
            // substring method and assinging in new str
            String newStr = str.substring(0, i) + str.substring(i + 1); // here char at i will be ignored
            getPermutation(newStr, ans + curr); // all the time these newStr will changed as arg for recurion 
            //this

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        getPermutation(str, "");

    }
}