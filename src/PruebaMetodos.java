public class PruebaMetodos {
 public static void main(String[] args) {
  Cuenta miCuenta = new Cuenta();
  miCuenta.depositar(400);
  System.out.println(miCuenta.saldo);
  miCuenta.depositar(100);
  System.out.println(miCuenta.saldo);
  miCuenta.retirar(50);
  System.out.println(miCuenta.saldo);
 }
}
