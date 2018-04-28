package com.onmobile.bi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Rules implements Serializable, Cloneable
{
	private static final long serialVersionUID = 1L;
	private static Rules rules = new Rules();
	private List<Rule> rulesList = new ArrayList<Rule>();
	
	public static Rules getInstance()
	{
		return rules;
	}
	
	public List<Rule> getRulesList()
	{
		List<Rule> cloneRulesList = new ArrayList<Rule>();
		for(Rule rule:rulesList)
		{
			if(rule.clone() != null)
				cloneRulesList.add(rule.clone());
			else
				System.out.println("Could not clone "+rule.toString());
		}
		return rulesList;
	}
	
	/*public void setRulesList(List<Rule> rulesList)
	{
		this.rulesList = rulesList;
	}*/
	
	public void addRule(Rule rule)
	{
		this.rulesList.add(rule);
	}
	
	public void removeRule(Rule rule)
	{
		this.rulesList.remove(rule);
	}
	
	public void updateRule(Rule rule)
	{
		for(Rule r:rulesList)
		{
			if(r.getRuleName().equalsIgnoreCase(rule.getRuleName()))
			{
				rulesList.remove(r);
				rulesList.add(rule);
			}
		}
	}
	
	@Override
	public String toString()
	{
		String rl = "";
		for(Rule r:rulesList)
			rl += r.toString()+", ";
		return "Rules [ "+rl.substring(0, rl.length()-2)+" ]";
	}
}
