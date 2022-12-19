public class PruebaMetodos {
 public static void main(String[] args) {
  Cuenta miCuenta = new Cuenta();
  miCuenta.depositar(400);
  System.out.println(miCuenta.getSaldo());
  miCuenta.depositar(100);
  System.out.println(miCuenta.getNumero());
  miCuenta.retirar(50);
  System.out.println(miCuenta.getAgencia());
  
  Cuenta cuenta2 = new Cuenta();
  cuenta2.depositar(200);
  System.out.println(cuenta2.getSaldo());
  System.out.println(miCuenta.getSaldo());
  
  miCuenta.transferir(50, cuenta2);
  System.out.println(cuenta2.getSaldo());
  System.out.println(miCuenta.getSaldo());
  
  cuenta2.transferir(30, miCuenta);
 
  System.out.println(cuenta2.getSaldo());
  System.out.println(miCuenta.getSaldo());
 }
}
