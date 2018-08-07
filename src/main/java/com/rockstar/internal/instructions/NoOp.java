package com.rockstar.internal.instructions;

import com.rockstar.Program;
import com.rockstar.internal.Instruction;

public class NoOp implements Instruction {

    @Override
    public void run(Program state) {
	//NoOp placeholder for comments
    }
    
    @Override
    public String toString(){
	return "NOOP (comment)"; 
    }
}
