public class PruebaEncapsulamiento {
 public static void main(String[] args) {
  Cuenta cuenta = new Cuenta();
  Cliente cliente = new Cliente();
  cliente.setNombre("Diego");
  
  cuenta.setTitular(cliente);
  
  Cliente titular = cuenta.getTitular();
 
  System.out.println(cliente.getNombre());
  System.out.println(cuenta.getTitular().getNombre());
 }
}
