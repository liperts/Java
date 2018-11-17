package com.labassignments.lipeteixeira;

import javax.swing.JFrame;

public class Solution
{

	public static void main(String[] args)
	{
        LoanCalculator gui = new LoanCalculator();
        gui.pack();
        gui.setTitle("COMP 228 Loan Calculator");
        gui.setSize(305,200);
        // the Loan Calculator will appear centralized
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        
    }
}
