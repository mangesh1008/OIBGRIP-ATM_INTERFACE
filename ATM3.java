import java.util.Scanner;

public class ATM3
{
	public static void main(String[] args) 
	{

		int choice, pin=0, k;
		long amount=0,deposit=0,withdraw=0;
		Scanner s = new Scanner(System.in);
		char trasction = 'y';
		int ID=112233;
		 do{
		 	System.out.println("Enter your ID : ");
			ID = s.nextInt();
		

			System.out.println("Enter your pin : ");
			pin = s.nextInt();
			

			if(ID != 112233 || pin!=1234)
				System.out.println("Please Enter correct password");
		 }

		while(ID != 112233 && pin!=1234);
		/*{	
			System.out.println("Enter your ID : ");
			String c = s.nextLine();
			ID = c;
			
			System.out.println("Enter your pin : ");
			int i = s.nextInt();
			pin = i;

			if(ID == "admin" && pin!=1234)
				System.out.println("Please Enter correct password");
		}*/
		do
		{
			System.out.println("\n------ATM SERVICE-----\n");
			System.out.println("1. Trasction History");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Transfer");
			System.out.println("5. Quit");

			System.out.println("\n\nEnter your choice : ");
			 choice = s.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("trasction history");
					{
						if ( transactions == 0 ) {
							System.out.println("\nEmpty");
						}
						else {
							System.out.println("\n" + transactionHistory);
						}
					}


				case 2:
					{
						System.out.print("\nEnter amount to withdraw : ");
						Scanner sc = new Scanner(System.in);
						float amount = sc.nextFloat();
						
						try {
								if ( balance >= amount ) {
									transactions++;
									balance -= amount;
										System.out.println("\nWithdraw Successfull");
										String str = amount + " Rs Withdrawed\n";
										transactionHistory = transactionHistory.concat(str);
								}
								else {
									System.out.println("\nInsufficient Balance");
							}
						}
						catch ( Exception e) {
						}
					}
					break;

				case 3:
					{
						System.out.print("\nEnter amount to deposit : ");
						Scanner sc = new Scanner(System.in);
						float amount = sc.nextFloat();
						try {
								if ( amount <= 1000000f ) {
									transactions++;
									balance += amount;
									System.out.println("\nSuccessfully Deposited");
									String str = amount + " Rs deposited\n";
									transactionHistory = transactionHistory.concat(str);
								}
								else {
										System.out.println("\nyou have exceded the limit" + "\nLimit is 5000000.00 only");
								}
						}
						catch ( Exception e) {
						}
					}
					break;

				case 4:
					System.out.println("-------------------Transfer-------------------------");
					{
						Scanner sc = new Scanner(System.in);
						System.out.print("\nEnter Receipent's Name : ");
						String receipent = sc.nextLine();
						System.out.print("\nEnter amount you wish to transfer : ");
						float amount = sc.nextFloat();
						
						try {
								if ( balance >= amount ) {
									if ( amount <= 50000f ) {
										transactions++;
										balance -= amount;
										System.out.println("\nSuccessfully Transfered to " + receipent);
										String str = amount + " Rs transfered to " + receipent + "\n";
										transactionHistory = transactionHistory.concat(str);
									}
									else {
										System.out.println("\nInvalid Transfer..Limit is 49000.00 only");
									}
								}
								else {
										System.out.println("\nInsufficient Balance");
								}
							}
						catch ( Exception e) {
						}
					}
					break;

				case 5:
					{
						System.out.println("\n" + balance + " Rs");
					}
					break;

				default:
					System.out.println("Invalid choice");
			}
		}while(choice!=5);
	}
}
