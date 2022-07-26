package banking.system;
import java.util.*;
class Deposit{
    int amt= 0;
    
    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        amt = scanner.nextInt();
        int prevTransaction=amt;
        if(amt<=0)
        {
            InvalidBankTransaction depositnegativeError = new InvalidBankTransaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }else{   
            return amt;
        }

        return amt;
        
    }

}