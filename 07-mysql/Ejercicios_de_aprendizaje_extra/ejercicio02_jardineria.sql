USE jardineria;

-- Consultas sobre una tabla
-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT codigo_oficina AS 'codigo', ciudad AS 'Ciudad' FROM oficina;

-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
SELECT ciudad AS 'Ciudad', telefono AS 'Telefono' FROM oficina WHERE pais LIKE 'España';

-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
SELECT nombre AS 'Nombre',apellido1 AS 'Apellido', email AS 'Email' FROM empleado WHERE codigo_jefe = 7;

-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
SELECT puesto AS 'Puesto', nombre AS 'Nombre', apellido1 AS 'Apellido', email AS 'Email' FROM empleado WHERE puesto LIKE'Director General';

-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
SELECT nombre AS 'Nombre', apellido1 AS 'Apellido', puesto AS 'Puesto' from empleado WHERE puesto NOT LIKE 'Representante ventas';

-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
SELECT nombre_cliente AS 'Nombre', pais AS 'Pais' FROM cliente WHERE pais LIKE 'Spain';

-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
SELECT DISTINCT estado AS 'Estado' FROM pedido;

-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. 
-- Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:
-- o Utilizando la función YEAR de MySQL.
-- o Utilizando la función DATE_FORMAT de MySQL.
-- o Sin utilizar ninguna de las funciones anteriores.
SELECT codigo_cliente AS 'Codigo Cliente', fecha_pago AS 'Fecha de pago' FROM pago WHERE YEAR(fecha_pago) = 2008;

-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
SELECT codigo_pedido AS 'Codigo de pedido', codigo_cliente AS 'Codigo de cliente', fecha_esperada AS 'Fecha esperada', fecha_entrega AS 'Fecha de entrega'
FROM pedido WHERE fecha_entrega > fecha_esperada;

-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos 
-- cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.
-- o Utilizando la función ADDDATE de MySQL.
-- o Utilizando la función DATEDIFF de MySQL.
SELECT codigo_pedido AS 'Codigo de pedido', codigo_cliente AS 'Codigo de cliente', fecha_esperada AS 'Fecha esperada', fecha_entrega AS 'Fecha de entrega'
FROM pedido WHERE DATEDIFF(fecha_esperada, fecha_entrega) = 2;

-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
SELECT * FROM pedido WHERE estado LIKE 'Rechazado' AND YEAR(fecha_pedido) = 2009;

-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
SELECT * FROM pedido WHERE MONTH(fecha_entrega) = 01;

-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
SELECT * FROM pago WHERE YEAR(fecha_pago) = 2008 AND forma_pago LIKE 'Paypal' ORDER BY total DESC;

-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
SELECT DISTINCT forma_pago FROM pago;

-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. 
-- El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
SELECT * FROM producto WHERE gama LIKE 'Ornamentales' AND cantidad_en_stock > 100 ORDER BY precio_venta DESC;

-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
SELECT * FROM cliente WHERE ciudad LIKE 'Madrid' AND codigo_empleado_rep_ventas IN (11, 30);

-- Consultas multitabla (Composición interna)
-- Las consultas se deben resolver con INNER JOIN.
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
SELECT cliente.nombre_cliente AS 'Cliente', CONCAT(empleado.nombre, ' ', empleado.apellido1, ' ', empleado.apellido2) Nombre_Representante
FROM cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado;

-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT DISTINCT cliente.nombre_cliente AS 'Cliente', CONCAT(empleado.nombre, ' ', empleado.apellido1, ' ', empleado.apellido2) Nombre_Representante
FROM cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente;

-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT cliente.nombre_cliente AS 'Cliente', CONCAT(empleado.nombre, ' ', empleado.apellido1, ' ', empleado.apellido2) Nombre_Representante
FROM cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado 
WHERE cliente.codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);

-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el 
-- representante.
SELECT DISTINCT cliente.nombre_cliente AS 'Cliente', CONCAT(empleado.nombre, ' ', empleado.apellido1, ' ', empleado.apellido2) Nombre_Representante, 
(SELECT ciudad FROM oficina WHERE codigo_oficina = empleado.codigo_oficina) AS 'Ciudad'
FROM cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado INNER JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente;

-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la 
-- oficina a la que pertenece el representante.
SELECT cliente.nombre_cliente AS 'Cliente', CONCAT(empleado.nombre, ' ', empleado.apellido1, ' ', empleado.apellido2) Nombre_Representante,
(SELECT ciudad FROM oficina WHERE codigo_oficina = empleado.codigo_oficina) AS 'Ciudad'
FROM cliente INNER JOIN empleado ON cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado 
WHERE cliente.codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);

-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT oficina.codigo_oficina AS 'Codigo', oficina.linea_direccion1 AS 'Direccion-1', oficina.linea_direccion2 AS 'Direccion-2'
FROM oficina INNER JOIN empleado ON oficina.codigo_oficina = empleado.codigo_oficina 
INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE cliente.ciudad = 'Fuenlabrada';

-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT cliente.nombre_cliente AS Nombre, CONCAT(empleado.nombre,' ', empleado.apellido1,' ', empleado.apellido2) Nombre_Representante, oficina.ciudad AS Ciudad
FROM oficina INNER JOIN empleado ON oficina.codigo_oficina = empleado.codigo_oficina 
INNER JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas;

