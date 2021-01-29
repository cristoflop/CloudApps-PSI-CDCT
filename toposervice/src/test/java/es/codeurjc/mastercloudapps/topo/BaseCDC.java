package es.codeurjc.mastercloudapps.topo;

import es.codeurjc.mastercloudapps.topo.controller.TopoController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseCDC {

    @Autowired
    private TopoController topoController;

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(this.topoController);
    }

}
