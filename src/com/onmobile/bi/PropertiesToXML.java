package com.onmobile.bi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Properties;


public class PropertiesToXML
{
	public static void main(String [ ] args)
	{
		// When Serialized object is required
		String absolutePath = "D:\\system_testing\\Boost\\config1.properties";
		if(args[0] != null && args[0].equals("")==false)
			absolutePath = args[0];
		convert(absolutePath, false);
//		
//		// When XML is required
//		convert(absolutePath, true);
	}
	
	public static Object convert(String absolutePath, boolean isXMLRequired)
	{
		Rules rules = new Rules();
		StringBuilder sb = new StringBuilder();
		sb.append("<Rules>");
		try
		{
			File file = new File(absolutePath);
			FileInputStream fis = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fis);
			fis.close();
			
			Enumeration enu = props.keys();
			while(enu.hasMoreElements())
			{
				Rule rule = new Rule();
				String key = (String) enu.nextElement();
				String value = props.getProperty(key);
				if(key.equalsIgnoreCase("WHITELISTEDIPS") || key.equalsIgnoreCase("ESP_API") || key.equalsIgnoreCase("TO_MAILS"))
				{
					
				}
				else
				{
					// MANDATORY START
					String ruleName = key;
					rule.setRuleName(ruleName);
					
					String tableName = value.substring(value.indexOf("from")+5, value.indexOf("(")).trim();
					rule.setTableName(tableName);
					
					String mandatoryTemp = value.substring(value.indexOf("(") + 1, value.indexOf(")"));
					String[] mandatoryParams = mandatoryTemp.split(",");
					sb.append("<Rule name=\""+ruleName+"\" >");
					sb.append("<Table name=\""+tableName+"\" />");
					sb.append("<Mandatory>");
					for(String s: mandatoryParams)
					{
						if(!s.equalsIgnoreCase("arguments"))
						{
							Param param;
//							sb.append("<Mandatory>");
							if(s.indexOf("::") != -1)
							{
								String[] tokens = s.split("::");
								param = new Param(tokens[0], tokens[1]);
								sb.append("<Param name=\""+tokens[0]+"\" type=\""+tokens[1]+"\" />");
							}
							else
							{
								param = new Param(s);
								sb.append("<Param name=\""+s+"\" />");
							}
							rule.addMandatoryParam(param);
//							sb.append("</Mandatory>");
						}
					}
					sb.append("</Mandatory>");
					// MANDATORY END
					
					// OPTIONAL START
					
					String optionalTemp = value.substring(value.indexOf("dep")+4, value.lastIndexOf(")"));
					String[] optionalParams = optionalTemp.split(",");
					sb.append("<Optional>");
					for (String s:optionalParams)
					{
						String name = s.substring(s.indexOf("\"")+1, s.lastIndexOf("\""));
						String type = s.substring(s.lastIndexOf("\"")+1).trim();
						Param param = new Param(name, type);
						sb.append("<Param name=\""+name+"\" type=\""+type+"\" />");
//						System.out.println("Name:"+name+", Type:"+type);
						rule.addOptionalParam(param);
					}
					sb.append("</Optional>");
					// OPTIONAL END
					sb.append("</Rule>");
				}
				rules.addRule(rule);
//				System.out.println("Key="+key+" Value="+value);
			}
			sb.append("</Rules>");
//			System.out.println(sb.toString());
//			System.out.println(rules.toString());
			if(isXMLRequired)
				return sb.toString();
			else
			{
				FileOutputStream fos = new FileOutputStream(new File("D:\\system_testing\\Boost\\config1.ser"));
				ObjectOutputStream oos = new ObjectOutputStream(System.out);
				oos.writeObject(rules);
				oos = new ObjectOutputStream(fos);
				oos.writeObject(rules);
				fos.close();
				return rules;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
