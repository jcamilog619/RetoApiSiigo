#language: es
Característica: Crud Api Post
  Quiero validar la informacion al crear un usuario en la api Post-user

  @datosEmpleados
  Esquema del escenario: Realizar la creacion de un usuario
    Dado que el usuaro cargo los datos para el proceso
      | name   | job   |
      | <name> | <job> |
    Cuando se realiza la creacion en la api
    Entonces se vizualizara exitosamente la creacion del empleado
    Ejemplos:
      | name          | job |
      | Juan Camilo G | QA  |