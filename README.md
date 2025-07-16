# 📊 Tabela FIPE - Consulta de Preço de Veículos

🙋‍♂️ Desenvolvido por
Enzo Cambraia — estudante de Engenharia de Software, apaixonado por Java e pela construção de soluções úteis e bem estruturadas.

Aplicação Java que consome a [API pública da Tabela FIPE](https://deividfortuna.github.io/fipe/) para consultar preços médios de veículos no Brasil.

Desenvolvido como projeto de estudo em programação Java e APIs REST.

---

## 🚗 Funcionalidades

- Escolha entre Carro, Moto ou Caminhão
- Listagem das marcas disponíveis
- Listagem dos modelos da marca escolhida
- Listagem dos anos disponíveis para o modelo
- Consulta detalhada de valor médio do veículo

---

## 🧰 Tecnologias e conceitos aplicados

- Java 17+
- API REST com `HttpClient`
- Manipulação de JSON com `Jackson`
- Uso de Generics (`<T>`) para requisições flexíveis
- Organização por pacotes (model, service)
- Streams e Programação Funcional
- Enum para controle de tipos de veículos
- Tratamento de erros simples
- IntelliJ IDEA + Maven

---

## 🔗 API Utilizada

- API pública da FIPE:  
  👉 [`https://deividfortuna.github.io/fipe/`](https://deividfortuna.github.io/fipe/)

---

## 💻 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seuusuario/tabela-fipe-java.git
2. Abra no IntelliJ ou em sua IDE favorita

3. Certifique-se de ter o Java 17+ instalado

4. Rode a classe TabelaFipeApplication com o método main()

✨ Exemplo de uso

Escolha o tipo de veículo: 
1 - Carros
2 - Motos
3 - Caminhões

Digite o código da marca desejada: 21
Digite o código do modelo desejado: 4828
Digite o código do ano desejado: 2013-1

🧾 Dados do Veículo:
Marca: FIAT
Modelo: UNO MILLE ECONOMY
Ano Modelo: 2013
Combustível: Gasolina
Valor Médio: R$ 18.507,00



📚 Aprendizados
Este projeto foi essencial para fixar:

Boas práticas com programação funcional em Java

Requisições HTTP e desserialização com Jackson

Estruturação de aplicações reais em camadas

Interação com APIs REST externas

Criação de modelos DTO baseados em JSON

Controle de fluxo de execução baseado em entrada do usuário

📌 Licença
Este projeto é open-source, uso livre para fins educacionais e profissionais.
