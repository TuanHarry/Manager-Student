-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 16, 2017 at 02:31 AM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlydiem`
--

-- --------------------------------------------------------

--
-- Table structure for table `thongtingiaovien`
--

CREATE TABLE `thongtingiaovien` (
  `Masogv` varchar(50) NOT NULL,
  `Hodem` varchar(50) NOT NULL,
  `Ten` varchar(50) NOT NULL,
  `Chucvu` varchar(25) NOT NULL,
  `Bomon` varchar(25) NOT NULL,
  `Gioitinh` varchar(5) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Sdt` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `thongtingiaovien`
--

INSERT INTO `thongtingiaovien` (`Masogv`, `Hodem`, `Ten`, `Chucvu`, `Bomon`, `Gioitinh`, `Email`, `Sdt`) VALUES
('5IT332', 'Nguyen Duc', 'Thuan', 'Giang Vien', 'HTTT', 'Nam', 'nguyenducthuan@ntu.edu.vn', '09999999999'),
('5IT3543', 'Nguyen van', 'Cuong', 'Giang Vien', 'KTDH', 'Nam', 'cuongnv@ntu.edu.vn', '0978546255');

-- --------------------------------------------------------

--
-- Table structure for table `thongtinhocsinh`
--

CREATE TABLE `thongtinhocsinh` (
  `Masohs` varchar(50) NOT NULL,
  `Hohs` varchar(50) NOT NULL,
  `Tenhs` varchar(20) NOT NULL,
  `Lop` varchar(50) NOT NULL,
  `Diachi` text NOT NULL,
  `Gioitinh` varchar(4) NOT NULL,
  `Sdt` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `thongtinhocsinh`
--

INSERT INTO `thongtinhocsinh` (`Masohs`, `Hohs`, `Tenhs`, `Lop`, `Diachi`, `Gioitinh`, `Sdt`) VALUES
('57130243', 'Tran Anh', 'Tuan', '57TH2', 'Qui Nhon Binh Dinh', 'nam', '01639899632'),
('57130246', 'Tran Van', 'Tuan', '7MT2', 'Duc Pho Quang Ngai', 'nam', '01639488996'),
('57135332', 'Bui Thi Minh ', 'Quang', '7TH2', 'Quang Nam', 'Nu', '01655712526'),
('57154026', 'Nguyen Phung ', 'Truong', '7TH2', 'Khanh Hoa', 'Nam', '0921653624');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `TenDN` varchar(50) NOT NULL,
  `MatKhau` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`TenDN`, `MatKhau`) VALUES
('admin', 'admin'),
('TuanTran', '12345111');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `thongtingiaovien`
--
ALTER TABLE `thongtingiaovien`
  ADD PRIMARY KEY (`Masogv`);

--
-- Indexes for table `thongtinhocsinh`
--
ALTER TABLE `thongtinhocsinh`
  ADD PRIMARY KEY (`Masohs`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`TenDN`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
