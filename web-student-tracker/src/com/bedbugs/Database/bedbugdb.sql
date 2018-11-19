-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 08, 2018 at 09:45 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
--create Database bedbugdb;
use bedbugdb;
--

-- --------------------------------------------------------

--
-- Table structure for table `resapp`
--

CREATE TABLE `resapp` (
  `PID` int(11) DEFAULT NULL,
  'UserID' int(11) DEFAULT NULL,
  `PreffAccomStyle` varchar(30) DEFAULT NULL,
  `SpecialConsiderations` varchar(100) DEFAULT NULL,
  `PreferedRoomate1` varchar(60) DEFAULT NULL,
  `PreferedRoomate2` varchar(60) DEFAULT NULL,
  `DateSubmitted` date DEFAULT NULL,
  `AppStatus` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `residentinfo`
--

CREATE TABLE `residentinfo` (
  `PID` int(11) DEFAULT NULL,
  'UserID' int(11) DEFAULT NULL,
  'RoomID' int(11) DEFAULT NULL,
  `PhoneNum` varchar(15) DEFAULT NULL,
  `EmergContact` varchar(30) DEFAULT NULL,
  `EmergNum` varchar(15) DEFAULT NULL,
  `YearApplied` int(11) DEFAULT NULL,
  `StatusCode` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `resrooms`
--

CREATE TABLE `resrooms` (
  `RoomID` int(11) NOT NULL,
  `Campus` varchar(30) DEFAULT NULL,
  `ResName` varchar(30) DEFAULT NULL,
  `HouseName` varchar(30) DEFAULT NULL,
  `ResType` varchar(30) DEFAULT NULL,
  `RoomType` varchar(30) DEFAULT NULL
  'Size' int(2) DEFAULT NULL --number of students
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roombooking`
--

CREATE TABLE `roombooking` (
  `PID` int(11) DEFAULT NULL,
  'UserID' int(11) DEFAULT NULL,
  `TermNum` int(11) DEFAULT NULL,
  `RoomID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `PID` int(11) NOT NULL,
  `StdEmpNum` int(11) DEFAULT NULL,
  `FirstName` varchar(30) DEFAULT NULL,
  `LastName` varchar(30) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `UserType` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `admininfo`
--

CREATE TABLE `admininfo` (
  `PID` int(11) NOT NULL,
  `EmployeeID` int(11) DEFAULT NULL,
  `FirstName` varchar(30) DEFAULT NULL,
  `LastName` varchar(30) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `workorder`
--

CREATE TABLE `workorder` (
  `OrderNum` int(11) NOT NULL,
  `SubPID` int(11) DEFAULT NULL,
  'UserID' int(11) DEFAULT,
  `Building` varchar(30) DEFAULT NULL,
  `Room` varchar(30) DEFAULT NULL,
  `Description` varchar(300) DEFAULT NULL,
  `DateOpened` date DEFAULT NULL,
  `DateClosed` date DEFAULT NULL,
  `Notes` varchar(100) DEFAULT NULL,
  'Complete' boolean DEFAULT FALSE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `resrooms`
--
ALTER TABLE `resrooms`
  ADD PRIMARY KEY (`RoomID`);

--
-- Indexes for table `workorder`
--
ALTER TABLE `workorder`
  ADD PRIMARY KEY (`OrderNum`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
