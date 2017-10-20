-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 13, 2017 at 12:17 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pplagro`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenis_makanan`
--

CREATE TABLE `jenis_makanan` (
  `id_jenis` int(11) NOT NULL,
  `jenis` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis_makanan`
--

INSERT INTO `jenis_makanan` (`id_jenis`, `jenis`) VALUES
(1, 'Makanan'),
(2, 'Vaksin'),
(3, 'Vitamin');

-- --------------------------------------------------------

--
-- Table structure for table `kandang`
--

CREATE TABLE `kandang` (
  `id_kandang` int(11) NOT NULL,
  `nomor_kandang` int(11) NOT NULL,
  `kapasitas_kandang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `kandang`
--

INSERT INTO `kandang` (`id_kandang`, `nomor_kandang`, `kapasitas_kandang`) VALUES
(2, 12, 12);

-- --------------------------------------------------------

--
-- Table structure for table `makanan`
--

CREATE TABLE `makanan` (
  `id_makanan` int(11) NOT NULL,
  `id_jenis` int(11) NOT NULL,
  `id_nama_makanan` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nama_makanan`
--

CREATE TABLE `nama_makanan` (
  `id_nama_makanan` int(11) NOT NULL,
  `nama_makanan` varchar(25) NOT NULL,
  `persentase_BK` float NOT NULL,
  `persentase_PK` float NOT NULL,
  `persentase_TDN` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `nama_makanan`
--

INSERT INTO `nama_makanan` (`id_nama_makanan`, `nama_makanan`, `persentase_BK`, `persentase_PK`, `persentase_TDN`) VALUES
(1, 'Ampas Tahu', 10.788, 25.651, 76),
(2, 'Ampas Kecap', 85.43, 36.381, 89.553),
(3, 'Ampas Bir', 31.174, 26.448, 78.708),
(4, 'Ampas Brem', 81.634, 3.13, 55.826),
(5, 'Ampas Gula Cair', 34.314, 5.106, 54.956),
(6, 'Bungkil Kopra', 90.557, 27.597, 75.333),
(7, 'Bungkil Kelapa Sawit', 92.524, 14.112, 67.435),
(8, 'Bungkil Kacang Tanah', 91.447, 36.397, 71.721),
(9, 'Bungkil Kedelai', 89.413, 52.075, 40.265),
(10, 'Bungkil Bengkuang', 92.524, 14.112, 67.435),
(11, 'Dedak Padi', 91.267, 9.96, 55.521),
(12, 'Kedelai BS', 85.43, 38.38, 69.93),
(13, 'Onggok Kering', 90.17, 2.839, 77.249),
(14, 'Tumpi Kedelai', 91.417, 21.134, 69.425),
(15, 'Tumpi Jagung', 87.385, 8.657, 48.475),
(16, 'Tepung Gaplek', 87.024, 2.412, 73.489),
(17, 'Polard', 89.567, 16.412, 74.828),
(18, 'Molasses', 30.232, 8.3, 63),
(19, 'Daun Ubi Jalar', 87, 14.32, 67.3),
(20, 'Daun Ubi Kayu', 88.69, 20.4, 65.3),
(21, 'Gamal Berbunga', 89.7, 19.1, 69),
(22, 'Gamal Muda', 90.1, 22.7, 75),
(23, 'Tepung daun Alfafa', 90.5, 20, 74.1),
(24, 'Alang - Alang', 91.81, 6.5, 54),
(25, 'Rumput teki', 91.4, 11.9, 57),
(26, 'Daun Bambu', 91.27, 4.24, 36.42),
(27, 'Daun Kelapa', 91.74, 7.23, 42.28),
(28, 'Daun Pisang', 94.3, 2.79, 73.5),
(29, 'Rumput Gajah', 89.9, 9.1, 46),
(30, 'Tebon Jagung 34 - 56', 91.1, 10.7, 59),
(31, 'Tebon Jagung 56 - 70', 92.2, 9.9, 54.3),
(32, 'Tebon Jagung 99 - 112', 91.3, 9.2, 49.6);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL,
  `level` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `level`) VALUES
(1, 'fahmy', 'fahmy', 'admin'),
(2, 'haris', 'haris', 'peternak');

-- --------------------------------------------------------

--
-- Table structure for table `validasi`
--

CREATE TABLE `validasi` (
  `id_validasi` int(11) NOT NULL,
  `id_sapi` int(11) NOT NULL,
  `validasi` enum('Diterima','Ditolak','','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jenis_makanan`
--
ALTER TABLE `jenis_makanan`
  ADD PRIMARY KEY (`id_jenis`);

--
-- Indexes for table `kandang`
--
ALTER TABLE `kandang`
  ADD PRIMARY KEY (`id_kandang`),
  ADD UNIQUE KEY `nomor_kandang` (`nomor_kandang`);

--
-- Indexes for table `makanan`
--
ALTER TABLE `makanan`
  ADD PRIMARY KEY (`id_makanan`),
  ADD KEY `id_jenis` (`id_jenis`),
  ADD KEY `id_nama_makanan` (`id_nama_makanan`);

--
-- Indexes for table `nama_makanan`
--
ALTER TABLE `nama_makanan`
  ADD PRIMARY KEY (`id_nama_makanan`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `validasi`
--
ALTER TABLE `validasi`
  ADD PRIMARY KEY (`id_validasi`),
  ADD KEY `id_sapi` (`id_sapi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jenis_makanan`
--
ALTER TABLE `jenis_makanan`
  MODIFY `id_jenis` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `kandang`
--
ALTER TABLE `kandang`
  MODIFY `id_kandang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `makanan`
--
ALTER TABLE `makanan`
  MODIFY `id_makanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `nama_makanan`
--
ALTER TABLE `nama_makanan`
  MODIFY `id_nama_makanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `validasi`
--
ALTER TABLE `validasi`
  MODIFY `id_validasi` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `makanan`
--
ALTER TABLE `makanan`
  ADD CONSTRAINT `makanan_ibfk_1` FOREIGN KEY (`id_jenis`) REFERENCES `jenis_makanan` (`id_jenis`),
  ADD CONSTRAINT `makanan_ibfk_2` FOREIGN KEY (`id_nama_makanan`) REFERENCES `nama_makanan` (`id_nama_makanan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
