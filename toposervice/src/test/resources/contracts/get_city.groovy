package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Get info from city"
    request {
        url "/api/topographicdetails/${regex(".*")}"
        method GET()
    }
    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                [
                        id       : "Recas",
                        landscape: "Flat"
                ]
        )
    }
}