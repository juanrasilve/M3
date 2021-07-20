package nivell2;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		int notes[][] = new int[5][3];
		
		for (int i=0;i<notes.length;i++){
			for (int j=0;j<notes[0].length;j++){
				System.out.print("Introdueix la nota " + (j+1) + " per l'alumne " + (i+1) +":");
				Scanner myObj = new Scanner(System.in);
				notes[i][j] =  Integer.parseInt(myObj.nextLine());
			}
			System.out.println("");
		}
		
		for (int i=0;i<notes.length;i++){
			double nota=0;
			double resultat = 0;
			for (int j=0;j<notes[0].length;j++){
				nota = nota + notes[i][j];
			}
			resultat = nota/3;
			if (resultat>=5) {
				System.out.println("L'alumne " + (i+1) + " ha aprovat amb un "+ resultat);
			}else {
				System.out.println("L'alumne " + (i+1) + " ha suspés amb un "+ resultat);
			}
		}
	}
}
