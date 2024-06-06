-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 21, 2023 at 04:32 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projectanjay`
--

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `Event_ID` int(11) NOT NULL,
  `Artist_Name` varchar(50) NOT NULL,
  `Artist_Desc` varchar(100) NOT NULL,
  `Event_Schedule` datetime(6) NOT NULL,
  `Event_Location` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbladmin`
--

CREATE TABLE `tbladmin` (
  `id_admin` int(11) NOT NULL,
  `Admin` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbladmin`
--

INSERT INTO `tbladmin` (`id_admin`, `Admin`, `password`) VALUES
(1, 'admin', 'admin123'),
(4, 'adminUsername', 'adminPassword'),
(5, 'adminUsername', 'adminPassword'),
(6, 'adminUsername', 'adminPassword'),
(7, 'adminUsername', 'adminPassword'),
(8, 'adminUsername', 'adminPassword'),
(9, 'adminUsername', 'adminPassword'),
(10, 'adminUsername', 'adminPassword'),
(12, 'ValidAdmin', 'ValidPassword'),
(13, 'ValidAdmin', 'ValidPassword'),
(14, 'ValidAdmin', 'ValidPassword'),
(15, 'ValidAdmin', 'ValidPassword'),
(16, 'ValidAdmin', 'ValidPassword'),
(17, 'ValidAdmin', 'ValidPassword'),
(18, 'ValidAdmin', 'ValidPassword'),
(19, 'ValidAdmin', 'ValidPassword'),
(20, 'ValidAdmin', 'ValidPassword'),
(21, 'ValidAdmin', 'ValidPassword'),
(22, 'ValidAdmin', 'ValidPassword'),
(23, 'ValidAdmin', 'ValidPassword'),
(24, 'ValidAdmin', 'ValidPassword'),
(25, 'ValidAdmin', 'ValidPassword'),
(26, 'ValidAdmin', 'ValidPassword'),
(27, 'ValidAdmin', 'ValidPassword'),
(28, 'ValidAdmin', 'ValidPassword'),
(29, 'ValidAdmin', 'ValidPassword'),
(30, 'ValidAdmin', 'ValidPassword'),
(31, 'ValidAdmin', 'ValidPassword'),
(32, 'ValidAdmin', 'ValidPassword'),
(33, 'ValidAdmin', 'ValidPassword'),
(34, 'ValidAdmin', 'ValidPassword'),
(35, 'ValidAdmin', 'ValidPassword'),
(36, 'ValidAdmin', 'ValidPassword'),
(37, 'ValidAdmin', 'ValidPassword'),
(38, 'ValidAdmin', 'ValidPassword'),
(39, 'ValidAdmin', 'ValidPassword'),
(40, 'ValidAdmin', 'ValidPassword'),
(41, 'ValidAdmin', 'ValidPassword'),
(42, 'ValidAdmin', 'ValidPassword'),
(43, 'ValidAdmin', 'ValidPassword'),
(44, 'ValidAdmin', 'ValidPassword'),
(45, 'ValidAdmin', 'ValidPassword');

-- --------------------------------------------------------

--
-- Table structure for table `tblcust`
--

CREATE TABLE `tblcust` (
  `id_customer` int(11) NOT NULL,
  `nama_customer` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_tlpn` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblcust`
--

INSERT INTO `tblcust` (`id_customer`, `nama_customer`, `alamat`, `no_tlpn`) VALUES
(8, 'Reyhan', 'villa bekasi indah', '012345'),
(9, 'Han', 'Japan', '987654'),
(12, 'Nama Pelanggan', 'Alamat Pelanggan', '123456'),
(13, 'Reyhan', 'villa bekasi indah', '012345'),
(20, 'Han', 'Japan', '987654'),
(22, 'Han', 'osaka', '232323'),
(23, 'Reyhan', 'villa bekasi indah', '012345'),
(24, 'Han', 'osaka', '232323'),
(25, 'Han', 'osaka', '232323'),
(26, 'Han', 'osaka', '232323'),
(27, 'Han', 'osaka', '232323'),
(28, 'Reyhan', 'villa bekasi indah', '012345'),
(29, 'Han', 'osaka', '232323'),
(30, 'Han', 'osaka', '232323'),
(31, 'Han', 'osaka', '232323'),
(32, 'Han', 'osaka', '232323'),
(33, 'Reyhan', 'villa bekasi indah', '012345'),
(34, 'Han', 'osaka', '232323'),
(35, 'Han', 'osaka', '232323'),
(36, 'Han', 'osaka', '232323'),
(37, 'Han', 'osaka', '232323'),
(38, 'Reyhan', 'villa bekasi indah', '012345'),
(39, 'Han', 'osaka', '232323'),
(40, 'Han', 'osaka', '232323'),
(41, 'Han', 'osaka', '232323'),
(42, 'Han', 'osaka', '232323'),
(43, 'Reyhan', 'villa bekasi indah', '012345'),
(44, 'Han', 'osaka', '232323'),
(45, 'Han', 'osaka', '232323'),
(46, 'Han', 'osaka', '232323'),
(47, 'Han', 'osaka', '232323'),
(48, 'kuya', 'Bekasi', '12345'),
(49, 'kuya', 'Bekasi', '12345'),
(50, 'kuya', 'Bekasi', '12345'),
(51, 'kuya', 'Bekasi', '12345'),
(52, 'kuya', 'Bekasi', '12345'),
(53, 'kuya', 'Bekasi', '12345'),
(54, 'kuya', 'Bekasi', '12345'),
(55, 'kuya', 'Bekasi', '12345'),
(56, 'kuya', 'Bekasi', '12345'),
(57, 'kuya', 'Bekasi', '12345'),
(58, 'kuya', 'Bekasi', '12345'),
(59, 'kuya', 'Bekasi', '12345'),
(60, 'kuya', 'Bekasi', '12345'),
(61, 'kuya', 'Bekasi', '12345'),
(62, 'kuya', 'Bekasi', '12345'),
(63, 'kuya', 'Bekasi', '12345'),
(64, 'kuya', 'Bekasi', '12345'),
(65, 'kuya', 'Bekasi', '12345'),
(66, 'kuya', 'Bekasi', '12345'),
(67, 'kuya', 'Bekasi', '12345'),
(68, 'kuya', 'Bekasi', '12345'),
(69, 'kuya', 'Bekasi', '12345'),
(70, 'kuya', 'Bekasi', '12345'),
(71, 'kuya', 'Bekasi', '12345'),
(72, 'kuya', 'Bekasi', '12345'),
(73, 'kuya', 'Bekasi', '12345'),
(74, 'kuya', 'Bekasi', '12345'),
(75, 'Sample Customer', 'Sample Address', '1234567890'),
(76, 'kuya', 'Bekasi', '12345'),
(77, 'Sample Customer', 'Sample Address', '1234567890'),
(78, 'kuya', 'Bekasi', '12345'),
(79, 'Sample Customer', 'Sample Address', '1234567890'),
(80, 'kuya', 'Bekasi', '12345'),
(81, 'Sample Customer', 'Sample Address', '1234567890'),
(82, 'kuya', 'Bekasi', '12345'),
(83, 'Sample Customer', 'Sample Address', '1234567890'),
(84, 'Sample Customer', 'Sample Address', '1234567890'),
(85, 'Sample Customer', 'Sample Address', '1234567890'),
(86, 'Sample Customer', 'Sample Address', '1234567890'),
(87, 'Sample Customer', 'Sample Address', '1234567890'),
(88, 'kuya', 'Bekasi', '12345'),
(89, 'Sample Customer', 'Sample Address', '1234567890'),
(90, 'kuya', 'Bekasi', '12345'),
(91, 'Sample Customer', 'Sample Address', '1234567890'),
(92, 'kuya', 'Bekasi', '12345'),
(93, 'Sample Customer', 'Sample Address', '1234567890'),
(94, 'kuya', 'Bekasi', '12345'),
(95, 'Sample Customer', 'Sample Address', '1234567890'),
(96, 'kuya', 'Bekasi', '12345'),
(97, 'Sample Customer', 'Sample Address', '1234567890'),
(98, 'kuya', 'Bekasi', '12345'),
(99, 'Sample Customer', 'Sample Address', '1234567890'),
(100, 'kuya', 'Bekasi', '12345'),
(101, 'Sample Customer', 'Sample Address', '1234567890'),
(102, 'kuya', 'Bekasi', '12345'),
(103, 'Sample Customer', 'Sample Address', '1234567890'),
(104, 'kuya', 'Bekasi', '12345'),
(105, 'Sample Customer', 'Sample Address', '1234567890'),
(106, 'kuya', 'Bekasi', '12345'),
(107, 'Sample Customer', 'Sample Address', '1234567890'),
(108, 'kuya', 'Bekasi', '12345'),
(109, 'Sample Customer', 'Sample Address', '1234567890'),
(110, 'kuya', 'Bekasi', '12345'),
(111, 'Sample Customer', 'Sample Address', '1234567890'),
(112, 'kuya', 'Bekasi', '12345'),
(113, 'Sample Customer', 'Sample Address', '1234567890'),
(114, 'kuya', 'Bekasi', '12345'),
(115, 'Sample Customer', 'Sample Address', '1234567890'),
(116, 'kuya', 'Bekasi', '12345'),
(117, 'Sample Customer', 'Sample Address', '1234567890'),
(118, 'kuya', 'Bekasi', '12345'),
(119, 'Sample Customer', 'Sample Address', '1234567890'),
(120, 'kuya', 'Bekasi', '12345'),
(121, 'Sample Customer', 'Sample Address', '1234567890'),
(122, 'kuya', 'Bekasi', '12345'),
(123, 'Sample Customer', 'Sample Address', '1234567890'),
(124, 'kuya', 'Bekasi', '12345'),
(125, 'Sample Customer', 'Sample Address', '1234567890'),
(126, 'kuya', 'Bekasi', '12345'),
(127, 'Sample Customer', 'Sample Address', '1234567890'),
(128, 'kuya', 'Bekasi', '12345'),
(129, 'Sample Customer', 'Sample Address', '1234567890');

-- --------------------------------------------------------

--
-- Table structure for table `tblemp`
--

CREATE TABLE `tblemp` (
  `id_employee` int(11) NOT NULL,
  `nama_employee` varchar(100) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `tlpn` varchar(15) NOT NULL,
  `sallary` varchar(30) NOT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblemp`
--

INSERT INTO `tblemp` (`id_employee`, `nama_employee`, `gender`, `tlpn`, `sallary`, `address`) VALUES
(3, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(4, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(5, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(6, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(7, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(8, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(9, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(10, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(11, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(12, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(13, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(14, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(15, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(16, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(17, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(18, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(19, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(20, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(21, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(22, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(23, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(24, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(25, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(26, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(27, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(28, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(29, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(30, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(31, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(32, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(33, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(34, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(35, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(36, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(37, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(38, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(39, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(40, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(41, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(42, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(43, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(44, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(45, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(46, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(47, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(48, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address'),
(49, 'kuyang', 'Bekasi', '123456789', '1500000', '1500000'),
(50, 'Sample Employee', 'Sample Gender', '1234567890', '1500000', 'Sample Address');

-- --------------------------------------------------------

--
-- Table structure for table `tblevent`
--

CREATE TABLE `tblevent` (
  `Event_ID` int(11) NOT NULL,
  `Artist_name` varchar(50) NOT NULL,
  `Artist_Desc` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tblticket`
--

CREATE TABLE `tblticket` (
  `id_ticket` int(11) NOT NULL,
  `ticket_code` varchar(80) NOT NULL,
  `ticket_type` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tblticket`
--

INSERT INTO `tblticket` (`id_ticket`, `ticket_code`, `ticket_type`) VALUES
(1, '123123', 'VVIP'),
(2, '01001', 'VVIP'),
(3, '001121', 'VIP'),
(7, '001121123', 'VVIP'),
(8, '56565', 'Reguler');

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `id_user` int(11) NOT NULL,
  `password` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`id_user`, `password`, `username`) VALUES
(3, '12345', 'rey'),
(4, '123', 'rey'),
(5, '123', 'contoh'),
(6, 'testPassword', 'testUser'),
(8, 'testPassword', 'testUser'),
(10, 'testPassword', 'testUser'),
(12, 'testPassword', 'testUser'),
(14, 'testPassword', 'testUser'),
(16, 'testPassword', 'testUser'),
(18, 'testPassword', 'testUser'),
(20, 'testPassword', 'testUser');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbladmin`
--
ALTER TABLE `tbladmin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `tblcust`
--
ALTER TABLE `tblcust`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `tblemp`
--
ALTER TABLE `tblemp`
  ADD PRIMARY KEY (`id_employee`);

--
-- Indexes for table `tblevent`
--
ALTER TABLE `tblevent`
  ADD PRIMARY KEY (`Event_ID`);

--
-- Indexes for table `tblticket`
--
ALTER TABLE `tblticket`
  ADD PRIMARY KEY (`id_ticket`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbladmin`
--
ALTER TABLE `tbladmin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT for table `tblcust`
--
ALTER TABLE `tblcust`
  MODIFY `id_customer` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=130;

--
-- AUTO_INCREMENT for table `tblemp`
--
ALTER TABLE `tblemp`
  MODIFY `id_employee` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `tblevent`
--
ALTER TABLE `tblevent`
  MODIFY `Event_ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tblticket`
--
ALTER TABLE `tblticket`
  MODIFY `id_ticket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tbluser`
--
ALTER TABLE `tbluser`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
