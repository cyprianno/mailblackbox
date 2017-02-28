Kod:
- http://www.baeldung.com/rest-api-spring-oauth2-angularjs - przykład z authorization server

Projekt API i dokumentacja:
- doxygen ?
- https://apiblueprint.org/ lub http://swagger.io/

Założenia API:
- rozdzielenie API projektu, użytkownika i administratora
- wieloprojektowe; projekt=użytkownik; w przyszłości zarządzanie uprawnieniami?
- API model mapowany na internal model

Przykłady API:
- /AAPI/v1.0/install - create admin user using security code from application startup
- /AAPI/v1.0/pause - pause all or particular project
- /AAPI/v1.0/project - create/update project
- /AAPI/v1.0/project/abc-abc-abc-abc/ - particular project ADMIN management
- /PAPI/v1.0/abc-abc-abc-abc/template - template management
- /PAPI/v1.0/abc-abc-abc-abc/configuration - configuration management
- /PAPI/v1.0/abc-abc-abc-abc/server - configuration: display info about default server, custom SMTP/IMAP server
- /PAPI/v1.0/abc-abc-abc-abc/template/ff-ff-ff-ff - template management
- /PAPI/v1.0/abc-abc-abc-abc/message - send message (1..)
- /PAPI/v1.0/abc-abc-abc-abc/message/cba-cba-cba-cba - message management
- /PAPI/v1.0/abc-abc-abc-abc/messageset - message set management
- /PAPI/v1.0/abc-abc-abc-abc/messageset - message set management
- /PAPI/v1.0/ POST - create project
- /UAPI/v1.0/user/baba-baba-baba-baba - account info
- /UAPI/v1.0/register?
- /UAPI/v1.0/login?


Internal Model:
Template {
uid, name, version, project, header[], title, body, variables, from, cc, bcc
}
Project {
uid, name, email
}
MessageSet {
  uid, messsage[]
}
Message {
uid, status, messageid, data {
  metadata {}, template, rendered { from, to, cc, bcc, header[], title, body }
 }
}
User {
email, password, username (=email), projects
}


Dokumentacja API - opis założeń w dokumencie, przepisanie do adnotacji w java i na podstawie tego wygenerowanie swaggerUI.
