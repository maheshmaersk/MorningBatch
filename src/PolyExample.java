public class PolyExample {

    public static void main(String[] args) {


        PolyExample odsfadsad = new PolyExample();
        odsfadsad.getSimpleInterest("Axis Bank",1000000,60,11);
        odsfadsad.getSimpleInterest(1000000,60,11.3);

    }

    void getSimpleInterest(String bankName, long principleAmount, int timeInMonths, float interest){

        float interestAmount = (principleAmount*(timeInMonths/12)*interest)/100;

        System.out.println("Interest rate for "+ timeInMonths/12+" Year is "+interestAmount+" for "+bankName);
    }

    float getSimpleInterest( long principleAmount, int timeInMonths, float interest){

        float interestAmount = (principleAmount*timeInMonths*interest)/100;

        System.out.println("Interest rate for "+ timeInMonths/12+" Year is "+interestAmount);

        return interestAmount;
    }

    float getSimpleInterest( int principleAmount, float timeInMonths, double interest){

        double interestAmount = (principleAmount*timeInMonths*interest)/100;

        System.out.println("Interest rate for "+ timeInMonths/12+" Year is "+interestAmount);

        return (float)interestAmount;
    }


    void getSimpleInterest(long principleAmount, int timeInMonths){

        float interestAmount = (principleAmount*timeInMonths*7.3f)/100;

        System.out.println("Interest rate for "+ timeInMonths/12+" Year is "+interestAmount);
    }

    void getBankName(){
        System.out.println("I am Old Branch");
    }

}
