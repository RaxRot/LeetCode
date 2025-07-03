package easy;
//Given a positive integer n, write a function that returns the number of set bits in its binary representation
public class BitsWeight {
    public int hammingWeight(int n) {
        int bitsCount=Integer.bitCount(n);
        return bitsCount;
    }
}
