package jp.toastkid.verification.javalin;

import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        Javalin.create()
                .start(8080)
                .get("/", context -> context.result("Hello World!"));
    }

}