package Task4.Problem3;

public class Problem3
{
    public static void main(String[] args)
    {
        BankAccount bk = new BankAccount();
        bk.getAccountNumber();
        bk.setDeposite(700f);
        float b2= bk.setWithdraw(500f);
        bk.checkBalance(b2);

    }
}
