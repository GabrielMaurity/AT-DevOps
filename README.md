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

### Como rodar com Docker Compose
O ambiente sobe a API, banco de dados (Postgres), cache (Redis) e um container de teste.
```bash
docker compose up -d --build
