public class CrearCuenta {
 public static void main(String[] args) {
  // Variable         =  Valor
  Cuenta primeraCuenta = new Cuenta();
  primeraCuenta.setSaldo(1000);
//  primeraCuenta.pais = "Peru"; No compila
  System.out.println(primeraCuenta.getSaldo());
  
  Cuenta segundaCuenta = new Cuenta();
  segundaCuenta.setSaldo(500);
  System.out.println(segundaCuenta.getSaldo());
  System.out.println(primeraCuenta.getAgencia());
  
 }
}
