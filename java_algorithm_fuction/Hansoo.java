import java.util.*;
//�Ѽ��� ������ ���ϴ� �Լ��� ����� Ǯ �� �ִ� ����������,
//���θ޼ҵ尡 ��¸��� ����ϴµ�, ���� ���� �ٸ� �޼ҵ带 ������ �ʿ䰡 �ֳ� �ϰ� ������ �Ǿ���. 
//�׳� ���θ޼ҵ忡 �ҽ��ڵ带 �ְ� �������� ����ϸ� �Ǵ°��� �ƴѰ�...??

public class Hansoo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(hansoo(n));	
	}
	static int hansoo(int n) {
		int cnt = 0;//������ ���ϴ� �����ϱ� ������ �����ٰ���.
		for(int i=1; i<=n; ++i) {
			if(i<100) {//1���� 99�� ���� ���������� ���.
				++cnt;
			} else if(i<1000) {//1000�� ���������� �̷�� ���� �ʾ����ϱ� 3�ڸ� ���ڵ鸸 �� �ٷ��ָ� ����.
				int a = i%10;//1�� �ڸ�
				int b = (i/10)%10;//10�� �ڸ�
				int c = (i/100)%10;//100�� �ڸ�
				
				if(a-b == b-c) {
					++cnt;
				}
			}
		}
		return cnt;
	}
}
