# PowerGreen<br>![GitHub repo size](https://img.shields.io/github/repo-size/wagnermor/PowerGreen_BackEnd?color=green) [![GitHub](https://img.shields.io/github/license/wagnermor/PowerGreen_BackEnd)](https://github.com/wagnermor/PowerGreen_BackEnd/blob/main/LICENSE) ![GitHub top language](https://img.shields.io/github/languages/top/wagnermor/PowerGreen_BackEnd?color=green)
**PowerGreen**<br>*Energia limpa em moviento*
# Sobre o projeto

[https://powerGreen.com.br](https://github.com/wagnermor/PowerGreen_BackEnd "Projeto powerGreen")
PowerGreen é uma aplicação full stack, web e mobile, construída como projeto integrador durante o bootcamp **JAVA FullStack** oferecido por [Generation](https://brazil.generation.org "Site da Generation") e [Zé Delivery](https://www.ze.delivery "Site do Zé Delivery").

A aplicação consiste em um e-commerce para locação de bateria recaregável (powerbank) para veículos elétricos, onde é feito o cadastro e login do usuário e depois de logado, são listadas as baterias disponíveis para locação.


## Fluxo do usuário 
```mermaid
graph TD;
Página_principal-->Cadastro/usuário;
Página_principal-->Login_usuário;
Cadastro/usuário-->Login_usuário;
Login_usuário-->Escolha_da_assinatura;
Escolha_da_assinatura-->Escolha_da_bateria;
Escolha_da_bateria-->Pagamento_adicional;
Escolha_da_bateria-->Finaliza_pedido;
Pagamento_adicional-->Finaliza_pedido;
```

## DER - Diagrama Entidade Relacionamento
![DER](./assets/DER.png)

# Tecnologias utilizadas
## Back end &nbsp; ![GitHub language count](https://img.shields.io/github/languages/count/wagnermor/PowerGreen_BackEnd?color=green)

- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Implantação em produção
- Back end: 
- Banco de dados: MySQL

# Como executar o projeto

## Back end
Pré-requisitos: Java 17<

```bash
# clonar repositório
git clone https://github.com/wagnermor/PowerGreen_BackEnd

# entrar na pasta do projeto back end
cd powerGreen

# executar o projeto
./mvnw spring-boot:run
```
# Colaboradores

| [![Github: Wagner Moreira](https://wsrv.nl/?url=avatars.githubusercontent.com/u/47096330?v=4&w=100&h=100&fit=cover&mask=circle)<br>Wagner Moreira<br>![](https://img.shields.io/github/followers/wagnermor?style=social)](https://github.com/wagnermor) | [![Github: Marlon Bassoto](https://wsrv.nl/?url=avatars.githubusercontent.com/u/120661184?v=4&w=100&h=100&fit=cover&mask=circle)<br>Marlon Bassoto<br>![](https://img.shields.io/github/followers/Killbazz?style=social)](https://github.com/Killbazz) | [![Github: Joel Jr.](https://wsrv.nl/?url=https://avatars.githubusercontent.com/u/120653890?v=4&w=100&h=100&fit=cover&mask=circle)<br>Joel Jr.<br>![](https://img.shields.io/github/followers/Joeljrbeginner?style=social)](https://github.com/Joeljrbeginner) | [![Github: Carol Bertulli](https://wsrv.nl/?url=https://avatars.githubusercontent.com/u/120660461?v=4&w=100&h=100&fit=cover&mask=circle)<br>Carol Bertulli<br>![](https://img.shields.io/github/followers/CarolBertulli?style=social)](https://github.com/CarolBertulli) |
|:---:|:---:|:---:|:---:|
| [![Github: Jessica Cavalcante](https://wsrv.nl/?url=https://avatars.githubusercontent.com/u/120189007?v=4&w=100&h=100&fit=cover&mask=circle)<br>Jessica Cavalcante<br>![](https://img.shields.io/github/followers/jess59cavalcante?style=social)](https://github.com/jess59cavalcante) | [![Github: Gustavo Henrique](https://wsrv.nl/?url=https://avatars.githubusercontent.com/u/117678443?v=4&w=100&h=100&fit=cover&mask=circle)<br>Gustavo Henrique<br>![](https://img.shields.io/github/followers/Jotapppe?style=social)](https://github.com/Jotapppe) | [![Github: Henrique Vieira](https://wsrv.nl/?url=https://avatars.githubusercontent.com/u/120190249?v=4&w=100&h=100&fit=cover&mask=circle)<br>Henrique Vieira<br>![](https://img.shields.io/github/followers/HenriqueFerreirav?style=social)](https://github.com/HenriqueFerreirav) |  |
