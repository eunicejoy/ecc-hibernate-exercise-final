--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.26
-- Dumped by pg_dump version 9.4.26
-- Started on 2021-04-14 13:34:55

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;

--
-- TOC entry 1 (class 3079 OID 11855)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2043 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 174 (class 1259 OID 32814)
-- Name: person; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public.person (
    person_id integer NOT NULL,
    first_name text NOT NULL,
    last_name text NOT NULL,
    middle_name text,
    suffix text,
    title text,
    street_number integer,
    barangay text NOT NULL,
    municipality_or_city text NOT NULL,
    zipcode integer NOT NULL,
    birthday date NOT NULL,
    general_weighted_average numeric NOT NULL,
    date_hired date NOT NULL,
    currently_employed character(1) NOT NULL
);


ALTER TABLE public.person OWNER TO postgres;

--
-- TOC entry 173 (class 1259 OID 32812)
-- Name: person_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.person_id_seq OWNER TO postgres;

--
-- TOC entry 2044 (class 0 OID 0)
-- Dependencies: 173
-- Name: person_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.person_id_seq OWNED BY public.person.person_id;


--
-- TOC entry 180 (class 1259 OID 40972)
-- Name: personcontact; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public.personcontact (
    person_contact_id integer NOT NULL,
    person_id integer,
    person_contact_type text,
    person_contact_value text
);


ALTER TABLE public.personcontact OWNER TO postgres;

--
-- TOC entry 179 (class 1259 OID 40970)
-- Name: personcontact_person_contact_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.personcontact_person_contact_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.personcontact_person_contact_id_seq OWNER TO postgres;

--
-- TOC entry 2045 (class 0 OID 0)
-- Dependencies: 179
-- Name: personcontact_person_contact_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.personcontact_person_contact_id_seq OWNED BY public.personcontact.person_contact_id;


--
-- TOC entry 178 (class 1259 OID 32853)
-- Name: personrole; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public.personrole (
    person_role_id integer NOT NULL,
    person_id integer,
    role_id integer NOT NULL,
    role_name text NOT NULL
);


ALTER TABLE public.personrole OWNER TO postgres;

--
-- TOC entry 177 (class 1259 OID 32851)
-- Name: personrole_person_role_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.personrole_person_role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.personrole_person_role_id_seq OWNER TO postgres;

--
-- TOC entry 2046 (class 0 OID 0)
-- Dependencies: 177
-- Name: personrole_person_role_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.personrole_person_role_id_seq OWNED BY public.personrole.person_role_id;


--
-- TOC entry 176 (class 1259 OID 32842)
-- Name: roles; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE public.roles (
    role_id integer NOT NULL,
    role_name text NOT NULL
);


ALTER TABLE public.roles OWNER TO postgres;

--
-- TOC entry 175 (class 1259 OID 32840)
-- Name: roles_role_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.roles_role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.roles_role_id_seq OWNER TO postgres;

--
-- TOC entry 2047 (class 0 OID 0)
-- Dependencies: 175
-- Name: roles_role_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.roles_role_id_seq OWNED BY public.roles.role_id;


--
-- TOC entry 1903 (class 2604 OID 32817)
-- Name: person_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.person ALTER COLUMN person_id SET DEFAULT nextval('public.person_id_seq'::regclass);


--
-- TOC entry 1906 (class 2604 OID 40975)
-- Name: person_contact_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.personcontact ALTER COLUMN person_contact_id SET DEFAULT nextval('public.personcontact_person_contact_id_seq'::regclass);


--
-- TOC entry 1905 (class 2604 OID 32856)
-- Name: person_role_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.personrole ALTER COLUMN person_role_id SET DEFAULT nextval('public.personrole_person_role_id_seq'::regclass);


--
-- TOC entry 1904 (class 2604 OID 32845)
-- Name: role_id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.roles ALTER COLUMN role_id SET DEFAULT nextval('public.roles_role_id_seq'::regclass);


--
-- TOC entry 2028 (class 0 OID 32814)
-- Dependencies: 174
-- Data for Name: person; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.person (person_id, first_name, last_name, middle_name, suffix, title, street_number, barangay, municipality_or_city, zipcode, birthday, general_weighted_average, date_hired, currently_employed) FROM stdin;
1	Juan	Dela Cruz	Ramos	Junior	Software Engineer	902	Camangyanan	Santa Maria	3022	1996-11-05	1.54	2021-04-12	Y
2	Matilda	Enriquez	Loyola		Human Resource Officer	345	Lilim	Cabuyao	1232	1994-07-04	1.35	2021-04-12	Y
\.


--
-- TOC entry 2048 (class 0 OID 0)
-- Dependencies: 173
-- Name: person_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.person_id_seq', 1, false);


--
-- TOC entry 2034 (class 0 OID 40972)
-- Dependencies: 180
-- Data for Name: personcontact; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.personcontact (person_contact_id, person_id, person_contact_type, person_contact_value) FROM stdin;
2	2	landline	12453356
3	1	mobile number	09153263215
\.


--
-- TOC entry 2049 (class 0 OID 0)
-- Dependencies: 179
-- Name: personcontact_person_contact_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.personcontact_person_contact_id_seq', 1, false);


--
-- TOC entry 2032 (class 0 OID 32853)
-- Dependencies: 178
-- Data for Name: personrole; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.personrole (person_role_id, person_id, role_id, role_name) FROM stdin;
1	1	1	dev
2	2	3	hr
\.


--
-- TOC entry 2050 (class 0 OID 0)
-- Dependencies: 177
-- Name: personrole_person_role_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.personrole_person_role_id_seq', 1, false);


--
-- TOC entry 2030 (class 0 OID 32842)
-- Dependencies: 176
-- Data for Name: roles; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.roles (role_id, role_name) FROM stdin;
1	dev
2	admin
3	hr
\.


--
-- TOC entry 2051 (class 0 OID 0)
-- Dependencies: 175
-- Name: roles_role_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.roles_role_id_seq', 1, false);


--
-- TOC entry 1908 (class 2606 OID 32822)
-- Name: person_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public.person
    ADD CONSTRAINT person_pkey PRIMARY KEY (person_id);


--
-- TOC entry 1914 (class 2606 OID 40980)
-- Name: personcontact_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public.personcontact
    ADD CONSTRAINT personcontact_pkey PRIMARY KEY (person_contact_id);


--
-- TOC entry 1912 (class 2606 OID 32861)
-- Name: personrole_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public.personrole
    ADD CONSTRAINT personrole_pkey PRIMARY KEY (person_role_id);


--
-- TOC entry 1910 (class 2606 OID 32850)
-- Name: roles_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pkey PRIMARY KEY (role_id);


--
-- TOC entry 1917 (class 2606 OID 40981)
-- Name: personcontact_person_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.personcontact
    ADD CONSTRAINT personcontact_person_id_fkey FOREIGN KEY (person_id) REFERENCES public.person(person_id);


--
-- TOC entry 1915 (class 2606 OID 32862)
-- Name: personrole_person_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.personrole
    ADD CONSTRAINT personrole_person_id_fkey FOREIGN KEY (person_id) REFERENCES public.person(person_id);


--
-- TOC entry 1916 (class 2606 OID 32867)
-- Name: personrole_role_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.personrole
    ADD CONSTRAINT personrole_role_id_fkey FOREIGN KEY (role_id) REFERENCES public.roles(role_id);


--
-- TOC entry 2042 (class 0 OID 0)
-- Dependencies: 6
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2021-04-14 13:34:56

--
-- PostgreSQL database dump complete
--

