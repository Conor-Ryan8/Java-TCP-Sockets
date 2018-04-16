package sockets;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client 
{
	public static void main(String[] args) throws Exception
	{
		//Set/find IP address of the server
		InetAddress address = InetAddress.getLocalHost();
		
		//Create new socket "sock" and pass it connection information
		Socket sock = new Socket(address,9999);
		
		//create a string "data" to be sent to server
		String data = "Random data";
		
		//Create new streamwriter "stream" and pass it socket information
		OutputStreamWriter stream = new OutputStreamWriter(sock.getOutputStream());
		
		//Create new printwriter "output" and pass it streamwriter information
		PrintWriter output =  new PrintWriter(stream);
		
		//Send the "data" to the printwriter
		output.println(data);
		
		//Flush the streamwriter
		stream.flush();
		
		//Close the socket "sock"
		sock.close();
	}
}
