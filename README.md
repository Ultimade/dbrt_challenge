## Feladat:
Kérlek, készíts el egy konténerizálható REST API alkalmazást a Spring Boot keretrendszer használatával!

Az alkalmazás szolgálja ki az alábbi kéréseket:

1. .../melyiknap?DATUM
a paraméterben megadott dátum alapján adja vissza, hogy ez melyik napja a hétnek (például: szerda)

2. .../primszam?SZAM
a paraméterben megadott szám alapján adja vissza, hogy ez a szám prímszám-e 

3. .../maganhangzo?SZOVEG
a paraméterben megadott szöveg alapján adja vissza, hogy hány darab magánhangzót tartalmaz (a magyar ABC szerint)

## Teszt segédlet

# Szükséges eszközök:
    - Docker/Docker desktop
    - Maven
    - Java 21

# Build and Run
    1. Töltsd le a projektet a futtatandó eszközre
    2. futtasd a következő parancsokat sorrendben
        - mvn clean install
        - mvn package
        - docker image build -t dbrt_challenge:latest .   
        - docker run -d --name dbrt_challenge -p 127.0.0.1:8081:8081 dbrt_challenge:latest

    3. Docker desktop-ba, vagy a docker ps parancs kiadásával a command line-ba láthatónak kell lennie a futó konténernek.

# Tesztelés
    Böngészőben, vagy postmanba írd be a következő linkeket:
    - localhost:8081/melyiknap?DATUM=2025-05-31
    - localhost:8081/primszam?SZAM=3
    - localhost:8081/maganhangzo?SZOVEG=Ez a szöveg külömböző magánhangzókból összesen 20 -at tartalmaz
    

