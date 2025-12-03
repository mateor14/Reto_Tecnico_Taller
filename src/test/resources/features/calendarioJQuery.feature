#language: es

Característica: Automatizacion calendario

  Antecedentes:
  Dado que me encuentro en la página JQuery

  Escenario: Seleccion de una fecha en el mes actual
    Cuando selecciono el día 15 del mes actual
    Entonces debería ver la fecha en el campo de texto

  Escenario: Seleccion de una fecha en un mes diferente al actual
    Cuando selecciono el día 10 del próximo mes
    Entonces debería ver la fecha del mes siguiente en el campo de texto