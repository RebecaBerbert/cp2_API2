
# 📄 Documentação do Projeto – API Spring Boot

## 📌 1. Visão Geral

Este projeto é uma API REST desenvolvida com **Spring Boot**, com o objetivo de gerenciar duas entidades principais:

* 🚗 **Carros**
* 🏥 **Pacientes (Consultório)**

A API permite realizar operações CRUD (Create, Read, Update, Delete) para ambas as entidades.

---

## 🛠️ 2. Tecnologias Utilizadas

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* Maven
* Jakarta Persistence (JPA)

---

## 📁 3. Estrutura do Projeto

```
src/main/java/com/github/biloschycki/carro
│
├── CarroApplication.java        # Classe principal
│
├── controller/                 # Camada de controle (API REST)
│   ├── CarroController.java
│   └── ConsultorioController.java
│
├── model/                      # Entidades do banco
│   ├── Carro.java
│   └── Consultorio.java
│
├── repository/                 # Acesso ao banco (JPA)
│   ├── CarroRepository.java
│   └── ConsultorioRepository.java
│
└── resources/
    └── application.properties  # Configurações
```

---

## 🚀 4. Inicialização da Aplicação

A aplicação é iniciada pela classe:

```java
CarroApplication.java
```

Ela contém o método `main`, responsável por subir o servidor Spring Boot.

---

## 📦 5. Entidades (Model)

### 🚗 Carro

Tabela: `carros`

| Campo  | Tipo   | Descrição     |
| ------ | ------ | ------------- |
| id     | Long   | Identificador |
| nome   | String | Nome do carro |
| ano    | int    | Ano do carro  |
| marca  | String | Marca         |
| modelo | String | Modelo        |

---

### 🏥 Consultório (Paciente)

Tabela: `pacientes`

| Campo   | Tipo   | Descrição        |
| ------- | ------ | ---------------- |
| id      | Long   | Identificador    |
| nome    | String | Nome do paciente |
| tutor   | String | Responsável      |
| idade   | int    | Idade            |
| especie | String | Espécie          |

---

## 🗄️ 6. Repositórios

Os repositórios utilizam **Spring Data JPA**, permitindo operações automáticas no banco.

### CarroRepository

```java
public interface CarroRepository extends JpaRepository<Carro, Long>
```

### ConsultorioRepository

```java
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long>
```

---

## 🌐 7. Endpoints da API

A API utiliza versionamento via variável:

```
api/${api.version}
```

---

### 🚗 Carros

Base URL:

```
/api/{version}/carros
```

#### ➕ Criar carro

`POST /carros`

#### 🔍 Buscar por ID

`GET /carros/{id}`

#### 📋 Listar todos

`GET /carros`

#### ✏️ Atualizar

`PUT /carros/{id}`

#### ❌ Deletar

`DELETE /carros/{id}`

---

### 🏥 Pacientes (Consultório)

Base URL:

```
/api/{version}/pacientes
```

#### ➕ Criar paciente

`POST /pacientes`

#### 🔍 Buscar por ID

`GET /pacientes/{id}`

#### 📋 Listar todos

`GET /pacientes`

#### ✏️ Atualizar

`PUT /pacientes/{id}`

#### ❌ Deletar

`DELETE /pacientes/{id}`

---

## 🔄 8. Fluxo da Aplicação

1. O cliente faz uma requisição HTTP
2. O **Controller** recebe a requisição
3. O Controller chama o **Repository**
4. O Repository acessa o banco de dados
5. A resposta é retornada via `ResponseEntity`

---

## ⚠️ 9. Observações Importantes

* O `id` não é gerado automaticamente → deve ser informado manualmente
* Não há camada de serviço (Service), a lógica está direto no controller
* Não há validações (ex: campos obrigatórios, formatos)
* Não há tratamento de exceções global

---

## 💡 10. Possíveis Melhorias

* ✅ Adicionar `@GeneratedValue` no ID
* ✅ Criar camada **Service**
* ✅ Implementar validações (`@Valid`)
* ✅ Criar tratamento global de erros (`@ControllerAdvice`)
* ✅ Documentar com Swagger/OpenAPI
* ✅ Adicionar autenticação (Spring Security)

---

Se quiser, posso:

* transformar isso em **PDF pronto pra entrega**
* gerar **documentação estilo Swagger**
* ou montar um **roteiro de apresentação igual você fez antes**

Só me fala 👍
