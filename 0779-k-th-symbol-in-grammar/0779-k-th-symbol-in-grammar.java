class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) 
            return 0;
        int size = 1 << (n - 2);
        if (k <= size) 
            return kthGrammar(n - 1, k);
        else 
            return 1 -kthGrammar(n - 1, k - size);
    }
}
//table n rows
//0 with 01 and 1 with 10
//Input : n = 1 , k = 1;
//Output  : 0;

