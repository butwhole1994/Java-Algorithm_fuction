//https://www.acmicpc.net/problem/4673
public class self_number {
	public static void main (String[] args) {
		boolean[] SNF = new boolean[10001];
		for(int i=1; i<=10000; ++i) {
			int dn = getDn(i);
			if(dn<=10000) {
				SNF[dn] = true;
			}
		}
		for(int i=1; i<=10000; ++i) {
			if (SNF[i] == false) {
				System.out.println(i);
			}
		}
	
	}
	public static int getDn(int n) {
		int dn = n;
		while(n>0) {
			dn += n%10;
			n /= 10;
		}
		return dn;
	}
}
