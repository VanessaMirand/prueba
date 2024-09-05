package CuentaBancaria;

public class NuevaCuenta {
    public static void main(String[] args) {
        CuentaBancaria1 Nueva_Cuenta = new CuentaBancaria1("37300005873", 500, "Sergio Triana");

        Nueva_Cuenta.deposit(4000);
        Nueva_Cuenta.withdraw(1000);
        Nueva_Cuenta.get_balance();

}
}
