CREATE TABLE formula1_resultados (
    id SERIAL PRIMARY KEY,
    posicion INT,
    numero INT,
    piloto VARCHAR(100),
    auto VARCHAR(100),
    vueltas INT,
    tiempo VARCHAR(20),
    pts INT,
    year INT,
    grand_prix VARCHAR(100),
    detalle VARCHAR(20),
    codigo_conductor VARCHAR(50)
);
