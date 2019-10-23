package com.Excersice23generics.model;

public class Suma <T>
{
	
	T miObjeto;
	
	public Suma(T miObjeto)
	{
		this.miObjeto=miObjeto;
	}
	
	public T  getMiObjeto()
	{
		return this.miObjeto;
	}
	
	
}