-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT CONCAT(A.nombre,' ', A.apellido1,' ', A.apellido2) 'Jefe', A.codigo_empleado AS 'Codigo-Jefe', CONCAT(B.nombre,' ', B.apellido1,' ', B.apellido2) AS 'Empleado', B.codigo_empleado AS 'Codigo-Empleado' 
FROM empleado A JOIN empleado B ON  A.codigo_jefe = B.codigo_empleado;

-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
SELECT DISTINCT cliente.nombre_cliente AS 'Cliente' FROM cliente JOIN pedido ON cliente.codigo_cliente = pedido.Codigo_cliente WHERE pedido.fecha_esperada < pedido.fecha_entrega;

-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
SELECT DISTINCT producto.gama AS Gama, cliente.nombre_cliente AS Cliente 
FROM cliente INNER JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente 
INNER JOIN detalle_pedido ON pedido.codigo_pedido = detalle_pedido.codigo_pedido 
INNER JOIN producto ON detalle_pedido.codigo_producto = producto.codigo_producto;

-- Consultas multitabla (Composición externa)
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT DISTINCT nombre_cliente AS 'Cliente' FROM cliente
LEFT JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente
WHERE cliente.codigo_cliente NOT IN (SELECT codigo_cliente FROM pago);

-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
SELECT DISTINCT nombre_cliente AS 'Cliente' FROM cliente
LEFT JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente
WHERE cliente.codigo_cliente NOT IN (SELECT codigo_cliente FROM pedido);

-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
SELECT DISTINCT nombre_cliente AS 'Cliente' FROM cliente
LEFT JOIN pedido ON cliente.codigo_cliente = pedido.codigo_cliente
LEFT JOIN pago ON cliente.codigo_cliente = pago.codigo_cliente
WHERE (cliente.codigo_cliente NOT IN (SELECT codigo_cliente FROM pedido)) AND (cliente.codigo_cliente NOT IN (SELECT codigo_cliente FROM pago));

-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
SELECT nombre AS 'Empleado' FROM empleado
LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina
WHERE oficina.codigo_oficina IS NULL;

-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
SELECT empleado.* FROM empleado
LEFT JOIN cliente ON empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas
WHERE cliente.codigo_empleado_rep_ventas IS NULL;

-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
SELECT empleado.* FROM empleado LEFT JOIN cliente ON  empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas WHERE cliente.codigo_cliente IS NULL
UNION SELECT empleado.* FROM empleado LEFT JOIN oficina ON empleado.codigo_oficina = oficina.codigo_oficina WHERE oficina.codigo_oficina IS NULL;

-- 7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT * FROM producto LEFT JOIN detalle_pedido ON producto.codigo_producto = detalle_pedido.codigo_producto 
WHERE detalle_pedido.codigo_pedido IS NULL;

-- 8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas 
-- de algún cliente que haya realizado la compra de algún producto de la gama Frutales.
SELECT oficina.codigo_oficina, producto.gama FROM oficina 
JOIN empleado ON oficina.codigo_oficina = empleado.codigo_oficina 
JOIN cliente ON cliente.codigo_empleado_rep_ventas != e.codigo_empleado 
JOIN pedido ON 
JOIN producto ON 
WHERE producto.gama LIKE 'frutales' GROUP BY p.gama;

-- 9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.


-- 10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.


-- Consultas resumen
-- 1. ¿Cuántos empleados hay en la compañía?
-- 2. ¿Cuántos clientes tiene cada país?
-- 3. ¿Cuál fue el pago medio en 2009?
-- 4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.
-- 5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
-- 6. Calcula el número de clientes que tiene la empresa.
-- 7. ¿Cuántos clientes tiene la ciudad de Madrid?
-- 8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
-- 9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
-- 10. Calcula el número de clientes que no tiene asignado representante de ventas.
-- 11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente.
-- 12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
-- 13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
-- 14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. 
-- El listado deberá estar ordenado por el número total de unidades vendidas.
-- 15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado. 
-- La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. 
-- El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores.
-- 16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
-- 17. La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.
-- 18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado 
-- con impuestos (21% IVA)

-- Subconsultas con operadores básicos de comparación
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
-- 3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta que tendrá que calcular cuál es el número total de 
-- unidades que se han vendido de cada producto a partir de los datos de la tabla detalle_pedido. 
-- Una vez que sepa cuál es el código del producto, puede obtener su nombre fácilmente.)
-- 4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).
-- 5. Devuelve el producto que más unidades tiene en stock.
-- 6. Devuelve el producto que menos unidades tiene en stock.
-- 7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.

-- Subconsultas con ALL y ANY
-- 1. Devuelve el nombre del cliente con mayor límite de crédito.
-- 2. Devuelve el nombre del producto que tenga el precio de venta más caro.
-- 3. Devuelve el producto que menos unidades tiene en stock.

-- Subconsultas con IN y NOT IN
-- 1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente.
-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
-- 3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
-- 4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
-- 5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente.

-- Subconsultas con EXISTS y NOT EXISTS
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
-- 2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
-- 3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
-- 4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.