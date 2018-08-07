package com.rockstar.internal.instructions;

import com.rockstar.Program;
import com.rockstar.internal.Instruction;
import com.rockstar.internal.Value;

public class AddInstruction implements Instruction {
    private final String variableName;
    private final String rhs;
    
    public AddInstruction(String variableName, String rhs){
	this.variableName = variableName;
	this.rhs = rhs;
    }
    
    @Override
    public void run(Program state) {
	double number1=state.evaluate(rhs).getValue(Double.class);
	double number2=state.getVariable(variableName).getValue(Double.class);
	state.assignVariable(variableName,Value.createNumber(number1 + number2));
    }
    
    @Override
    public String toString(){
	return variableName + " + " + rhs; 
    }
}
