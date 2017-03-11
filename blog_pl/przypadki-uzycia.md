[//]: # (title: Przypadki użycia; create_date: 2017-03-11; publish_date: 2017-03-11;)

[uc-main-admin]: https://raw.githubusercontent.com/cyprianno/mailblackbox/master/blog_pl/main-admin.png
[uc-project-and-email]: https://raw.githubusercontent.com/cyprianno/mailblackbox/master/blog_pl/project-adm-email.png
[uc-user-account]: https://raw.githubusercontent.com/cyprianno/mailblackbox/master/blog_pl/user-account.png

Główne pliki dokumentacji - przypadki użycia. Źródła znajdują się na GH: https://github.com/cyprianno/mailblackbox/tree/master/docs/use-case

Aplikacja będzie podzielona na trzy API:

1. Administracja aplikacją. Można będzie ograniczyć dostęp do tych zasobów z określonych adresów IP na poziomie loadbalancera. 
Administrator główny będzie miał dostęp do modyfikacji wszystkich elementów serwisu. Tu też można będzie umieścić usługi monitorujące.
![Main admin use case][uc-main-admin]

2. Konto użytkownika. Zarządzanie kontem, hasłem, dostępem oauth.
![User account use case][uc-user-account]

3. Główne API aplikacji. Związane z projektami użytkownika i właściwą funkcjonalnością.
![Application use case][uc-project-and-email]
