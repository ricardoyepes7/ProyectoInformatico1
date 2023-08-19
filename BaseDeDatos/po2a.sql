-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-05-2023 a las 22:45:01
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `po2a`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `answers`
--

CREATE TABLE `answers` (
  `id` int(11) NOT NULL,
  `id_question` int(11) NOT NULL,
  `option_answer` text NOT NULL,
  `correct_answer` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `answers`
--

INSERT INTO `answers` (`id`, `id_question`, `option_answer`, `correct_answer`) VALUES
(1, 1, 'A la práctica de ocultar el código fuente de un programa para evitar que otros programadores lo copien.', 0),
(2, 1, ' A la técnica de comprimir varios archivos en uno solo para facilitar su distribución.', 0),
(3, 1, 'A la capacidad de un objeto de mantener sus propiedades y métodos ocultos de otros objetos, lo que ayuda a proteger los datos y evitar errores de programación.', 1),
(4, 1, 'A la habilidad de un programa de dividir su código en módulos independientes para que sea más fácil de mantener y actualizar.', 0),
(5, 2, 'Crear una clase que tenga propiedades públicas que puedan ser modificadas directamente por otras clases.', 0),
(6, 2, 'Utilizar funciones globales para modificar directamente las propiedades de un objeto.', 0),
(7, 2, 'Crear una clase que tenga propiedades privadas y métodos públicos para acceder y modificar dichas propiedades.', 1),
(8, 2, 'Utilizar un objeto literal que tenga propiedades públicas y privadas para representar los datos de una entidad.', 0),
(11, 3, 'Proteger los datos internos de una clase', 1),
(12, 3, 'Asegurarse de que los métodos de una clase sean públicos', 0),
(13, 3, 'Facilitar la creación de objetos', 0),
(14, 3, 'Acelerar la ejecución de los programas', 0),
(15, 4, 'Métodos que sólo pueden ser utilizados por objetos de una determinada clase.', 0),
(16, 4, 'Métodos que sólo pueden ser utilizados por la clase en la que se definen.', 0),
(17, 4, 'Métodos que permiten acceder y modificar los datos internos de una clase desde fuera de ella.', 1),
(18, 4, 'Métodos que se encargan de la inicialización de objetos.', 0),
(19, 5, 'Permite controlar el acceso a los datos internos de una clase.', 1),
(20, 5, 'Facilita la creación de objetos y su inicialización.', 0),
(21, 5, 'Hace que los métodos de una clase sean públicos y accesibles desde fuera de ella', 0),
(22, 5, 'Acelera la ejecución de los programas', 0),
(23, 6, 'Facilitar la división del programa en módulos separados. ', 0),
(24, 6, 'Proporcionar una forma de reutilizar el código existente.', 0),
(25, 6, 'Simplificar el diseño y la implementación de objetos complejos.', 1),
(26, 6, 'Reducir la cantidad de memoria necesaria para ejecutar el programa.', 0),
(27, 7, 'Una técnica para dividir un programa en módulos separados.', 0),
(28, 7, 'Un mecanismo para reutilizar el código existente.', 0),
(29, 7, 'Un proceso para identificar y separar los aspectos importantes de un objeto de los no importantes.', 1),
(30, 7, 'Una forma de combinar múltiples objetos en uno solo.', 0),
(31, 11, 'Una clase que tiene al menos un método abstracto.', 0),
(32, 11, 'Un tipo de objeto que no tiene una implementación concreta.', 1),
(33, 11, 'Un mecanismo para heredar de múltiples clases al mismo tiempo. ', 0),
(34, 11, 'Un enfoque para dividir un programa en módulos separados.', 0),
(35, 8, 'Un método que no tiene una implementación concreta y debe ser definido por una subclase.', 1),
(36, 8, 'Un método que siempre devuelve el mismo valor independientemente de los argumentos de entrada.', 0),
(37, 8, 'Un método que solo puede ser llamado por otros métodos dentro de la misma clase. ', 0),
(38, 8, 'Un método que tiene una implementación predeterminada que puede ser anulada por una subclase.', 0),
(39, 9, 'Facilita la división del programa en módulos separados. ', 0),
(40, 9, 'Proporciona una forma de reutilizar el código existente.', 0),
(41, 9, 'Simplifica el diseño y la implementación de objetos complejos.', 1),
(42, 9, 'Reduce la cantidad de memoria necesaria para ejecutar el programa.', 0),
(43, 10, 'Una clase que no puede ser instanciada.', 0),
(44, 10, 'Una clase que tiene al menos un método abstracto.', 1),
(45, 10, 'Una clase que no tiene ningún método definido.', 0),
(46, 10, 'Una clase que no tiene ningún atributo definido.', 0),
(47, 12, 'Un conjunto de métodos abstractos que una clase debe implementar.', 1),
(48, 12, 'Una clase que no puede ser instanciada.', 0),
(49, 12, 'Una clase que solo puede ser heredada por una subclase.', 0),
(50, 12, 'Una clase que tiene al menos un método abstracto.', 0),
(51, 13, 'Un proceso para identificar y separar los aspectos importantes de un objeto de los no importantes.', 0),
(52, 13, 'Una técnica para dividir un programa en módulos separados.', 0),
(53, 13, 'Un mecanismo para reutilizar el código existente. ', 1),
(54, 13, 'Un proceso para ocultar la complejidad de un objeto.', 0),
(55, 14, 'Una clase que hereda de otra clase.', 0),
(56, 14, 'Una clase que es heredada por otra clase.', 1),
(57, 14, 'Una clase que es heredada por otra clase.', 0),
(58, 14, 'Una clase que no puede ser instanciada.', 0),
(59, 15, 'Una clase que hereda de otra clase.', 1),
(60, 15, 'Una clase que es heredada por otra clase.', 0),
(61, 15, 'Una clase que tiene métodos abstractos.', 0),
(62, 15, 'Una clase que no puede ser instanciada.', 0),
(63, 16, 'La capacidad de una subclase para heredar todos los métodos de su superclase.', 0),
(64, 16, 'La capacidad de una subclase para sobrescribir los métodos de su superclase.', 0),
(65, 16, 'La capacidad de una subclase para tener atributos adicionales que su superclase.', 0),
(66, 16, 'La capacidad de una subclase para ser usada en lugar de su superclase.', 1),
(67, 17, 'La capacidad de una clase para heredar de múltiples superclases.', 1),
(68, 17, 'La capacidad de una subclase para sobrescribir los métodos de sus múltiples superclases.', 0),
(69, 17, 'La capacidad de una clase para tener múltiples constructores.', 0),
(70, 17, 'La capacidad de una clase para tener múltiples métodos con el mismo nombre.', 0),
(71, 18, 'Una clase que no puede ser instanciada.', 0),
(72, 18, 'Una clase que no puede ser heredada.', 1),
(73, 18, 'Una clase que no puede tener métodos abstractos.', 0),
(74, 18, 'Una clase que no puede tener métodos privados.', 0),
(75, 19, 'Una clase que no puede ser instanciada.', 0),
(76, 19, 'Una clase que es heredada por otra clase.', 1),
(77, 19, 'Una clase que tiene métodos abstractos.', 0),
(78, 19, 'Una clase que contiene métodos estáticos.', 0),
(79, 20, 'Un bloque de código que realiza una tarea específica.', 0),
(80, 20, 'Una estructura de datos que almacena múltiples valores del mismo tipo.', 0),
(81, 20, 'Un conjunto de objetos que comparten los mismos atributos y métodos.', 1),
(82, 20, 'Un mecanismo para realizar operaciones matemáticas complejas.', 0),
(83, 21, 'Una variable que almacena un valor.', 0),
(84, 21, 'Una estructura de datos que almacena múltiples valores del mismo tipo.', 0),
(85, 21, 'Una instancia de una clase que tiene sus propios valores de atributos.', 1),
(86, 21, 'Un conjunto de funciones que realizan tareas específicas.', 0),
(87, 22, 'Un método que se llama automáticamente cuando se crea un objeto.', 1),
(88, 22, 'Un método que se llama automáticamente cuando se destruye un objeto.', 0),
(89, 22, 'Un método que se llama para inicializar un objeto con valores predeterminados.', 0),
(90, 22, 'Un método que se llama para copiar un objeto existente.', 0),
(91, 23, 'Un método que se llama automáticamente cuando se crea un objeto. ', 0),
(92, 23, 'Un método que se llama automáticamente cuando se destruye un objeto.', 1),
(93, 23, 'Un método que se llama automáticamente cuando se destruye un objeto.', 0),
(94, 23, 'Un método que se llama para copiar un objeto existente.', 0),
(95, 24, 'Un bloque de código que realiza una tarea específica.', 1),
(96, 24, 'Una estructura de datos que almacena múltiples valores del mismo tipo.', 0),
(97, 24, 'Un conjunto de objetos que comparten los mismos atributos y métodos.', 0),
(98, 24, 'Un conjunto de objetos que comparten los mismos atributos y métodos.', 0),
(99, 25, 'Un método que se aplica a una instancia de una clase.', 0),
(100, 25, 'Un método que se aplica a la clase en sí misma.', 1),
(101, 25, 'Un método que no puede ser heredado por las subclases.', 0),
(102, 25, 'Un método que no puede ser sobrescrito por las subclases.', 0),
(103, 26, 'Un método que tiene una implementación en la clase base, pero puede ser sobrescrito por las subclases.', 0),
(104, 26, 'Un método que no tiene una implementación en la clase base y debe ser sobrescrito por las subclases.', 1),
(105, 26, 'Un método que no puede ser llamado directamente, pero puede ser llamado por otros métodos de la misma clase.', 0),
(106, 26, 'Un método que solo puede ser llamado desde la clase que lo define.', 0),
(107, 34, 'Un lenguaje de programación.', 0),
(108, 34, 'Una técnica de programación.', 1),
(109, 34, 'Un tipo de dato.', 0),
(110, 34, 'Un patrón de diseño.', 0),
(111, 35, 'Es el mismo que el polimorfismo dinámico.', 0),
(112, 35, 'Se resuelve en tiempo de compilación.', 1),
(113, 35, 'Solo se puede utilizar en lenguajes interpretados.', 0),
(114, 35, 'Solo se puede utilizar en lenguajes compilados.', 0),
(115, 36, 'Es el mismo que el polimorfismo estático.', 0),
(116, 36, 'Se resuelve en tiempo de compilación.', 0),
(117, 36, 'Solo se puede utilizar en lenguajes interpretados.', 0),
(118, 36, 'Se resuelve en tiempo de ejecución.', 1),
(119, 37, 'No hay diferencia.', 0),
(120, 37, 'La sobrecarga se aplica a métodos estáticos, la sobreescritura a métodos de instancia.', 0),
(121, 37, 'La sobrecarga se refiere a tener varios métodos con el mismo nombre, pero diferentes parámetros, la sobreescritura a tener varios métodos con el mismo nombre y los mismos parámetros, pero en diferentes clases.', 1),
(122, 37, 'La sobrecarga se refiere a tener varios métodos con el mismo nombre y los mismos parámetros, pero en diferentes clases, la sobreescritura a tener varios métodos con el mismo nombre, pero diferentes parámetros. ', 0),
(123, 38, 'Es el mismo que el enlace estático.', 0),
(124, 38, 'Se realiza en tiempo de compilación.', 0),
(125, 38, 'Se realiza en tiempo de ejecución.', 1),
(126, 38, 'Solo se puede utilizar en lenguajes interpretados.', 0),
(127, 39, 'Permite reducir la cantidad de código necesario.', 0),
(128, 39, 'Permite crear objetos de diferentes tipos.', 0),
(129, 39, 'Permite utilizar una clase base para manipular objetos de diferentes clases derivadas.', 1),
(130, 39, 'Permite evitar la herencia.', 0),
(131, 40, 'Un método que solo se puede llamar una vez.', 0),
(132, 40, 'Un método que no se puede sobrescribir.', 0),
(133, 40, 'Un método que se puede sobrescribir en una clase derivada.', 1),
(134, 40, 'Un método que solo se puede utilizar en lenguajes interpretados.', 0),
(135, 41, 'Una variable que almacena un valor.', 0),
(136, 41, 'Un tipo de dato primitivo.', 0),
(137, 41, 'Una función asociada a un objeto que puede realizar acciones o devolver valores.', 1),
(138, 41, 'Una constante que no puede cambiar de valor.', 0),
(139, 42, 'Es el proceso de definir múltiples métodos con el mismo nombre, pero diferentes parámetros.', 1),
(140, 42, 'Es el proceso de definir múltiples métodos con el mismo nombre y los mismos parámetros.', 0),
(141, 42, 'Es el proceso de definir múltiples métodos con diferentes nombres y diferentes parámetros.', 0),
(142, 42, 'Es el proceso de definir múltiples métodos con diferentes nombres, pero los mismos parámetro.', 0),
(143, 43, 'Indica que el método se puede llamar sin crear una instancia del objeto.', 1),
(144, 43, 'Indica que el método solo se puede llamar dentro de la misma clase.', 0),
(145, 43, 'Indica que el método solo se puede llamar desde otra clase.', 0),
(146, 43, 'Indica que el método solo se puede llamar dentro de la misma clase y sus clases derivadas.', 0),
(147, 44, 'Indica que el método se puede sobrescribir en una subclase.', 0),
(148, 44, 'Indica que el método no se puede sobrescribir en una subclase.', 1),
(149, 44, 'Indica que el método solo se puede llamar dentro de la misma clase.', 0),
(150, 44, 'Indica que el método solo se puede llamar dentro de la misma clase y sus clases derivadas.', 0),
(151, 45, 'Un método que establece el valor de un atributo.', 0),
(152, 45, 'Un método que obtiene el valor de un atributo', 1),
(153, 45, 'Un método que realiza una operación específica en un objeto.', 0),
(154, 45, 'Un método que no devuelve ningún valor.', 0),
(155, 46, 'Un método que obtiene el valor de un atributo.', 0),
(156, 46, 'Un método que establece el valor de un atributo.', 1),
(157, 46, 'Un método que realiza una operación específica en un objeto.', 0),
(158, 46, 'Un método que no devuelve ningún valor.', 0),
(159, 47, 'Permite el acceso a un atributo o método solo desde la misma clase.', 0),
(160, 47, 'Permite el acceso a un atributo o método solo desde otra clase.', 0),
(161, 47, 'Permite el acceso a un atributo o método desde la misma clase y sus clases derivadas.', 1),
(162, 47, 'Permite el acceso a un atributo o método desde cualquier parte del programa.', 0),
(163, 48, 'Es un método que solo se puede llamar dentro de la misma clase.', 0),
(164, 48, 'Es un método que solo se puede llamar desde otra clase.', 0),
(165, 48, 'Es un método que se puede llamar desde cualquier parte del programa.', 1),
(166, 48, 'Es un método que solo se puede llamar dentro de la misma clase y sus clases derivadas.', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `challenge`
--

CREATE TABLE `challenge` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `challenge`
--

INSERT INTO `challenge` (`id`, `name`, `description`) VALUES
(1, 'Encapsulation', 'Encapsulación'),
(2, 'Abstraction', 'Abstracción'),
(3, 'Inheritance', 'Herencia'),
(4, 'Polymorphism', 'Polimorfismo'),
(5, 'Class', 'Clase'),
(6, 'Method', 'Métodos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `challenge_results`
--

CREATE TABLE `challenge_results` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `id_challenge` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp(),
  `level` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `challenge_results`
--

INSERT INTO `challenge_results` (`id`, `username`, `id_challenge`, `score`, `date`, `level`) VALUES
(16, 'juan.perez', 6, 100, '2023-05-07 01:22:39', 1),
(17, 'juan.perez', 5, 100, '2023-05-07 01:24:33', 1),
(18, 'juan.perez', 4, 100, '2023-05-07 01:25:48', 1),
(19, 'juan.perez', 3, 100, '2023-05-07 01:27:33', 1),
(20, 'juan.perez', 2, 100, '2023-05-07 01:31:44', 1),
(21, 'juan.perez', 1, 100, '2023-05-07 01:32:38', 1),
(22, 'juan.perez', 3, 40, '2023-05-07 01:33:56', 1),
(23, 'juan.perez', 3, 20, '2023-05-07 02:22:11', 1),
(24, 'juan.perez', 1, 50, '2023-05-07 02:28:45', 1),
(30, 'ricardo.paez', 1, 20, '2023-05-17 20:17:40', 1),
(31, 'ricardo.paez', 3, 20, '2023-05-17 20:17:57', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `glosario`
--

CREATE TABLE `glosario` (
  `word` varchar(100) NOT NULL,
  `definition` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `glosario`
--

INSERT INTO `glosario` (`word`, `definition`) VALUES
('Abstracción', 'La simplificación de un objeto complejo mediante la identificación de sus características esenciales y la eliminación de los detalles irrelevantes. La abstracción permite crear modelos conceptuales en la programación y es clave para el desarrollo de software modular y reutilizable.\r\n'),
('Atributo', 'Una variable que contiene datos asociados a un objeto. Los atributos definen las características o propiedades de un objeto y representan su estado interno.\r\n'),
('Clase', 'Una plantilla o modelo que define la estructura, el comportamiento y las propiedades de los objetos. Las clases son los componentes básicos de la POO y se utilizan para crear instancias de objetos.'),
('Encapsulamiento', 'El proceso de ocultar los detalles internos de un objeto y proporcionar una interfaz pública para interactuar con él. Los objetos encapsulados solo pueden ser accedidos y modificados a través de los métodos definidos en su clase, lo que mejora la seguridad y el control de acceso a los datos.\r\n'),
('Herencia', 'Un mecanismo que permite que una clase adquiera las propiedades y los comportamientos de otra clase. La herencia permite establecer jerarquías y relaciones entre las clases, lo que facilita la reutilización de código y la creación de relaciones entre objetos.\r\n'),
('Instanciar', 'El proceso de crear un objeto concreto (instancia) a partir de una clase. Al instanciar una clase, se reserva espacio en la memoria para el objeto y se inicializan sus atributos.\r\n'),
('Interface', 'Una especificación de un conjunto de métodos que una clase debe implementar. Las interfaces definen los contratos o acuerdos entre las clases, permitiendo la comunicación y el intercambio de datos de manera estandarizada. Las clases pueden implementar múltiples interfaces, lo que facilita la reutilización y la creación de sistemas más flexibles.\r\n'),
('Método', 'Una función o procedimiento que se define en una clase y describe el comportamiento o las acciones que un objeto puede realizar. Los métodos son utilizados para interactuar con los atributos de un objeto o para llevar a cabo operaciones específicas.\r\n'),
('Objeto', 'Una instancia concreta de una clase. Un objeto tiene un estado interno (atributos) y puede realizar acciones (métodos) según lo definido por su clase.\r\n'),
('Polimorfismo', 'La capacidad de un objeto para presentar diferentes comportamientos o formas según el contexto. En POO, el polimorfismo permite que objetos de diferentes clases respondan de manera única a una misma solicitud o interfaz común, lo que mejora la flexibilidad y la extensibilidad del código.\r\n');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `questions`
--

CREATE TABLE `questions` (
  `id` int(11) NOT NULL,
  `id_challenge` int(11) NOT NULL,
  `question` varchar(500) NOT NULL,
  `level` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `questions`
--

INSERT INTO `questions` (`id`, `id_challenge`, `question`, `level`) VALUES
(1, 1, '¿A que se le llama encapsulación?', 1),
(2, 1, 'De los siguientes, ¿Cuál es un buen ejemplo de encapsulación?', 1),
(3, 1, '¿Cuál es el objetivo principal de la encapsulación?', 1),
(4, 1, '¿Qué son los métodos de acceso en POO?', 1),
(5, 1, '¿Cuál es la ventaja de utilizar métodos de acceso en POO?', 1),
(6, 2, '¿Cuál es el propósito de la abstracción en la programación orientada a objetos? ', 1),
(7, 2, '¿Qué es la abstracción en la programación orientada a objetos? ', 1),
(8, 2, '¿Qué es un método abstracto en la programación orientada a objetos? ', 1),
(9, 2, '¿Cuál es la ventaja de utilizar la abstracción en la programación orientada a objetos?', 1),
(10, 2, '¿Qué es una clase abstracta en la programación orientada a objetos? ', 1),
(11, 2, '¿Qué es un tipo de datos abstracto (TDA) en la programación orientada a objetos? ', 2),
(12, 2, '¿Qué es una interfaz en la programación orientada a objetos? ', 2),
(13, 3, '¿Qué es la herencia en la programación orientada a objetos? ', 1),
(14, 3, '¿Qué es una superclase en la programación orientada a objetos? ', 1),
(15, 3, '¿Qué es una subclase en la programación orientada a objetos? ', 1),
(16, 3, '¿Qué es el polimorfismo en la programación orientada a objetos? ', 2),
(17, 3, '¿Qué es la herencia múltiple en la programación orientada a objetos? ', 1),
(18, 3, '¿Qué es la clase final en la programación orientada a objetos? ', 2),
(19, 3, '¿Qué es la clase padre en la programación orientada a objetos? ', 1),
(20, 5, '¿Qué es una clase en la programación orientada a objetos? ', 1),
(21, 5, '¿Qué es un objeto en la programación orientada a objetos? ', 1),
(22, 5, '¿Qué es el constructor en la programación orientada a objetos? ', 1),
(23, 5, '¿Qué es el destructor en la programación orientada a objetos? ', 2),
(24, 5, '¿Qué es el método en la programación orientada a objetos? ', 1),
(25, 5, '¿Qué es el método estático en la programación orientada a objetos? ', 1),
(26, 5, '¿Qué es el método abstracto en la programación orientada a objetos?', 2),
(34, 4, '¿Qué es el polimorfismo? ', 1),
(35, 4, '¿Qué es el polimorfismo estático? ', 1),
(36, 4, '¿Qué es el polimorfismo dinámico? ', 1),
(37, 4, '¿Cuál es la diferencia entre sobrecarga y sobreescritura de métodos? ', 2),
(38, 4, '¿Qué es el enlace dinámico? ', 1),
(39, 4, '¿Cuál es la ventaja principal del polimorfismo? ', 1),
(40, 4, '¿Qué es un método virtual? ', 2),
(41, 6, '¿Qué es un método en programación orientada a objetos? ', 1),
(42, 6, '¿Qué es la sobrecarga de métodos en programación orientada a objetos?', 2),
(43, 6, '¿Qué es el modificador de acceso \"static\" en un método? ', 1),
(44, 6, '¿Qué es el modificador de acceso \"final\" en un método? ', 1),
(45, 6, '¿Qué es un método getter en programación orientada a objetos? ', 1),
(46, 6, '¿Qué es un método setter en programación orientada a objetos? ', 1),
(47, 1, '¿Qué es el modificador de acceso \"protected\" en una clase? ', 2),
(48, 1, '¿Qué es un método público en una clase? ', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tutorials`
--

CREATE TABLE `tutorials` (
  `id` int(11) NOT NULL,
  `id_challenge` int(11) NOT NULL,
  `url_video` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tutorials`
--

INSERT INTO `tutorials` (`id`, `id_challenge`, `url_video`) VALUES
(1, 1, 'https://www.youtube.com/embed/gR0EssHrl24'),
(2, 1, 'https://www.youtube.com/embed/0G84qeKXd00'),
(3, 1, 'https://www.youtube.com/embed/1rDog0lo76E'),
(4, 2, 'https://www.youtube.com/embed/2GaLSrW41pg'),
(5, 2, 'https://www.youtube.com/embed/oBO01Cx_YwQ'),
(6, 2, 'https://www.youtube.com/embed/puTrRZd6_aI'),
(7, 2, 'https://www.youtube.com/embed/NRfXJkvxQRQ'),
(8, 3, 'https://www.youtube.com/embed/9NynVRpZzv4'),
(9, 4, 'https://www.youtube.com/embed/tjjecfz9Cvk'),
(10, 4, 'https://www.youtube.com/embed/-xAav1WnB-Y'),
(11, 4, 'https://www.youtube.com/embed/LCm0-CkDjXY'),
(12, 4, 'https://www.youtube.com/embed/hcL0-LFYpIc'),
(13, 5, 'https://www.youtube.com/embed/aSUvGPB6oE8'),
(14, 6, 'https://www.youtube.com/embed/XNVHS5eT5HU');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `level` int(10) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`username`, `password`, `name`, `last_name`, `level`) VALUES
('juan.perez', '1234', 'Juan', 'Perez', 1),
('ricardo.paez', '1234', 'Ricardo', 'Páez', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_question` (`id_question`);

--
-- Indices de la tabla `challenge`
--
ALTER TABLE `challenge`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `challenge_results`
--
ALTER TABLE `challenge_results`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`),
  ADD KEY `id_challenge` (`id_challenge`);

--
-- Indices de la tabla `glosario`
--
ALTER TABLE `glosario`
  ADD PRIMARY KEY (`word`);

--
-- Indices de la tabla `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_challenge` (`id_challenge`);

--
-- Indices de la tabla `tutorials`
--
ALTER TABLE `tutorials`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_challenge` (`id_challenge`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `answers`
--
ALTER TABLE `answers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=167;

--
-- AUTO_INCREMENT de la tabla `challenge`
--
ALTER TABLE `challenge`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `challenge_results`
--
ALTER TABLE `challenge_results`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `questions`
--
ALTER TABLE `questions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT de la tabla `tutorials`
--
ALTER TABLE `tutorials`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `answers`
--
ALTER TABLE `answers`
  ADD CONSTRAINT `answers_ibfk_1` FOREIGN KEY (`id_question`) REFERENCES `questions` (`id`);

--
-- Filtros para la tabla `challenge_results`
--
ALTER TABLE `challenge_results`
  ADD CONSTRAINT `challenge_results_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`),
  ADD CONSTRAINT `challenge_results_ibfk_2` FOREIGN KEY (`id_challenge`) REFERENCES `challenge` (`id`);

--
-- Filtros para la tabla `questions`
--
ALTER TABLE `questions`
  ADD CONSTRAINT `questions_ibfk_1` FOREIGN KEY (`id_challenge`) REFERENCES `challenge` (`id`);

--
-- Filtros para la tabla `tutorials`
--
ALTER TABLE `tutorials`
  ADD CONSTRAINT `tutorials_ibfk_1` FOREIGN KEY (`id_challenge`) REFERENCES `challenge` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
