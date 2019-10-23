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
	
	/*// los mismo que los de abajo
	 * suma de numeros cualquiera y el resultado darlo en double
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
	*/
	
	public static <T extends Number,T2 extends Number> T SumaNumeros(T objeto1,T2 objeto2)
	{
		Double resultado=0.0;
		resultado=objeto1.doubleValue() + objeto2.doubleValue();
		return (T) resultado;
	}
	
}
