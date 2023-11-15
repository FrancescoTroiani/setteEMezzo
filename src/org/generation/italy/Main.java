package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random R=new Random();
		ArrayList<String> mazzo=new ArrayList<>();
		String carta, cartaEstratta;
		String [] semi = {"Denari", "Coppe", "Spade", "Bastoni"};
		for (String seme:semi)
			for(int i=1;i<11;i++) 
			{
				carta=(i)+" di "+ seme;        //converte il valore di i in stringa
				mazzo.add(carta);
			}
		int n=R.nextInt(mazzo.size());
		cartaEstratta = mazzo.get(n);
		mazzo.remove(n);
		System.out.println("La carta estratta è: "+ cartaEstratta);
	}

}
