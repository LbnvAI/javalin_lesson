package org.anton;

import io.javalin.Javalin;

public class JavalinApp {
    public static void main(String[] args) {
        // Создаем приложение
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });
        // Описываем, что загрузится по адресу /
        app.get("/", ctx -> ctx.result("Hello World"));
        // Стартуем веб-сервер
        app.start(7070);
    }
}