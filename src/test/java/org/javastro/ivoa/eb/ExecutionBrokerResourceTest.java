package org.javastro.ivoa.eb;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class ExecutionBrokerResourceTest {
    @Test
    void testCapabilitiesEndpoint() {
        given()
          .when().get("/eb/sessions/needs_uuid")
          .then()
             .statusCode(200)
             ;//TODO test return
    }

}