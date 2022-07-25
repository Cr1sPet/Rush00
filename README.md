# Rush00

#Console app like Pac-Man

###How to use

```
cd ex00/Game

mvn clean package

java -jar game.jar --enemiesCount=10 --wallsCount=10 --size=30 --profile=production

```

### Parameters requirements

```

[--profile] - {production, dev}
[--size]  - {5 , 100}
[--enemiesCount] - {> 0}
[--wallsCount] - { >= 0}

```
