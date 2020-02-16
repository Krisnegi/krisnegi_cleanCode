package com.CleanCode;


public class CompoundInterest extends Interest {
    public CompoundInterest(float principle, float ratePerAnnum, float timeInYears) {
        super(principle, ratePerAnnum, timeInYears);
    }
    public float calculateCompoundInterestYearly()
    {
        return (float)(principle*(Math.pow((1+ratePerAnnum/100),timeInYears)-1));
    }
    public float calculateCompoundInterestHalfYearly()
    {
        return (float)(principle*(Math.pow((1+ratePerAnnum/200),2*timeInYears)-1));
    }
    public float calculateCompoundInterestQuaterly()
    {
        return (float)(principle*(Math.pow((1+ratePerAnnum/400),4*timeInYears)-1));
    }
}
