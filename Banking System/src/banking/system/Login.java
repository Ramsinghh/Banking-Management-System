/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;
import java.util.*;
class Login{
    int ac_number = 12345678;
    int ac_pass = 32145;
    int ac;
    int pw;

    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the account number:");
        ac = scanner.nextInt();

        System.out.println("Enter the Password:");
        pw = scanner.nextInt();

    }

    public void verify() throws Exception{
         
        if(ac == ac_number && pw==ac_pass)
        {
            System.out.println("Login Successfull!");

            BankingSystem banking = new BankingSystem();
            System.out.println(" ");
            System.out.println("Your Balance is: "+banking.getBalance()+"  Rupees");
            System.out.println(" ");
            Menu menu = new Menu();
            menu.showMenu();
        }else{
            InvalidBankTransaction loginfailed = new InvalidBankTransaction("Incorrect login credentials");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }


}