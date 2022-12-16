public class Cuenta {
 double saldo;
 int agencia;
 int numero;
 String titular;
 
 double depositar( double valor ) {
 this.saldo += valor;
 return this.saldo;
 }
 double retirar(double valor ) {
  this.saldo -= valor;
  return this.saldo;
 }
}