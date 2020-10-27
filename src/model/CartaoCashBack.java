package model;

public class CartaoCashBack extends CartaoPrePago {

	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public boolean comprar(double valor) {
		if (valor > super.saldo) {
			return false;
		} else {
			super.saldo = super.saldo - valor;
			if (tipo == 0) {        // tipo GOLD
				super.saldo = super.saldo + valor * 0.08;
		    }
			else if (tipo == 1) {   // tipo SILVER
				super.saldo = super.saldo + valor * 0.05;
			}
			else if (tipo == 2) {   // tipo BRONZE
				super.saldo = super.saldo + valor * 0.02;
			}
			return true;
		}
	}

	

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "CartaoCashBack [numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}

}