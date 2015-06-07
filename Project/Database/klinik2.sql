-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2015 at 07:57 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `klinik2`
--

-- --------------------------------------------------------

--
-- Table structure for table `antrian`
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
-- Table structure for table `detail_lab`
--

CREATE TABLE IF NOT EXISTS `detail_lab` (
  `ID_DETAIL_LAB` varchar(10) NOT NULL,
  `ID_TRANSAKSI_LAB` varchar(10) DEFAULT NULL,
  `ID_LAB` varchar(10) DEFAULT NULL,
  `HASIL` longblob,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_DETAIL_LAB`),
  KEY `FK_RELATIONSHIP_16` (`ID_LAB`),
  KEY `ID_TRANSAKSI_LAB` (`ID_TRANSAKSI_LAB`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `detail_resep`
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
-- Table structure for table `detail_tindakan`
--

CREATE TABLE IF NOT EXISTS `detail_tindakan` (
  `NO_DETAIL` varchar(10) NOT NULL,
  `ID_TINDAKAN` varchar(10) DEFAULT NULL,
  `ID_REKAM` varchar(10) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`NO_DETAIL`),
  UNIQUE KEY `NO_DETAIL` (`NO_DETAIL`,`ID_TINDAKAN`),
  UNIQUE KEY `NO_DETAIL_2` (`NO_DETAIL`,`ID_TINDAKAN`),
  KEY `FK_RELATIONSHIP_19` (`ID_TINDAKAN`),
  KEY `ID_REKAM` (`ID_REKAM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `det_layanan_kecantikan`
--

CREATE TABLE IF NOT EXISTS `det_layanan_kecantikan` (
  `ID_DET_KESEHATAN` varchar(10) NOT NULL,
  `ID_TRANSAKSI_LAYANAN` varchar(10) NOT NULL,
  `ID_KECANTIKAN` varchar(10) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_DET_KESEHATAN`),
  KEY `ID_TRANSAKSI_LAYANAN` (`ID_TRANSAKSI_LAYANAN`),
  KEY `FK_RELATIONSHIP_27` (`ID_KECANTIKAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `det_layanan_kecantikan`
--

INSERT INTO `det_layanan_kecantikan` (`ID_DET_KESEHATAN`, `ID_TRANSAKSI_LAYANAN`, `ID_KECANTIKAN`, `KETERANGAN`) VALUES
('DK0001', 'TK0001', 'K0001', NULL),
('DK0002', 'TK0001', 'K0002', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `diagnosa`
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
-- Table structure for table `laboratorium`
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
-- Table structure for table `layanan_kecantikan`
--

CREATE TABLE IF NOT EXISTS `layanan_kecantikan` (
  `ID_KECANTIKAN` varchar(10) NOT NULL,
  `JENIS_LAYANAN` varchar(30) DEFAULT NULL,
  `TARIF` int(11) DEFAULT NULL,
  `DESKRIPSI` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_KECANTIKAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `layanan_kecantikan`
--

INSERT INTO `layanan_kecantikan` (`ID_KECANTIKAN`, `JENIS_LAYANAN`, `TARIF`, `DESKRIPSI`) VALUES
('K0001', 'FACIAL', 50000, NULL),
('K0002', 'CREAMBATH', 50000, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE IF NOT EXISTS `obat` (
  `ID_OBAT` varchar(10) NOT NULL,
  `NAMA_OBAT` varchar(30) DEFAULT NULL,
  `JENIS_OBAT` varchar(30) DEFAULT NULL,
  `HARGA_OBAT` int(11) DEFAULT NULL,
  `SATUAN` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID_OBAT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`ID_OBAT`, `NAMA_OBAT`, `JENIS_OBAT`, `HARGA_OBAT`, `SATUAN`) VALUES
('OBT0001', 'ASERING OTSU 500CC', 'Obat Larutan Intravena & Larut', 15800, 'BOTOL'),
('OBT0002', 'NS OTSU 500ML', 'Obat Larutan Intravena & Larut', 8273, 'BOTOL'),
('OBT0003', 'RL OTSU 500ML', 'Obat Larutan Intravena & Larut', 9000, 'BOTOL'),
('OBT0004', 'NS OTSU 25ML', 'Obat Larutan Intravena & Larut', 3400, 'BOTOL'),
('OBT0005', 'RINGER SOLUTION OTSU 500ML', 'Obat Larutan Intravena & Larut', 7651, 'BOTOL'),
('OBT0006', 'NS OTSU 100ML', 'Obat Larutan Intravena & Larut', 9767, 'BOTOL'),
('OBT0007', 'RING AS SINGLE 500ML', 'Obat Larutan Intravena & Larut', 40500, 'BOTOL'),
('OBT0008', 'OTSU STERILIZED WATER FOR INJE', 'Obat Larutan Intravena & Larut', 2900, 'BOTOL'),
('OBT0009', 'OTSU STERILIZED WATER FOR INJE', 'Obat Larutan Intravena & Larut', 11900, 'BOTOL'),
('OBT0010', 'MONOTARD INJ 10ML 40IU/ML', 'Obat Preparat Insulim', 2100, 'BOTOL'),
('OBT0011', 'NATUR E LOT 70ML', 'Obat Preparat Insulim', 18424, 'BOTOL'),
('OBT0012', 'MEZATRIN 250MG TAB', 'Obat Sulfonamid ', 11786, 'TABLET'),
('OBT0013', 'COTRIMOXAZOL 120MG TAB', 'Obat Sulfonamid ', 64, 'TABLET'),
('OBT0014', 'COTRIMOXAZOL IF 480MG TAB', 'Obat Sulfonamid ', 148, 'TABLET'),
('OBT0015', 'COTRIMOXAZOL SUSP 60ML 240MG/5', 'Obat Sulfonamid ', 3155, 'TABLET'),
('OBT0016', 'TRIMOXUL F 960MG TAB', 'Obat Sulfonamid ', 1200, 'TABLET'),
('OBT0017', 'TRIMOXUL TAB 480M', 'Obat Sulfonamid ', 665, 'TABLET'),
('OBT0018', 'COTRIMOXAZOL BERNO 480MG TAB', 'Obat Sulfonamid ', 174, 'TABLET'),
('OBT0019', 'COTRIMOXAZOL NOVA 480MG TAB', 'Obat Sulfonamid ', 147, 'TABLET'),
('OBT0020', 'COTRIMOXSAZOLE ERITA SUSP 240M', 'Obat Sulfonamid ', 3600, 'TABLET'),
('OBT0021', 'ACEPRESS 25MG TAB', 'Obat ACE Inhibitor', 2800, 'TABLET'),
('OBT0022', 'CAPTENSIN 25MG TAB', 'Obat ACE Inhibitor', 570, 'TABLET'),
('OBT0023', 'CAPTOPRIL IF 12,5MG TAB', 'Obat ACE Inhibitor', 74, 'TABLET'),
('OBT0024', 'CAPTOPRIL IF 25MG TAB', 'Obat ACE Inhibitor', 94, 'TABLET'),
('OBT0025', 'CAPTOPRIL IF 50MG TAB', 'Obat ACE Inhibitor', 199, 'TABLET'),
('OBT0026', 'DEXACAP 12,5MG TAB', 'Obat ACE Inhibitor', 230, 'TABLET'),
('OBT0027', 'INTERPRIL 10MG TAB', 'Obat ACE Inhibitor', 3323, 'TABLET'),
('OBT0028', 'INTERPRIL 5MG TAB', 'Obat ACE Inhibitor', 1932, 'TABLET'),
('OBT0029', 'NOPERTEN 10MG TAB', 'Obat ACE Inhibitor', 1305, 'TABLET'),
('OBT0030', 'NOPERTEN 5MG TAB', 'Obat ACE Inhibitor', 825, 'TABLET'),
('OBT0031', 'OTORYL 25MG TAB', 'Obat ACE Inhibitor', 164, 'TABLET'),
('OBT0032', 'TANAPRESS 10MG TAB', 'Obat ACE Inhibitor', 12685, 'TABLET'),
('OBT0033', 'TANAPRESS 5MG TAB', 'Obat ACE Inhibitor', 9362, 'TABLET'),
('OBT0034', 'TENACE 10MG TAB', 'Obat ACE Inhibitor', 3833, 'TABLET'),
('OBT0035', 'TENACE 5MG TAB', 'Obat ACE Inhibitor', 2373, 'TABLET'),
('OBT0036', 'TENAZIDE TAB', 'Obat ACE Inhibitor', 5000, 'TABLET'),
('OBT0037', 'TENSICAP 25MG TAB', 'Obat ACE Inhibitor', 3294, 'TABLET'),
('OBT0038', 'TENSICAP 12,5MG TAB', 'Obat ACE Inhibitor', 1743, 'TABLET'),
('OBT0039', 'TRIATEC 2,5MG TAB', 'Obat ACE Inhibitor', 5800, 'TABLET'),
('OBT0040', 'TRIATEC 5MG TAB', 'Obat ACE Inhibitor', 9158, 'TABLET'),
('OBT0041', 'CAPTOPRIL KF 12,5MG 60S TAB', 'Obat ACE Inhibitor', 136, 'TABLET'),
('OBT0042', 'RAMIPRIL 5MG', 'Obat ACE Inhibitor', 461, 'TABLET'),
('OBT0043', 'FARMOTEN 12,5MG TAB', 'Obat ACE Inhibitor', 170, 'TABLET'),
('OBT0044', 'FARMOTEN 25MG TAB', 'Obat ACE Inhibitor', 230, 'TABLET'),
('OBT0045', 'ODACE 10MG TAB', 'Obat ACE Inhibitor', 3399, 'TABLET'),
('OBT0046', 'CAPTOPRIL KF 25MG 100''S', 'Obat ACE Inhibitor', 192, 'TABLET'),
('OBT0047', 'CAPTOPRIL KF 12,5MG 100''S TAB', 'Obat ACE Inhibitor', 82, 'TABLET'),
('OBT0048', 'CAPTOPRIL HEXPHARM 50MG TAB', 'Obat ACE Inhibitor', 173, 'TABLET'),
('OBT0049', 'CAPTOPRIL DEXA 12,5MG TAB', 'Obat ACE Inhibitor', 74, 'TABLET'),
('OBT0050', 'CAPTOPRIL DEXA 25MG TAB', 'Obat ACE Inhibitor', 86, 'TABLET'),
('OBT0051', 'CAPTOPRIL DEXA 50MG TAB', 'Obat ACE Inhibitor', 189, 'TABLET'),
('OBT0052', 'CAPTOPRIL HEXPHARM 25MG TAB', 'Obat ACE Inhibitor', 125, 'TABLET'),
('OBT0053', 'CAPTOPRIL PHAROS 12,5MG TAB', 'Obat ACE Inhibitor', 80, 'TABLET'),
('OBT0054', 'CAPTOPRIL PHAROS 25MG TAB', 'Obat ACE Inhibitor', 122, 'TABLET'),
('OBT0055', 'CAPTOPRIL PHAROS 50MG TAB', 'Obat ACE Inhibitor', 212, 'TABLET'),
('OBT0056', 'CAPTOPRIL HEXPHARM 12,5MG TAB', 'Obat ACE Inhibitor', 77, 'TABLET'),
('OBT0057', 'CAPTOPRIL LANDSON 25MG TAB', 'Obat ACE Inhibitor', 150, 'TABLET'),
('OBT0058', 'NOPRIL 5MG TAB 50S', 'Obat ACE Inhibitor', 316, 'TABLET'),
('OBT0059', 'LISINOPRIL 10MG TAB 50S', 'Obat ACE Inhibitor', 530, 'TABLET'),
('OBT0060', 'CANDESARTAN DEXA 8MG TAB', 'Obat ACE Inhibitor', 3866, 'TABLET'),
('OBT0061', 'LISINOPRIL NOVEL 5MG TAB', 'Obat ACE Inhibitor', 320, 'TABLET'),
('OBT0062', 'BETA ONE 2,5MG TAB', 'Obat ACE Inhibitor', 2000, 'TABLET'),
('OBT0063', 'B-BETA 5MG TAB', 'Obat ACE Inhibitor', 5340, 'TABLET'),
('OBT0064', 'ALPARA TAB 10S', 'Obat Analgesik (Non Opiat) & A', 402, 'TABLET'),
('OBT0065', 'ANTALGIN IF 500MG TAB STR', 'Obat Analgesik (Non Opiat) & A', 132, 'TABLET'),
('OBT0066', 'ASAM MEFENAMAT IF 500MG', 'Obat Analgesik (Non Opiat) & A', 137, 'TABLET'),
('OBT0067', 'ASAM MEFENAMAT LANDSON 500MG', 'Obat Analgesik (Non Opiat) & A', 118, 'TABLET'),
('OBT0068', 'ASPILETS CHEW 80MG 10''S', 'Obat Analgesik (Non Opiat) & A', 515, 'TABLET'),
('OBT0069', 'ASPIRIN 500MG TAB 8S', 'Obat Analgesik (Non Opiat) & A', 435, 'TABLET'),
('OBT0070', 'ASAM MEFENAMAT BERNO 500MG', 'Obat Analgesik (Non Opiat) & A', 2, 'TABLET'),
('OBT0071', 'ANTALINU TAB', 'Obat Analgesik (Non Opiat) & A', 630, 'TABLET'),
('OBT0072', 'BENOSTAN 500MG TAB', 'Obat Analgesik (Non Opiat) & A', 850, 'TABLET'),
('OBT0073', 'BINTANG 7 NO.16 PUYER', 'Obat Analgesik (Non Opiat) & A', 3030, 'BUNGKUS'),
('OBT0074', 'BIOGESIC 500MG TAB STR 4$', 'Obat Analgesik (Non Opiat) & A', 1305, 'TABLET'),
('OBT0075', 'BIOGESIC SYR', 'Obat Analgesik (Non Opiat) & A', 17150, 'BOTOL'),
('OBT0076', 'BODREX TAB', 'Obat Analgesik (Non Opiat) & A', 234, 'TABLET'),
('OBT0077', 'BODREXIN 80MG TAB STR 10S', 'Obat Analgesik (Non Opiat) & A', 1337, 'TABLET'),
('OBT0078', 'BUSCOPAN 10MG TAB', 'Obat Analgesik (Non Opiat) & A', 2017, 'TABLET'),
('OBT0079', 'BUSCOPAN PLUS TAB', 'Obat Analgesik (Non Opiat) & A', 2753, 'TABLET'),
('OBT0080', 'BODREX EXTRA TAB 4''S', 'Obat Analgesik (Non Opiat) & A', 1418, 'TABLET'),
('OBT0081', 'CONTREXYN TAB STR', 'Obat Analgesik (Non Opiat) & A', 568, 'TABLET'),
('OBT0082', 'DUMIN 500MG TAB', 'Obat Analgesik (Non Opiat) & A', 296, 'TABLET'),
('OBT0083', 'DUMIN SYR 60ML', 'Obat Analgesik (Non Opiat) & A', 13232, 'BOTOL'),
('OBT0084', 'DUMIN RECTAL TUB 125MG/2,5ML', 'Obat Analgesik (Non Opiat) & A', 10600, 'BOTOL'),
('OBT0085', 'NEUROFENAC PLUS TAB', 'Obat Analgesik (Non Opiat) & A', 3540, 'TABLET'),
('OBT0086', 'E SEPULUH TAB STR', 'Obat Analgesik (Non Opiat) & A', 1688, 'TABLET'),
('OBT0087', 'ERPHAMOL DROP', 'Obat Analgesik (Non Opiat) & A', 15000, 'TABLET'),
('OBT0088', 'FEMINAX TAB STR', 'Obat Analgesik (Non Opiat) & A', 1455, 'TABLET'),
('OBT0089', 'IBUPROFEN 400MG TAB', 'Obat Analgesik (Non Opiat) & A', 150, 'TABLET'),
('OBT0090', 'ITRAMOL SYR 60ML', 'Obat Analgesik (Non Opiat) & A', 3182, 'BOTOL'),
('OBT0091', 'OBAT SAKIT KEPALA INDO', 'Obat Analgesik (Non Opiat) & A', 909, 'TABLET'),
('OBT0092', 'LAPISTAN 500MG TAB', 'Obat Analgesik (Non Opiat) & A', 760, 'TABLET'),
('OBT0093', 'LO HAN KUO INFUSION', 'Obat Analgesik (Non Opiat) & A', 1250, 'TABLET'),
('OBT0094', 'MEFENTAN 500MG CAP', 'Obat Analgesik (Non Opiat) & A', 255, 'KAPSUL'),
('OBT0095', 'MEFINAL 250MG CAP', 'Obat Analgesik (Non Opiat) & A', 520, 'KAPSUL'),
('OBT0096', 'MEFINAL 500MG TAB', 'Obat Analgesik (Non Opiat) & A', 1124, 'TABLET'),
('OBT0097', 'MEFINTER 250MG CAP', 'Obat Analgesik (Non Opiat) & A', 550, 'KAPSUL'),
('OBT0098', 'MEFINTER 500MG TAB', 'Obat Analgesik (Non Opiat) & A', 1027, 'TABLET'),
('OBT0099', 'ASPIRIN TAB 8S', 'Obat Analgesik (Non Opiat) & A', 3984, 'TABLET');

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
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
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`ID_PASIEN`, `NO_KTP`, `NAMA_PASIEN`, `ALAMAT`, `TGL_LAHIR`, `TGL_DAFTAR`, `USIA`, `NO_HP`, `JENIS_KELAMIN`) VALUES
('P0001', '12345', 'AGUS', 'SURABAYA', '1995-05-08', '2015-05-08', 20, '081222222222', 'L');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE IF NOT EXISTS `pembayaran` (
  `ID_PEMBAYARAN` varchar(10) NOT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `ID_USG` varchar(10) DEFAULT NULL,
  `ID_TRANSAKSI_LAB` varchar(10) DEFAULT NULL,
  `ID_RESEP` varchar(10) DEFAULT NULL,
  `ID_REKAM` varchar(10) DEFAULT NULL,
  `ID_TRANSAKSI_LAYANAN` varchar(10) DEFAULT NULL,
  `TANGGAL_BAYAR` date DEFAULT NULL,
  `TOTAL_HARGA` int(11) DEFAULT NULL,
  `STATUS` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`ID_PEMBAYARAN`),
  KEY `FK_RELATIONSHIP_18` (`ID_TRANSAKSI_LAB`),
  KEY `FK_RELATIONSHIP_21` (`ID_REKAM`),
  KEY `FK_RELATIONSHIP_25` (`ID_TRANSAKSI_LAYANAN`),
  KEY `FK_RELATIONSHIP_28` (`ID_USG`),
  KEY `FK_RELATIONSHIP_29` (`ID_RESEP`),
  KEY `ID_PASIEN` (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `penyakit`
--

CREATE TABLE IF NOT EXISTS `penyakit` (
  `ID_PENYAKIT` varchar(10) NOT NULL,
  `PENYAKIT` varchar(50) DEFAULT NULL,
  `GEJALA` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_PENYAKIT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyakit`
--

INSERT INTO `penyakit` (`ID_PENYAKIT`, `PENYAKIT`, `GEJALA`) VALUES
('P0001', 'Rubella (campak)', 'Demam dan ruam yang menyebar ke seluruh tubuh'),
('P0002', 'Batuk rejan', 'Batuk keras, sesak napas'),
('P0003', 'Radang selaput otak', 'Sakit kepala, demam, leher kaku, flu'),
('P0004', 'Radang tenggorokan', 'Bersin, sulit menelan, air liur berlebihan, ruam, demam'),
('P0005', 'Demam berdarah', 'Ruam, kasar merah, radang tenggorokan, demam'),
('P0006', 'Sindrom Reye', 'Perilaku dramatis, kejang, koma'),
('P0007', 'Impetigo', 'Kulit melepuh, infeksi'),
('P0008', 'Kurap', 'Cincin merah pada kulit, kerontokan rambut kepala'),
('P0009', 'Lyme', 'Demam, menggigil, nyeri tubuh'),
('P0010', 'Flu', 'Demam tinggi, nyeri tubuh, kelelahan'),
('P0011', 'Alergi ', 'Bersin, mata berairi, hidung berair'),
('P0012', 'Radang amandel', 'Pembengkakan amandel'),
('P0013', 'Demam', 'Sakit tenggorokan, kedinginan, pipi merah'),
('P0014', 'Batuk', 'Flu, batuk'),
('P0015', 'Cacar air', 'Demam, sakit kepala, gatal, benjolan cairan muncul'),
('P0016', 'Panas dalam', 'Bibir pecah pecah, sakit, benjolan di bibir'),
('P0017', 'Infeksi saluran napas', 'Sesak, pneumonia, bronkitis, radang tenggorokan'),
('P0018', 'HIV/AIDS', 'Lemah, kekebalan tubuh berkurang'),
('P0019', 'Malaria', 'Demam, bintik merah, tulang nyeri'),
('P0020', 'Diare', 'Kolera, disentri, buang air besar sering, perut kembung'),
('P0021', 'TBC', 'Batuk, menggigil, demam, penurunan berat badan'),
('P0022', 'Campak', 'Diare, demam'),
('P0023', 'Tetanus', 'Infeksi luka'),
('P0024', 'Difteri', 'Demam, sakit tenggorokan, bercak putih di teggorokan'),
('P0025', 'Infeksi radang tenggorokan', 'Pilek, demam tinggi, bintik merah, nanah putih'),
('P0026', 'Rhinitis alergi', 'Hidung tersumbat, sakit tenggorokan, gatal, sakit kepala, nyeri wajah'),
('P0027', 'Infeksi telinga tengah', 'Demam, cairan bening mengalir dari telinga, sakit kepala'),
('P0028', 'Sesak napas', 'Wajah biru'),
('P0029', 'Kuning (jaundice)', 'Kulit kuning, demam');

-- --------------------------------------------------------

--
-- Table structure for table `rekam_medis`
--

CREATE TABLE IF NOT EXISTS `rekam_medis` (
  `ID_REKAM` varchar(10) NOT NULL,
  `ID_DIAGNOSA` varchar(10) DEFAULT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
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
  KEY `FK_RELATIONSHIP_22` (`ID_DIAGNOSA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `resep`
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
-- Table structure for table `tindakan`
--

CREATE TABLE IF NOT EXISTS `tindakan` (
  `ID_TINDAKAN` varchar(10) NOT NULL,
  `SPESIALISASI` varchar(30) DEFAULT NULL,
  `NAMA_TINDAKAN` varchar(30) DEFAULT NULL,
  `TARIF` int(11) DEFAULT NULL,
  `KETERANGAN` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_TINDAKAN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tindakan`
--

INSERT INTO `tindakan` (`ID_TINDAKAN`, `SPESIALISASI`, `NAMA_TINDAKAN`, `TARIF`, `KETERANGAN`) VALUES
('T0001', 'Anak', 'Pemeriksaan', 25, 'Pemeriksaan biasa untuk menghasilkan diagnosa'),
('T0002', 'Anak', 'Pemberian vaksin', 50, 'Vaksin antibiotik'),
('T0003', 'Anak', 'Pemberian imunisasi', 50, 'Pemberian imunisasi campak, difteri, tuberkulosis, dan polio');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_lab`
--

CREATE TABLE IF NOT EXISTS `transaksi_lab` (
  `ID_TRANSAKSI_LAB` varchar(10) NOT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `TOTAL_HARGA` int(11) DEFAULT NULL,
  `TANGGAL` date DEFAULT NULL,
  PRIMARY KEY (`ID_TRANSAKSI_LAB`),
  KEY `ID_PASIEN` (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_layanan_kecantikan`
--

CREATE TABLE IF NOT EXISTS `transaksi_layanan_kecantikan` (
  `ID_TRANSAKSI_LAYANAN` varchar(10) NOT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `TOTAL_HARGA` int(11) DEFAULT NULL,
  `TANGGAL` date DEFAULT NULL,
  PRIMARY KEY (`ID_TRANSAKSI_LAYANAN`),
  KEY `FK_RELATIONSHIP_31` (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi_layanan_kecantikan`
--

INSERT INTO `transaksi_layanan_kecantikan` (`ID_TRANSAKSI_LAYANAN`, `ID_PASIEN`, `TOTAL_HARGA`, `TANGGAL`) VALUES
('TK0001', 'P0001', 0, '2015-05-08');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi_usg`
--

CREATE TABLE IF NOT EXISTS `transaksi_usg` (
  `ID_USG` varchar(10) NOT NULL,
  `ID_PASIEN` varchar(10) DEFAULT NULL,
  `TANGGAL` date NOT NULL,
  `HASIL` longblob,
  `HARGA` int(11) DEFAULT NULL,
  `DESKRIPSI` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID_USG`),
  KEY `FK_RELATIONSHIP_32` (`ID_PASIEN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
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
-- Dumping data for table `user`
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
-- Constraints for dumped tables
--

--
-- Constraints for table `antrian`
--
ALTER TABLE `antrian`
  ADD CONSTRAINT `antrian_ibfk_1` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);

--
-- Constraints for table `detail_lab`
--
ALTER TABLE `detail_lab`
  ADD CONSTRAINT `detail_lab_ibfk_1` FOREIGN KEY (`ID_LAB`) REFERENCES `laboratorium` (`ID_LAB`),
  ADD CONSTRAINT `detail_lab_ibfk_2` FOREIGN KEY (`ID_TRANSAKSI_LAB`) REFERENCES `transaksi_lab` (`ID_TRANSAKSI_LAB`);

--
-- Constraints for table `detail_resep`
--
ALTER TABLE `detail_resep`
  ADD CONSTRAINT `detail_resep_ibfk_1` FOREIGN KEY (`ID_OBAT`) REFERENCES `obat` (`ID_OBAT`),
  ADD CONSTRAINT `detail_resep_ibfk_2` FOREIGN KEY (`ID_RESEP`) REFERENCES `resep` (`ID_RESEP`);

--
-- Constraints for table `detail_tindakan`
--
ALTER TABLE `detail_tindakan`
  ADD CONSTRAINT `ID_REKAM` FOREIGN KEY (`ID_REKAM`) REFERENCES `rekam_medis` (`ID_REKAM`),
  ADD CONSTRAINT `detail_tindakan_ibfk_1` FOREIGN KEY (`ID_TINDAKAN`) REFERENCES `tindakan` (`ID_TINDAKAN`);

--
-- Constraints for table `det_layanan_kecantikan`
--
ALTER TABLE `det_layanan_kecantikan`
  ADD CONSTRAINT `det_layanan_kecantikan_ibfk_1` FOREIGN KEY (`ID_TRANSAKSI_LAYANAN`) REFERENCES `transaksi_layanan_kecantikan` (`ID_TRANSAKSI_LAYANAN`),
  ADD CONSTRAINT `det_layanan_kecantikan_ibfk_2` FOREIGN KEY (`ID_KECANTIKAN`) REFERENCES `layanan_kecantikan` (`ID_KECANTIKAN`);

--
-- Constraints for table `diagnosa`
--
ALTER TABLE `diagnosa`
  ADD CONSTRAINT `diagnosa_ibfk_1` FOREIGN KEY (`ID_PENYAKIT`) REFERENCES `penyakit` (`ID_PENYAKIT`);

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `pembayaran_ibfk_1` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`),
  ADD CONSTRAINT `pembayaran_ibfk_3` FOREIGN KEY (`ID_USG`) REFERENCES `transaksi_usg` (`ID_USG`),
  ADD CONSTRAINT `pembayaran_ibfk_5` FOREIGN KEY (`ID_TRANSAKSI_LAYANAN`) REFERENCES `transaksi_layanan_kecantikan` (`ID_TRANSAKSI_LAYANAN`),
  ADD CONSTRAINT `pembayaran_ibfk_6` FOREIGN KEY (`ID_RESEP`) REFERENCES `resep` (`ID_RESEP`),
  ADD CONSTRAINT `pembayaran_ibfk_7` FOREIGN KEY (`ID_REKAM`) REFERENCES `rekam_medis` (`ID_REKAM`),
  ADD CONSTRAINT `pembayaran_ibfk_8` FOREIGN KEY (`ID_TRANSAKSI_LAB`) REFERENCES `transaksi_lab` (`ID_TRANSAKSI_LAB`);

--
-- Constraints for table `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD CONSTRAINT `FK_RELATIONSHIP_1` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`),
  ADD CONSTRAINT `rekam_medis_ibfk_1` FOREIGN KEY (`ID_DIAGNOSA`) REFERENCES `diagnosa` (`ID_DIAGNOSA`);

--
-- Constraints for table `resep`
--
ALTER TABLE `resep`
  ADD CONSTRAINT `resep_ibfk_1` FOREIGN KEY (`ID_REKAM`) REFERENCES `rekam_medis` (`ID_REKAM`);

--
-- Constraints for table `transaksi_lab`
--
ALTER TABLE `transaksi_lab`
  ADD CONSTRAINT `transaksi_lab_ibfk_1` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);

--
-- Constraints for table `transaksi_layanan_kecantikan`
--
ALTER TABLE `transaksi_layanan_kecantikan`
  ADD CONSTRAINT `FK_RELATIONSHIP_31` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);

--
-- Constraints for table `transaksi_usg`
--
ALTER TABLE `transaksi_usg`
  ADD CONSTRAINT `FK_RELATIONSHIP_32` FOREIGN KEY (`ID_PASIEN`) REFERENCES `pasien` (`ID_PASIEN`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
