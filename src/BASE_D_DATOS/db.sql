-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-08-2022 a las 21:49:38
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistencia_instructor`
--

CREATE TABLE `asistencia_instructor` (
  `id_asisten` int(11) NOT NULL,
  `cc_instruc_fk` int(11) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `hora_inicio` time NOT NULL,
  `fecha_fin` date DEFAULT NULL,
  `hora_fin` time DEFAULT NULL,
  `estado_asistencia` varchar(60) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `asistencia_instructor`
--

INSERT INTO `asistencia_instructor` (`id_asisten`, `cc_instruc_fk`, `fecha_inicio`, `hora_inicio`, `fecha_fin`, `hora_fin`, `estado_asistencia`) VALUES
(14, 1005371822, '2022-08-09', '14:47:11', '2022-08-09', '14:48:04', 'ASISTENCIA COMPLETA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conctacto_instructor`
--

CREATE TABLE `conctacto_instructor` (
  `id_conct` int(11) NOT NULL,
  `telfon` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `email` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `cc_instruc_fk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `conctacto_instructor`
--

INSERT INTO `conctacto_instructor` (`id_conct`, `telfon`, `email`, `cc_instruc_fk`) VALUES
(25, '3118568900', 'ana123@gmail.com', 1005371822),
(26, '3186231409', 'elain@hotmail.com', 345678),
(28, '3118568900', 'juanguiza65@gmail.com', 51254132),
(29, '3254565', 'jaime@outlok.com', 752545),
(30, '3022545', 'feliemar@gmail.com', 652545);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona_instructor`
--

CREATE TABLE `persona_instructor` (
  `cc_instruc` int(11) NOT NULL,
  `nombre_instruc` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `apellido` varchar(60) COLLATE utf8mb4_bin NOT NULL,
  `edad` varchar(100) COLLATE utf8mb4_bin NOT NULL,
  `id_contrato_fk` int(11) NOT NULL,
  `estado` varchar(5) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `persona_instructor`
--

INSERT INTO `persona_instructor` (`cc_instruc`, `nombre_instruc`, `apellido`, `edad`, `id_contrato_fk`, `estado`) VALUES
(345678, 'elian santiago', 'farid ruiz', '19', 3, 'I'),
(652545, 'felipe martinez', 'fernando gutierres', '25', 1, 'I'),
(752545, 'jaime andres', 'celis perez', '52', 2, 'A'),
(51254132, 'juan david', 'guiza garcia', '19', 1, 'A'),
(1005371822, 'juan david', 'guiia garcia', '19', 3, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipos_de_contrato`
--

CREATE TABLE `tipos_de_contrato` (
  `id_contrato` int(11) NOT NULL,
  `nombre` varchar(45) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `tipos_de_contrato`
--

INSERT INTO `tipos_de_contrato` (`id_contrato`, `nombre`) VALUES
(1, 'planta'),
(2, 'contratista'),
(3, 'practicante');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `validacion_administrador`
--

CREATE TABLE `validacion_administrador` (
  `id_admin` int(11) NOT NULL,
  `cc_admin` int(11) NOT NULL,
  `contraseña` varchar(40) COLLATE utf8mb4_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `validacion_administrador`
--

INSERT INTO `validacion_administrador` (`id_admin`, `cc_admin`, `contraseña`) VALUES
(21, 1005371822, 'juan1234'),
(22, 91228846, 'eliansanti');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `validacion_instructor`
--

CREATE TABLE `validacion_instructor` (
  `id_valida` int(11) NOT NULL,
  `cc_instruc_fk` int(11) NOT NULL,
  `contraseña` varchar(15) COLLATE utf8mb4_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

--
-- Volcado de datos para la tabla `validacion_instructor`
--

INSERT INTO `validacion_instructor` (`id_valida`, `cc_instruc_fk`, `contraseña`) VALUES
(25, 1005371822, 'juan1234'),
(26, 345678, 'elain123'),
(28, 51254132, 'juan1234'),
(29, 752545, 'jaimito123'),
(30, 652545, 'felipe123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asistencia_instructor`
--
ALTER TABLE `asistencia_instructor`
  ADD PRIMARY KEY (`id_asisten`),
  ADD KEY `cc_instruc_fk` (`cc_instruc_fk`);

--
-- Indices de la tabla `conctacto_instructor`
--
ALTER TABLE `conctacto_instructor`
  ADD PRIMARY KEY (`id_conct`),
  ADD KEY `cc_instruc_fk` (`cc_instruc_fk`);

--
-- Indices de la tabla `persona_instructor`
--
ALTER TABLE `persona_instructor`
  ADD PRIMARY KEY (`cc_instruc`),
  ADD KEY `persona_instructor_ibfk_2` (`id_contrato_fk`);

--
-- Indices de la tabla `tipos_de_contrato`
--
ALTER TABLE `tipos_de_contrato`
  ADD PRIMARY KEY (`id_contrato`);

--
-- Indices de la tabla `validacion_administrador`
--
ALTER TABLE `validacion_administrador`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indices de la tabla `validacion_instructor`
--
ALTER TABLE `validacion_instructor`
  ADD PRIMARY KEY (`id_valida`),
  ADD KEY `cc_instruc_fk` (`cc_instruc_fk`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `asistencia_instructor`
--
ALTER TABLE `asistencia_instructor`
  MODIFY `id_asisten` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `conctacto_instructor`
--
ALTER TABLE `conctacto_instructor`
  MODIFY `id_conct` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `tipos_de_contrato`
--
ALTER TABLE `tipos_de_contrato`
  MODIFY `id_contrato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `validacion_administrador`
--
ALTER TABLE `validacion_administrador`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `validacion_instructor`
--
ALTER TABLE `validacion_instructor`
  MODIFY `id_valida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asistencia_instructor`
--
ALTER TABLE `asistencia_instructor`
  ADD CONSTRAINT `asistencia_instructor_ibfk_1` FOREIGN KEY (`cc_instruc_fk`) REFERENCES `persona_instructor` (`cc_instruc`) ON DELETE CASCADE;

--
-- Filtros para la tabla `conctacto_instructor`
--
ALTER TABLE `conctacto_instructor`
  ADD CONSTRAINT `conctacto_instructor_ibfk_1` FOREIGN KEY (`cc_instruc_fk`) REFERENCES `persona_instructor` (`cc_instruc`) ON DELETE CASCADE;

--
-- Filtros para la tabla `persona_instructor`
--
ALTER TABLE `persona_instructor`
  ADD CONSTRAINT `persona_instructor_ibfk_1` FOREIGN KEY (`id_contrato_fk`) REFERENCES `tipos_de_contrato` (`id_contrato`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `persona_instructor_ibfk_2` FOREIGN KEY (`id_contrato_fk`) REFERENCES `tipos_de_contrato` (`id_contrato`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `validacion_instructor`
--
ALTER TABLE `validacion_instructor`
  ADD CONSTRAINT `validacion_instructor_ibfk_1` FOREIGN KEY (`cc_instruc_fk`) REFERENCES `persona_instructor` (`cc_instruc`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
