public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }


    //Extracted delegate 11:37AM 2/13/2020

    public double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public int getConstant() {
        return 105600;
    }

    public double getWeight() {
        return 0.02;
    }

    public int getAdjustment() {
        return 60000;
    }
}