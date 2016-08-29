package br.trainee.aline.banco2;

public class Conta {

	private double saldo;

	void deposita(double valor) {
		this.saldo += valor;
	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void atualiza(double taxa) {
		this.saldo = this.saldo * taxa;
	}
}
