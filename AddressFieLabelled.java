import java.util.*;
import java.io.*;

public class AddressFileLabelled extends AddressFile
{
	public String toLine(Address addr)
	{
        StringBuilder sb = new StringBuilder();
        sb.append("id:");
        sb.append(addr.id);
        sb.append(";");
        sb.append("name:");
        sb.append(addr.name);
        sb.append(";");
        sb.append("street:");
        sb.append(addr.street);
        sb.append(";");
        sb.append("zip:");
        sb.append(addr.zipCode);
        sb.append(";");
        sb.append("city:");
        sb.append(addr.city);
        sb.append('\n');
		
		
		
        String str = sb.toString();
		
		return str;
	}


	public Address parseLine(String line)
	{
		String [] tokens ;
		String label_0 = "id";
		String label_1 = "name";
		String label_2 = "street";
		String label_3 = "zip";
		String label_4 = "city";
		
		Scanner scan = new Scanner(line);
		scan . findInLine ( label_0 +"[\\ s ]*:[\\ s ]*([^;]*)");
		tokens =scan . match (). group (1). trim (). append();
		scan . findInLine ( label_1 +"[\\ s ]*:[\\ s ]*([^;]*)");
		tokens =scan . match (). group (1). trim (). append();
		scan . findInLine ( label_2 +"[\\ s ]*:[\\ s ]*([^;]*)");
		tokens =scan . match (). group (1). trim (). append();
		scan . findInLine ( label_3 +"[\\ s ]*:[\\ s ]*([^;]*)");
		tokens =scan . match (). group (1). trim (). append();
		scan . findInLine ( label_4 +"[\\ s ]*:[\\ s ]*([^;]*)");
		tokens =scan . match (). group (1). trim (). append();
		
		
		Address addr = new Address(Integer.parseInt(tokens[ADD_ID]); tokens[ADD_NAME]; tokens[ADD_STREET]; Integer.parseInt(tokens[ADD_ZIPCODE]); tokens[ADD_CITY]);
		
		return addr;	
		
	}

	

}
