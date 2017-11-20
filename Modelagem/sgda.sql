-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 20-Nov-2017 às 15:23
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
-- Database: `sgda`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `alunos`
--

DROP TABLE IF EXISTS `alunos`;
CREATE TABLE IF NOT EXISTS `alunos` (
  `matricula` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `genero` varchar(15) NOT NULL,
  `rg` varchar(20) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `dtnasc` date NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `num` varchar(15) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `contato` varchar(20) NOT NULL,
  `email` varchar(80) NOT NULL,
  `curso` int(11) NOT NULL,
  `dtmatricula` date NOT NULL,
  PRIMARY KEY (`matricula`),
  KEY `curso` (`curso`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cursos`
--

DROP TABLE IF EXISTS `cursos`;
CREATE TABLE IF NOT EXISTS `cursos` (
  `cod_curso` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) DEFAULT NULL,
  `periodo` varchar(20) DEFAULT NULL,
  `carga_horaria` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`cod_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplinas`
--

DROP TABLE IF EXISTS `disciplinas`;
CREATE TABLE IF NOT EXISTS `disciplinas` (
  `cod_disciplina` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  `curso` int(11) NOT NULL,
  `professor` int(11) NOT NULL,
  `qtde_aulas` int(11) NOT NULL,
  PRIMARY KEY (`cod_disciplina`),
  KEY `curso` (`curso`),
  KEY `professor` (`professor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
CREATE TABLE IF NOT EXISTS `funcionarios` (
  `cod_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `genero` varchar(15) DEFAULT NULL,
  `rg` varchar(20) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `dtnasc` date DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `num` varchar(15) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL,
  `contato` varchar(20) DEFAULT NULL,
  `email` varchar(80) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `salario` decimal(10,2) DEFAULT NULL,
  `dtadmissao` date NOT NULL,
  PRIMARY KEY (`cod_funcionario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `cod_cadastro` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(15) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`cod_cadastro`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `alunos`
--
ALTER TABLE `alunos`
  ADD CONSTRAINT `alunos_ibfk_1` FOREIGN KEY (`curso`) REFERENCES `cursos` (`cod_curso`);

--
-- Limitadores para a tabela `disciplinas`
--
ALTER TABLE `disciplinas`
  ADD CONSTRAINT `disciplinas_ibfk_1` FOREIGN KEY (`curso`) REFERENCES `cursos` (`cod_curso`),
  ADD CONSTRAINT `disciplinas_ibfk_2` FOREIGN KEY (`professor`) REFERENCES `funcionarios` (`cod_funcionario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
