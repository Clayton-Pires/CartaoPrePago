package userInterface;

import java.util.ArrayList;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		
		
		ArrayList<CartaoPrePago> cartoes;
		cartoes = new ArrayList<CartaoPrePago>();
		
		
		// adicionando novos cartões
		cartoes.add(new CartaoPrePago("1111 2222 3333 4444",  "Professor Isidro", 2030, 10, 1000.0));
		cartoes.add(new CartaoCashBack("3333 4444 5555 6666","ClienteCB Gold  ", 2030, 10, 1000.0, 0));
		cartoes.add(new CartaoCashBack("3333 5555 6666 7777","ClienteCB Silver", 2030, 10, 1000.0, 1));
		cartoes.add(new CartaoCashBack("3333 6666 7777 8888","ClienteCB Bronze", 2030, 10, 1000.0, 2));
		
		
		for (CartaoPrePago c: cartoes) {
			System.out.println(c);
		}
		
		for (CartaoPrePago c: cartoes) {
			c.comprar(100);
			System.out.println(c);
		}
		
		/*
		CartaoPrePago c1 = new CartaoPrePago("1111 2222 3333 4444",  "Professor Isidro", 2030, 10, 1000.0);
		CartaoPrePago b1 = new CartaoCashBack("3333 4444 5555 6666","ClienteCB Gold  ", 2030, 10, 1000.0, 0);
		CartaoPrePago b2 = new CartaoCashBack("3333 5555 6666 7777","ClienteCB Silver", 2030, 10, 1000.0, 1);
		CartaoPrePago b3 = new CartaoCashBack("3333 6666 7777 8888","ClienteCB Bronze", 2030, 10, 1000.0, 2);
		
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		c1.comprar(100);
		b1.comprar(100);
		b2.comprar(100);
		b3.comprar(100);
		
		System.out.println("    ---    ");
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		*/
		
	}
}