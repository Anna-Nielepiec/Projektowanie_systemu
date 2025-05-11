# Projektowanie_systemu

SYSTEM DO OBSŁUGI SIECI PRZYCHODNI LEKARSKICH 

Dorota Bober
Anna Nielepiec
Mateusz Ziarkiewicz

Informatyka, niestacjonarne, 3 rok
Grupa 2






1. Cel projektu 
Przedmiotem projektu jest system przeznaczony do obsługi sieci przychodni lekarskich. Wdrożenie oprogramowania ma na celu usprawnienie funkcjonowania rejestracji i gabinetu lekarskiego w przychodniach. Aplikacja umożliwi pacjentom na samodzielny zapis do lekarza poprzez kalendarz dostępny online. Dodatkowo będzie dostępna dokumentacja medyczna, e-zwolnienia i e-recepty.
Lekarze będą mieli ułatwienie w tworzeniu dokumentacji medycznej. Szybki dostęp do informacji na temat przebytych chorób pacjentów, przyjmowanych leków. 
Projekt przyspieszy obsługę pacjentów czekających w kolejce i umożliwi przyjęcie większej ilości osób.

2. Szczegółowy opis wymagań 
a) Wymagania funkcjonalne: 
    • system umożliwia rejestrację i logowanie użytkowników, 
    • system wymaga podania roli każdego użytkownika, determinującej jego uprawnienia, 
    • system umożliwia personelowi dodanie pacjenta do Rejestru pacjentów poprzez ręczne wpisanie jego danych,
    • pacjent może uzyskać dostęp do systemu w celu umawiania wizyt poprzez uzyskanie danych do logowania od personelu,
      Terminarz 
    • na początku każdego miesiąca lekarze/personel tworzą terminarze, gdzie podawany jest id lekarza, jego dostępność i numer gabinetu,
    • na podstawie terminarzy personel tworzy listę terminów możliwych do rezerwacji,
    • pacjent samodzielnie (jeśli ma utworzone konto w systemie) lub w rejestracji może planować wizyty z puli dostępnych terminów udostępnionych online,
    • system wysyła powiadomienia SMS do zaplanowanych pacjentów dzień przez zaplanowaną wizytą, 
    • w systemie dostępny jest podgląd terminarza dla lekarzy z możliwością anulowania zaplanowanych wizyt oraz zmianą ich terminu i wysłaniem powiadomienia SMS do pacjenta, 
    • system obsługuje dodanie do terminarza godzin otwarcia gabinetu w poszczególne dni przez użytkownika o roli lekarz, 
    • system umożliwia anulowanie zaplanowanego terminu przez pacjenta (z podaniem powodu),
      Realizacja wizyty 
    • system umożliwia lekarzowi przyjęcie zaplanowanego pacjenta z terminarza, 
    • system umożliwia wprowadzenie godzin rozpoczęcia i zakończenia wizyty, 
    • w systemie dostępne jest wybranie rozpoznania ze słownika rozpoznań - słownik może być uzupełniany ręcznie lub poprzez pobranie go ze strony NFZ, 
    • w systemie jest możliwość uzupełnienia ręcznie opisu wizyty, 
    • w systemie jest możliwość wybrania opisu wizyty z dostępnych szablonów - szablony dodają lekarze i są one widoczne oraz edytowalne dla wszystkich użytkowników o roli lekarz, 
    • w systemie jest możliwość skopiowania opisu i rozpoznania z poprzedniej wizyty pacjenta
      Recepta 
    • w systemie jest możliwość wystawienia e-recepty (zgodnie z wytycznymi NFZ) oraz recepty papierowej przez użytkownika o roli lekarz, 
    • w oknie dodawania recepty możliwe jest dodawanie leków z oficjalnego słownika leków wczytywanego z pliku, 
    • na recepcie jest możliwość wyboru poziomu refundacji leku, 
    • w systemie użytkownik o roli lekarz ma dostęp do podglądu dotychczas wypisywanych pacjentowi leków, które może wybrać do skopiowania na nową receptę, 
    • w systemie użytkownik ma możliwość wydruku recepty w wymaganych przez NFZ formatach na dostępnej drukarce, 
    • w systemie lekarz ma dostęp do zapisanych leków recepturowych i system umożliwia mu dodanie do recepty leku ze słownika zapisanych leków recepturowych, 
    • użytkownik o roli lekarz ma możliwość dopisania własnego leku recepturowego do słownika poprzez użycie odpowiedniego przycisku w oknie dodawania recepty 
      Zwolnienie 
    • w systemie użytkownik o roli lekarz ma możliwość wystawiania e-zwolnień i wysyłania bezpośrednio do pracodawcy na postawie wytycznych NFZ 
    • system umożliwia lekarzowi wystawianie papierowych zwolnień 
    • w systemie lekarz ma możliwość wydruku zwolnienia zgodnie z wymaganym szablonem 
      Skierowanie 
    • system udostępnia lekarzowi wystawianie skierowania do szpitala, pracowni, gabinetu oraz wydruk tego skierowania na dostępnej drukarce, 
      Rozliczenia 
    • system udostępnia użytkownikowi z odpowiednimi uprawnieniami informacje o ubezpieczeniu pacjenta poprzez odpowiednie oznaczenie go na liście Rejestru pacjentów,
    • w systemie jest możliwość dodania rozliczenia pacjenta na podstawie dostępnych umów przez użytkownika o odpowiednich uprawnieniach, 
    • system obsługuje wysłanie rozliczeń do NFZ.

