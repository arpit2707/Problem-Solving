class ReverseInteger {
    public int reverse(int x) {
        int temp = x;
        String s = x + "";
        long r = 0;
        while (x != 0) {
            long digit = x % 10;
            r = r * 10 + digit;
            x = x / 10;
            if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) (r);
    }
}