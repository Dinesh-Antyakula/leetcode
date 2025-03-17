class Solution {
    public int arrangeCoins(int n) {
        int row=0;
        int rc=n;
        while(rc>row){
            row++;
            rc-=row;

        }
        return row;
    }
}