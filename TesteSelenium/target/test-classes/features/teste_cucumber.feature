#language: pt
Funcionalidade: Cadastro de Veiculos

  Cenario: Preenchimento do Formulario
    Dado que estou na pagina da aplicacao
    E preencho a aba Enter Vehicle Data
    E preencho a aba Enter Insurant Data
    E preencho a aba Enter Product Data
    E preencho a aba Select Price Option
    E preencho a aba Send Quote e submeto o formulario
    Entao devo ver a mensagem: "Sending e-mail success!"
