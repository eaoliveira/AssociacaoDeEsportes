CREATE TABLE `Curso2` (
  `idCurso` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(140) NOT NULL,
  `descricao` varchar(250) NOT NULL,
  `inicio` date NOT NULL,
  `numHoras` int(11) NOT NULL,
  `desativado` tinyint(4) NOT NULL,
  PRIMARY KEY (`idCurso`)
) ENGINE=InnoDB CHARSET=latin1;

CREATE TABLE `Aluno2` (
  `matricula` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(90) NOT NULL,
  `email` varchar(90) NOT NULL,
  `idCurso` int(11) DEFAULT NULL,
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB CHARSET=latin1;
