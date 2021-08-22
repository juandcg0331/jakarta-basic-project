CREATE TABLE CODIGORUPESTRE.USUARIO(
                                       id  INTEGER  GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
                                       nombre VARCHAR2(100),
                                       apellidos VARCHAR2(100),
                                       usuario VARCHAR2(100),
                                       password VARCHAR2(100),
                                       email VARCHAR2(100),
                                       telefono VARCHAR2(100));