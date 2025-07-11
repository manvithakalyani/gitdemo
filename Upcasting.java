
class Bank {
    public void display() {
        System.out.println("Bank Details");
    }
}

class HDFCBank extends Bank {
    public void loan() {
        System.out.println("Home Loan at 8%");
    }
}

public class Upcasting {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) {
		       // HDFCBank bank = new HDFCBank();  // 🔼 Upcasting
			 		Bank bank = new HDFCBank();
			 		HDFCBank bank1=(HDFCBank) bank;
		        bank.display();              // ✅ Allowed
		    //     bank.loan(); 
		    
	}

}
