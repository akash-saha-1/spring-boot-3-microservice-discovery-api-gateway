### This is microservice based application where components are api-gateway, eureka discovery service, global configuration for different applications, employee-service and department-service
1) Web CLient adapter and rest client adapter 6.1 working document => https://docs.spring.io/spring-framework/reference/integration/rest-clients.html#rest-http-interface-return-values
2) spring 6.0 adapter example: https://dev.to/glefloch/easy-http-client-with-spring-6x-4gdh
3) To run zipkins in using docker: docker run -d -p 9411:9411 openzipkin/zipkin 
4) springboot-3-microservices
5) first start global config service which will make the configs for all apps available globally.
6) the start service registry which will start eureka backend service.
7) the start employee-service and then department service which will be availble through url
8) and then start api-gateway
9) remember that eureka is running on this url -> http://localhost:8761/eureka