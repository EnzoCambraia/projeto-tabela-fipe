package br.com.alura.TabelaFipe;

import br.com.alura.TabelaFipe.model.*;
import br.com.alura.TabelaFipe.service.HttpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class TabelaFipeApplication {
	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(TabelaFipeApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha o tipo de veículo: ");
		System.out.println("1 - Carros");
		System.out.println("2 - Motos");
		System.out.println("3 - Caminhões");

		int opcao = scanner.nextInt();

		TipoVeiculo tipoSelecionado;

		switch (opcao){
			case 1 -> tipoSelecionado = TipoVeiculo.CARROS;
			case 2 -> tipoSelecionado = TipoVeiculo.MOTOS;
			case 3 -> tipoSelecionado = TipoVeiculo.CAMINHOES;
			default -> {
				System.out.println("Opção inválida, insira apenas uma das três opções. Encerrando a aplicação");
				return;
			}
		}
		HttpService http = new HttpService();
		try{

			String url = "https://parallelum.com.br/fipe/api/v1/" + TipoVeiculo.CARROS.getValor() + "/marcas";
			Marca[] marcas = http.get(url, Marca[].class);

			for (Marca m : marcas) {
				System.out.println(m.getCodigo() + " - " + m.getMarca());
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\nDigite o código da marca desejada");
		String codigoMarca = scanner.next();

		String urlModelos = "https://parallelum.com.br/fipe/api/v1/" + tipoSelecionado.getValor() + "/marcas/" + codigoMarca + "/modelos";
		// Requisição de exibição dos modelos
		ModelosResponse respostaModelos = http.get(urlModelos, ModelosResponse.class);
		respostaModelos.getModelos().forEach(System.out::println);

		System.out.println("\nDigite o código do modelo desejado");
		String codigoModelo = scanner.next();

		String urlAnos = "https://parallelum.com.br/fipe/api/v1/" + tipoSelecionado.getValor() + "/marcas/" + codigoMarca + "/modelos/" + codigoModelo + "/anos";
		//Requisição de exibição de anos

		Ano[] anos = http.get(urlAnos, Ano[].class);

		System.out.println("Anos disponíveis");

		for (Ano a : anos) {
			System.out.println(a);
		}

		System.out.println("\nDigite o código do ano desejado (ex: 2015-1): ");
		String codigoAno = scanner.next();

		String urlVeiculos = "https://parallelum.com.br/fipe/api/v1/" + tipoSelecionado.getValor() + "/marcas/" + codigoMarca + "/modelos/" + codigoModelo + "/anos/" + codigoAno;
		Veiculo veiculo = http.get(urlVeiculos, Veiculo.class);

		System.out.println("Informações sobre o veículo: ");

		System.out.println(veiculo);


	}
}
