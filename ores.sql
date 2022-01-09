-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2022 at 04:06 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ores`
--

-- --------------------------------------------------------

--
-- Table structure for table `faq`
--

CREATE TABLE `faq` (
  `faqid` int(10) NOT NULL,
  `faqtitle` varchar(200) NOT NULL,
  `faqsolution` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `faq`
--

INSERT INTO `faq` (`faqid`, `faqtitle`, `faqsolution`) VALUES
(1, 'How to upload your property details?', 'Go to Post property > Add property details > click on Upload buttton'),
(2, 'How to change Profile details?', 'Go to Profile > click on Change details button > add your new profile or details > click on Update button'),
(3, 'How to contact complain', 'Go to contact us and complain with details');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `contact` varchar(10) NOT NULL,
  `email` varchar(100) NOT NULL,
  `intention` varchar(10) NOT NULL,
  `comment` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `name`, `contact`, `email`, `intention`, `comment`) VALUES
(7, 'Demo name', '9988776644', 'demo@gmail.com', 'Feedback', 'good website ');

-- --------------------------------------------------------

--
-- Table structure for table `property`
--

CREATE TABLE `property` (
  `pid` int(10) NOT NULL,
  `pdate` timestamp NOT NULL DEFAULT current_timestamp(),
  `id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `pname` varchar(50) NOT NULL,
  `ptype` varchar(50) NOT NULL,
  `srproperty` varchar(10) NOT NULL,
  `psubtype` varchar(50) NOT NULL,
  `details` text NOT NULL,
  `price` double NOT NULL,
  `contact` varchar(10) NOT NULL,
  `cityname` varchar(50) NOT NULL,
  `pincode` varchar(6) NOT NULL,
  `address` varchar(250) NOT NULL,
  `location` text NOT NULL,
  `bedroom` varchar(10) NOT NULL,
  `bathroom` varchar(10) NOT NULL,
  `area` varchar(100) NOT NULL,
  `areasq` varchar(50) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `status` int(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `property`
--

INSERT INTO `property` (`pid`, `pdate`, `id`, `name`, `pname`, `ptype`, `srproperty`, `psubtype`, `details`, `price`, `contact`, `cityname`, `pincode`, `address`, `location`, `bedroom`, `bathroom`, `area`, `areasq`, `filename`, `path`, `status`) VALUES
(94, '2021-12-15 11:30:28', 57, 'Demo name', 'demo name', 'Apartment', 'Sale', '1RK', '<p>best house for sale</p>\r\n', 89898, '9988776644', 'Mumbai', '400022', 'Sion, Mumbai, Maharashtra', 'no location', '1', '1', '120', 'Square Feet', 'bg-photo-1.jpg', 'C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\Properties\\bg-photo-1.jpg', 1);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `password` varchar(250) NOT NULL,
  `filename` varchar(255) NOT NULL,
  `path` varchar(255) NOT NULL,
  `role` varchar(10) NOT NULL DEFAULT 'user'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`id`, `name`, `contact`, `email`, `password`, `filename`, `path`, `role`) VALUES
(41, 'admin', '9090', 'admin@gmail.com', '$2a$12$UVZiSj3yyupmIjEaiuDeD.mqnj2ve2.TJn354OL08H5QbqAZLjYB2', 'Sharingan.jpeg', 'C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\User Profile\\Sharingan.jpeg', 'admin'),
(57, 'Demo name', '9988776644', 'demo@gmail.com', '$2a$12$rKEb5qNtQOHQ2gxOGjzSMeyNVfjXkQvyjrd//J5J/p1jaw9iccmJa', 'default in.jfif', 'C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\User Profile\\default in.jfif', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `faq`
--
ALTER TABLE `faq`
  ADD PRIMARY KEY (`faqid`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`),
  ADD KEY `email_cntr` (`email`);

--
-- Indexes for table `property`
--
ALTER TABLE `property`
  ADD PRIMARY KEY (`pid`),
  ADD KEY `id` (`id`),
  ADD KEY `name` (`name`);

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `contact` (`contact`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `faq`
--
ALTER TABLE `faq`
  MODIFY `faqid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `property`
--
ALTER TABLE `property`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=95;

--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `feedback`
--
ALTER TABLE `feedback`
  ADD CONSTRAINT `email_cntr` FOREIGN KEY (`email`) REFERENCES `signup` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `property`
--
ALTER TABLE `property`
  ADD CONSTRAINT `property_ibfk_1` FOREIGN KEY (`id`) REFERENCES `signup` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
