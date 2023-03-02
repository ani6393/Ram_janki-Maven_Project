package com.Student.ByRam_Janki;

public class Section 
{
	private Money Fees;

	public Section(Money Fees) 
	{
		this.Fees=Fees;
	}
public void start() {
Fees.pay();
}
}