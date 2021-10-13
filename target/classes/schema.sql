DROP TABLE IF EXISTS policy;

CREATE TABLE policy (
                        idApolice INT AUTO_INCREMENT  PRIMARY KEY,
                        cdApoliceExterna VARCHAR(250) NOT NULL,
                        nmCorretor VARCHAR(250) NOT NULL,
                        nrDocumentoCorretor VARCHAR(250) DEFAULT NULL
);
