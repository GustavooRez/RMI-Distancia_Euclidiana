/*
Atividade 03 - Sistemas distribuídos

Gustavo Rezende de Almeida - 2019005257

*/

import java.rmi.*;

// Definicao da interface que descreve os objetos remotos que poderao ser acessados pelo cliente
public interface InterfaceServidorCalculo extends Remote
{
    public double distanciaEuclidiana(double a, double b, double c, double d) throws RemoteException;
}