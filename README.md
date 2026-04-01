Calculator Java Project

Ovaj repozitorijum sadrži jednostavan kalkulator napisan u Javi.

Static Code Analysis Report

Ovaj izveštaj prikazuje broj linija koda (LOC) i zapažanja iz statičke analize za projekat calculator-java.

Tabela sa LOC i zapažanjima:

| Fajl               | Broj linija | Zapažanje                                                                 |
|-------------------|------------|---------------------------------------------------------------------------|
| Calculator.java   | 120        | Metoda `calculate()` je duga i obavlja više različitih operacija – može se podeliti na manje funkcije. Nedostatak komentara za javne metode. |
| Main.java         | 50         | Nedostaju komentari, varijable `a` i `b` nisu jasno imenovane.           |
| Operations.java   | 80         | Duplirani kod za osnovne operacije (sabiranje, oduzimanje). Duga metoda za svaku operaciju, može se optimizovati. |
| Utils.java        | 30         | Varijable `temp` i `result` nisu opisane. Neke metode mogu biti statične. |
| README.md         | 10         | Nema zapažanja – fajl informativnog karaktera.                            |

Ukupno LOC: 290 linija

Napomene za statičku analizu (Code Smell):
Dugačke metode (calculate())
Duplirani kod u Operations.java
Nedostatak komentara i dokumentacije
Nejasna imena promenljivih (a, b, temp)
Potencijalni rizik: deljenje sa nulom nije provereno u operacijama
