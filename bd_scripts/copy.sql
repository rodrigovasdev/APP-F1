COPY nombre_tabla (posicion, numero, piloto, auto, vueltas, tiempo, pts, year, grand_prix, detalle, codigo_conductor)
FROM 'RUTA\f1list\bd_scripts\sprint_results.csv'
WITH (FORMAT csv, DELIMITER ',', HEADER true);
