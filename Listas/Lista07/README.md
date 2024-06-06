1 - Crie um pacote chamado escola.
2 - Dentro do pacote escola, crie a classe base Usuario.
● Atributos:
○ nome: String - Representa o nome do usuário.
○ email: String - Representa o email do usuário.
○ Os atributos devem ser privados.
● Construtor:
○ Crie um construtor que inicialize os atributos nome e email com os valores
fornecidos.
● Métodos:
○ public void exibirInfo(): Este método deve imprimir o nome e o
email do usuário.
● Getters e Setters:
○ Desenvolva getters e setters para cada um dos atributos.
3 - Crie a subclasse Aluno que herda de Usuario.
● Atributo adicional:
○ matricula: String - Representa a matrícula do aluno.
○ O atributo deve ser privado.
● Construtor:
○ Crie um construtor que inicialize os atributos nome, email e matricula
com os valores fornecidos.
● Métodos:
○ Sobrescreva o método exibirInfo() da super classe, para que, além de
exibir o nome e o email do usuário, exiba também a matrícula do aluno.
○ Sobrecarregue o método exibirInfo(boolean exibirNome, boolean
exibirEmail, boolean exibirMatricula), cada parâmetro é um
booleano que representa um atributo, e imprima cada atributo onde seu
parâmentro booleano seja true.
● Getter e Setter:
○ Desenvolva getter e setter para o atributo adicional.
4 - Crie a subclasse Professor que herda de Usuario.
● Atributo adicional:
○ disciplina: String - Representa o departamento do professor.
○ O atributo deve ser privado.
● Construtor:
○ Crie um construtor que inicialize os atributos nome, email e disciplina
com os valores fornecidos.
● Métodos:
○ Sobrescreva o método exibirInfo() para que, além de exibir o nome e o
email do usuário, exiba também o departamento do professor.
○ Sobrecarregue o método exibirInfo(boolean exibirNome, boolean
exibirEmail, boolean exibirDisciplina), cada parâmetro é um
booleano que representa um atributo, e imprima cada atributo onde seu
parâmentro booleano seja true.
● Getter e Setter:
○ Desenvola getter e setter para o atributo adicional.
Na classe App:
● Método main:
○ Crie uma instância de Aluno utilizando o construtor com parâmetros.
○ Crie uma instância de Professor utilizando o construtor com parâmetros.
○ Chame os métodos exibirInfo (O sobrescrito e o
sobrecarregado) para cada objeto, utilizando diferentes combinações de
parâmetros booleanos.