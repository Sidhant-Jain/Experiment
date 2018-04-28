package com.onmobile.bi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Rule implements Serializable, Cloneable
{
	private static final long serialVersionUID = 1L;
	private String ruleName;
	private String tableName;
	private List<Param> mandatoryParams = new ArrayList<Param>();
	private List<Param> optionalParams = new ArrayList<Param>();
	
	public Rule()
	{
		
	}

	public String getRuleName()
	{
		return ruleName;
	}

	public void setRuleName(String ruleName)
	{
		this.ruleName = ruleName;
	}

	public String getTableName()
	{
		return tableName;
	}

	public void setTableName(String tableName)
	{
		this.tableName = tableName;
	}

	public List<Param> getMandatoryParams()
	{
//		return mandatoryParams;
		List<Param> cloneMan = new ArrayList<Param>();
		for(Param p:mandatoryParams)
		{
			if(p.clone() != null)
				cloneMan.add(p.clone());
			else
				System.out.println("Could not clone "+p.toString());
		}
		return cloneMan;
	}

	/*public void setMandatoryParams(List<Param> mandatoryParams)
	{
		this.mandatoryParams = mandatoryParams;
	}*/

	public List<Param> getOptionalParams()
	{
		List<Param> cloneOpt = new ArrayList<Param>();
		for(Param p:optionalParams)
		{
			if(p.clone() != null)
				cloneOpt.add(p.clone());
			else
				System.out.println("Could not clone "+p.toString());
		}
		return cloneOpt;
	}

	/*public void setOptionalParams(List<Param> optionalParams)
	{
		this.optionalParams = optionalParams;
	}*/
	
	public void addMandatoryParam(Param param)
	{
		this.mandatoryParams.add(param);
	}
	
	public void addOptionalParam(Param param)
	{
		this.optionalParams.add(param);
	}
	
	public void removeMandatoryParam(Param param)
	{
		this.mandatoryParams.remove(param);
	}
	
	public void removeOptionalParam(Param param)
	{
		this.optionalParams.remove(param);
	}
	
	@Override
	protected Rule clone()
	{
		Rule rule = null;
		try
		{
			rule = (Rule)super.clone(); 
		}
		catch(CloneNotSupportedException cnse)
		{
			cnse.printStackTrace();
		}
		return rule;
	}
	@Override
	public String toString()
	{
		String mp = "";
		if(mandatoryParams.size()==0)
			mp = ", ";
		else if(mandatoryParams.size()==1)
			mp = mandatoryParams.get(0)+", ";
		else
			for(Param p: mandatoryParams)
				mp+= p.toString()+", ";
		
		String op = "";
		if(optionalParams.size()==0)
			op = ", ";
		else if(optionalParams.size()==1)
			op = optionalParams.get(0)+", ";
		else
			for(Param p: optionalParams)
				op+= p.toString()+", ";
		return "Rule [ ruleName="+ruleName+", tableName="+tableName+", MandatoryParams [ "+mp.substring(0, mp.length()-2)+"], OptionalParams [ "+op.substring(0, op.length()-2)+"]]";
	}
}
