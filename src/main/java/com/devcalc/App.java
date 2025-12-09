package com.devcalc;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        // Inicializa o serviço
        CalculatorService service = new CalculatorService();

        // Inicia o servidor na porta 7000 (padrão do Javalin)
        Javalin app = Javalin.create().start(7000);

        // Endpoint de Soma
        app.get("/add", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.add(a, b)));
        });

        // Endpoint de Subtração
        app.get("/subtract", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.subtract(a, b)));
        });

        // Endpoint de Multiplicação
        app.get("/multiply", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.multiply(a, b)));
        });

        // Endpoint de Divisão
        app.get("/divide", ctx -> {
            double a = Double.parseDouble(ctx.queryParam("a"));
            double b = Double.parseDouble(ctx.queryParam("b"));
            ctx.result(String.valueOf(service.divide(a, b)));
        });
    }
}