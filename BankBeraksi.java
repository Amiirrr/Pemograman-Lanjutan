package hp;

public class BankBeraksi {
    public static void main (String args[]){
        Bank bank = new Bank();
        bank.getUang();
        bank.simpanUang(500000);
        bank.ambilUang(150000);
    }     
}
