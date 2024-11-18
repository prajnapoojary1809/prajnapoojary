package Task4.Problem3;

public class BankAccount {

        private long accountNumber=6789735328l;
        private float balance=8000;

        void setDeposite(float deposite){
            checkBalance(balance);
            balance+=deposite;
            typeOfTransaction(balance,'d');
        }
        float setWithdraw(float withdraw){
            checkBalance(balance);
            balance-=withdraw;
            typeOfTransaction(balance, 'w');
            return balance;
        }

        void getAccountNumber(){
            System.out.println("AccountNumber:"+ accountNumber);
        }
        void checkBalance(float balance){
            System.out.println(" Balance: " +balance);
        }

        void typeOfTransaction(float balance,char ch) {
            String trans = ch == 'd' ? " Deposit" : " Withdrawal";
            System.out.println("Balance after" + trans + " :" + balance);
        }
    }

