package org.generation.italy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> squadre= new HashMap<>() {{
		put("juve",0);	
		put("napoli",0);
		put("catania",0);
		put("roma",0);
		put("lazio",0);
		}	
		};
		ArrayList<String> partite = new ArrayList<>();
		ArrayList<Integer> punteggioCasa = new ArrayList<>();
		ArrayList<Integer> punteggioFuoricasa = new ArrayList<>();
		String squadra1, squadra2, risposta;
		int punteggio1, punteggio2, i;

		do {
			
			System.out.println("inserisci una partita");
			System.out.println("quali squadre giocano?");
			
			squadra1 = sc.nextLine(); // sc.nextLine in caso di stringhe
			squadra2 = sc.nextLine();
			if(!squadre.containsKey(squadra1) || !squadre.containsKey(squadra2)) {
				
				System.out.println("la squadra inserita non è valida");
				
			}
			partite.add(squadra1 + "-" + squadra2);
			
			System.out.println("inserisci il punteggio");
			
			punteggio1 = Integer.parseInt(sc.nextLine()); // per gli int meglio mettere parseInt
			punteggio2 = Integer.parseInt(sc.nextLine());
			
			if(punteggio1>punteggio2) {
				squadre.put(squadra1,squadre.get(squadra1)+3); //ha vinto la squadra 1
			}
			else if(punteggio1<punteggio2) {
				squadre.put(squadra2,squadre.get(squadra2)+3); //ha vinto la squadra 2
			}
			else if(punteggio1==punteggio2) {
				squadre.put(squadra2,squadre.get(squadra2)+1); //in caso di pareggio
				squadre.put(squadra1,squadre.get(squadra1)+1);
			}
			
			System.out.println("vuoi inserire un'altra partita? (si/no)");
			risposta = sc.nextLine();

		} while (risposta.equals("si"));
		
		System.out.println("classifica:");
		
		/*
		ArrayList <String> prova=new ArrayList<>(squadre.keySet()); // arraylist che contiene tutte le chiavi dell' hashmap
		Collections.sort(prova);
		for(String s:prova) {
			System.out.println(s);
		}
		*/
		
		for (String t:squadre.keySet()) {
			System.out.println(t + " " + squadre.get(t) + " " + "punti"  );
		}
		sc.close();
	}
}
