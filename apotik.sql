-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Agu 2020 pada 08.18
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.2.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotik`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `id_obat` varchar(255) NOT NULL,
  `nama_obat` varchar(255) NOT NULL,
  `kategori` varchar(100) NOT NULL,
  `komposisi` varchar(200) NOT NULL,
  `dosis` varchar(100) NOT NULL,
  `aturan_pakai` varchar(100) NOT NULL,
  `harga` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`id_obat`, `nama_obat`, `kategori`, `komposisi`, `dosis`, `aturan_pakai`, `harga`) VALUES
('OBT12', 'Panadol', 'Sakit kepala', 'nanas jeruk', 'Dewasa', 'pagi', '2000'),
('OBT1', 'Paramex', 'Demam', 'alll', '12 Tahun ++', '3 kali sehari', '2000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` varchar(255) NOT NULL,
  `obat_id` varchar(255) NOT NULL,
  `jumlah_beli` int(6) NOT NULL,
  `tanggal` varchar(255) NOT NULL,
  `total` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `obat_id`, `jumlah_beli`, `tanggal`, `total`) VALUES
('ORD-0331', 'OBT1', 3, '29-07-2020', '6000'),
('ORD-3754', 'OBT1', 2, 'null', '4000'),
('ORD-4227', 'OBT12', 3, '29-07-2020', '6000'),
('ORD-4549', 'OBT1', 6, '29-07-2020', '12000'),
('ORD-5306', 'OBT1', 1, '29-07-2020', '2000'),
('ORD-5422', 'OBT1', 3, '29-07-2020', '6000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nama_user` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `nama_user`) VALUES
('USR001', 'admin', 'admin', 'Suherman');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
