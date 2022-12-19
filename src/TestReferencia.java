public class TestReferencia {
 public static void main(String[] args) {
  Cuenta primeraCuenta = new Cuenta();
  primeraCuenta.setSaldo(400);
  
  Cuenta segundaCuenta = new Cuenta();
  segundaCuenta.setSaldo(400);
  System.out.println(primeraCuenta.getSaldo());
  System.out.println(segundaCuenta.getSaldo());
  
  segundaCuenta.setSaldo(segundaCuenta.getSaldo() + 400);
 
  System.out.println(primeraCuenta.getSaldo());
  System.out.println(segundaCuenta.getSaldo());
 
  if ( primeraCuenta.getSaldo() == segundaCuenta.getSaldo() ) {
   System.out.println("Son el mismo objeto");
  } else {
   System.out.println("Son diferentes");
  }
 }
}
