-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 19 Apr 2015 pada 15.02
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `klinik2`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `antrian`
--

CREATE TABLE IF NOT EXISTS `antrian` (
  `ID_ANTRIAN` varchar(10) NOT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `JENIS_ANTRIAN` varchar(30) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_ANTRIAN`),
  KEY `FK_RELATIONSHIP_17` (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_lab`
--

CREATE TABLE IF NOT EXISTS `detail_lab` (
  `ID_DETAIL_LAB` varchar(10) NOT NULL,
  `ID_LAB` varchar(10) DEFAULT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  `HASIL` longblob,
  `TANGGAL` date DEFAULT NULL,
  `TOTAL_HARGA` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_DETAIL_LAB`),
  KEY `FK_RELATIONSHIP_16` (`ID_LAB`),
  KEY `FK_RELATIONSHIP_30` (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_resep`
--

CREATE TABLE IF NOT EXISTS `detail_resep` (
  `NO_DETAIL_RESEP` varchar(10) NOT NULL,
  `ID_RESEP` varchar(10) DEFAULT NULL,
  `ID_OBAT` varchar(10) DEFAULT NULL,
  `TAKARAN` varchar(30) DEFAULT NULL,
  `PEMAKAIAN` varchar(30) DEFAULT NULL,
  `JUMLAH` int(11) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`NO_DETAIL_RESEP`),
  KEY `FK_RELATIONSHIP_11` (`ID_RESEP`),
  KEY `FK_RELATIONSHIP_24` (`ID_OBAT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_tindakan`
--

CREATE TABLE IF NOT EXISTS `detail_tindakan` (
  `NO_DETAIL` varchar(10) NOT NULL,
  `ID_TINDAKAN` varchar(10) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`NO_DETAIL`),
  KEY `FK_RELATIONSHIP_19` (`ID_TINDAKAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `det_layanan_kecantikan`
--

CREATE TABLE IF NOT EXISTS `det_layanan_kecantikan` (
  `ID_DET_KESEHATAN` varchar(10) NOT NULL,
  `ID_TRANSAKSI_LAYANAN` varchar(10) NOT NULL,
  `ID_KECANTIKAN` varchar(10) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_DET_KESEHATAN`),
  UNIQUE KEY `ID_TRANSAKSI_LAYANAN` (`ID_TRANSAKSI_LAYANAN`),
  KEY `FK_RELATIONSHIP_27` (`ID_KECANTIKAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `diagnosa`
--

CREATE TABLE IF NOT EXISTS `diagnosa` (
  `ID_DIAGNOSA` varchar(10) NOT NULL,
  `ID_PENYAKIT` varchar(10) DEFAULT NULL,
  `DIAGNOSA` varchar(30) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_DIAGNOSA`),
  KEY `FK_RELATIONSHIP_10` (`ID_PENYAKIT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `laboratorium`
--

CREATE TABLE IF NOT EXISTS `laboratorium` (
  `ID_LAB` varchar(10) NOT NULL,
  `JENIS_PEMERIKSAAN` varchar(30) DEFAULT NULL,
  `HARGA` int(11) DEFAULT NULL,
  `DESKRIPSI` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_LAB`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `layanan_kecantikan`
--

CREATE TABLE IF NOT EXISTS `layanan_kecantikan` (
  `ID_KECANTIKAN` varchar(10) NOT NULL,
  `JENIS_LAYANAN` varchar(30) DEFAULT NULL,
  `TARIF` int(11) DEFAULT NULL,
  `DESKRIPSI` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_KECANTIKAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE IF NOT EXISTS `obat` (
  `ID_OBAT` varchar(10) NOT NULL,
  `NAMA_OBAT` varchar(30) DEFAULT NULL,
  `JENIS_OBAT` varchar(30) DEFAULT NULL,
  `HARGA_OBAT` int(11) DEFAULT NULL,
  `SATUAN` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_OBAT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE IF NOT EXISTS `pasien` (
  `ID_PASIEN` varchar(10) NOT NULL,
  `NO_KTP` varchar(16) NOT NULL,
  `NAMA_PASIEN` varchar(30) NOT NULL,
  `ALAMAT` varchar(100) NOT NULL,
  `TGL_LAHIR` date NOT NULL,
  `TGL_DAFTAR` date NOT NULL,
  `USIA` int(3) NOT NULL,
  `NO_HP` varchar(13) NOT NULL,
  `JENIS_KELAMIN` varchar(1) NOT NULL,
  PRIMARY KEY (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`ID_PASIEN`, `NO_KTP`, `NAMA_PASIEN`, `ALAMAT`, `TGL_LAHIR`, `TGL_DAFTAR`, `USIA`, `NO_HP`, `JENIS_KELAMIN`) VALUES
('P0001', '1234', 'tiara', 'aaa', '0000-00-00', '0000-00-00', 20, '1234', 'P'),
('P0002', '12', 'aa', 'aa', '2015-04-16', '2015-04-17', 1, '1111', 'L');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
--

CREATE TABLE IF NOT EXISTS `pembayaran` (
  `ID_PEMBAYARAN` varchar(10) NOT NULL,
  `ID_USG` varchar(10) DEFAULT NULL,
  `ID_DETAIL_LAB` varchar(10) DEFAULT NULL,
  `ID_RESEP` varchar(10) DEFAULT NULL,
  `ID_REKAM` varchar(10) DEFAULT NULL,
  `ID_TRANSAKSI_LAYANAN` varchar(10) DEFAULT NULL,
  `TANGGAL_BAYAR` date DEFAULT NULL,
  `TOTAL_HARGA` int(11) DEFAULT NULL,
  `STATUS` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`ID_PEMBAYARAN`),
  KEY `FK_RELATIONSHIP_18` (`ID_DETAIL_LAB`),
  KEY `FK_RELATIONSHIP_21` (`ID_REKAM`),
  KEY `FK_RELATIONSHIP_25` (`ID_TRANSAKSI_LAYANAN`),
  KEY `FK_RELATIONSHIP_28` (`ID_USG`),
  KEY `FK_RELATIONSHIP_29` (`ID_RESEP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penyakit`
--

CREATE TABLE IF NOT EXISTS `penyakit` (
  `ID_PENYAKIT` varchar(10) NOT NULL,
  `PENYAKIT` varchar(50) DEFAULT NULL,
  `GEJALA` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_PENYAKIT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekam_medis`
--

CREATE TABLE IF NOT EXISTS `rekam_medis` (
  `ID_REKAM` varchar(10) NOT NULL,
  `ID_DIAGNOSA` varchar(10) DEFAULT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `NO_DETAIL` varchar(10) DEFAULT NULL,
  `TGL_REKAM` date DEFAULT NULL,
  `TINGGI` int(11) DEFAULT NULL,
  `BERAT` int(11) DEFAULT NULL,
  `TEKANAN_DARAH` int(11) DEFAULT NULL,
  `HASIL_PEMERIKSAAN` varchar(30) DEFAULT NULL,
  `ALERGI` varchar(30) DEFAULT NULL,
  `TOTAL_HARGA` int(11) DEFAULT NULL,
  `LAYANAN_TAMBAHAN` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_REKAM`),
  KEY `FK_RELATIONSHIP_1` (`ID_PASIEN`),
  KEY `FK_RELATIONSHIP_20` (`NO_DETAIL`),
  KEY `FK_RELATIONSHIP_22` (`ID_DIAGNOSA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `resep`
--

CREATE TABLE IF NOT EXISTS `resep` (
  `ID_RESEP` varchar(10) NOT NULL,
  `ID_REKAM` varchar(10) DEFAULT NULL,
  `TOTAL_HARGA` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_RESEP`),
  KEY `FK_RELATIONSHIP_23` (`ID_REKAM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tindakan`
--

CREATE TABLE IF NOT EXISTS `tindakan` (
  `ID_TINDAKAN` varchar(10) NOT NULL,
  `SPESIALISASI` varchar(30) DEFAULT NULL,
  `NAMA_TINDAKAN` varchar(30) DEFAULT NULL,
  `TARIF` int(11) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_TINDAKAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi_layanan_kecantikan`
--

CREATE TABLE IF NOT EXISTS `transaksi_layanan_kecantikan` (
  `ID_TRANSAKSI_LAYANAN` varchar(10) NOT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `TOTAL_HARGA` int(11) DEFAULT NULL,
  `TANGGAL` date DEFAULT NULL,
  PRIMARY KEY (`ID_TRANSAKSI_LAYANAN`),
  KEY `FK_RELATIONSHIP_31` (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi_usg`
--

CREATE TABLE IF NOT EXISTS `transaksi_usg` (
  `ID_USG` varchar(10) NOT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `HASIL` longblob,
  `HARGA` int(11) DEFAULT NULL,
  `DESKRIPSI` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_USG`),
  KEY `FK_RELATIONSHIP_32` (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `ID_USER` varchar(10) NOT NULL,
  `NAMA_USER` varchar(30) DEFAULT NULL,
  `JABATAN` varchar(100) DEFAULT NULL,
  `USERNAME` varchar(30) DEFAULT NULL,
  `PASSWORD` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_USER`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`ID_USER`, `NAMA_USER`, `JABATAN`, `USERNAME`, `PASSWORD`) VALUES
('U0001', 'Kusumaningtyas Aditya Putri', 'ADMINISTRATOR', 'Putri', 'Putri'),
('U0002', 'Adam Muhammad', 'PENDAFTARAN', 'Adam', 'Adam'),
('U0003', 'Anang Q.', 'PENDAFTARAN', 'Anang', 'Anang'),
('U0004', 'Afifah Nurrosyidah', 'DOKTER', 'Afifah', 'Afifah'),
('U0005', 'Rindu Puspita Wibawa', 'APOTEKER', 'Rindu', 'Rindu'),
('U0006', 'Erin Dinda Ahsana', 'LAB', 'Erin', 'Erin'),
('U0007', 'Arline Hartanti', 'USG', 'Arline', 'Arline'),
('U0008', 'Ayundha Puspadini', 'KECANTIKAN', 'Dini', 'Dini'),
('U0009', 'Tiara Ratna Sari', 'PEMBAYARAN', 'Tiara', 'Tiara'),
('U0010', 'Harris Bimo Aditya', 'KEP.KLINIK', 'Bimo', 'Bimo');

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `antrian`
--
ALTER TABLE `antrian`
  ADD CONSTRAINT `FK_RELATIONSHIP_17` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);

--
-- Ketidakleluasaan untuk tabel `detail_lab`
--
ALTER TABLE `detail_lab`
  ADD CONSTRAINT `FK_RELATIONSHIP_16` FOREIGN KEY (`ID_LAB`) REFERENCES `laboratorium` (`ID_LAB`),
  ADD CONSTRAINT `FK_RELATIONSHIP_30` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);

--
-- Ketidakleluasaan untuk tabel `detail_resep`
--
ALTER TABLE `detail_resep`
  ADD CONSTRAINT `FK_RELATIONSHIP_11` FOREIGN KEY (`ID_RESEP`) REFERENCES `resep` (`ID_RESEP`),
  ADD CONSTRAINT `FK_RELATIONSHIP_24` FOREIGN KEY (`ID_OBAT`) REFERENCES `obat` (`ID_OBAT`);

--
-- Ketidakleluasaan untuk tabel `detail_tindakan`
--
ALTER TABLE `detail_tindakan`
  ADD CONSTRAINT `FK_RELATIONSHIP_19` FOREIGN KEY (`ID_TINDAKAN`) REFERENCES `tindakan` (`ID_TINDAKAN`);

--
-- Ketidakleluasaan untuk tabel `det_layanan_kecantikan`
--
ALTER TABLE `det_layanan_kecantikan`
  ADD CONSTRAINT `det_layanan_kecantikan_ibfk_2` FOREIGN KEY (`ID_TRANSAKSI_LAYANAN`) REFERENCES `transaksi_layanan_kecantikan` (`ID_TRANSAKSI_LAYANAN`),
  ADD CONSTRAINT `det_layanan_kecantikan_ibfk_1` FOREIGN KEY (`ID_KECANTIKAN`) REFERENCES `layanan_kecantikan` (`ID_KECANTIKAN`);

--
-- Ketidakleluasaan untuk tabel `diagnosa`
--
ALTER TABLE `diagnosa`
  ADD CONSTRAINT `FK_RELATIONSHIP_10` FOREIGN KEY (`ID_PENYAKIT`) REFERENCES `penyakit` (`ID_PENYAKIT`);

--
-- Ketidakleluasaan untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `FK_RELATIONSHIP_18` FOREIGN KEY (`ID_DETAIL_LAB`) REFERENCES `detail_lab` (`ID_DETAIL_LAB`),
  ADD CONSTRAINT `FK_RELATIONSHIP_21` FOREIGN KEY (`ID_REKAM`) REFERENCES `rekam_medis` (`ID_REKAM`),
  ADD CONSTRAINT `FK_RELATIONSHIP_25` FOREIGN KEY (`ID_TRANSAKSI_LAYANAN`) REFERENCES `transaksi_layanan_kecantikan` (`ID_TRANSAKSI_LAYANAN`),
  ADD CONSTRAINT `FK_RELATIONSHIP_28` FOREIGN KEY (`ID_USG`) REFERENCES `transaksi_usg` (`ID_USG`),
  ADD CONSTRAINT `FK_RELATIONSHIP_29` FOREIGN KEY (`ID_RESEP`) REFERENCES `resep` (`ID_RESEP`);

--
-- Ketidakleluasaan untuk tabel `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD CONSTRAINT `FK_RELATIONSHIP_1` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`),
  ADD CONSTRAINT `FK_RELATIONSHIP_20` FOREIGN KEY (`NO_DETAIL`) REFERENCES `detail_tindakan` (`NO_DETAIL`),
  ADD CONSTRAINT `FK_RELATIONSHIP_22` FOREIGN KEY (`ID_DIAGNOSA`) REFERENCES `diagnosa` (`ID_DIAGNOSA`);

--
-- Ketidakleluasaan untuk tabel `resep`
--
ALTER TABLE `resep`
  ADD CONSTRAINT `FK_RELATIONSHIP_23` FOREIGN KEY (`ID_REKAM`) REFERENCES `rekam_medis` (`ID_REKAM`);

--
-- Ketidakleluasaan untuk tabel `transaksi_layanan_kecantikan`
--
ALTER TABLE `transaksi_layanan_kecantikan`
  ADD CONSTRAINT `FK_RELATIONSHIP_31` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);

--
-- Ketidakleluasaan untuk tabel `transaksi_usg`
--
ALTER TABLE `transaksi_usg`
  ADD CONSTRAINT `FK_RELATIONSHIP_32` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
