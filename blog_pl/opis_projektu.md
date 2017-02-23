[//]: # (title: Opis projektu; create_date: 2017-02-23; publish_date: 2017-02-23;)

Czarna skrzynka do wysyłania/odbierania wiadomości email (nie mylić z black mail).
Ogólne założenia:

- dostęp przez REST API
- wysyłanie pełnych wiadomości, lub na podstawie metadanych z wcześniej skonfigurowanym szablonem
- wysyłanie zestawów wiadomości
- opóźnione wysyłanie
- weryfikacja wysłania wiadomości (różne metody do opracowania)
- archiwum/ponowienie
- obsługa załączników
- odczyt wiadomości IMAP z parsowaniem i uruchomieniem powiązanej akcji
  Dodatkowe funkcjonalności:
- weryfikacja poprawnej konfiguracji domeny (zapobieganie wysyłania spamu i kwalifikacji jako spam)
- aplikacja dla wielu rozłącznych użytkowników
- wersjonowanie szablonów i skryptów parsujących

W miarę zwięzły opis, który będzie bardziej rozbudowany przy okazji pisania pełniejszej specyfikacji. Ważne jest, żeby główne cele były przejrzyste. Projekt powstaje od zera, więc będzie tu opisane wszystko po kolei: umle, przypadki testowe, przygotowanie serwerów, budowanie z wdrażaniem no i oczywiście proces powstawania kodu. Blog po polsku, ale wszystkie dokumenty na github postaram się tworzyć w języku angielskim.

Wykonanie wszystkiego w trzy miesiące jest bardzo mało prawdopodobne. Zamierzam wdrożyć projekt w okrojonej wersji i wejść w tryb CI/CD (Continous Integration/Continous Deployment), czyli budowanie, testowanie i wdrażanie wersji na serwer produkcyjny po każdej zmianie. Plan pracy przewidziany jest następująco:

- podpatrzenie konkurencyjnych aplikacji tego typu (znalazłem póki co tylko serwisy w trybie SaaS zamkniętoźródłowe)
- zaprojektowanie ramy funkcjonalnej i niefunkcjonalnej - technologie, przypadki użycia, wymagane zasoby
- zaprojektowanie API
- wybranie zakresu wersji 1.0
- przygotowanie scenariuszy testowych
- uruchomienie serwerów (budowanie, test, produkcja)
- programowanie
- modyfikacje głównych założeń (to zawsze występuje na tym etapie)
- programowanie ...
- uruchomienie pierwszego klienta - podmiana funkcji wysyłania email na stronie internetowej
