-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 04-Dez-2017 às 17:28
-- Versão do servidor: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_sgda`
--
CREATE DATABASE IF NOT EXISTS `database_sgda` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `database_sgda`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

DROP TABLE IF EXISTS `aluno`;
CREATE TABLE IF NOT EXISTS `aluno` (
  `matricula` int(11) NOT NULL AUTO_INCREMENT,
  `pessoa` int(11) NOT NULL,
  `curso` int(11) NOT NULL,
  `data_matricula` date NOT NULL,
  PRIMARY KEY (`matricula`),
  KEY `curso` (`curso`),
  KEY `pessoa` (`pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`matricula`, `pessoa`, `curso`, `data_matricula`) VALUES
(1, 1, 1, '2017-12-02'),
(2, 2, 1, '2017-12-02'),
(3, 5, 1, '2017-12-03');

-- --------------------------------------------------------

--
-- Estrutura da tabela `campus`
--

DROP TABLE IF EXISTS `campus`;
CREATE TABLE IF NOT EXISTS `campus` (
  `id_campus` int(11) NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(30) NOT NULL,
  `razao_social` varchar(100) NOT NULL,
  `rua` varchar(50) NOT NULL,
  `numero` varchar(50) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `cep` varchar(10) NOT NULL,
  PRIMARY KEY (`id_campus`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `campus`
--

INSERT INTO `campus` (`id_campus`, `cnpj`, `razao_social`, `rua`, `numero`, `bairro`, `cidade`, `estado`, `cep`) VALUES
(1, '00.000.000/0000-00', 'IFSP - HORTOLÂNDIA', 'RUA', '00', 'BAIRRO', 'CIDADE', 'São Paulo (SP)', '00000-000'),
(2, '00.000.000/0000-00', 'IFSP - CAMPINAS', 'RUA', '00', 'BAIRRO', 'CIDADE', 'São Paulo (SP)', '00000-000');

-- --------------------------------------------------------

--
-- Estrutura da tabela `campus_contato`
--

DROP TABLE IF EXISTS `campus_contato`;
CREATE TABLE IF NOT EXISTS `campus_contato` (
  `campus` int(11) NOT NULL,
  `contato` varchar(15) NOT NULL,
  KEY `campus` (`campus`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `campus_contato`
--

INSERT INTO `campus_contato` (`campus`, `contato`) VALUES
(2, '(00) 00000-0000'),
(1, '(00) 00000-0000'),
(2, '(00) 00000-0000');

-- --------------------------------------------------------

--
-- Estrutura da tabela `campus_email`
--

DROP TABLE IF EXISTS `campus_email`;
CREATE TABLE IF NOT EXISTS `campus_email` (
  `campus` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  KEY `campus` (`campus`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `campus_email`
--

INSERT INTO `campus_email` (`campus`, `email`) VALUES
(1, 'ifsp-hto@edu.com.br');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cargo`
--

DROP TABLE IF EXISTS `cargo`;
CREATE TABLE IF NOT EXISTS `cargo` (
  `id_cargo` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  PRIMARY KEY (`id_cargo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cargo`
--

INSERT INTO `cargo` (`id_cargo`, `descricao`) VALUES
(1, 'Diretor Geral'),
(2, 'Assistente Administrativo'),
(3, 'Aplicações TI');

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

DROP TABLE IF EXISTS `curso`;
CREATE TABLE IF NOT EXISTS `curso` (
  `id_curso` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `periodo` varchar(20) NOT NULL,
  `carga_horaria` int(11) NOT NULL,
  `campus` int(11) NOT NULL,
  PRIMARY KEY (`id_curso`),
  KEY `campus` (`campus`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`id_curso`, `descricao`, `periodo`, `carga_horaria`, `campus`) VALUES
(1, 'ANÁLISE E DESENVOLVIMENTO DE SISTEMAS', 'Noturno', 2500, 1),
(2, 'LICENCIATURA EM MATEMÁTICA', 'Noturno', 2500, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso_disciplina`
--

DROP TABLE IF EXISTS `curso_disciplina`;
CREATE TABLE IF NOT EXISTS `curso_disciplina` (
  `curso` int(11) NOT NULL,
  `disciplina` int(11) NOT NULL,
  KEY `curso` (`curso`),
  KEY `disciplina` (`disciplina`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `curso_disciplina`
--

INSERT INTO `curso_disciplina` (`curso`, `disciplina`) VALUES
(1, 1),
(2, 5),
(2, 4),
(1, 4),
(1, 2),
(1, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
CREATE TABLE IF NOT EXISTS `disciplina` (
  `id_disciplina` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  `qtd_aulas` int(11) NOT NULL,
  PRIMARY KEY (`id_disciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`id_disciplina`, `descricao`, `qtd_aulas`) VALUES
(1, 'BANCO DE DADOS I', 80),
(2, 'LINGUAGEM DE PROGRAMAÇÃO I', 80),
(3, 'LINGUAGEM DE PROGRAMAÇÃO II', 80),
(4, 'HISTÓRIA DA CIÊNCIA E TÉCNOLOGIA', 40),
(5, 'CÁLCULO I', 80),
(6, 'ESTRUTURA DE DADOS I', 60);

-- --------------------------------------------------------

--
-- Estrutura da tabela `docente`
--

DROP TABLE IF EXISTS `docente`;
CREATE TABLE IF NOT EXISTS `docente` (
  `id_docente` int(11) NOT NULL AUTO_INCREMENT,
  `pessoa` int(11) NOT NULL,
  `formacao` varchar(50) NOT NULL,
  `nivel` varchar(50) NOT NULL,
  `salario` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id_docente`),
  KEY `pessoa` (`pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `docente`
--

INSERT INTO `docente` (`id_docente`, `pessoa`, `formacao`, `nivel`, `salario`) VALUES
(1, 3, 'Mestrado', 'Superior', '8000.00'),
(2, 6, 'Mestrado', 'Superior', '8000.00'),
(3, 7, 'Especializado', 'Superior', '6000.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `docente_disciplina`
--

DROP TABLE IF EXISTS `docente_disciplina`;
CREATE TABLE IF NOT EXISTS `docente_disciplina` (
  `docente` int(11) NOT NULL,
  `disciplina` int(11) NOT NULL,
  KEY `docente` (`docente`),
  KEY `disciplina` (`disciplina`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `docente_disciplina`
--

INSERT INTO `docente_disciplina` (`docente`, `disciplina`) VALUES
(1, 1),
(1, 2),
(2, 3),
(3, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `pessoa` int(11) NOT NULL,
  `cargo` int(11) NOT NULL,
  `salario` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  KEY `cargo` (`cargo`),
  KEY `pessoa` (`pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_funcionario`, `pessoa`, `cargo`, `salario`) VALUES
(1, 4, 1, '12000.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
CREATE TABLE IF NOT EXISTS `pessoa` (
  `id_pessoa` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `rg` varchar(20) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `data_nascimento` date NOT NULL,
  `rua` varchar(50) NOT NULL,
  `numero` varchar(50) NOT NULL,
  `bairro` varchar(50) NOT NULL,
  `cidade` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  `cep` varchar(10) NOT NULL,
  PRIMARY KEY (`id_pessoa`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`id_pessoa`, `nome`, `genero`, `rg`, `cpf`, `data_nascimento`, `rua`, `numero`, `bairro`, `cidade`, `estado`, `cep`) VALUES
(1, 'DUMAS MORAIS DE CARVALHO', 'Masculino', '00.000.000-0', '000.000.000-00', '2017-12-02', 'RUA', '00', 'BAIRRO', 'CIDADE', 'ESTADO', '00000-000'),
(2, 'MARIA EDUARDA DE OLIVEIRA SILVA', 'Feminino', '00.000.000-0', '000.000.000-00', '2017-12-02', 'RUA', '00', 'BAIRRO', 'CIDADE', 'ESTADO', '00000-000'),
(3, 'MICHELE CRISTIANI BARION', 'Feminino', '00.000.000-0', '000.000.000-00', '2017-12-02', 'RUA', '00', 'BAIRRO', 'CIDADE', 'ESTADO', '00000-000'),
(4, 'EDGAR NODA', 'Masculino', '00.000.000-0', '000.000.000-00', '2017-12-02', 'RUA', '00', 'BAIRRO', 'CIDADE', 'ESTADO', '00000-000'),
(5, 'JOSÉ LUIS ANTUNES NUNES', 'Masculino', '00.000.000-0', '000.000.000-00', '2017-12-03', 'RUA', '00', 'BAIRRO', 'CIDADE', 'São Paulo (SP)', '00000-000'),
(6, 'LEANDRO CAMARA LEDEL', 'Masculino', '00.000.000-0', '000.000.000-00', '2017-03-12', 'RUA', '00', 'BAIRRO', 'CIDADE', 'São Paulo (SP)', '00000-000'),
(7, 'FLÁVIA ROBERTA TOREZIN', 'Feminino', '00.000.000-0', '000.000.000-00', '2017-12-04', 'RUA', '00', 'BAIRRO', 'CIDADE', 'São Paulo (SP)', '00000-000');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa_contato`
--

DROP TABLE IF EXISTS `pessoa_contato`;
CREATE TABLE IF NOT EXISTS `pessoa_contato` (
  `pessoa` int(11) NOT NULL,
  `contato` varchar(20) NOT NULL,
  KEY `pessoa` (`pessoa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pessoa_contato`
--

INSERT INTO `pessoa_contato` (`pessoa`, `contato`) VALUES
(2, '(00) 00000-0000'),
(3, '(00) 00000-0000'),
(4, '(00) 00000-0000'),
(5, '(00) 00000-0000');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa_email`
--

DROP TABLE IF EXISTS `pessoa_email`;
CREATE TABLE IF NOT EXISTS `pessoa_email` (
  `pessoa` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  KEY `pessoa` (`pessoa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pessoa_email`
--

INSERT INTO `pessoa_email` (`pessoa`, `email`) VALUES
(4, 'edgarnoda@ifsp.com.br'),
(3, 'michelebarion@ifsp.com.br'),
(1, 'dumasmcarvalho@gmail.com');

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `aluno`
--
ALTER TABLE `aluno`
  ADD CONSTRAINT `aluno_ibfk_1` FOREIGN KEY (`curso`) REFERENCES `curso` (`id_curso`),
  ADD CONSTRAINT `aluno_ibfk_2` FOREIGN KEY (`pessoa`) REFERENCES `pessoa` (`id_pessoa`);

--
-- Limitadores para a tabela `campus_contato`
--
ALTER TABLE `campus_contato`
  ADD CONSTRAINT `campus_contato_ibfk_1` FOREIGN KEY (`campus`) REFERENCES `campus` (`id_campus`);

--
-- Limitadores para a tabela `campus_email`
--
ALTER TABLE `campus_email`
  ADD CONSTRAINT `campus_email_ibfk_1` FOREIGN KEY (`campus`) REFERENCES `campus` (`id_campus`);

--
-- Limitadores para a tabela `curso`
--
ALTER TABLE `curso`
  ADD CONSTRAINT `curso_ibfk_1` FOREIGN KEY (`campus`) REFERENCES `campus` (`id_campus`);

--
-- Limitadores para a tabela `curso_disciplina`
--
ALTER TABLE `curso_disciplina`
  ADD CONSTRAINT `curso_disciplina_ibfk_1` FOREIGN KEY (`curso`) REFERENCES `curso` (`id_curso`),
  ADD CONSTRAINT `curso_disciplina_ibfk_2` FOREIGN KEY (`disciplina`) REFERENCES `disciplina` (`id_disciplina`);

--
-- Limitadores para a tabela `docente`
--
ALTER TABLE `docente`
  ADD CONSTRAINT `docente_ibfk_1` FOREIGN KEY (`pessoa`) REFERENCES `pessoa` (`id_pessoa`);

--
-- Limitadores para a tabela `docente_disciplina`
--
ALTER TABLE `docente_disciplina`
  ADD CONSTRAINT `docente_disciplina_ibfk_1` FOREIGN KEY (`docente`) REFERENCES `docente` (`id_docente`),
  ADD CONSTRAINT `docente_disciplina_ibfk_2` FOREIGN KEY (`disciplina`) REFERENCES `disciplina` (`id_disciplina`);

--
-- Limitadores para a tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`cargo`) REFERENCES `cargo` (`id_cargo`),
  ADD CONSTRAINT `funcionario_ibfk_2` FOREIGN KEY (`pessoa`) REFERENCES `pessoa` (`id_pessoa`);

--
-- Limitadores para a tabela `pessoa_contato`
--
ALTER TABLE `pessoa_contato`
  ADD CONSTRAINT `pessoa_contato_ibfk_1` FOREIGN KEY (`pessoa`) REFERENCES `pessoa` (`id_pessoa`);

--
-- Limitadores para a tabela `pessoa_email`
--
ALTER TABLE `pessoa_email`
  ADD CONSTRAINT `pessoa_email_ibfk_1` FOREIGN KEY (`pessoa`) REFERENCES `pessoa` (`id_pessoa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
