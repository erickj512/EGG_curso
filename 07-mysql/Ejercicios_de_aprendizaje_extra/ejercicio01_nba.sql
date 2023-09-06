USE nba;

-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT nombre FROM jugadores ORDER BY nombre;

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
SELECT nombre FROM jugadores WHERE posicion like 'C';

-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT nombre FROM equipos ORDER BY nombre;

-- 4. Mostrar el nombre de los equipos del este (East).
SELECT nombre FROM equipos WHERE conferencia LIKE 'East';

-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT nombre FROM equipos WHERE ciudad LIKE 'C%' ORDER BY nombre;

-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT jugadores.nombre AS 'Nombre Jugador', equipos.nombre AS 'Equipo' FROM jugadores INNER JOIN equipos ON jugadores.nombre_equipo = equipos.nombre ORDER BY equipos.nombre;

-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT jugadores.nombre AS 'Nombre Jugador' FROM jugadores INNER JOIN equipos ON jugadores.nombre_equipo = equipos.nombre WHERE equipos.nombre LIKE 'Raptors' ORDER BY jugadores.nombre;

-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT Puntos_por_partido AS 'PPP' FROM estadisticas WHERE jugador = (SELECT codigo FROM jugadores WHERE nombre LIKE 'PAU GASOL');

-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT Puntos_por_partido AS 'PPP' FROM estadisticas WHERE jugador = (SELECT codigo FROM jugadores WHERE nombre LIKE 'PAU GASOL') AND temporada LIKE '04/05';

-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT jugadores.nombre AS 'Jugador',(SELECT ROUND(SUM(Puntos_por_partido)) FROM estadisticas WHERE jugador = codigo) AS 'Puntos Totales' FROM jugadores;

-- 11. Mostrar el número de jugadores de cada equipo.
SELECT nombre_equipo AS 'Equipo', COUNT(nombre_equipo) AS 'Cantidad' FROM jugadores GROUP BY nombre_equipo;

-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT jugadores.nombre AS 'Jugador',(SELECT ROUND(SUM(Puntos_por_partido)) FROM estadisticas WHERE jugador = codigo) AS PuntosTotales 
FROM jugadores ORDER BY PuntosTotales DESC Limit 1;

-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT Nombre, Conferencia, Division FROM equipos WHERE Nombre  = (SELECT jugadores.Nombre_equipo FROM jugadores ORDER BY jugadores.Altura DESC LIMIT 1);

-- 14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
SELECT equipo_local AS 'Local', ROUND(AVG(puntos_local)) AS 'Media de puntos' 
FROM partidos INNER JOIN equipos ON partidos.equipo_local = equipos.nombre WHERE equipos.division = 'Pacific' GROUP BY partidos.equipo_local;

-- 15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT equipo_local AS 'Local', equipo_visitante AS 'Visitante', ABS((puntos_local-puntos_visitante)) AS 'Diferencia' 
FROM partidos WHERE ABS(puntos_local-puntos_visitante) = (SELECT max(ABS(puntos_local-puntos_visitante)) FROM partidos);

-- 16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
-- Ya realizado en el 14.

-- 17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
SELECT equipo_local AS 'Local', puntos_local AS 'Puntos Local', puntos_visitante AS 'Puntos Visitante', equipo_visitante AS 'Visitante'
FROM partidos;

-- 18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT codigo AS 'Codigo', equipo_local AS 'Local', puntos_local AS 'Puntos Local', puntos_visitante AS 'Puntos Visitante', equipo_visitante AS 'Visitante', 
(SELECT CASE WHEN (puntos_local> puntos_visitante) THEN equipo_local WHEN (puntos_local< puntos_visitante) THEN equipo_visitante ELSE 'Empate' END) AS 'Equipo Ganador'
FROM partidos;