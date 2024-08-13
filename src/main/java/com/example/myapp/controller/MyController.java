package com.example.myapp.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/api/greeting")
    @Operation(summary = "Metodo get", description = "Envia un saludo es esta url /api/greeting ")
    @ApiResponse(responseCode = "200", description = "Data successfully received.")
    @ApiResponse(responseCode = "400", description = "Bad request, invalid data.")
    public String getGreeting() {
        return "Hello, World!";
    }

    @PostMapping("/api/submit")
    @Operation(summary = "Metodo post", description = "Recibe un valor desde el cuerpo de la peticion con url /api/submit ")
    @ApiResponse(responseCode = "200", description = "Data successfully received.")
    @ApiResponse(responseCode = "400", description = "Bad request, invalid data.")
    public String submitData(@RequestBody String data) {
        return "Data received: " + data;
    }

    @GetMapping("/api/user/{id}")
    @Operation(summary = "Metodo get", description = "Optiene un usuario por el id url /api/user/{id} ")
    @ApiResponse(responseCode = "200", description = "Data successfully received.")
    @ApiResponse(responseCode = "400", description = "Bad request, invalid data.")
    public String getUserById(@PathVariable("id") Long id) {
        return "User ID: " + id;
    }

    @GetMapping("/api/search")
    @Operation(summary = "Metodo get", description = "Realiza una busqueda por medio de un parametro de la url url /api/search ")
    @ApiResponse(responseCode = "200", description = "Data successfully received.")
    @ApiResponse(responseCode = "400", description = "Bad request, invalid data.")
    public String search(@RequestParam(name = "query", defaultValue = "") String query) {
        return "Search results for: " + query;
    }
}
