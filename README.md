# DevCalc API - DevOps Final Assessment

[![Hello Workflow](https://github.com/GabrielMaurity/AT-DevOps/actions/workflows/hello.yml/badge.svg)](https://github.com/GabrielMaurity/AT-DevOps/actions/workflows/hello.yml)

Este projeto é a consolidação da disciplina de DevOps. Trata-se de uma API REST em Java (Javalin) para cálculos matemáticos, utilizada para demonstrar práticas de CI/CD, Containerização e Orquestração.

## 🚀 Tecnologias Utilizadas
- **Linguagem:** Java 17 (Maven)
- **Framework:** Javalin
- **Containerização:** Docker & Docker Compose
- **Orquestração:** Kubernetes
- **CI/CD:** GitHub Actions
- **Bancos de Dados:** PostgreSQL e Redis

---

## 📦 Etapa 1: Dockerização
A aplicação foi empacotada utilizando um `Dockerfile` com **Multistage Build** para otimização de imagem.

3. Execute a aplicação (após implementar a classe Main):
   mvn exec:java -Dexec.mainClass="com.devcalc.Main"
---
## 📚 Conceitos de DevOps e Git
**Papel do Git na Entrega Contínua:**
O Git é a espinha dorsal do CI/CD, permitindo que cada mudança no código seja rastreada, versionada e auditada. Ele atua como a "fonte da verdade", onde commits disparam pipelines automatizados que testam e entregam o software.

**Importância de Branches e Tags:**
- **Branches:** Permitem desenvolvimento isolado (Feature Branches) sem quebrar a produção (Main), facilitando Code Reviews e testes paralelos.
- **Tags:** Marcam pontos imutáveis na história (Releases), garantindo que saibamos exatamente qual versão do código está rodando em produção.
### Como rodar com Docker Compose
O ambiente sobe a API, banco de dados (Postgres), cache (Redis) e um container de teste.
```bash
docker compose up -d --build
