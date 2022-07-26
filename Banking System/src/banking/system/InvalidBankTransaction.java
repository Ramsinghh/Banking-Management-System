
package banking.system;

class InvalidBankTransaction extends Exception
{
     String errorMessage;
     public InvalidBankTransaction(String message)
     {
        errorMessage = message;
     }  

      public String getMessage()
      {
          return errorMessage;
      }
}