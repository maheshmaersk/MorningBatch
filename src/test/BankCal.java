package test;

public class BankCal extends PolyExample{

    public static void main(String[] args) {

        BankCal sadas= new BankCal();
        sadas.getBank(true);
//        sadas.getSimpleInterest(100000,60,12.23f);

    }

    float getSimpleInterest( int principleAmount, int timeInMonths, float interest){

        float interestAmount = (principleAmount*(timeInMonths/12)*interest)/100;

        System.out.println("Bank Cal Interest rate for "+ timeInMonths/12+" Year is "+interestAmount);

        return interestAmount;
    }

    void getBankName(){
        System.out.println("I am Latest");
    }

    void getBank(boolean isOld){
       if (isOld)super.getBankName();
       else getBankName();
    }
}
