package javasessions;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;
import java.text.*;
class List{
	
	/********************************************
	 * 
	 *  Commmand : ls
	 *  Use : Gives list of files and directories
	 * 
	 * ******************************************/
	public static void ls(String path) {
		File f = new File(path);
		File[] file = f.listFiles();
		for(File i : file){
			if(!i.isHidden()){
				System.out.printf(i.getName() + "\t");
			}
		}
	}

	public static void main(String args[]){
		
		File f = new File(path);
		
		String arr[] = f.list();
		File[] file = f.listFiles();
		switch(args[0]){
			case "ls-a":
				
				for(String i : arr){
					System.out.printf(i+"\t");		
				}
				break;
		
			case "ls-la":
			
				for(File i : file){
									}
				break;

			case "ls":
				ls(args[1]);
				break;

							
		}


	}
}
