package br.com.renan.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.renan.dominio.Pagamento;

import br.com.renan.dados.StaticBD;

public class TestePagamento {
	public static void main(String[] args) {
		List<Pagamento> pagamentos = StaticBD.getPagamentos();
		pagamentos.forEach(System.out::println);
		Double pgHj = pagamentos
				.stream().filter(p -> p.getDataVencimento().equals(LocalDate.now()))
				.mapToDouble(Pagamento::getValor).sum();
		System.out.println(pgHj);
	}
}
