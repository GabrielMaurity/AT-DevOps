# DevCalc API - DevOps Final Assessment

![Build Status](https://github.com/SEU-USUARIO/devcalc-api/actions/workflows/maven-ci.yml/badge.svg)

Este projeto é a consolidação da disciplina de DevOps. Trata-se de uma API REST em Java (Javalin) para cálculos matemáticos, utilizada para demonstrar práticas de CI/CD, Containerização e Orquestração.

## 👨‍💻 Aluno
**Nome:** [Seu Nome Aqui]
**Curso:** Análise e Desenvolvimento de Sistemas

---

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
