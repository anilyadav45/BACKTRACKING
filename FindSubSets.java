public class FindSubSets {
    // function to find subsets
    public static void findSubSets(String str, String ans, int i) {
        // baseCase:
        // below stuff will printed before start backtracking
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Recursiions
        // Yes - if character will add
        findSubSets(str, ans + str.charAt(i), i + 1);
        // No - if character won't be add but it iterate for another char
        findSubSets(str, ans, i + 1);
    }

    public static void main(String[] args) {
      String str = "ababc";
      findSubSets(str, "", 0);
    }
}