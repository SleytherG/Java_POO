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
  return saldo;
 }
 
 public void setSaldo(double saldo) {
  this.saldo = saldo;
 }
 
 public int getAgencia() {
  return agencia;
 }
 
 public void setAgencia(int agencia) {
  this.agencia = agencia;
 }
 
 public int getNumero() {
  return numero;
 }
 
 public void setNumero(int numero) {
  this.numero = numero;
 }
}