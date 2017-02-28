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
- /PAPI/v1.0/abc-abc-abc-abc/configuration - global configuration management
- /PAPI/v1.0/abc-abc-abc-abc/out/config - outgoing mail configuration management (Default/SMTP)
- /PAPI/v1.0/abc-abc-abc-abc/out/template - template list management
- /PAPI/v1.0/abc-abc-abc-abc/out/template/ff-ff-ff-ff - template management
- /PAPI/v1.0/abc-abc-abc-abc/out/message - send message (1..)
- /PAPI/v1.0/abc-abc-abc-abc/out/message/cba-cba-cba-cba - message management
- /PAPI/v1.0/abc-abc-abc-abc/out/messageset - message set management
- /PAPI/v1.0/abc-abc-abc-abc/in/config - incomming message configuration (IMAP, time)
- /PAPI/v1.0/abc-abc-abc-abc/in/message - incomming messages
- /PAPI/v1.0/abc-abc-abc-abc/in/script - incomming messages parsing script (libraries)
- /PAPI/v1.0/abc-abc-abc-abc/in/filter - filters (workflow); ordering, conditions, attach script
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

USE CASE:
A. Instalacja i konfiguracja globalna
1. Instalacja przy pomocy wygenerowanego kodu autoryzacji
2. Konfiguracja - włączenie/wyłączenie rejestracji
3. Automatyczna instalacja na podstawie zmiennych systemowych (docker env)

B. Obsługa kont użytkowników przez Administratora
1. Rejestracja nowego użytkownika
2. Zablokowanie konta
3. Usunięcie konta
4. Aktualizacja danych

C. Rejestracja/Logowanie użytkownika
1. Rejestracja za pomocą formularza
2. Logowanie za pomocą loginu i hasła
3. Flow OAuth2
4. Aktualizacja danych

D. Wiadomości wychodzące
1. Wyślij wiadomość email
2. Zdefiniuj szablon
3. Wyślij wiadomość używając szablonu
4. Skonfiguruj SMTP serwer
5. Wyślij wiadomość używając serwera SMTP

TEST CASE:

A. Rejestracja/Logowanie
1. Rejestracja użytkownika za pomocą formularza; przy rejestracji tworzony jest projekt; sukces=użytkownik w bazie, 200 i liczba projektów=1
2. Rejestracja użytkownika za pomocą OAuth; przy rejestracji tworzony jest projekt; sukces=użytkownik w bazie, 200 i liczba projektów=1
3. Resetowanie hasła (procedura z kodem w email); sukces=zmienione hasło w bazie
4. Logowanie użytkownika zarejestrowanego za pomocą formularza używając loginu i hasła; sukces=kod 200 przy pobraniu danych użytkownika
5. Logowanie użytkownika zarejestrowanego za pomocą formularza używając OAuth; sukces=kod 200 przy pobraniu danych użytkownika
6. Logowanie użytkownika zarejestrowanego za pomocą OAuth używając OAuth; sukces=kod 200 przy pobraniu danych użytkownika
7. Logowanie użytkownika zarejestrowanego za pomocą OAuth używając Loginu i hasła (login=email, hasło należy zresetować); sukces=kod 200 przy pobraniu danych użytkownika
