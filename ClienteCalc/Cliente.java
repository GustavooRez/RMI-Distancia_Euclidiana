/*
Atividade 03 - Sistemas distribuídos

Gustavo Rezende de Almeida - 2019005257

*/

import java.rmi.*;
import java.util.Scanner;

public class Cliente
{
	private InterfaceServidorCalculo isc;
	private static Scanner teclado; 

	public static void main (String[] argv)
	{
		Cliente cliente = new Cliente();
		teclado = new Scanner(System.in);

		System.out.println("Entre com valores de X1 e Y1 separados por espaco:");
		double x1 = teclado.nextDouble();
		double y1 = teclado.nextDouble();
		
		System.out.println("Entre com valores de X2 e Y2 separados por espaco:");
		double x2 = teclado.nextDouble();
		double y2 = teclado.nextDouble();
		
		try
		{   
			System.out.println("\nDistancia euclidiana: " + cliente.distEuclidiana(x1,y1,x2,y2));
		}
		catch (Exception e)
		{
			System.out.println("\nExcecao durante chamadas remotas:" +e);
		}
	}
	

	public Cliente()
	{
		System.out.println("-- Realizando a Execucao do Cliente -- \n");
		try
		{   
			isc = (InterfaceServidorCalculo) Naming.lookup("rmi://localhost/ServidorCalc");
		}
		catch (Exception e)
		{
			System.out.println("-- Nao foi possível executar o Cliente --\n -- "+e+" --");					
			System.exit(0);
		}
	}
	
	public double distEuclidiana(double a, double b, double c, double d) throws RemoteException{
		 return isc.distanciaEuclidiana(a,b,c,d);	
	}
}