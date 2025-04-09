
# 📊 Projeto Final - Conversor Spring Boot

Aplicação web desenvolvida com **Spring Boot** como parte da disciplina de Desenvolvimento Web III.  
Este projeto permite que o usuário:

1. Insira dados pessoais (nome, idade e altura)
2. Realize uma conversão de valores de **dólar para real**

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Maven
- Thymeleaf
- HTML + CSS (estilo básico)
- IntelliJ IDEA (IDE recomendada)

---

## 📁 Estrutura do Projeto

```
conversor/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.projetofinal/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── service/
│   │   │       └── conversor/ (classe principal)
│   │   ├── resources/
│   │   │   ├── static/css/style.css
│   │   │   ├── templates/
│   │   │   │   ├── formularioPessoa.html
│   │   │   │   ├── resultadoPessoa.html
│   │   │   │   ├── formularioConversao.html
│   │   │   │   └── resultadoConversao.html
│   │   │   └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

---

## ⚙️ Como executar o projeto

### 1. Clone o repositório:
```bash
git clone https://github.com/guiijorge/DSWIII
```

### 2. Acesse o diretório:
```bash
cd conversor
```

### 3. Execute o projeto:

- No IntelliJ: execute a classe `ConversorApplication`
- Ou via terminal:
```bash
./mvnw spring-boot:run
```

### 4. Acesse no navegador:

```bash
http://localhost:8080
```

- **Formulário de Pessoa:** `/formulario-pessoa`
- **Formulário de Conversão:** `/formulario-conversao`

---

## ✍️ Desenvolvido por

- Guilherme Jorge Silva  
- Curso em Desenvolvimento de Software Multiplataforma (DSM) – 3º Semestre  
- Projeto para disciplina de Desenvolvimento Web III
