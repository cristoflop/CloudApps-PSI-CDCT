package es.codeurjc.mastercloudapps.topo;

import es.codeurjc.mastercloudapps.planner.models.LandscapeResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureStubRunner(
        ids = {"es.codeurjc.test:cdct_ejem:+:stubs:8080"},
        stubsMode = StubsMode.LOCAL)
class DemoApplicationTests {

    @Test
    void verify_get_city_service() {
        RestTemplate restTemplate = new RestTemplate();

        LandscapeResponse response = restTemplate.getForObject("http://localhost:8080/api/topographicdetails/Recas", LandscapeResponse.class);

        assertEquals("Recas", response.getId());
        assertEquals("Flat", response.getLandscape());
    }

}