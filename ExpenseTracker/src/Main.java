import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;

import java.io.*;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(
                new InetSocketAddress(8080), 0
        );

        server.createContext("/addExpense", (HttpExchange exchange) -> {

            // CORS FIX
            exchange.getResponseHeaders().add(
                    "Access-Control-Allow-Origin", "*"
            );

            exchange.getResponseHeaders().add(
                    "Access-Control-Allow-Methods",
                    "GET, POST, OPTIONS"
            );

            exchange.getResponseHeaders().add(
                    "Access-Control-Allow-Headers",
                    "Content-Type"
            );

            // HANDLE OPTIONS REQUEST
            if ("OPTIONS".equals(exchange.getRequestMethod())) {

                exchange.sendResponseHeaders(204, -1);
                return;
            }

            // HANDLE POST REQUEST
            if ("POST".equals(exchange.getRequestMethod())) {

                InputStream input =
                        exchange.getRequestBody();

                String data =
                        new String(input.readAllBytes());

                // SAVE DATA
                FileWriter writer =
                        new FileWriter("../expenses.txt", true);

                writer.write(data + "\n");

                writer.close();

                System.out.println("Saved: " + data);

                String response =
                        "Expense Added Successfully";

                exchange.sendResponseHeaders(
                        200,
                        response.getBytes().length
                );

                OutputStream os =
                        exchange.getResponseBody();

                os.write(response.getBytes());

                os.close();
            }
        });

        server.start();

        System.out.println(
                "Server Started At http://localhost:8080"
        );
    }
}