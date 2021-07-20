package nivell1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NomCiutatsFase1 {
	
	private static String ciutat1="";
	private static String ciutat2="";
	private static String ciutat3="";
	private static String ciutat4="";
	private static String ciutat5="";
	private static String ciutat6="";
	
	public static ArrayList<String> ciutats = new ArrayList<>();

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String,String>(); 
		
		for (int i=1;i<=6;i++) {
			Scanner myObj = new Scanner(System.in);
			System.out.println("Entreu un nom de ciutat");
			String ciutat = myObj.nextLine();
			map.put("ciutat"+i, ciutat);
		}
		
		ciutat1 = map.get("ciutat1");
		ciutat2 = map.get("ciutat2");
		ciutat3 = map.get("ciutat3");
		ciutat4 = map.get("ciutat4");
		ciutat5 = map.get("ciutat5");
		ciutat6 = map.get("ciutat6");
	
		System.out.println(ciutat1+","+ciutat2+","+ciutat3+","+ciutat4+","+ciutat5+","+ciutat6);
		
	}

}
