package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	BankAccount bobsAccount = new BankAccount();

	bobsAccount.setAccountNumber("1234555");
	bobsAccount.deposit(50.0);
    bobsAccount.deposit(50.0);
	bobsAccount.withdrawal(100.0);

	VipPerson person1 = new VipPerson();
	System.out.println(person1.getName());

	VipPerson person2 = new VipPerson("Bob" , 25000.0);
	System.out.println(person2.getEmailAddress());

	VipPerson person3 = new VipPerson("Bob" , 27000.0, "bob@email.com");
	System.out.println(person2.getName());
    }
}
