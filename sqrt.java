public class sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1, right = x, ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        sqrt solution = new sqrt();
        int x1 = 4;
        int x2 = 8;
        int x3 = 25;

        System.out.println(solution.mySqrt(x1));
        System.out.println(solution.mySqrt(x2));
        System.out.println(solution.mySqrt(x3));
    }
}