Given a psikus instance
When set argument 8 to cyfrokrad
Then result is equal to null

When set argument 109 to cyfrokrad
Then result is not null and any of 10, 19, 9

When set argument 29 to hultajchochla
Then result is reversed and equal to 92

When set argument 8 to hultajchochla
Then an nieudany psikus exception is thrown

When set argument 455 to nieksztaltek
Then result is same as an argument and equal to 455

When set argument 376 to nieksztaltek
Then result is equal to any of 876, 316, 379