package basics;

public class Number {
	static int count(int n)
	{
		int x=n,len=0;
		while (x>0)
		{
			len++;
			x=x/10;
		}
		return len;+
	}

	static int mulValue(int num) {
		int val = 10, res = 1;
		for (int i = 1; i <= count(num) - 1; i++) {
			res = res * val;
		}
		return res;
	}

	static boolean isPrime(int n) {
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 9786;
		int len = count(num);
		// System.out.println(len);
		boolean prime = true;
		for (int i = 1; i <= len - 1; i++) {
			int lastValue = num % 10;
			lastValue = lastValue * mulValue(num);
			num = (num / 10) + lastValue;
			if (!isPrime(num)) {
				prime = false;
				break;
			}
		}
		System.out.println(prime);

	}
}
