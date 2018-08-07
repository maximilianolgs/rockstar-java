package com.rockstar.internal.conditions;

import com.rockstar.Program;
import com.rockstar.internal.Comparison;
import com.rockstar.internal.Condition;

public class ComparisonCondition implements Condition {
	private final String lhs;
	private final String rhs;
	private final Comparison comp;
	
	public ComparisonCondition(String lhs,String rhs,Comparison comp)	{
		this.lhs=lhs;
		this.rhs=rhs;
		this.comp=comp;
	}

	@Override
	public boolean evaluate(Program state) {
		return comp.compare(state,lhs,rhs);
	}
	
	@Override
	public String toString(){
	    switch(comp){
		case EQUAL:
		    return "Comparison " + lhs + " EQUAL " + rhs;
		case LOWER:
		    return "Comparison " + lhs + " LOWER THAN " + rhs;
		case HIGHER:
		    return "Comparison " + lhs + " HIGHER THAN " + rhs;
		case HIGHER_OR_EQUAL:
		    return "Comparison " + lhs + " HIGHER OR EQUAL THAN " + rhs;
		case LOWER_OR_EQUAL:
		    return "Comparison " + lhs + " LOWER OR EQUAL THAN " + rhs;
	    }
	    return "Comparison Undefined?";
	}
}
