package com.example.msuser.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * Méthode qui configure les règles pour gérer les requêtes CORS. Elle permet
     * les requêtes depuis toutes les origines avec les méthodes GET, POST, PUT et
     * DELETE, et autorise tous les en-têtes.
     *
     * @param registry Le registre CORSRegistry pour configurer les règles CORS.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*") // Autorise toutes les origines (domaines) à effectuer des
                // requêtes
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Autorise les méthodes HTTP spécifiées
                .allowedHeaders("*") // Autorise tous les en-têtes dans la requête
                .allowCredentials(false); // N'autorise pas l'envoi de cookies d'authentification
    }
}
