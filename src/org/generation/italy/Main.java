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
		String carta, cartaEstratta, risposta;
		ArrayList<Double> punteggio=new ArrayList<>();
		int j, i, numCarta, conta;
		double n, punti;
		String [] semi = {"Denari", "Coppe", "Spade", "Bastoni"};
		conta=0;
		punti=0;
		/*for (String seme:semi)
			for(int i=1;i<11;i++) 
			{
				carta=(i)+" di "+ seme;        //converte il valore di i in stringa
				mazzo.add(carta);
			}
		
		do {
			int n=R.nextInt(mazzo.size());
			cartaEstratta = mazzo.get(n);
			mazzo.remove(n);
			System.out.println("La carta estratta è: "+ cartaEstratta); */
			
			for(j=0; j<4; j++)
			{
				for(i=1; i<=10; i++)
				{
					mazzo.add(i+" di "+semi[j]);
					
					if(i >= 1 && i < 8)
					{
						n = i;
						punteggio.add(n);
					}
					else if(i >= 8 && i <= 10)
					{
						punteggio.add(0.5);
					}
				}
			}
			/*do {
				int x=R.nextInt(mazzo.size());
				cartaEstratta = mazzo.get(x);
				mazzo.remove(x);
				System.out.println("La carta estratta è: "+ cartaEstratta);
				
				System.out.println("Il punteggio attuale è: ");
				System.out.println("Vuoi pescare un'altra carta? ");
				risposta=sc.nextLine();
					
				
			}while(risposta.equals("si"));*/
			do 
			{
				
				numCarta = R.nextInt(mazzo.size());
				cartaEstratta = mazzo.get(numCarta);
				punti = punti + punteggio.get(numCarta);
				if(conta == 0)
				{
					System.out.println("La tua prima carta è "+cartaEstratta);
					System.out.println("Attualmente hai "+punti+" punti.");
					conta++;
				}
				else if(conta > 0)
				{
					System.out.println("La tua nuova carta è "+cartaEstratta);
					System.out.println("Attualmente hai "+punti+" punti.");
				}
				mazzo.remove(numCarta);
				punteggio.remove(numCarta);
				if (punti>=8)
				{
					System.out.println("Hai sballato");
					break;
				}
				else
					{
					System.out.println("Vuoi estrarre un'altra carta? (si/no)");
					risposta = sc.nextLine();
					}
				
			} 
			while(risposta.equals("si"));
			
			sc.close();


	}

}
