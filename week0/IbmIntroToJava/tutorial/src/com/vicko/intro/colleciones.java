package com.vicko.intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class colleciones {

	public static void main(String[] args) {
		
		//Arrays 
		int[] arreglo1 = new int[20];
		// o int[] enteros = new int[] {2,3,4,5,6,7};
		// o int[] enteros = {2,3,4,5,6,7};
		
		//Un arreglo se puede cargar de la siguiente manera
		/*
		for(int i = 0; i < arreglo1.length; i++) {
			System.out.println(arreglo1[i]);
		}
		
		for(int item:arreglo1) {
			System.out.println(item);
		}
		*/
		
		//Tambien se pueden crear un arreglo de la siguiente manera
		Integer[] withObjects = new Integer[] {Integer.valueOf(7),Integer.valueOf(77)};
		
		//Este ultimo objeto es la representacion del JDK del tipo primitivo entero, cada tipo tiene una representación de esto
		
		int valor = 88;
		Integer valorBoxed = Integer.valueOf(valor);
		
		Integer valorBoxed2 = Integer.valueOf(88);
		int valor2 = valorBoxed2.intValue();
		
		//Tambien se puede hacer parse de tipos con estos wrappers
		String number = "34";
		Integer stringToInt = Integer.parseInt(number);
		
		//Las listas son colleciones ordenadas en donde no se pueden guardar tipos primitivos porque al final es una instancia
		List<String> names = new ArrayList<>();
		
		//Para añadir algo a la lista
		names.add("Alberto");
		
		//Para saber el tamaño de la lista
		System.out.println(names.size());
		
		//Para saber el valor de uno de los elementos de la lista
		System.out.println(names.get(0));
		names.add("Juan");
		
		//Por lo general estas colecciones son iterables, por lo tanto
		for(String element: names) {
			System.out.println(element);
		}
		
		//Un set es una collecion similar a la lista, sin embargo todos los elementos que este contiene son unicos, por lo tanto no duplicados
		Set<Integer> notas = new HashSet<>();
		
		//Los sets pueden hacer las mismas cuestiones que las listas, sin embargo cuando este recibe algun elemento repetido, no lo guardara
		notas.add(Integer.valueOf(6));
		notas.add(Integer.valueOf(8));
		notas.add(Integer.valueOf(6));
		
		for(Integer element: notas) {
			System.out.println(element);
		}
		
		//Un mapa es una collecion que contiene objetos que seran marcados por una llava y un valor, lo que se puede hacer con este es similar a lo que se hace con las demas colleciones
		Map<String, Integer> users = new HashMap<>();
		
		//Para añadir un elemento a un mapa
		users.put( "user1", Integer.valueOf(1));
		users.put( "user2", Integer.valueOf(2));
		
		//Para obtener un elemento de un mapa mediante su llave
		System.out.println(users.get("user1"));
		
		//Se puede obtener un set solo de llaves o de los valores de la siguiente forma
		Set<String> keysUsers = users.keySet();
		
		for(String user : keysUsers) {
			System.out.println(user);
		}

	}

}
