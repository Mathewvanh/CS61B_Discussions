public class Rotate {
    public static int[]rotate(int[] A,int k){
        int[] result = new int[A.length];
        for(int i=0;i<A.length;i++){
            result[(i+k)%A.length]=A[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] A = new int[8];
        for(int i=0;i<=7;i++){
            A[i]=i;
        }
        int k=12;
        int[] result = rotate(A,k);
        for(int i=0;i<8;i++){
            System.out.println(result[i]+" ");
        }
        System.out.println("\n");
    }
}
