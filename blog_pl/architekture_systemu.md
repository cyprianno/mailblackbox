[//]: # (title: Architektura systemu; create_date: 2017-03-19; publish_date:  2017-03-19;)

[arch-high-level]: https://raw.githubusercontent.com/cyprianno/mailblackbox/master/blog_pl/system-high-level.png

Architektura wysokopoziomowa, komponenty z których będzie się składał system. Każdy package / cloud / database / node to osobny kontener dockera. 
Wszystko powinno się zmieścić na początku na jednej maszynie wirtualnej. Na początek diagram (źródło: https://github.com/cyprianno/mailblackbox/blob/master/docs/architecture/system-high-level.puml)
 
 ![Architecture high level][arch-high-level]
 
Trochę wyjaśnień:

NGINX to punkt wejściowy. Obsługuje certyfikaty SSL i ewentualnie w przyszłości load balancer

Tylko mailbox-app używa bazy danych. Reszta systemu jest bezstanowa i tylko raportuje do głównego serwera.

Serwer konfiguracji - pojedynczy punkt udostępniający zmienne dla danej instancji systemu. Będzie serwował różne ustawienia w zależności od tego, czy jest to 
wersja testowa czy produkcyjna, oraz udostępni możliwość włączania i wyłączania funkcjonalności przy indywidualnych wdrożeniach.
 
Pracownicy - odpowiadają za wysyłanie (w przyszłości odbieranie) email. W jakiś sposób trzeba będzie ich zidentyfikować, żeby maile wysyłały się z poprawnego adresu IP.
 Potrzebny będzie też system monitorowania postfix sprawdzający, czy wiadomość rzeczywiście została wysłana, czy jest jeszcze w kolejce. Potrzebne będzie zatem 
 przechowywanie spool i logów między restartami.
 
 Na podstawie tego diagramu można przygotować plik docker-compose.yml, który wystartuje nam cały system.