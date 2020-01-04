package com.java.v8;

import java.util.Arrays;

public class _04_StreamAPICollection {
	
//Stream API, Collection’lar üzerinde bazý iþlemleri yapmayý kolaylaþtýran bir yapýdýr
//	filter (filtreleme)
//	forEach (itere etme)
//	map (dönüþtürme)
//	reduce (indirgeme)
//	distinct (tekil hale getirme)
//	limit (limitleme)
//	collect (toplama)
//	count (sayma)
//	min / max  (sýralama ile max-min eleman bulma)

	public static void main(String[] args) {
		Arrays.asList("dev","not",".com").stream().forEach(System.out::println);

	}

}
