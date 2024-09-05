package CuentaBancaria;

public class CuentaBancaria1 {

    public String account_number;
    public double balance;
    public String owner;


    public CuentaBancaria1(String account_number, double initial_balance, String owner){
        this.account_number = account_number;
        this.owner = owner;
        this.balance = initial_balance;

    }
    public void deposit (double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposito realizado correctamente. Nuevo saldo: $ " + balance);

        } else {
            System.out.println("Cantidad invalida. no se puede depositar una cantidad negativa o cero.");
        }
    }
    public void withdraw (double amount){
        if (balance > amount){
            balance -= amount;
            System.out.println("Retiro realizado exitosamente. Nuevo saldo: $ " + balance);
        }else if (balance < amount ){
            System.out.println("No tiene dinero para retirar.");

        }else {
            System.out.println("Ingrese un valor valido para retirar.");
        }


    }
    public void get_balance(){
        System.out.println("El saldo actual es: $" + balance);
    }

}