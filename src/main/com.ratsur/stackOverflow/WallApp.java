//package com.ratsur.stackOverflow;
//
//import java.net.URI;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
//
//public class WallApp
//{
//    public static void main(String[] args) {
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create("https://wallhaven.cc/api/v1/w/pkgkkp"))
//                .build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        WallHaven post = mapper.readValue(response.body(), new TypeReference<WallHaven>() {
//        });
//        System.out.println(post);
//    }
//}
