class GridWays {
    static int gridWays(int i, int j, int n, int m) {
        // base case : when they meet last col and row box i.e n-1,m-1
        if (i == n - 1 && j == m - 1) {
            return 1; // although we reached there exist one way
        } else if (i == n || j == m) {
            return 0; // when it try to go out of boundary
        }
        // kaam : to find ways for right and bottom
        int w1 = gridWays(i, j + 1, n, m);// right way
        int w2 = gridWays(i + 1, j, n, m); // down way
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        // checking for 3*3 matrix way to go last box n-1,m-1
        int res = gridWays(0, 0, n, m); // let's move from starting
        System.out.println("There are " + res + " ways to reach (n-1,m-1) : i.e (" + (n - 1) + "," + (m - 1)+")");
    }
}