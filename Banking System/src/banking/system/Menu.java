/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.util.*;
class Menu{
    char option;

    BankingSystem banking = new BankingSystem();
    Deposit d= new Deposit();
    int prevTransaction;
    void getPrevTransaction()
    {
        if(prevTransaction>0)
        {
            System.out.println(prevTransaction + " is credited in Your Account");
        }
        else if(prevTransaction<0)
        {
            System.out.println(Math.abs(prevTransaction) + " is debited from your Account");
        }
        else
        {
            System.out.println("No Transaction occured");
        }
    }
    public void showMenu()
    {
        System.out.println("WELCOME RAM" );
        

        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("===============================================================================================");
            System.out.println("Please Select an option below:");
            System.out.println("Press A to Deposit Amount.");
            System.out.println("Press B to Withdraw Amount.");
            System.out.println("Press C to View Balance");
            System.out.println("Press D to see last transaction");
            System.out.println("Press E for Exit");
            System.out.println("----------------------------------------------\n");
            System.out.println ("Press a key:");
            option = scanner.next().charAt(0);
            System.out.println("===============================================================================================\n");
        
            switch (option) {
                case 'A':
                    Deposit d = new Deposit();
                    int depamt =  d.userInput();
                    prevTransaction = depamt;
                    banking.add(depamt);
                    break;
                    
                case 'B':
                    System.out.println("Please Enter the amount to withdraw:");
                    int withamt=scanner.nextInt();
                    prevTransaction = -withamt;
                    banking.withdrw(withamt);
                    break;
                    
                case 'C':
                    System.out.println("Your Account Balance is "+banking.getBalance()+" Rupees");
                    System.out.println(" "); 
                    break;
                    
                case 'D':
                    getPrevTransaction();
                    System.out.println(" ");  
                    break;
                    
                case 'E':
                    System.out.println(" ");  
                    break;
        
                default:
                    System.out.println("Please enter a valid key");                    
                    break;
            }
        }while(option!='E');
        System.out.println("exited...");
        System.out.println("Thank you for using our services");
    }

}