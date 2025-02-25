package corejava.methodorverloading;

//What is method overloading?
//When a class has different methods with same name it's called method overloading
//But those methods parameters must be different for each method. Either by types or by number of arguments/parameters


public class MethodOverloading {

    public static void main(String[] args) {

      MethodOverloading m=new MethodOverloading();
      m.doPayment(2000);
      m.doPayment("MayBank2U");
      m.doPayment("May Bank Debit Card","May Bank Credit Card");


    }

    public void doPayment(String onlineBanking){
        System.out.println("Payment by online Banking: "+onlineBanking);
    }

    public void doPayment(String debitCard, String creditCard){
        System.out.println("Payment by debit or credit cards : "+debitCard+" or "+creditCard);
    }

    public void doPayment(double amount){
        System.out.println("The amount is: "+amount);
    }
}
