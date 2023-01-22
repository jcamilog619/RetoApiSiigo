#language: es
Característica: Crud Api Get
  Quiero validar la informacion de un usuario en la api get-user


  @datosEmpleados
  Esquema del escenario: Realizar la peticion para obener la informacion de un usuario
    Dado que el usuario cargo la informacion a consultar
      | infoClient   | email   | first_name   | last_name   | date   |
      | <infoClient> | <email> | <first_name> | <last_name> | <date> |
    Cuando se realiza la consulta a la api
    Entonces se vizualizara exitosamente la informacion del response
    Ejemplos:
      | infoClient | email                  | first_name | last_name | date    |
      | 2          | janet.weaver@reqres.in | Janet      | Weaver    | exitoso |


  @datosEmpleadosNoEncontrados
  Esquema del escenario: Realizar la peticion para usuario que no existente
    Dado que el usuario cargo la informacion a consultar
      | infoClient   | date   |
      | <infoClient> | <date> |
    Cuando se realiza la consulta de la informacion a la api get
    Entonces se vizualizara un Bad Request
    Ejemplos:
      | infoClient | date    |
      | 23         | exitoso |

  @valdacionApi
  Esquema del escenario: Realizar la peticion con el endpoint erroneo
    Dado que el usuaro cargo la informacion a consultar
      | message   | date   |
      | <message> | <date> |
    Cuando se realiza la consulta a la api erronea
    Entonces se vizualizara el error del response
    Ejemplos:
      | message                                                         | date  |
      | Error Occured! Page Not found, contact rstapi2example@gmail.com | error |


