给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。 
public class Solution {
    public int[] multiply(int[] A) {
        if (A.length<=0){
            return A;
        }
        int sum = 1;
        for (int i = 0;i<A.length;i++){
            sum *=A[i];
        }
        if (sum==0){
            sum=1;
            int flag = 0;
            int num = 0;
            for (int i = 0;i<A.length;i++){
                if (!(A[i]==0)&&flag<2){
                    sum *=A[i];
                }else if (A[i]==0&&flag<2){
                    num = i;
                    flag++;
                }else {
                    break;
                }
            }
 
                for (int i = 0;i<A.length;i++){
                    A[i]=0;
                }
            if (flag<2){
                A[num]=sum;}
            return A;
        }
        int[] B = A;
        for (int i =0;i<A.length;i++){
            B[i] = (int) (sum * Math.pow(A[i],-1));
        }
        return B;
    }
     
}
