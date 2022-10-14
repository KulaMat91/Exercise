package org.exercise.EX4;

public class PremiumAccount extends SavingAccount{
    private final  Integer monthlyPayment;
    public PremiumAccount(Integer monthlyInterestRate, Integer monthlyPayment) {
        super(monthlyInterestRate);
        this.monthlyPayment = monthlyPayment;
    }
    @Override
    public void onMonthPassed() {
        super.onMonthPassed();
        this.money -=monthlyPayment;
    }

}
