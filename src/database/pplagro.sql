-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2017 at 02:33 AM
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
-- Table structure for table `jenis_sapi`
--

CREATE TABLE `jenis_sapi` (
  `id_jenis_sapi` int(11) NOT NULL,
  `jenis_sapi` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis_sapi`
--

INSERT INTO `jenis_sapi` (`id_jenis_sapi`, `jenis_sapi`) VALUES
(1, 'Limousin'),
(2, 'Simmental'),
(3, 'Brahma'),
(4, 'Brangus'),
(5, 'Aberdeen Angus'),
(6, 'Beefalo'),
(7, 'Braford'),
(8, 'Hereford'),
(9, 'Dexter'),
(10, 'Parthenais'),
(11, 'Belgian blue'),
(12, 'Droughtmaster'),
(13, 'Murray grey'),
(14, 'Pinzgauer'),
(15, 'Ongole'),
(16, 'Madura'),
(17, 'Bali'),
(18, 'Aceh');

-- --------------------------------------------------------

--
-- Table structure for table `kandang`
--

CREATE TABLE `kandang` (
  `id_kandang` int(11) NOT NULL,
  `kapasitas_kandang` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `kandang`
--

INSERT INTO `kandang` (`id_kandang`, `kapasitas_kandang`) VALUES
(5, 10),
(23, 23),
(234, 23);

-- --------------------------------------------------------

--
-- Table structure for table `makanan`
--

CREATE TABLE `makanan` (
  `id_makanan` int(11) NOT NULL,
  `id_jenis` int(11) NOT NULL,
  `id_nama_makanan` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `makanan`
--

INSERT INTO `makanan` (`id_makanan`, `id_jenis`, `id_nama_makanan`) VALUES
(3, 1, 1);

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
-- Table structure for table `sapi`
--

CREATE TABLE `sapi` (
  `id_sapi` int(11) NOT NULL,
  `berat_sapi` double DEFAULT NULL,
  `umur_sapi` int(11) NOT NULL,
  `pakan_sapi` int(11) DEFAULT NULL,
  `vitamin` int(11) DEFAULT NULL,
  `vaksin` int(11) DEFAULT NULL,
  `id_validasi` int(11) DEFAULT NULL,
  `id_saran` int(11) DEFAULT NULL,
  `id_kandang` int(11) DEFAULT NULL,
  `id_jenis_sapi` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sapi`
--

INSERT INTO `sapi` (`id_sapi`, `berat_sapi`, `umur_sapi`, `pakan_sapi`, `vitamin`, `vaksin`, `id_validasi`, `id_saran`, `id_kandang`, `id_jenis_sapi`) VALUES
(2, 11.56, 3, NULL, NULL, NULL, NULL, NULL, 5, 3),
(15, 15252.25, 23, NULL, NULL, NULL, NULL, NULL, 5, 17),
(16, 1176.49, 45, NULL, NULL, NULL, NULL, NULL, 5, 15),
(17, 1751652.25, 21, NULL, NULL, NULL, NULL, NULL, 5, 2);

-- --------------------------------------------------------

--
-- Table structure for table `saran`
--

CREATE TABLE `saran` (
  `id_saran` int(11) NOT NULL,
  `saran` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `saran`
--

INSERT INTO `saran` (`id_saran`, `saran`) VALUES
(1, 'Tambahkan Vitamin dan Vaksin selama 1 minggu kedepan kemudian cek lagi untuk kelakuan dan kebiasaan sapi');

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
(1, 'admin', 'admin', 'admin'),
(2, 'peternak', 'peternak', 'peternak');

-- --------------------------------------------------------

--
-- Table structure for table `validasi`
--

CREATE TABLE `validasi` (
  `id_validasi` int(11) NOT NULL,
  `validasi` enum('Diterima','Ditolak','','') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `validasi`
--

INSERT INTO `validasi` (`id_validasi`, `validasi`) VALUES
(1, 'Diterima'),
(2, 'Ditolak');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jenis_makanan`
--
ALTER TABLE `jenis_makanan`
  ADD PRIMARY KEY (`id_jenis`);

--
-- Indexes for table `jenis_sapi`
--
ALTER TABLE `jenis_sapi`
  ADD PRIMARY KEY (`id_jenis_sapi`);

--
-- Indexes for table `kandang`
--
ALTER TABLE `kandang`
  ADD PRIMARY KEY (`id_kandang`),
  ADD UNIQUE KEY `id_kandang` (`id_kandang`);

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
-- Indexes for table `sapi`
--
ALTER TABLE `sapi`
  ADD PRIMARY KEY (`id_sapi`),
  ADD KEY `id_berat_sapi` (`berat_sapi`),
  ADD KEY `id_validasi` (`id_validasi`),
  ADD KEY `id_saran` (`id_saran`),
  ADD KEY `id_kandang` (`id_kandang`),
  ADD KEY `id_kandang_2` (`id_kandang`),
  ADD KEY `id_jenis_sapi` (`id_jenis_sapi`);

--
-- Indexes for table `saran`
--
ALTER TABLE `saran`
  ADD PRIMARY KEY (`id_saran`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `validasi`
--
ALTER TABLE `validasi`
  ADD PRIMARY KEY (`id_validasi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jenis_makanan`
--
ALTER TABLE `jenis_makanan`
  MODIFY `id_jenis` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `jenis_sapi`
--
ALTER TABLE `jenis_sapi`
  MODIFY `id_jenis_sapi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `makanan`
--
ALTER TABLE `makanan`
  MODIFY `id_makanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nama_makanan`
--
ALTER TABLE `nama_makanan`
  MODIFY `id_nama_makanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `sapi`
--
ALTER TABLE `sapi`
  MODIFY `id_sapi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `saran`
--
ALTER TABLE `saran`
  MODIFY `id_saran` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `validasi`
--
ALTER TABLE `validasi`
  MODIFY `id_validasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `makanan`
--
ALTER TABLE `makanan`
  ADD CONSTRAINT `makanan_ibfk_1` FOREIGN KEY (`id_jenis`) REFERENCES `jenis_makanan` (`id_jenis`),
  ADD CONSTRAINT `makanan_ibfk_2` FOREIGN KEY (`id_nama_makanan`) REFERENCES `nama_makanan` (`id_nama_makanan`);

--
-- Constraints for table `sapi`
--
ALTER TABLE `sapi`
  ADD CONSTRAINT `sapi_ibfk_1` FOREIGN KEY (`id_saran`) REFERENCES `saran` (`id_saran`),
  ADD CONSTRAINT `sapi_ibfk_2` FOREIGN KEY (`id_validasi`) REFERENCES `validasi` (`id_validasi`),
  ADD CONSTRAINT `sapi_ibfk_3` FOREIGN KEY (`id_kandang`) REFERENCES `kandang` (`id_kandang`),
  ADD CONSTRAINT `sapi_ibfk_4` FOREIGN KEY (`id_jenis_sapi`) REFERENCES `jenis_sapi` (`id_jenis_sapi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
