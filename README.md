# DevCalc API
[![Hello Workflow](https://github.com/GabrielMaurity/AT-DevOps/actions/workflows/hello.yml/badge.svg)](https://github.com/GabrielMaurity/AT-DevOps/actions/workflows/hello.yml)
## Objetivo
Esta aplicação é uma API REST desenvolvida em Java para realizar operações matemáticas simples (soma, subtração, multiplicação e divisão). O projeto serve como base para validar pipelines de CI/CD, incluindo testes automatizados, dockerização e simulação de deploy.

## Ferramentas Utilizadas
- **Linguagem:** Java 17
- **Framework:** Javalin
- **Build Tool:** Maven
- **Testes:** JUnit 5

## Como executar localmente

1. Clone o repositório:
   git clone https://github.com/SEU-USUARIO/devcalc-api.git

2. Compile o projeto:
   mvn clean install

3. Execute a aplicação (após implementar a classe Main):
   mvn exec:java -Dexec.mainClass="com.devcalc.Main"
---
## 📚 Conceitos de DevOps e Git
**Papel do Git na Entrega Contínua:**
O Git é a espinha dorsal do CI/CD, permitindo que cada mudança no código seja rastreada, versionada e auditada. Ele atua como a "fonte da verdade", onde commits disparam pipelines automatizados que testam e entregam o software.

**Importância de Branches e Tags:**
- **Branches:** Permitem desenvolvimento isolado (Feature Branches) sem quebrar a produção (Main), facilitando Code Reviews e testes paralelos.
- **Tags:** Marcam pontos imutáveis na história (Releases), garantindo que saibamos exatamente qual versão do código está rodando em produção.