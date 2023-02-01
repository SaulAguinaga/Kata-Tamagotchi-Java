# Tamagotchi Kata Rules

## Sleep:

- energy < 3 = "(-_-)" (cansado)
- energy = 0 = "(-_-) zZZ" (dormido)
- energy >= 3 = ":-|" (normal)
- sleeping = energy + 2
- if (energy = 0) = "(-_-) zZZ" (dormido)

## Mood:

- mood > 8 = ":-)" (contento)
- mood < 2 = "ఠ_ఠ" (enfadado)
- mood <= 8 && mood >=2 = ":-|" (normal)
- playing = energy - 1, hunger + 1, mood + 1

## Hunger:

- eating = hunger - 2, energy + 1

### More details

- https://agilekatas.co.uk/katas/Tamagotchi-Kata
