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
	
	public static <T,T2> Double SumaNumeros(T objeto1,T2 objeto2)
	{
		Double objDouble1=0.0, objDouble2=0.0;
		if(objeto1 instanceof Double && objeto2 instanceof Double)
		{
			objDouble1 = ((Double) objeto1).doubleValue();
			objDouble2 = ((Double) objeto2).doubleValue();
		}
		return objDouble1+objDouble2;
	}
}
