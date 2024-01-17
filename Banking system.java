import java.util.*;
class BankAccount
{
    Scanner sc=new Scanner(System.in);
    int balance=1000;
    String accountholdername;
    String accountnumber;
    BankAccount(String acno,String holno)
    {
        this.accountholdername=holno;
        this.accountnumber=acno;
        this.balance=balance;
    }
    void display()
    {
        System.out.println("Account holder name:"+accountholdername);
        System.out.println("Account number:"+accountnumber);
        System.out.println("your balance:"+balance);
    }
    
    void deposit()
    {
        System.out.print("enter amount to deposit:");
        int amount=sc.nextInt();
        balance+=amount;
        System.out.println("amount "+amount+" is deposited");
        System.out.println("balance amount:"+balance);
    }
    void withdrawl()
    {
        System.out.print("enter amount to withdraw: ");
        int amount=sc.nextInt();
        if(amount<balance)
        {
        balance=balance-amount;
        System.out.println("Balance amount:"+balance);
        }
        else
        {
            System.out.println("insufficient funds");
        }
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        BankAccount bank=new BankAccount("ANDB2086","koushik");
        System.out.println("enter the option you want:");
        System.out.println("1.Display user details");
        System.out.println/*-("2.Deposit");
        System.out.println("3.Withdraw Amount");
        Scanner sc=new Scanner(System.in);
        int expression=sc.nextInt();
        switch(expression)
        {
            case 1:
                {
                //System.out.println("user details:");
                bank.display();
                break;
                }
                case 2:
                    {
                        //System.out.print("Deposit");
                        bank.deposit();
                        break;
                    }
                case 3:
                    {
                        //System.out.print("withdraw:");
                        bank.withdrawl();
                        break;
                    }
                default:
                System.out.println("invalid input!!");
        }
         
        /*bank.display();
        bank.deposit();
        bank.withdrawl();*/
    }
}