package com.neotech.lesson26;

public abstract class Marks {

	
	public abstract double getAverage();
	
	
	
	
	
	
	
	
	
	
	
}

class StudentA extends Marks
{
	int mark1, mark2, mark3;
	
	StudentA(int mark1, int mark2, int mark3)
	{
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}


	@Override
	public double getAverage() {
		 
		return (mark1 + mark2 + mark3)/3;
	}
	
	
	
	
}

class StudentB extends Marks
{
	int mark1,  mark2, mark3, mark4;
	
	StudentB(int mark1, int mark2, int mark3, int mark4)
	{
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}

	@Override
	public double getAverage() {
		
		return (mark1 + mark2 + mark3 + mark4)/4;
	}
}