package io.specto.hoverfly.junit.core;

public class HoverflyConstants {

    public static final int DEFAULT_PROXY_PORT = 8500;
    public static final int DEFAULT_ADMIN_PORT = 8888;
    public static final int DEFAULT_HTTPS_ADMIN_PORT = 443;

    // Hoverfly custom auth header name
    public static final String X_HOVERFLY_AUTHORIZATION = "X-HOVERFLY-AUTHORIZATION";

    // Environment variable names
    public static final String HOVERFLY_AUTH_TOKEN = "HOVERFLY_AUTH_TOKEN";

    public static final String LOCALHOST = "localhost";
    public static final String HTTP = "http";
    public static final String HTTPS = "https";

    public static final String DEFAULT_HOVERFLY_EXPORT_PATH = "src/test/resources/hoverfly";
    public static final String DEFAULT_HOVERFLY_RESOURCE_DIR = "hoverfly";

    private HoverflyConstants() {
    }
}
