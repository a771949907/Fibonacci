package demo;

public class Fibonacci {

	public static int of(int n) {
		int res=n<=2?1:0;
		int n1=1;
		int n2=1;
		for(int i=2;i<n;i++) {
			res=n1+n2;
			n1=n2;
			n2=res;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=200;
		for(int i=1;i<=n;i++) {
			System.out.println(Fibonacci.of(i));
		}
	}

}
