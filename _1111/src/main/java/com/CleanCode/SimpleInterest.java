package com.CleanCode;

public class SimpleInterest extends Interest {
    public SimpleInterest(float principle, float ratePerAnnum, float timeInYears) {
        super(principle, ratePerAnnum, timeInYears);
    }
    public float calculateSimpleInterest()
    {
        return (principle*ratePerAnnum*timeInYears)/100;
    }
}
