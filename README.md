"# git-refactoring-mip-2017-nemethmarci" 

---

Fungovanie programu:

Program vytvorí inštanciu triedy Client pre každého používateľa, spojí objednávky s objednávateľmi, spracúva dáta, vypočíta cenu a nakoniec vypíše zoznam všetkých objednávok.

Na výstupe sa objavia inštancie objektov, ktoré obsahujú ich atribúty a cenu, čo je vypočítaná na základe kombinácie materiálu, veľkosti, typu a takým spôsobom poskytujú informácie objednávateľom.

---

Program je refaktorovaný s účelom, aby fungoval bezpečnejšie, práve preto prístup k atribútom je obmedzený na používanie set a get metód.

Aby program bol rýchlejší boli odsrtánené zbytočné elementy, ako nepoužité scannery a rôzne if-else podmienky - čo bolo možné využitím princípu polymorfizmu.

Je rozšírená aj jeho funkcionalita - pridaná možnosť vybrať z viacerých typov šiat.

Okrem toho, aby celý kód bol prehľadnejší a zrozumiteľnejší, mená jednotlivých atribútov a metód sú zmenené na jasnejšie výrazy.
