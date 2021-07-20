package nivell1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class NomCiutatsFase4 {
	
	private static String ciutat1="";
	private static String ciutat2="";
	private static String ciutat3="";
	private static String ciutat4="";
	private static String ciutat5="";
	private static String ciutat6="";
	
	public static ArrayList<String> arrayCiutats = new ArrayList<>();
	public static ArrayList<String> arrayCiutatsModificades = new ArrayList<>();

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
		
		for (int i=1;i<=6;i++) {
			arrayCiutats.add(map.get("ciutat"+i));
		}
		
		Collections.sort(arrayCiutats);

		System.out.println("");
		
		System.out.println("Ciutats per ordre alfabètic: ");
		System.out.println("");
		
		for (int i=0;i<=5;i++) {
			System.out.println(arrayCiutats.get(i));
		}
		
		for (int i=0;i<=5;i++) {
			arrayCiutatsModificades.add(arrayCiutats.get(i).replace('a','4'));
		}
		
		Collections.sort(arrayCiutatsModificades);
		
		System.out.println("");
		System.out.println("Ciutats Modificades:");
		System.out.println("");
		
		
		for (int i=0;i<=5;i++) {
			System.out.println(arrayCiutatsModificades.get(i));
		}
		
		//Arrays de Ciutats
		char[] array1= new char[arrayCiutats.get(0).length()];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = arrayCiutats.get(0).charAt(i);
		}
		invertirArray(array1);
		char[] array2= new char[arrayCiutats.get(1).length()];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = arrayCiutats.get(1).charAt(i);
		}
		invertirArray(array2);
		char[] array3= new char[arrayCiutats.get(2).length()];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = arrayCiutats.get(2).charAt(i);
		}
		invertirArray(array3);
		char[] array4= new char[arrayCiutats.get(3).length()];
		for (int i = 0; i < array4.length; i++) {
			array4[i] = arrayCiutats.get(3).charAt(i);
		}
		invertirArray(array4);
		char[] array5= new char[arrayCiutats.get(4).length()];
		for (int i = 0; i < array5.length; i++) {
			array5[i] = arrayCiutats.get(4).charAt(i);
		}
		invertirArray(array5);
		char[] array6= new char[arrayCiutats.get(5).length()];
		for (int i = 0; i < array6.length; i++) {
			array6[i] = arrayCiutats.get(5).charAt(i);
		}
		invertirArray(array6);
		
		//
		System.out.println("");
		System.out.println("Ciutats Amb els noms invertits:");
		System.out.println("");
		
		System.out.println(arrayCiutats.get(0) + "-" + ciudadInvertida(array1));
		System.out.println(arrayCiutats.get(1) + "-" + ciudadInvertida(array2));
		System.out.println(arrayCiutats.get(2) + "-" + ciudadInvertida(array3));
		System.out.println(arrayCiutats.get(3) + "-" + ciudadInvertida(array4));
		System.out.println(arrayCiutats.get(4) + "-" + ciudadInvertida(array5));
		System.out.println(arrayCiutats.get(5) + "-" + ciudadInvertida(array6));
		
	}
	
	public static char[] invertirArray(char[] n) {
	    char aux;
	    for (int i = 0; i < n.length / 2; i++) {
	        aux = n[i];
	        n[i] = n[n.length - 1 - i];
	        n[n.length - 1 - i] = aux;
	    }
	    return n;
	}
	
	public static String ciudadInvertida(char[] n) {
		
		String ciudadInv="";
		for (int i = 0; i < n.length; i++) {
			ciudadInv= ciudadInv + Character.toString(n[i]);
	    }
		return ciudadInv;
	}

}
