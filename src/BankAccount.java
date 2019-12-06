public class BankAccount {
    double amount;



    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
       double add =  amount + sum;
       this.amount =add;
       return add;

    }

    public double withDraw(double sum) throws LimitException{
        double subtraction = amount - sum;
        this.amount=subtraction;
        if (amount<sum){
            throw new LimitException("Не достаточно средств",subtraction);
        }

        return subtraction;
    }
}
