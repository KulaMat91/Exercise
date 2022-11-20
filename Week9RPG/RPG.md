Mając na uwadze zasady Clean Code, DRY, KISS, YAGNI oraz SOLID, a także korzystając z wybranych wzorców projektowych, zaprojektuj hierarchię klas i interfejsów oraz zaimplementuj kilka podstawowych mechanik dla gry komputerowej RPG (nie musi to być w pełni funkcjonalna aplikacja):
Gracz - składa się z następujących modułów: tożsamość, statystyki, ekwipunek
Tożsamość gracza - rasa (człowiek, elf, krasnolud, etc.) oraz imię
Statystyki gracza - punkty zdrowia, magii i siły, które mogą się wyczerpywać oraz odnawiać. Ich maksymalny poziom może być powiększany na stałe za pomocą eliksirów oraz tymczasowo za pomocą przedmiotów z ekwipunku.
Ekwipunek gracza - można w nim przechowywać przedmioty, takie jak miecze, eliksiry, zbroja i artefakty. Gracz może "założyć" jeden miecz, jedną zbroję i trzy artefakty, może też wypić eliksir. Ekwipunek ma limit udźwigu. Ekwipunek ma także sakiewkę ze złotem.
Przedmioty - każdy przedmiot można kupić, sprzedać, włożyć do ekwipunku albo użyć. Każdy przedmiot ma swoją wartość w złocie oraz masę.
Miecze zwiększają siłę gracza (dopóki jest założony)
Zbroja zwiększa zdrowie gracza (dopóki jest założona)
Artefakty mogą zwiększać punkty zdrowia, magii lub siły (w zależności od artefaktu, dopóki są założone)
Eliksiry trwałe mogą na stałe zwiększać zdrowie, magię lub siłę gracza po wypiciu (w zależności od eliksiru)
Eliksiry zwykłe mogą odnowić obecny stan zdrowia, magii lub siły gracza po wypiciu (w zależności od eliksiru)
Handlarz - można z nim handlować (kupować przedmioty za złoto lub sprzedawać przedmioty za złoto)
Potwór - można z nim walczyć, po zabiciu daje złoto
Warstwa persystencji - gra posiada funkcjonalność zapisywania stanu gracza oraz innych obiektów w różnych formach - może to być plik JSON, może to być baza danych SQL, etc.

PROCES: