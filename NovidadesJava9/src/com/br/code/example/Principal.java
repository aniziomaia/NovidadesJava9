package com.br.code.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		listaModoAntigo();
		System.out.println("--------------------------------");
		
		listaModoNovo();
		System.out.println("--------------------------------");
		
		mapModoAntigo();
		System.out.println("--------------------------------");
		
		mapModoNovo();

	}
	
	private static void listaModoAntigo() {
		Collection<String> colection = new ArrayList<String>();
		colection.add("Maringá");
		colection.add("Manaus");
		colection.add("Blumenau");
		colection.add("Curitiba");
		
		colection.forEach(c -> System.out.println(c));
	}
	
	private static void listaModoNovo() {
		Collection<String> colection = Set.of("Maringá", "Manaus", "Blumenau", "Curitiba");
		colection.forEach(c -> System.out.println(c));
		
		System.out.println("--------------------------------");
		
		List<String> lista = List.of("Maringá", "Manaus", "Blumenau", "Curitiba");
		lista.forEach(c -> System.out.println(c));
	}
	
	private static void mapModoAntigo() {
		Map<Long, String> map = new HashMap<Long, String>();
		map.put(1l,"Maringá");
		map.put(2l,"Manaus");
		map.put(3l,"Blumenau");
		map.put(4l,"Curitiba");
		
		map.forEach((key, value) -> {
		    System.out.println("Key : " + key + " Value : " + value);
		});
	
	}
	
	private static void mapModoNovo() {
		Map<Long, String> map = Map.of(1L, "Maringá",2L,"Manaus",3L,"Blumenau",4L,"Curitiba");
		
		//Lambda modo 1
		map.entrySet().forEach(entry -> {
		    System.out.println("Key modo 1: " + entry.getKey() + " Value : " + entry.getValue());
		}); 
		
		//Lambda modo 2
		map.forEach((k,v)->System.out.println("Key modo 2 : " + k + " Count : " + v));
		
		//Lambda modo 3
		map.forEach((key, value) -> {
		    System.out.println("Key modo 3 : " + key + " Value : " + value);
		});
	}

}
