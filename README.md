timecapsule-rabbit-dtos
========================

Biblioteca com DTOs usados para mensagens RabbitMQ no ecossistema TimeCapsule.

Como usar

1) Instale o artifact localmente (no diretório do projeto):

   mvn clean install

2) Adicione a dependência no pom do seu projeto:

<dependency>
  <groupId>br.com.timecapsuleproject</groupId>
  <artifactId>timecapsule-rabbit-dtos</artifactId>
  <version>0.0.1-SNAPSHOT</version>
</dependency>

Observações
- Os DTOs usam Lombok. Ative o annotation processing no seu IDE.
- Mantive o mesmo package usado no serviço principal: `br.com.timecapsuleproject.timeCapsuleService.dto` para facilitar a substituição.

