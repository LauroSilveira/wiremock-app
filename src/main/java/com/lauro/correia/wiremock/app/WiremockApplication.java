package com.lauro.correia.wiremock.app;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WiremockApplication {
    private static final Logger logger = LoggerFactory.getLogger(WiremockApplication.class);
    private static final String PATH_FILES = "src/main/resources/wiremock";

    public static void main(String[] args) {
        logger.info("Starting wiremock server...");
        final var wireMockServer = new WireMockServer(WireMockConfiguration.options()
                .port(8082)
                .usingFilesUnderClasspath(PATH_FILES));

        wireMockServer.start();
        logger.info("Started wiremock server on port: {}!", wireMockServer.port());

        wireMockServer.addMockServiceRequestListener((request, response) -> {
            logger.info("Received request: {}", request);
            logger.info("Sending response: {}", response.getBodyAsString());
        });

    }
}