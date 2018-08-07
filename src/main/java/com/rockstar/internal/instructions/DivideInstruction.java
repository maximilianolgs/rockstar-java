package com.rockstar.internal.instructions;

import com.rockstar.Program;
import com.rockstar.internal.Instruction;
import com.rockstar.internal.Value;

public class DivideInstruction implements Instruction {
    private final String variableName;
    private final String rhs;
    
    public DivideInstruction(String variableName, String rhs){
	this.variableName = variableName;
	this.rhs = rhs;
    }
    
    @Override
    public void run(Program state) {
	double dividend=state.evaluate(rhs).getValue(Double.class);
	double divisor=state.getVariable(variableName).getValue(Double.class);
	state.assignVariable(variableName,Value.createNumber(dividend / divisor));
    }
    
    @Override
    public String toString(){
	return variableName + " / " + rhs; 
    }
}
