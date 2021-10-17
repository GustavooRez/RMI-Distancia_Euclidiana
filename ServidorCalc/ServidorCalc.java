/*
Atividade 03 - Sistemas distribuídos

Gustavo Rezende de Almeida - 2019005257

*/

import java.rmi.*;
import java.rmi.server.*;

public class ServidorCalc extends UnicastRemoteObject implements InterfaceServidorCalculo
{
    public ServidorCalc() throws RemoteException
    {
        System.out.println("Novo Servidor instanciado...");
    }
	
    public double distanciaEuclidiana(double a, double b, double c, double d) throws RemoteException
    {
        System.out.println("Pontos recebidos do cliente: (" + a + ","+ b + ") ("+ c +","+ d +")");
        
		return Math.sqrt(Math.pow(c - a, 2) + Math.pow(d - b, 2));
    }
} 