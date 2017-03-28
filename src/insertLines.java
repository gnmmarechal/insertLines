/*
 * insertLines.java
 * 
 * Copyright 2017 Mário Liberato <mliberato@ua.pt>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.*;
import java.io.*;

public class insertLines 
{
	
	public static void main (String[] args) throws IOException
	{
		if (args.length != 2) return;
		
		File inputFile = new File(args[0]);
		File outFile = new File(args[1]);
		PrintWriter pw = new PrintWriter(outFile);
		Scanner sc = new Scanner(inputFile);
		
		while (sc.hasNextLine())
		{
			pw.println(sc.nextLine());
			pw.println("");
		}
		pw.close();
	}
}

