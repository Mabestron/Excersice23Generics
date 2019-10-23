package com.Excersice23generics.model;

public class Multi
{
	public static <T> String MuestraTipoDato (T objeto)
	{
		
		return "Tipo de dato es: "+objeto.getClass()+" Nombre del Parametro: "+objeto.getClass().getName()+
				" Valor del elemento: "+objeto;
		
	}
	
	
}
