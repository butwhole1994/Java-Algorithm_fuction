//https://www.acmicpc.net/step/5
public class sum_N {

	long sum(int[] a) {
        long ans = 0;
        for(int i  = 0; i < a.length; i++){
            ans += a[i];
        }
        return ans;
    }
}