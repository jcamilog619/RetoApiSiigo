#language: es
Característica: Crud Api Put
  Quiero actualizar la informacion de un usuario en la api Post-user

  @datosEmpleados
  Esquema del escenario: Realizar la actualizacion de la informacion de un usuario
    Dado que el usuaro cargo los datos para el proceso
      | name   | job   | infoClient   |
      | <name> | <job> | <infoClient> |
    Cuando se realiza la actualizacion en la api
    Entonces se vizualizara exitosamente la actualizacion del usuario
    Ejemplos:
      | name          | job | infoClient |
      | Juan Camilo G | QA  | 2          |