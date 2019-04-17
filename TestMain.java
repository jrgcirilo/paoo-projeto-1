package br.com.strategy.project.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestMain {
	
			public static void main(String[] args) {
		List <Character> characters = new ArrayList<> ();
		
		Character c1 = new King();
		Character c2 = new Queen();
		Character c3 = new Knight();
		Character c4 = new Troll();
		
		characters.add(c1);
		characters.add(c2);
		characters.add(c3);
		characters.add(c4);
		
		
		

		for (Character atack : characters) {
			atack.fight();
		}

		
		
		Random gerador = new Random();
	    double d = gerador.nextDouble(); 
	    
	    for (Character atack : characters) {
			
			  if(d<=0.25){	atack.fight();
			}
	    }	
	   
	    
	    }
		
			
		}

		








