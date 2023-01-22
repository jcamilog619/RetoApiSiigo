#language: es
Característica: Crud Api Delete
  Quiero validar la informacion para eliminar un usuario en la api Delete-user

  @datosEmpleados
  Esquema del escenario: Realizar la eliminacion de un usuario
    Dado que el usuaro cargo los datos para el proceso
      | name   | job   |
      | <name> | <job> |
    Cuando se realiza la creacion del usuario
    Y elimino la informacion del usuario
    Entonces se vizualizara exitosamente la eliminacion del empleado con el codigo 204
    Ejemplos:
      | name   | job   |
      | <name> | <job> |
