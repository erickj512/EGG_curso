SELECT * FROM equipos;
SELECT * FROM estadisticas;
SELECT * FROM jugadores;
SELECT * FROM partidos;

-- Tenemos que adivinar la clave y posición de una caja fuerte. El cerrojo consta de 4 candados,
-- cada candado tiene de clave, un número que puede ser de más de 1 cifra y una posición que
-- puede ir desde 1 a 4.
-- Nosotros tenemos los 4 candados en la mano (Candado A, Candado B, Candado C y Candado D)
-- debemos averiguar la posición de cada candado y la clave del mism


-- CANDADO A
-- Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT MAX(Asistencias_por_partido) FROM estadisticas;
SELECT COUNT(*) AS veces_max_asistencias 
FROM estadisticas
WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadisticas);

-- A es el candado 2

-- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
-- centro o esté comprendida en otras posicione

SELECT SUM(jugadores.Peso) AS total_peso
FROM jugadores
INNER JOIN equipos ON equipos.Nombre = jugadores.Nombre_equipo
WHERE equipos.Conferencia = 'East' AND jugadores.Posicion LIKE 'C%' ;

SELECT DISTINCT Posicion
FROM jugadores;

SELECT SUM(jugadores.Peso) AS total_peso
FROM jugadores
INNER JOIN equipos ON equipos.Nombre = jugadores.Nombre_equipo
WHERE equipos.Conferencia = 'East' AND (jugadores.Posicion LIKE 'C' OR jugadores.Posicion LIKE 'C-F'OR jugadores.Posicion LIKE 'F-C') ;

-- CANDADO B
-- Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
-- jugadores que tiene el equipo Heat.
SELECT DISTINCT Nombre
FROM equipos;

SELECT COUNT(*) AS jugadores_heat
FROM  jugadores
WHERE Nombre_equipo = 'Heat';

SELECT COUNT(*) AS mas_asistencia_heat
FROM  estadisticas
WHERE Asistencias_por_partido >(SELECT COUNT(*) AS jugadores_heat FROM  jugadores WHERE Nombre_equipo = 'Heat');

-- B es el candado 3


-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)
-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999

SELECT DISTINCT temporada
FROM partidos;

SELECT COUNT(*) AS partidos_jugados
FROM partidos
WHERE temporada like '98/99' or '99/00';

-- CANDADO C
-- Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
-- parte de equipos de la conferencia oeste.
-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
-- 195, y a eso le vamos a sumar 0.9945.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT DISTINCT Procedencia
FROM jugadores;

SELECT DISTINCT Conferencia
FROM equipos;

SELECT (COUNT(*) / (SELECT COUNT(*) FROM jugadores WHERE Peso >= 195) + 0.9945) AS CANDADO_C
FROM jugadores 
INNER JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE jugadores.Procedencia = 'Michigan' AND equipos.Conferencia = 'West';

-- C es el candado 1

-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
-- sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
-- tapones por partido. Además, este resultado debe ser, donde la división sea central.


SELECT DISTINCT Division
FROM equipos;

SELECT FLOOR(AVG(Puntos_por_partido) + COUNT(Asistencias_por_partido) + SUM(Tapones_por_partido)) AS codigo
FROM estadisticas 
INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo
INNER JOIN equipos ON jugadores.Nombre_equipo=equipos.Nombre
WHERE equipos.Division = 'Central';



-- CANDADO D
-- Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
-- resultado debe ser redondeado. Nota: el resultado debe estar redondeado
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT DISTINCT Nombre
FROM jugadores;

SELECT ROUND(AVG(Tapones_por_partido)) AS posicion
FROM estadisticas
INNER JOIN jugadores ON estadisticas.jugador = jugadores.codigo
WHERE jugadores.Nombre = 'Corey Maggette' AND temporada = '00/01';

-- D es el candado 4

-- Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
-- de todos los jugadores de procedencia argentina.
SELECT DISTINCT Procedencia
FROM jugadores;


SELECT FLOOR(SUM(Puntos_por_partido)) AS codigo
FROM estadisticas
INNER JOIN jugadores  ON estadisticas.jugador = jugadores.codigo
WHERE jugadores.Procedencia = 'Argentina';


