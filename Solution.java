import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = fs.nextInt(), x = fs.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = fs.nextInt();
			}
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = fs.nextInt();
			}
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] >= x) {
					ans += b[i];
				}
			}
			System.out.println(ans);
		}
		fs.close();
	}
}
