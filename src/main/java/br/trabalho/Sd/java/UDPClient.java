package br.trabalho.Sd.java;

import java.net.*;
import javax.swing.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JOptionPane;

public class UDPClient {

	public static void main(String args[]) throws Exception {
	 DatagramSocket clientSocket = new DatagramSocket();
			byte[] sendData = new byte[1024];
			InetAddress IPAddress = InetAddress.getByName("localhost");
			while(true) {
				String sentence = JOptionPane.showInputDialog("Digite");
				sendData = sentence.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData,sentence.length(),IPAddress,5000);
				clientSocket.send(sendPacket);
				if(sentence.equals("fim")) break;
			
			}
			clientSocket.close();
	}
	
}