b) Wymagania niefunkcjonalne: 
    • hasło powinno zawierać co najmniej 8 znaków, w tym minimum 1 cyfrę, znak specjalny, wielką literę,
    • działanie na różnych urządzeniach (responsywność),
    • spełnienie zasady WCAG 2.1 (dotępność strony dla osób z niepełnosprawnościami),
    • średnic czas otrzymania odpowiedzi do 1 sekundy,
    • możliwość jednoczesnego przeglądu terminarza przez minimum 20 użytkowników,
    • brak możliwości wybrania tego samego terminu przez więcej niż 1 użytkownika,
    • słownik rozpoznań ICD-9 jest pobierany z oficjalnej strony NFZ,
    • lekarz musi posiadać pulę numerów recept żeby wystawić receptę,
    • podgląd wydruków w PDF - obsługa Adobe Reader.

3. Ograniczenia
    • kompatybilność ze starszymi wersjami przeglądarek internetowych,
    • dokumenty i raporty w formacie dostosowanym do OpenOffice,
    • ograniczenia wynikające z szyfrowania danych wrażliwych,
    • czas realizacji projektu – 10 miesięcy.

4. Użytkownicy systemu
    • administrator systemu – prace konserwacyjne
    • pracownicy recepcji – rejestracja pacjentów w systemie; umawianie na wizyty; przygotowywanie terminarza,
    • lekarze – uzupełnianie dokumentacji medycznej; wystawianie recept, skierowań i zwolnień lekarskich
    • pacjenci – umawianie się na wizyty, przeglądanie własnej dokumentacji medycznej

Przy określaniu wymagań kluczowym użytkownikiem jest lekarz kierujący placówką, w drugiej kolejności osoba odpowiedzialna za kierowanie recepcją, pacjenci mają najniższy priorytet.

5. Diagram przypadków użycia

