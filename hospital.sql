-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 06, 2021 at 07:36 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Stand-in structure for view `daftar_obat`
-- (See below for the actual view)
--
CREATE TABLE `daftar_obat` (
`dokter` varchar(100)
,`pasien` varchar(50)
,`obat` varchar(100)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `daftar_obat1`
-- (See below for the actual view)
--
CREATE TABLE `daftar_obat1` (
`dokter` varchar(100)
,`pasien` varchar(50)
,`obat` varchar(100)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `daftar_obat2`
-- (See below for the actual view)
--
CREATE TABLE `daftar_obat2` (
`dokter` varchar(100)
,`pasien` varchar(50)
,`obat` varchar(100)
);

-- --------------------------------------------------------

--
-- Table structure for table `detail_rekaman_medis`
--

CREATE TABLE `detail_rekaman_medis` (
  `kd_rekaman` int(11) NOT NULL,
  `kd_kamar` int(11) NOT NULL,
  `kd_dokter` int(11) NOT NULL,
  `kd_obat` int(11) NOT NULL,
  `tgl_rekaman` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detail_rekaman_medis`
--

INSERT INTO `detail_rekaman_medis` (`kd_rekaman`, `kd_kamar`, `kd_dokter`, `kd_obat`, `tgl_rekaman`) VALUES
(1, 2, 6, 6, '2018-11-20'),
(5, 2, 3, 9, '2018-10-17'),
(6, 1, 9, 5, '2018-12-01'),
(8, 3, 5, 8, '2018-09-30'),
(4, 1, 10, 3, '2018-12-03'),
(10, 1, 1, 3, '2018-10-30'),
(2, 3, 1, 9, '2018-11-24');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `kd_dokter` int(11) NOT NULL,
  `kd_spesialis` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tempat_lahir` varchar(100) NOT NULL,
  `tanggal_lahir` varchar(20) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_tlp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`kd_dokter`, `kd_spesialis`, `nama`, `tempat_lahir`, `tanggal_lahir`, `alamat`, `no_tlp`) VALUES
(1, 1, 'Dr. Muhammad Fauzi', 'Kendal', '1979-10-09', 'Demak', '0863 5821 4912'),
(2, 3, 'Dr. Arif Yahya', 'Semarang', '1980-02-13', 'Semarang', '0831 4732 8313'),
(3, 5, 'Dr. Iva Prasetyanigsih', 'Jakarta', '1974-05-06', 'Bandung', '0863 3811 3410'),
(4, 10, 'Dr. Santoso', 'Kudus', '1975-12-03', 'Kudus', '0871 4529 1331'),
(5, 1, 'Dr. Siti Rahmawati', 'Semarang', '1980-08-31', 'Semarang', '0841 9391 4810'),
(6, 10, 'Dr. Joko Sulaiman', 'Demak', '1979-01-04', 'Kendal', '0834 2841 3811'),
(7, 4, 'Dr. Dian Lestari', 'Demak', '1979-08-01', 'Semarang', '0833 1831 3911'),
(8, 9, 'Dr. Agus', 'Kendal', '1973-06-14', 'Kendal', '0812 3812 2481'),
(9, 2, 'Dr. Taufik Hidayat', 'Pemalang', '1981-02-11', 'Purwodadi', '0811 4728 2919'),
(10, 5, 'Dr. Septi Suhesti', 'Purbalingga', '1977-09-23', 'Kendal', '0819 2847 9521'),
(11, 6, 'Dr. Agus Setiawan', 'Tasikmalaya', '1975-09-24', 'Garut', '0879 3456 7890');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_dokter`
--

CREATE TABLE `jadwal_dokter` (
  `kd_jadwal` int(11) NOT NULL,
  `kd_dokter` int(11) NOT NULL,
  `hari` varchar(50) NOT NULL,
  `jam_kerja` varchar(20) NOT NULL,
  `jam_pulang` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal_dokter`
--

INSERT INTO `jadwal_dokter` (`kd_jadwal`, `kd_dokter`, `hari`, `jam_kerja`, `jam_pulang`) VALUES
(1, 9, 'Senin, Rabu, Jumat', '07:30:00', '14:30:00'),
(2, 8, 'Selasa, Kamis, Minggu', '07:30:00', '14:30:00'),
(3, 5, 'Senin, Selasa, Jumat', '07:30:00', '14:30:00'),
(4, 2, 'Selasa, Kamis, Jumat', '07:30:00', '14:30:00'),
(5, 10, 'Senin, Selasa, Rabu', '14:30:00', '20:30:00'),
(6, 7, 'Kamis, Jumat, Sabtu', '14:30:00', '20:30:00'),
(7, 1, 'Senin, Selasa, Rabu', '14:30:00', '20:30:00'),
(8, 3, 'Kamis, Jumat, Sabtu', '14:30:00', '20:30:00'),
(9, 6, 'Senin, Selasa, Rabu, Kamis, Jumat', '08:00:00', '16:00:00'),
(10, 4, 'Senin, Selasa, Rabu, Kamis, Jumat', '08:00:00', '16:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `kamar_inap`
--

CREATE TABLE `kamar_inap` (
  `kd_kamar` int(11) NOT NULL,
  `kelas` varchar(50) NOT NULL,
  `biaya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kamar_inap`
--

INSERT INTO `kamar_inap` (`kd_kamar`, `kelas`, `biaya`) VALUES
(1, '1', 350000),
(2, '2', 250000),
(3, '3', 150000);

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `kd_obat` int(11) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `harga_obat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kd_obat`, `nama_obat`, `harga_obat`) VALUES
(1, 'Acetyl', 30000),
(2, 'Allylestrenol', 45000),
(3, 'Amfetamin', 70000),
(4, 'Haloperidol', 50000),
(5, 'Interferon', 20000),
(6, 'Manitol', 65000),
(7, 'Methisoprinol', 100000),
(8, 'Petrolatum', 80000),
(9, 'Quinolone', 150000),
(10, 'Zolpidem', 75000),
(11, 'Paracetamol', 20000);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `kd_pasien` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jk` enum('Pria','Wanita') NOT NULL,
  `berat_badan` int(11) NOT NULL,
  `tinggi_badan` int(11) NOT NULL,
  `golongan_darah` enum('A','B','AB','O') NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`kd_pasien`, `nama`, `jk`, `berat_badan`, `tinggi_badan`, `golongan_darah`, `alamat`) VALUES
(1, 'Hari Sulistio', 'Pria', 62, 145, 'A', 'Semarang'),
(2, 'Edi Wisnu', 'Pria', 55, 155, 'O', 'Semarang'),
(3, 'Darmadi', 'Pria', 60, 169, 'B', 'Kudus'),
(4, 'Rini', 'Wanita', 45, 157, 'O', 'Purwodadi'),
(5, 'Siti Nurlita', 'Wanita', 58, 162, 'AB', 'Purbalingga'),
(6, 'Iwan Mulyono', 'Pria', 60, 165, 'A', 'Purwokerto'),
(7, 'Dita Lestari', 'Wanita', 45, 141, 'AB', 'Semarang'),
(8, 'Nurhadi', 'Pria', 70, 168, 'O', 'Demak'),
(9, 'Faiz Candra', 'Pria', 36, 117, 'B', 'Rembang'),
(10, 'Nurul Hidayah', 'Wanita', 46, 151, 'B', 'Demak');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `kd_pembayaran` int(11) NOT NULL,
  `kd_petugas` int(11) NOT NULL,
  `kd_pasien` int(11) NOT NULL,
  `kd_kamar` int(11) DEFAULT NULL,
  `tgl_pembayaran` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pendaftaran`
--

CREATE TABLE `pendaftaran` (
  `kd_pendaftaran` int(11) NOT NULL,
  `kd_petugas` int(11) NOT NULL,
  `kd_pasien` int(11) NOT NULL,
  `tgl_pendafaran` date NOT NULL,
  `keterangan` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pendaftaran`
--

INSERT INTO `pendaftaran` (`kd_pendaftaran`, `kd_petugas`, `kd_pasien`, `tgl_pendafaran`, `keterangan`) VALUES
(1, 1, 3, '2018-08-16', NULL),
(2, 2, 7, '2018-09-27', NULL),
(3, 3, 2, '2018-10-02', NULL),
(4, 4, 9, '2018-12-06', NULL),
(5, 1, 1, '2018-11-30', NULL),
(6, 3, 8, '2018-12-06', NULL),
(7, 5, 4, '2018-07-30', NULL),
(8, 2, 10, '2018-11-19', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `kd_petugas` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `tempat_lahir` varchar(100) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `jk` enum('Pria','Wanita') NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_tlp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`kd_petugas`, `nama`, `tempat_lahir`, `tgl_lahir`, `jk`, `alamat`, `no_tlp`) VALUES
(1, 'Dedi Sutiawan', 'Semarang', '1982-10-20', 'Pria', 'Semarang', '0812 4789 3910'),
(2, 'Harianto', 'Rembang', '1985-06-24', 'Pria', 'Rembang', '0864 2852 9641'),
(3, 'Ulfa Trianingsih', 'Semarang', '1988-01-12', 'Wanita', 'Semarang', '0852 5684 6192'),
(4, 'Andi', 'Kudus', '1978-11-21', 'Pria', 'Kudus', '0811 3746 7272'),
(5, 'Wiwit', 'Purowokerto', '1990-08-06', 'Wanita', 'Purwokerto', '0813 4719 9201');

-- --------------------------------------------------------

--
-- Table structure for table `rekaman_medis`
--

CREATE TABLE `rekaman_medis` (
  `kd_rekaman` int(11) NOT NULL,
  `kd_pasien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rekaman_medis`
--

INSERT INTO `rekaman_medis` (`kd_rekaman`, `kd_pasien`) VALUES
(5, 1),
(3, 2),
(1, 3),
(9, 4),
(10, 5),
(6, 6),
(2, 7),
(7, 8),
(4, 9),
(8, 10);

-- --------------------------------------------------------

--
-- Table structure for table `spesialis`
--

CREATE TABLE `spesialis` (
  `kd_spesialis` int(11) NOT NULL,
  `spesialis` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `spesialis`
--

INSERT INTO `spesialis` (`kd_spesialis`, `spesialis`) VALUES
(1, 'Anak'),
(2, 'Bedah'),
(3, 'Gigi'),
(4, 'Jantung'),
(5, 'Kandungan'),
(6, 'Kulit'),
(7, 'Penyakit Dalam'),
(8, 'Saraf'),
(9, 'THT'),
(10, 'Dokter Umum');

-- --------------------------------------------------------

--
-- Structure for view `daftar_obat`
--
DROP TABLE IF EXISTS `daftar_obat`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `daftar_obat`  AS SELECT `dokter`.`nama` AS `dokter`, `pasien`.`nama` AS `pasien`, `obat`.`nama_obat` AS `obat` FROM ((((`dokter` join `pasien`) join `obat`) join `pembayaran`) join `detail_rekaman_medis`) WHERE `dokter`.`kd_dokter` = `detail_rekaman_medis`.`kd_dokter` AND `detail_rekaman_medis`.`kd_kamar` = `pembayaran`.`kd_kamar` AND `pembayaran`.`kd_pasien` = `pasien`.`kd_pasien` AND `detail_rekaman_medis`.`kd_obat` = `obat`.`kd_obat` ;

-- --------------------------------------------------------

--
-- Structure for view `daftar_obat1`
--
DROP TABLE IF EXISTS `daftar_obat1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `daftar_obat1`  AS SELECT `dokter`.`nama` AS `dokter`, `pasien`.`nama` AS `pasien`, `obat`.`nama_obat` AS `obat` FROM (((((`dokter` join `pasien`) join `obat`) join `pembayaran`) join `detail_rekaman_medis`) join `rekaman_medis`) WHERE `dokter`.`kd_dokter` = `detail_rekaman_medis`.`kd_dokter` AND `pembayaran`.`kd_pasien` = `pasien`.`kd_pasien` AND `detail_rekaman_medis`.`kd_obat` = `obat`.`kd_obat` AND `rekaman_medis`.`kd_pasien` = `pasien`.`kd_pasien` AND `detail_rekaman_medis`.`kd_rekaman` = `rekaman_medis`.`kd_rekaman` ;

-- --------------------------------------------------------

--
-- Structure for view `daftar_obat2`
--
DROP TABLE IF EXISTS `daftar_obat2`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `daftar_obat2`  AS SELECT `dokter`.`nama` AS `dokter`, `pasien`.`nama` AS `pasien`, `obat`.`nama_obat` AS `obat` FROM (((((`dokter` join `pasien`) join `obat`) join `pembayaran`) join `detail_rekaman_medis`) join `rekaman_medis`) WHERE `dokter`.`kd_dokter` = `detail_rekaman_medis`.`kd_dokter` AND `detail_rekaman_medis`.`kd_obat` = `obat`.`kd_obat` AND `rekaman_medis`.`kd_pasien` = `pasien`.`kd_pasien` AND `detail_rekaman_medis`.`kd_rekaman` = `rekaman_medis`.`kd_rekaman` ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_rekaman_medis`
--
ALTER TABLE `detail_rekaman_medis`
  ADD KEY `FK__Detail_rekaman_medis` (`kd_rekaman`),
  ADD KEY `FK__Detail_kamar_inap` (`kd_kamar`),
  ADD KEY `FK__Detail_dokter` (`kd_dokter`),
  ADD KEY `FK_detail_obat` (`kd_obat`);

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`kd_dokter`),
  ADD KEY `FK_dokter_spesialis` (`kd_spesialis`);

--
-- Indexes for table `jadwal_dokter`
--
ALTER TABLE `jadwal_dokter`
  ADD PRIMARY KEY (`kd_jadwal`),
  ADD KEY `FK__dokter` (`kd_dokter`);

--
-- Indexes for table `kamar_inap`
--
ALTER TABLE `kamar_inap`
  ADD PRIMARY KEY (`kd_kamar`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`kd_obat`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`kd_pasien`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`kd_pembayaran`),
  ADD KEY `FK__pembayaran_petugas` (`kd_petugas`),
  ADD KEY `FK__pembayaran_pasien` (`kd_pasien`),
  ADD KEY `FK_pembayaran_kamar_inap` (`kd_kamar`);

--
-- Indexes for table `pendaftaran`
--
ALTER TABLE `pendaftaran`
  ADD PRIMARY KEY (`kd_pendaftaran`),
  ADD KEY `FK__petugas` (`kd_petugas`),
  ADD KEY `FK_pendaftaran_pasien` (`kd_pasien`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`kd_petugas`);

--
-- Indexes for table `rekaman_medis`
--
ALTER TABLE `rekaman_medis`
  ADD PRIMARY KEY (`kd_rekaman`),
  ADD KEY `FK__pasien` (`kd_pasien`);

--
-- Indexes for table `spesialis`
--
ALTER TABLE `spesialis`
  ADD PRIMARY KEY (`kd_spesialis`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dokter`
--
ALTER TABLE `dokter`
  MODIFY `kd_dokter` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `jadwal_dokter`
--
ALTER TABLE `jadwal_dokter`
  MODIFY `kd_jadwal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `kamar_inap`
--
ALTER TABLE `kamar_inap`
  MODIFY `kd_kamar` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `obat`
--
ALTER TABLE `obat`
  MODIFY `kd_obat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `kd_pasien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `pendaftaran`
--
ALTER TABLE `pendaftaran`
  MODIFY `kd_pendaftaran` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `kd_petugas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `rekaman_medis`
--
ALTER TABLE `rekaman_medis`
  MODIFY `kd_rekaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `spesialis`
--
ALTER TABLE `spesialis`
  MODIFY `kd_spesialis` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_rekaman_medis`
--
ALTER TABLE `detail_rekaman_medis`
  ADD CONSTRAINT `FK__Detail_dokter` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`),
  ADD CONSTRAINT `FK__Detail_kamar_inap` FOREIGN KEY (`kd_kamar`) REFERENCES `kamar_inap` (`kd_kamar`),
  ADD CONSTRAINT `FK__Detail_rekaman_medis` FOREIGN KEY (`kd_rekaman`) REFERENCES `rekaman_medis` (`kd_rekaman`),
  ADD CONSTRAINT `FK_detail_obat` FOREIGN KEY (`kd_obat`) REFERENCES `obat` (`kd_obat`);

--
-- Constraints for table `dokter`
--
ALTER TABLE `dokter`
  ADD CONSTRAINT `FK_dokter_spesialis` FOREIGN KEY (`kd_spesialis`) REFERENCES `spesialis` (`kd_spesialis`);

--
-- Constraints for table `jadwal_dokter`
--
ALTER TABLE `jadwal_dokter`
  ADD CONSTRAINT `FK__dokter` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`);

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `FK__pembayaran_pasien` FOREIGN KEY (`kd_pasien`) REFERENCES `pasien` (`kd_pasien`),
  ADD CONSTRAINT `FK__pembayaran_petugas` FOREIGN KEY (`kd_petugas`) REFERENCES `petugas` (`kd_petugas`),
  ADD CONSTRAINT `FK_pembayaran_kamar_inap` FOREIGN KEY (`kd_kamar`) REFERENCES `kamar_inap` (`kd_kamar`);

--
-- Constraints for table `pendaftaran`
--
ALTER TABLE `pendaftaran`
  ADD CONSTRAINT `FK__petugas` FOREIGN KEY (`kd_petugas`) REFERENCES `petugas` (`kd_petugas`),
  ADD CONSTRAINT `FK_pendaftaran_pasien` FOREIGN KEY (`kd_pasien`) REFERENCES `pasien` (`kd_pasien`);

--
-- Constraints for table `rekaman_medis`
--
ALTER TABLE `rekaman_medis`
  ADD CONSTRAINT `FK__pasien` FOREIGN KEY (`kd_pasien`) REFERENCES `pasien` (`kd_pasien`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
