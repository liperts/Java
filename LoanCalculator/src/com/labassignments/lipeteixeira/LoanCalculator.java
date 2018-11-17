package com.labassignments.lipeteixeira;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoanCalculator extends JFrame
{
    // create text fields
    private JTextField annualInterestRateTF = new JTextField();
    private JTextField numberOfYearsTF = new JTextField();
    private JTextField loanAmountTF = new JTextField();
    private JTextField monthlyPaymentTF = new JTextField();
    private JTextField totalPaymentTF = new JTextField();
    
    // create a compute payment button
    private JButton ComputePayment = new JButton("Compute Payment"); 
    
    public LoanCalculator()
    {
        // create a panel with specified dimensions
        JPanel panel = new JPanel(new GridLayout(5, 2));
        
        panel.add(new JLabel("Annual Interest Rate"));
        panel.add(annualInterestRateTF);
        
        panel.add(new JLabel("Number of Years"));
        panel.add(numberOfYearsTF);
        
        panel.add(new JLabel("Loan Amount"));
        panel.add(loanAmountTF);
        
        panel.add(new JLabel("Monthly Payment"));
        panel.add(monthlyPaymentTF);
        
        panel.add(new JLabel("Total Payment"));
        panel.add(totalPaymentTF);
        
        // create the second panel, for a button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(ComputePayment); 
        
        // add all panels to the frame
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        // add a listener to interact with the frame
        ComputePayment.addActionListener(new ButtonListener());
    }
    
    // handle the ComputePayment button's events
    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            // get the value from the first three text fields
            double interest = Double.parseDouble(annualInterestRateTF.getText());
            int year = Integer.parseInt(numberOfYearsTF.getText());
            double loanAmount = Double.parseDouble(loanAmountTF.getText());
            
            Loan loan = new Loan(interest, year, loanAmount);
            
            // based on the above values, display both monthly and total payment 
            monthlyPaymentTF.setText(String.format("%.2f", loan.getMonthlyPayment()));
            totalPaymentTF.setText(String.format("%.2f", loan.getTotalPayment()));
        }
    }
    
    // create a loan class, to store loan information
    public class Loan
    {
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        
        // default constructor
        public Loan()
        {
            this(3.5, 5, 50000);
        }
        
        // constructor with a specified values by the user
        public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
        {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
        }
        
        // getters and setters
        public double getAnnualInterestRate()
        {
            return annualInterestRate;
        }
        
        public void setAnnualInterestRate(double annualInterestRate)
        {
            this.annualInterestRate = annualInterestRate;
        }
        
        public int getNumberOfYears()
        {
            return numberOfYears;
        }
        
        public void setNumberOfYears(int numberOfYears)
        {
            this.numberOfYears = numberOfYears;
        }
        
        public double getLoanAmount()
        {
            return loanAmount;
        }
        
        public double getMonthlyPayment()
        {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;
        }
        
        public double getTotalPayment()
        {
            double totalPayment = getMonthlyPayment() * numberOfYears * 12;
            return totalPayment;
        }
        
    }
}