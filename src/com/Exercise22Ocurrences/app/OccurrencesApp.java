package com.Exercise22Ocurrences.app;


import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class OccurrencesApp {

	public static void main(String[] args) {
		
		//Constant declaration
		final int ELEMENTS=20;
		
		//Variables declaration
		
		//Objects declaration
		//Scanner input = new Scanner(System.in);
		Random numbers = new Random(System.nanoTime());
		HashMap<Integer, Integer> miHash = new HashMap<Integer, Integer>();
		
		//Initialization
		
		int[] miArray = new int[ELEMENTS];
		for(int i=0; i<ELEMENTS; i++)
		{
			miArray[i] = numbers.nextInt(5);
		}
		
		//Process
		
		int ocurrences=0;
		for(int element:miArray)
		{
			if(miHash.containsKey(element))
			{
				ocurrences = miHash.get(element);
				ocurrences++;
				miHash.put(element,ocurrences);
			}
			else
			{
				miHash.put(element,1);
			}
			
			
			
		}
		
		System.out.println(miHash);
		}
	
	
		
		/*
		for(int element:miArray)
		{
			System.out.print(" "+i);
		}
		*/
	
		//input.close();
		
		

	}


