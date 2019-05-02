//Created By Emma Seehousz on 4/16
public class Question9_7Tester {

	public static void main(String[] args) {
		Question9_7Class account = new Question9_7Class(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2_500);
        account.deposit(3_000);
        
        System.out.format("Balance:[%s]  Montly:[%s]  Date:[%s]\n", account.getBalance(), account.getMontlyInterest(), account.getDateCreated());
    }

}
