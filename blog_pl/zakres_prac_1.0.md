[//]: # (title: Zakres prac 1.0; create_date: 2017-03-11; publish_date: 2017-03-19;)

Do przypadków użycia dochodzą jeszcze sprawy bardziej techniczne. Najpierw potrzebny będzie core projektu i standardy przepływu danych (co przeważnie przedstawia
się na diagramie warstw). Chciałbym użyć CQRS (Command Query Responsibility Separation), czyli trochę dodatkowej pracy potrzebne będzie
 do przygotowania szkieletu. Mam do dyspozycji pięć tygodni implementacji, w tym jeden tydzień zarezerwowany na rzeczy nie związane z funkcjonalnościami biznesowymi.
 
 Na pewno potrzebne będą elementy zarządzania głównego administratora. W zasadzie wszystkie przypadki użycia będą niezbędne. To jest zadanie startowe, czyli w jego skład
 wejdzie również przygotowanie środowiska. Rezerwacja - 2 tygodnie.
 
 Bardziej szczegółowo:
 - tydzień na założenie projektu i różne prace techniczne
 - tydzień na właściwą funkcjonalność API administracyjnego
 
 Konto użytkownika - to można odłożyć na później. Aplikacja w wersji 1.0 nie będzie zatem w pełni umożliwiała wykorzystania w trybie SaaS. Na pewno trzeba mieć to na
 uwadze przy implementacji pozostałych części, że kiedyś to też będzie wykorzystywane. 0 tygodni.
 
 Główna funkcjonalność. Zakładamy, że użytkownika i projekt założy administrator. Nie będzie na razie czasu na czytanie wiadomości. Zostaje nam zatem wysyłanie
 wiadomości, zarządzanie szablonami i obsługa statusów. Rezerwacja - 3 tygodnie.
 
 Bardziej szczegółowo:
 - przygotowanie modelu API: 1/2 tygodnia
 - wysyłanie pojedynczej wiadomości i zwracanie statusu: 1/2 tygodnia
 - dodawanie/edycja szablonów (z wersjonowaniem) 1 tydzień
 - wysyłanie wiadomości z szablonu: 1/2 tygodnia
 - Możliwość konfiguracji projektu i serwerów: 1/2 tygodnia
 
To już chyba na tyle planowania, czas zabrać się za realizowanie zaplanowanych celów.
 
