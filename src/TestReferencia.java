public class TestReferencia {
 public static void main(String[] args) {
  Cuenta primeraCuenta = new Cuenta();
  primeraCuenta.saldo = 400;
  
  Cuenta segundaCuenta = new Cuenta();
  segundaCuenta.saldo = 400;
  System.out.println(primeraCuenta.saldo);
  System.out.println(segundaCuenta.saldo);
  
  segundaCuenta.saldo += 400;
 
  System.out.println(primeraCuenta.saldo);
  System.out.println(segundaCuenta.saldo);
 
  if ( primeraCuenta.saldo == segundaCuenta.saldo ) {
   System.out.println("Son el mismo objeto");
  } else {
   System.out.println("Son diferentes");
  }
 }
}
