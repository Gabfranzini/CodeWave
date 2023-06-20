-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 20/06/2023 às 17:18
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `codewave`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cadastro`
--

CREATE TABLE `cadastro` (
  `ra` int(9) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `email` varchar(40) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `nascimento` varchar(10) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `telefone` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cadastro`
--

INSERT INTO `cadastro` (`ra`, `nome`, `email`, `senha`, `nascimento`, `sexo`, `endereco`, `estado`, `telefone`) VALUES
(287457498, 'Gustavo', 'gustavinho@gmail.com', 'gustavo123', '08/10/2004', 'Masculino', 'rua guariba', 'SP', '(  )      -    '),
(431894607, 'Alice', 'alice123@gmail.com', 'alice1234', '01/02/2000', 'Outro', 'copacabana', 'RJ', '(  )      -    '),
(514598589, 'Gabriela Franzini', 'gabifranzini@gmial.com', 'gabi12345', '04/10/2003', 'Feminino', 'rua capelinha 88 jardim progresso', 'SP', '(  )      -    '),
(636517508, 'Carol', 'carolzinha@gmail.com', 'carol1234', '02/06/2004', 'Masculino', 'rua silva', 'SP', '(11) 93737-1301'),
(660315664, 'Luis fernando', 'luiss@outlook.com', 'luis12345', '21/09/2001', 'Masculino', 'rua vergueiro', 'MG', '(  )      -    '),
(770296069, 'Lorenzo', 'lorenzinho@gmail.com', 'lolo12345', '09/07/2005', 'Masculino', 'senador vergueiro', 'SP', '(  )      -    '),
(953462505, 'Claudio', 'claudinhobochecha@gmail.com', 'claudio123', '05/08/1989', 'Outro', 'rua capim grosso', 'MT', '(  )      -    ');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cadastro`
--
ALTER TABLE `cadastro`
  ADD PRIMARY KEY (`ra`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
