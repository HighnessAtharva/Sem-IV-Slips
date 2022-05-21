-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 08, 2022 at 05:37 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hb`
--

-- --------------------------------------------------------

--
-- Table structure for table `masteritemlist`
--

CREATE TABLE `masteritemlist` (
  `id` int(11) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `price` int(11) NOT NULL,
  `category` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `masteritemlist`
--

INSERT INTO `masteritemlist` (`id`, `item_name`, `price`, `category`) VALUES
(1, 'BrownBread', 15, 'BREADS'),
(2, 'GarlicBread', 99, 'BREADS'),
(3, 'GingerBread', 90, 'BREADS'),
(4, 'CheeseBread', 56, 'BREADS'),
(5, 'VanillaCake', 89, 'CAKES'),
(6, 'ChocolateCake', 159, 'CAKES');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `masteritemlist`
--
ALTER TABLE `masteritemlist`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
