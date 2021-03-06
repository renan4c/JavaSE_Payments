package br.com.renan.dados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.renan.dominio.Pagamento;

public class StaticBD {
	private static List<Pagamento> pagamentos = new ArrayList<>();
	
	static {
		pagamentos.add(new Pagamento(1, "Mouse", LocalDate.of(2020, 8, 20), 45.00, true));
		pagamentos.add(new Pagamento(2, "Teclado", LocalDate.now(), 145.00, false));
		pagamentos.add(new Pagamento(3, "Material Escritorio", LocalDate.of(2020, 7, 12), 200.00, false));
		pagamentos.add(new Pagamento(4, "Cursos", LocalDate.of(2020, 8, 19), 2300.00, true));
		pagamentos.add(new Pagamento(5, "Cadeira", LocalDate.of(2020, 9, 5), 750.00, false));
		pagamentos.add(new Pagamento(6, "Energia", LocalDate.of(2020, 10, 10), 280.00, false));
		pagamentos.add(new Pagamento(7, "Fatura celular", LocalDate.now(), 190.00, false));
		pagamentos.add(new Pagamento(8, "Fatura Netflix", LocalDate.of(2020, 11, 15), 60.00, false));
	}
	
	public static List<Pagamento> getPagamentos() {
		return pagamentos;
	}
}
