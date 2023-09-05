public class Account {
    private String accountHolder;
    private double quantity;

    private person persona;

    public Account(String accountHolder, double quantity, person persona) {
        this.accountHolder = accountHolder;
        this.quantity = quantity;
        this.persona = persona;
    }

    public person getPersona() {
        return persona;
    }

    public void setPersona(person persona) {
        this.persona = persona;
    }

    public Account(String accountHolder, double quantity){
        this.accountHolder = accountHolder;
        this.quantity = quantity;
    }

    //Getter & Setter

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
            this.quantity = quantity;
        }

        //deposit

        public void deposit(double inputCash) {
            if (inputCash<0){
                setQuantity(quantity);
            }else {
                setQuantity(quantity + inputCash);
            }
        }

        //withdraw

        public void withdraw(double outputCash){
            if(outputCash>quantity){
                setQuantity(quantity);
            }else {
                setQuantity(quantity - outputCash);
            }
        }

        //Show Account

        public void showAccount(){
            System.out.println("Account holder: "+accountHolder);
            System.out.println("Balance: $"+quantity);
        }
    @Override
    public String toString() {
        return "Account{accountHolder='" + accountHolder + "', quantity=" + quantity + "}";
    }

}

