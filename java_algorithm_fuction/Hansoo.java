import java.util.*;
//한수의 갯수를 구하는 함수를 만들면 풀 수 있는 문제이지만,
//메인메소드가 출력만을 담당하는데, 굳이 따로 다른 메소드를 구현할 필요가 있나 하고 생각이 되었나. 
//그냥 메인메소드에 소스코드를 넣고 마지막에 출력하면 되는것이 아닌가...??

public class Hansoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(hansoo(n));	
	}
	static int hansoo(int n) {
		int cnt = 0;//개수를 구하는 문제니까 개수를 세어줄거임.
		for(int i=1; i<=n; ++i) {
			if(i<100) {//1부터 99는 전부 등차수열로 취급.
				++cnt;
			} else if(i<1000) {//1000은 등차수열로 이루어 지지 않았으니까 3자리 숫자들만 잘 다뤄주면 끝남.
				int a = i%10;//1의 자리
				int b = (i/10)%10;//10의 자리
				int c = (i/100)%10;//100의 자리
				
				if(a-b == b-c) {
					++cnt;
				}
			}
		}
		return cnt;
	}
}
