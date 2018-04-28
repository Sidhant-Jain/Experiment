package com.onmobile.bi;

import java.io.Serializable;

public class Param implements Serializable, Cloneable
{
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	
	public Param(String name, String type)
	{
		this.name = name;
		this.type = type;
	}
	
	public Param(String name)
	{
		this.name = name;
		this.type = "NA";
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}

	@Override
	protected Param clone()
	{
		Param p = null;
		try
		{
			return (Param) super.clone();
		}
		catch(CloneNotSupportedException cnse)
		{
			cnse.printStackTrace();
		}
		return p;
	}
	@Override
	public String toString()
	{
		return "Param [ name=" + name + ", type=" + type + " ]";
	}
	
	public static void main(String [ ] args)
	{
		Param p = new Param("n");
		Param p1 = (Param)p.clone();
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}
}
