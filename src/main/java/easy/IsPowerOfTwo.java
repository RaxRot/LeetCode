package easy;
//Given an integer n, return true if it is a power of two. Otherwise, return false.
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        int bitCount=Integer.bitCount(n);
        return bitCount == 1;
    }
}
