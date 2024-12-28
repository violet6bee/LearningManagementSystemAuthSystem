package auth;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new AuthService())
                .build()
                .start();

        System.out.println("Сервер запущен на порту 8080");

        server.awaitTermination();
    }
}