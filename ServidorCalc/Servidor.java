/*
Atividade 03 - Sistemas distribuídos

Gustavo Rezende de Almeida - 2019005257

*/

import java.rmi.*;
import java.net.*;
import java.rmi.registry.Registry;

public class Servidor
{
    public static void main(String argv[])
    {
        try
        {
			Registry registro = java.rmi.registry.LocateRegistry.createRegistry(1099); 
            Naming.rebind("rmi://localhost:1099/ServidorCalc", new ServidorCalc());
			System.out.println("-- Iniciando servidor --\n");
        }
        catch (Exception e)
        {
            System.out.println("\nOcorreu um erro na iniciacao do servidor\n"+e.toString());
        }
    }
}