# CS Skins API

Bem-vindo à documentação da API Rest para a loja de skins de Counter-Strike.

## Visão Geral

Esta API foi desenvolvida utilizando Java e Spring Boot para fornecer operações CRUD (Create, Read, Update, Delete) relacionadas à gestão de skins de Counter-Strike em uma loja virtual. Ela permite que os usuários realizem diversas operações, como adicionar novas skins, visualizar o catálogo, atualizar informações e excluir itens.

## Requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:

- [Java](https://www.oracle.com/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Banco de Dados (MySQL)](https://www.mysql.com/)

## Configuração

1. Clone este repositório: `git clone https://github.com/seu-usuario/cs-skins-api.git`
2. Navegue até o diretório do projeto: `cd cs-skins-api`
3. Configure as informações do banco de dados no arquivo `application.properties`.

## Executando a Aplicação

Execute a aplicação utilizando sua IDE preferida ou o seguinte comando Maven:

```bash
mvn spring-boot:run
```

## Endpoints
## Endpoints

A API oferece os seguintes endpoints para interação:

### `GET /skins`

Retorna todas as skins disponíveis no catálogo.

#### Exemplo de Resposta:

```http
GET /skins
Content-Type: application/json

[
  {
    "id": 1,
    "name": "AK-47 | Aquamarine Revenge",
    "rarity": "Covert",
    "price": 150.00
  },
  {
    "id": 2,
    "name": "AWP | Dragon Lore",
    "rarity": "Legendary",
    "price": 2000.00
  },
  // ... outras skins
]
```
