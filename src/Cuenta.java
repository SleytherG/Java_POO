public class Cuenta {
 double saldo;
 int agencia;
 int numero;
 String titular;
 
 public void depositar(double valor) {
  this.saldo = this.saldo + valor;
 }
 
 public void retirar(double valor) {
  this.saldo = this.saldo - valor;
 }
 
 public void transferir(double valor, Cuenta cuentaDestino) {
  this.saldo = this.saldo - valor;
  cuentaDestino.saldo = cuentaDestino.saldo + valor;
 }
}