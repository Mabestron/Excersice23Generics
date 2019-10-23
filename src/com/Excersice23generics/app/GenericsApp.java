package com.Excersice23generics.app;

import com.Excersice23generics.model.Suma;
import com.Excersice23generics.model.Resta;
import java.util.ArrayList;
import java.util.HashMap;

public class GenericsApp
{
	public static void main(String[] args) 
	{
		Suma<Integer> miObjeto =new Suma <Integer>(15);
		Suma<String> miObjetoString =new Suma <String>("Testo");
		Resta<Integer,Integer> miObjetoResta =new Resta <Integer,Integer>(10,20);
		Resta<Integer,Integer> miObjetoResta2 =new Resta <Integer,Integer>();
		
		System.out.println("Objeto de miObjeto:"+miObjeto.getMiObjeto());
		System.out.println("Objeto de miObjetoString:"+miObjetoString.getMiObjeto());
		
		miObjetoResta2.setKey(100);
		miObjetoResta2.setValue(200);
		System.out.println("Objeto Resta1:"+miObjetoResta.ToString());
		System.out.println("Objeto Resta2:"+miObjetoResta2.ToString());
		
	}

}
