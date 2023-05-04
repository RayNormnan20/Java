create schema Stock;
use Stock;



CREATE TABLE Stock (
  stockId INT PRIMARY KEY,
  name VARCHAR(255),
  lastdate DATE,
  benchmarkId INT
);


INSERT INTO Stock (stockId, name, lastdate, benchmarkId)
VALUES (1, 'Stock A', '2022-04-25', 10),
       (2, 'Stock B', '2022-04-26', 20),
       (3, 'Stock C', '2022-04-27', 30);
       
       
-- Procedimiento para insertar un registro en la tabla Stock
CREATE PROCEDURE InsertarStock(
  IN p_stockId INT,
  IN p_name VARCHAR(255),
  IN p_lastdate DATE,
  IN p_benchmarkId INT
)
BEGIN
  INSERT INTO Stock (stockId, name, lastdate, benchmarkId)
  VALUES (p_stockId, p_name, p_lastdate, p_benchmarkId);
END;

-- Procedimiento para actualizar un registro en la tabla Stock
CREATE PROCEDURE ActualizarStock(
  IN p_stockId INT,
  IN p_name VARCHAR(255),
  IN p_lastdate DATE,
  IN p_benchmarkId INT
)
BEGIN
  UPDATE Stock
  SET name = p_name,
      lastdate = p_lastdate,
      benchmarkId = p_benchmarkId
  WHERE stockId = p_stockId;
END;

-- Procedimiento para eliminar un registro de la tabla Stock
CREATE PROCEDURE EliminarStock(
  IN p_stockId INT
)
BEGIN
  DELETE FROM Stock
  WHERE stockId = p_stockId;
END;


-- Procedimiento para obtener todos los registros de la tabla Stock
CREATE PROCEDURE ObtenerTodosStocks()
BEGIN
  SELECT * FROM Stock;
END;


-- Procedimiento para obtener un registro específico de la tabla Stock
CREATE PROCEDURE ObtenerStock(
  IN p_stockId INT
)
BEGIN
  SELECT * FROM Stock
  WHERE stockId = p_stockId;
END;



