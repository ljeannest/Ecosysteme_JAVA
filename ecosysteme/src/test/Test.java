package test;

import individus.Animal;
import individus.Lievre;
import individus.Lynx;
import individus.Vautour;

public class Test {

	public static void main(String[] args) {
		
		Lievre Herb1 = new Lievre (1,5,"M",0);
		Lynx Carn1 = new Lynx (1,1,"F",0);
		Vautour Char1 = new Vautour (2,4,"M",0);
		Animal[] A_list = {Herb1,Carn1,Char1};
		System.out.println(A_list.length+"\n");
		int n = A_list.length;
		for (int k=0;k<n;k++) {
			System.out.println(A_list[k]+"\n");
		}

	}

}
