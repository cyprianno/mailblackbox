Kod:
- http://www.baeldung.com/rest-api-spring-oauth2-angularjs - przykład z authorization server

Projekt API i dokumentacja:
- doxygen ?
- https://apiblueprint.org/ lub http://swagger.io/

Założenia API:
- rozdzielenie API projektu, użytkownika i administratora
- wieloprojektowe; projekt=użytkownik; w przyszłości zarządzanie uprawnieniami?

Przykłady API:
- /AAPI/v1.0/install - create admin user using security code from application startup
- /AAPI/v1.0/pause - pause all or particular project
- /AAPI/v1.0/project - create/update project
- /AAPI/v1.0/project/abc-abc-abc-abc/ - particular project ADMIN management
- /API/v1.0/abc-abc-abc-abc/template - template management
- /API/v1.0/abc-abc-abc-abc/configuration - configuration management
- /API/v1.0/abc-abc-abc-abc/template/ff-ff-ff-ff - template management
- /API/v1.0/abc-abc-abc-abc/message - send message (1..)
- /API/v1.0/abc-abc-abc-abc/message/cba-cba-cba-cba - message management
- /API/v1.0/abc-abc-abc-abc/messageset - message set management
- /UAPI/v1.0//messageset - message set management


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
