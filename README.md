"# git-refactoring-mip-2017-nemethmarci" 

---

Program som refaktoroval, aby fungoval bezpečnejšie, práve preto prístup k atribútom som obmedzil na používanie set a get metód.

Aby program bol rýchlejší, boli odstránené zbytočné elementy, ako nepoužité scannery a rôzne if-else podmienky - čo bolo možné využitím princípu polymorfizmu.

Je rozšírená aj jeho funkcionalita - pridal som možnosť vybrať z viacerých typov šiat a vytvoril som vlastnú triedu na uloženie adresy, ktorá už obsahuje podrobnejšie informácie.

Okrem toho, aby celý kód bol prehľadnejší a zrozumiteľnejší, mená jednotlivých atribútov a metód sú zmenené na jasnejšie výrazy.

---

Fungovanie programu:

Program vytvorí inštanciu triedy Client pre každého používateľa, spojí objednávky s objednávateľmi, spracúva dáta, vypočíta cenu a nakoniec vypíše zoznam všetkých objednávok.

Na výstupe sa objavia inštancie objektov, ktoré obsahujú ich atribúty a cenu, čo je vypočítaná na základe kombinácie materiálu, veľkosti, typu a takým spôsobom poskytujú informácie objednávateľom.
