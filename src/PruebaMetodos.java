public class PruebaMetodos {
 public static void main(String[] args) {
  Cuenta miCuenta = new Cuenta();
  miCuenta.depositar(400);
  System.out.println(miCuenta.saldo);
  miCuenta.depositar(100);
  System.out.println(miCuenta.saldo);
  miCuenta.retirar(50);
  System.out.println(miCuenta.saldo);
  
  Cuenta cuenta2 = new Cuenta();
  cuenta2.depositar(200);
  System.out.println(cuenta2.saldo);
  System.out.println(miCuenta.saldo);
  
  miCuenta.transferir(50, cuenta2);
  System.out.println(cuenta2.saldo);
  System.out.println(miCuenta.saldo);
 }
}
