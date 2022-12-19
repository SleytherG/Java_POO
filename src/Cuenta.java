public class Cuenta {
 private double saldo;
 private int agencia;
 private int numero;
 Cliente titular = new Cliente();
 
 public void depositar(double valor) {
  this.saldo = this.saldo + valor;
 }
 
 public boolean retirar(double valor) {
  if (this.saldo >= valor) {
   this.saldo = this.saldo - valor;
   return true;
  } else {
   return false;
  }
 }
 
 public boolean transferir(double valor, Cuenta cuentaDestino) {
  if (this.saldo >= valor) {
   this.saldo = this.saldo - valor;
   cuentaDestino.saldo = cuentaDestino.saldo + valor;
   return true;
  }
  return false;
 }
 
 public double getSaldo() {
  return this.saldo;
 }
 
 public void setSaldo(double saldo) {
  this.saldo = saldo;
 }
 
 public int getAgencia() {
  return this.agencia;
 }
 
 public void setAgencia(int agencia) {
  if ( agencia > 0) {
   this.agencia = agencia;
  } else {
   System.out.println("No estan permitidos valores negativos");
  }
 }
 
 public int getNumero() {
  return this.numero;
 }
 
 public void setNumero(int numero) {
  if ( numero > 0) {
   this.numero = numero;
  } else {
   System.out.println("No estan permitidos valores negativos");
  }
 }
}