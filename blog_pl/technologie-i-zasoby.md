Plan wszystkiego, co będzie potrzebne podczas rozwoju aplikacji. Zaczynamy od dokumentacji:
- UML w PlantUML - dzięki temu można łatwo wersjonować diagramy oraz wyszukiwac w nich
- Dokumenty w markdown - uniwersjalny sposób formatowania tekstu
- Dokumentacja API w Swagger - wygenerowana z kodu i dostarczana razem z aplikacją

Wykonanie aplikacji:
- Główna techonologia Java
- Główny framework spring-boot

Wdrożenie
- Automatyczne budowanie / Automatyczny deployment (Jenkins)
- Aplikacja dostarczana jako wykonywalne obrazy dockera, alternatywnie wykonywalne jary
- Wersja bundle - obrazy dockerowe dla aplikacji i wszystkich zależności

Zależności zewnętrzne aplikacji:
- baza danych MySQL
- AcitveMQ
- serwer smtp

Potrzeby serwerowe:
- serwer budowania jenkins - jeden VPS
- serwer testów integracyjnych - jeden VPS
- serwer produkcyjny - jeden VPS
- repozytorium obrazów dockera - Cloud Storage
