package com.java.v8;

import java.util.Arrays;

public class _04_StreamAPICollection {
	
//Stream API, Collection�lar �zerinde baz� i�lemleri yapmay� kolayla�t�ran bir yap�d�r
//	filter (filtreleme)
//	forEach (itere etme)
//	map (d�n��t�rme)
//	reduce (indirgeme)
//	distinct (tekil hale getirme)
//	limit (limitleme)
//	collect (toplama)
//	count (sayma)
//	min / max  (s�ralama ile max-min eleman bulma)

	public static void main(String[] args) {
		Arrays.asList("dev","not",".com").stream().forEach(System.out::println);

	}

}
