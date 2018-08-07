package com.rockstar.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rockstar.Parser;
import com.rockstar.internal.Instruction;
import com.rockstar.internal.instructions.AddInstruction;
import com.rockstar.internal.instructions.Assignment;
import com.rockstar.internal.instructions.BlockInstruction;
import com.rockstar.internal.instructions.DivideInstruction;
import com.rockstar.internal.instructions.MultiplyInstruction;
import com.rockstar.internal.instructions.SubtractInstruction;

public class AssignmentParser {
	private final static List<String> ALIASES=Arrays.asList(" is "," was "," were "," says ");
	
	private String varName;
	private String rhs;
	private boolean isCorrect;
	
	public AssignmentParser(String line)	{
		for (String alias:ALIASES)	{
			String[] split=line.split(alias);
			if (split.length!=2) continue;
			varName = Parser.parseVariableName(split[0]);
			rhs=split[1];
			isCorrect=true;
			return;
		}
		isCorrect=false;
	}
	
	public boolean isAssignment()	{
		return isCorrect;
	}
	
	//FIXME refactor... this is awfull
	public Instruction createInstruction()	{
		if(rhs.contains(" plus ") || rhs.contains(" with ")){
		    List<Instruction> instructions = new ArrayList<Instruction>();
		    String part=rhs.contains(" plus ")?rhs.split(" plus ")[0]:rhs.split(" with ")[0];
		    instructions.add(new Assignment(varName, part));
		    part=rhs.contains(" plus ")?rhs.split(" plus ")[1]:rhs.split(" with ")[1];
		    instructions.add(new AddInstruction(varName, part));
		    return new BlockInstruction(instructions);
		} else if(rhs.contains(" minus ") || rhs.contains(" without ")){
		    List<Instruction> instructions = new ArrayList<Instruction>();
		    String part=rhs.contains(" minus ")?rhs.split(" minus ")[0]:rhs.split(" without ")[0];
		    instructions.add(new Assignment(varName, part));
		    part=rhs.contains(" minus ")?rhs.split(" minus ")[1]:rhs.split(" without ")[1];
		    instructions.add(new SubtractInstruction(varName, part));
		    return new BlockInstruction(instructions);
		} else if(rhs.contains(" times ") || rhs.contains(" of ")){
		    List<Instruction> instructions = new ArrayList<Instruction>();
		    String part=rhs.contains(" times ")?rhs.split(" times ")[0]:rhs.split(" of ")[0];
		    instructions.add(new Assignment(varName, part));
		    part=rhs.contains(" times ")?rhs.split(" times ")[1]:rhs.split(" of ")[1];
		    instructions.add(new MultiplyInstruction(varName, part));
		    return new BlockInstruction(instructions);
		} else if (rhs.contains(" over ")){
		    List<Instruction> instructions = new ArrayList<Instruction>();
		    instructions.add(new Assignment(varName, rhs.split(" over ")[0]));
		    instructions.add(new DivideInstruction(varName, rhs.split(" over ")[1]));
		    return new BlockInstruction(instructions);
		} else{
		    return new Assignment(varName,rhs);
		}
	}

	public String getRHS() {
	    return rhs;
	}

	public String getVarName() {
	    return varName;
	}
}
