# asyncapi-codegen-scst

## Overview
This repo contains code artifacts that were used in my AsyncAPI Code Generation Blog + Video. 

* [Blog Link](https://solace.com/blog/asyncapi-codegen-microservices-using-spring-cloud-stream)
* [Video Link](https://www.youtube.com/watch?v=QEDL6AqsaJc)

## Artifacts
* Acme_Rideshare_EP_Export.json: This is my Solace Event Portal Application Domain Export
* ExpenseIntegration.yaml: This is the AsyncAPI document I exported from the Event Portal and used for Code Generation
* ExpenseIntegration/: This directory is what was generated from from the AsyncAPI Code Generator 
* AsyncAPI Code Gen Command: `ag -force-write -o ExpenseIntegration -p binder=solace -p actuator=true -p artifactId=ExpenseIntegration -p groupId=acme.rideshare -p javaPackage=acme.rideshare.expense -p host=localhost:55555 -p username=default -p password=default -p msgVpn=default ExpenseIntegration.yaml https://github.com/asyncapi/java-spring-cloud-stream-template.git`

## License

This project is licensed under the Apache License, Version 2.0. - See the [LICENSE](LICENSE) file for details.

## Resources

For more information try these resources:

- The Solace Developer Portal website at: https://solace.dev
- Ask the [Solace Community](https://solace.community)
