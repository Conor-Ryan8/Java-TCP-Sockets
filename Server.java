/*******************************************************************************
 * Conor Ryan - Socket Programming - Java				       *
 * Basic TCP Server							       *
 * April 2018			       				               *
 *******************************************************************************/

package sockets;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
	public static void main(String[] args) throws Exception
	{
		//Create new server socket "servsock" and pass it port number
		ServerSocket servsock = new ServerSocket(9999);
		
		//Create new socket "sock" and pass it server socket information
		Socket sock = servsock.accept();

		//Create new streamreader "stream" and pass it socket information
		InputStreamReader stream = new InputStreamReader(sock.getInputStream());
		
		//Create new buffered reader "buffer", passing it stream reader information created within the arguements
		BufferedReader buffer = new BufferedReader(stream);
		
		//Create new string "data" and pass it information recieved from the buffer
		String data = buffer.readLine();
		
		//Print the information received from the client 
		System.out.println("Client Sent: " + data);
				
		//Close the server socket "servsock"
		servsock.close();
	}
}
