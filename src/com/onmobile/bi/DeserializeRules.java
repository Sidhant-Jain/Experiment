package com.onmobile.bi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeRules
{
	public static void main(String [ ] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		System.out.println("reached");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\system_testing\\Boost\\config1.ser")));
		
		Rules rules = null;
		rules = (Rules) ois.readObject();
		
		System.out.println(rules.toString());
	}
}