![przypadki_użycia](https://github.com/user-attachments/assets/551a59ed-6ba1-45a5-921a-fcd5bbcd3fa8)


6. Scenariusze do wszystkich przypadków użycia


7. Diagramy czynności

Zaplanowanie wizyty:

![zaplanowanieWizyty](https://github.com/user-attachments/assets/567d4fe5-9aef-4c73-b21d-9c81bc06901e)

Utworzenie terminarza:

![utworzenieTerminarza](https://github.com/user-attachments/assets/2086319f-d931-4cb7-bfcb-341ca3f8caa3)

Rejestracja pacjenta:

![RejestracjaPacjenta](https://github.com/user-attachments/assets/1cf753d5-92f3-45f7-bdd1-78811890c606)

Logowanie do systemu:

![LogowanieSystem](https://github.com/user-attachments/assets/7c5993af-7c5d-4def-b564-6fd92a224b6f)

Przegląd danych pacjenta:

![PrzegladDanychPacjenta](https://github.com/user-attachments/assets/11908e67-958a-4384-8c08-dced97038ec7)

Utworzenie recepty:

![UtworzenieRecepty](https://github.com/user-attachments/assets/e6e7e08a-d134-427d-92d0-f2fe37fdd548)

Utworzenie skierowania:

![UtworzenieSkierowania](https://github.com/user-attachments/assets/143fdd79-5836-4ac4-9487-4a5b105bcfb0)


8. Diagram ERD

![Logical](https://github.com/user-attachments/assets/7f462b8e-4859-42d6-95ea-ee8469ca865c)


9. Diagram klas

![diagramKlas](https://github.com/user-attachments/assets/47882a5c-6be7-4ba5-9626-8489aa8df317)


10. Diagramy sekwencji

Zaplanowanie wizyty:

![SekwzaplanowanieWizyty](https://github.com/user-attachments/assets/44f74866-75fb-4cf8-8e00-b27a094f5b81)

Przegląd danych pacjenta:

![SekwPrzegladDanychPacjent](https://github.com/user-attachments/assets/905860a6-036a-47da-8a9a-196cd33c121e)

Wystawienie e-recepty:

![SekwWystawienieRecepty](https://github.com/user-attachments/assets/221a7f27-84b9-4bf0-9702-24fd7a93bbff)


11. Diagramy stanów

Dla obiektu recepta:

![StanRecepta](https://github.com/user-attachments/assets/da4f61ef-6f32-46b8-b0dc-0b3f0561a8ed)

Dla obiektu wizyta:

![StanWizyta](https://github.com/user-attachments/assets/8e2e9f2d-640c-4faf-9e53-dc4b72a2f057)

12. Diagram wdrożenia

![Wdrozenie](https://github.com/user-attachments/assets/f56f4513-e404-42c0-8faa-44943dae757e)


13. Plan procesu testowania
Cel testowania: Celem procesu testowania jest zapewnienie, że system do obsługi sieci przychodni lekarskich działa zgodnie z wymaganiami funkcjonalnymi i niefunkcjonalnymi oraz spełnia oczekiwania wszystkich grup użytkowników.
Zakres testów:
    1. Testy jednostkowe (Unit Tests):
        ◦ Testowanie poszczególnych modułów aplikacji, takich jak rejestracja pacjentów, terminarz, wystawianie recept, itp. 
        ◦ Weryfikacja poprawności logiki biznesowej (np. sprawdzanie, czy pacjenci mogą umawiać się na wolne terminy). 
    2. Testy integracyjne (Integration Tests):
        ◦ Sprawdzenie komunikacji między modułami, np. rejestr pacjentów zintegrowany z terminarzem. 
        ◦ Testy poprawności przesyłania danych między aplikacją a zewnętrznymi systemami (np. NFZ). 
    3. Testy systemowe (System Tests):
        ◦ Testowanie aplikacji jako całości na różnych urządzeniach i przeglądarkach (zgodnie z wymaganiem responsywności). 
        ◦ Weryfikacja zgodności z zasadami WCAG 2.1. 
    4. Testy wydajnościowe (Performance Tests):
        ◦ Testowanie szybkości działania systemu przy 20 jednoczesnych użytkownikach. 
        ◦ Analiza czasu odpowiedzi na zapytania. 
    5. Testy użyteczności (Usability Tests):
        ◦ Testowanie interfejsu użytkownika z perspektywy lekarzy, recepcjonistów i pacjentów. 
        ◦ Ocena intuicyjności nawigacji. 
    6. Testy regresji (Regression Tests):
        ◦ Weryfikacja, że nowe zmiany w systemie nie wpływają negatywnie na istniejące funkcjonalności. 
    7. Testy akceptacyjne (Acceptance Tests):
        ◦ Testowanie aplikacji przez rzeczywistych użytkowników, aby potwierdzić jej gotowość do wdrożenia. 
Harmonogram testowania:
    1. Testy jednostkowe: 2 tygodnie. 
    2. Testy integracyjne: 1 tydzień. 
    3. Testy systemowe: 2 tygodnie. 
    4. Testy wydajnościowe i użyteczności: 1 tydzień. 
    5. Testy regresji: 1 tydzień. 
    6. Testy akceptacyjne: 1 tydzień. 
Oczekiwane wyniki:
    • Wszystkie kluczowe funkcje działają poprawnie. 
    • żadne krytyczne błędy nie występują w systemie. 

14. Raport z analizy rynku
Cel analizy: Celem analizy rynku jest zidentyfikowanie konkurencyjnych rozwiązań i określenie potrzeb użytkowników w zakresie systemów obsługi przychodni lekarskich.
1. Identyfikacja konkurencji: Na rynku dostępne są liczne systemy do zarządzania przychodniami, takie jak:
    • Medchart: System zintegrowany z e-receptami i dokumentacją medyczną, nastawiony na ułatwienie pracy lekarzy. 
    • mMedica: Popularny system oferujący rozliczenia z NFZ oraz zarządzanie dokumentacją pacjentów. 
    • KAMSOFT: Rozwiązanie obsługujące duże sieci przychodni, umożliwiające kompleksowe zarządzanie placówką. 




