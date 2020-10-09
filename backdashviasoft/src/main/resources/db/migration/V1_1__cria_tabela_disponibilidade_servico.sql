CREATE TABLE public.disponibilidade_servico
(
    id bigserial,    
    dataconsulta timestamp with time zone,
    autorizador character varying(50),
    autorizacao4 character varying(30),
    retornoautorizacao4 character varying(30),
    inutilizacao4 character varying(30),
    consultaprotocolo4 character varying(30),
    statusservico4 character varying(30),
    tempomedio character varying(50),
    consultacadastro4 character varying(30),
    recepcaoevento4 character varying(30),
    PRIMARY KEY (id)
);

ALTER TABLE public.disponibilidade_servico
    ALTER COLUMN dataconsulta SET DEFAULT CURRENT_TIMESTAMP;