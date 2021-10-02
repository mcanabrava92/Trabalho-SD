package br.trabalho.Sd.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Date;




public class UDPServer {

	public static void main(String args[]) throws Exception{
		System.out.println("Servidor Inciado ...");
		byte[] receiveData = new byte[1024];
		DatagramSocket serverSocket = new DatagramSocket(5000);
		DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
		while(true) {
			serverSocket.receive(receivePacket);
			String sentence = new String(receivePacket.getData());
			
			if(sentence.substring(0,3).equals("fim")) break;
			InetAddress IPAdress=receivePacket.getAddress();
			System.out.println(" Recebido de" + IPAdress.getHostAddress()+ ":"+ sentence );
		}
	serverSocket.close();
	}
}
