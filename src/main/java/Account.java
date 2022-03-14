import java.util.Scanner;

public class Account {
    private int accountNo;
    private String accountName;
    private String accountSurname;
    private long balance;

    Scanner scanner=new Scanner(System.in);

    public Account(int accountNo, String accountName, String accountSurname, long balance){
        this.accountName=accountName;
        this.accountNo=accountNo;
        this.accountSurname=accountSurname;
        this.balance=balance;
    }

    public Account(){}

    public int getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(int accountNo){
        this.accountNo=accountNo;
    }
    public void openAccount(){
        System.out.println("Enter No");
        accountNo=scanner.nextInt();
        System.out.println("Enter Name");
        accountName=scanner.next();
        System.out.println("Enter Surname");
        accountSurname=scanner.next();
        System.out.println("Enter Balance");
        balance=scanner.nextInt();

    }
    public void showAccount(){
        System.out.println("Account number is: " + accountNo +". Name is: "+ accountName+ ". " +
                "Surname is: "+accountSurname + ". Your balance is: "+ balance + "." );
    }

}
