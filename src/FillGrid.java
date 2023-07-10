public class FillGrid {
    public static void fillGrid(int[] LL, int[] RR, int[][] S){
        int n = S.length;
        int l=0,r=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                S[i][j]=LL[l];
                l++;
            }
            for(int j=n-i-1;j>0;j--){
                S[i][n-j]=RR[r];
                r++;
            }
        }
    }
    public static void main(String[] args){
        int[][] S = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        int[] LL = {1,2,3,4,5,6,7,8,9,10,0,0};
        int[] RR = {11,12,13,14,15,16,17,18,19,20};
        fillGrid(LL,RR,S);
    }
}
