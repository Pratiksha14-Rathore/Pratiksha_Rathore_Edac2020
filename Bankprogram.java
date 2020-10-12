package Day4;
import java.util.Scanner;
class BankHome
{
    Scanner sc1=new Scanner(System.in);
    private static int accountNo;
    private static String name;
    private static String accounttype;
    private static int accountBal;
    
    void deposite()
    {
        System.out.println("Enter Deposite Amount : ");
        int amount=sc1.nextInt();
        accountBal=amount;
    }
    
     void withdraw()
    {
         System.out.println("Enter withdrawal Amount : ");
         int amount=sc1.nextInt();
        if(accountBal>=amount)
        {
            accountBal=accountBal-amount;
        }
        else
        {
            System.out.println("No money to withdraw");
        }
    }
    
   static void checkBal()
    {
       System.out.println("Bal is = "+accountBal); 
    }
   
    void createAccount()
   {
       System.out.println("Enter info : ");
       
       System.out.println("enter account number: ");
     accountNo=sc1.nextInt(); 
     
     System.out.println("enter account name: ");
     sc1.nextLine();
     name=sc1.nextLine();
     
     System.out.println("enter account type: ");
     accounttype=sc1.nextLine();
     
     System.out.println("enter account balance: ");
     accountBal=sc1.nextInt();
     
     System.out.println("Display info : ");
     
     System.out.println("Account no is = "+accountNo);
     System.out.println("Account holder name is ="+name);
     System.out.println("Account TYpe is = "+accounttype);
     System.out.println("Account balance is = "+accountBal);
             
   }
   
    public static void main(String[] args)
    {
        BankHome bh=new BankHome();
        int choice;
        do
        {
           System.out.println("Enter Choice : ");
           
           System.out.println("1.Deposite"+"  2.Withdraw" + "  3.CheckBal" + "  4.CreateAccount"+"  5.Exit");
           
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
           
           switch(choice)
           {
               case 1:
                   bh.deposite();
                   break;
                   
               case 2:
                   bh.withdraw();
                   break;
                   
               case 3:
                   checkBal();
                   break;
                   
               case 4:
                   bh.createAccount();
                   break;
                
               case 5:
                   System.out.println("Exit");
                   break;
                   
               default:
                   System.out.println("Wrong choice...!!!!");
                   break;  
                  
           }
           
           
        }while(choice!=5);
        
        
        
    }
}