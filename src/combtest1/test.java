package combtest1;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import combtest1.Permutation1;

public class test {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("長さ（要素数）を正の整数で入力してください。");
		int n = scanner.nextInt();
		for(int i = 0 ; i<n ; i++) {
			 System.out.println( (i+1) + "番目の要素を整数で入力してください。");
			 int a = scanner.nextInt();
			 data.add(a);
		}
		scanner.close();
		
		Permutation1 pm1 = new Permutation1();
		List<ArrayList<Integer>> perms = new ArrayList<ArrayList<Integer>>();
		perms = pm1.getPerms(data);
		for(int i = 0; i < perms.size(); i++) {
			System.out.println(perms.get(i) + "　　←　　" + (i+1) + "番目の順列" );
		}
		System.out.println("以上、全" + perms.size() +"個の順列を生成しました");
		
	}
}