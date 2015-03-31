/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     28/03/2015 12:19:34                          */
/*==============================================================*/


drop table if exists ANTRIAN;

drop table if exists DETAIL_LAB;

drop table if exists DETAIL_RESEP;

drop table if exists DETAIL_TINDAKAN;

drop table if exists DET_LAYANAN_KECANTIKAN;

drop table if exists DIAGNOSA;

drop table if exists LABORATORIUM;

drop table if exists LAYANAN_KECANTIKAN;

drop table if exists OBAT;

drop table if exists PASIEN;

drop table if exists PEMBAYARAN;

drop table if exists PENYAKIT;

drop table if exists REKAM_MEDIS;

drop table if exists RESEP;

drop table if exists TINDAKAN;

drop table if exists TRANSAKSI_LAYANAN_KESEHATAN;

drop table if exists TRANSAKSI_USG;

drop table if exists USER;

/*==============================================================*/
/* Table: ANTRIAN                                               */
/*==============================================================*/
create table ANTRIAN
(
   ID_ANTRIAN           int not null,
   ID_PASIEN            int,
   JENIS_ANTRIAN        varchar(30),
   KETERANGAN           varchar(100),
   primary key (ID_ANTRIAN)
);

/*==============================================================*/
/* Table: DETAIL_LAB                                            */
/*==============================================================*/
create table DETAIL_LAB
(
   ID_DETAIL_LAB        int not null,
   ID_LAB               int,
   KETERANGAN           varchar(100),
   HASIL                longblob,
   TANGGAL              date,
   TOTAL_HARGA          int,
   primary key (ID_DETAIL_LAB)
);

/*==============================================================*/
/* Table: DETAIL_RESEP                                          */
/*==============================================================*/
create table DETAIL_RESEP
(
   NO_DETAIL_RESEP      int not null,
   ID_RESEP             int,
   ID_OBAT              int,
   TAKARAN              varchar(30),
   PEMAKAIAN            varchar(30),
   JUMLAH               int,
   KETERANGAN           varchar(100),
   primary key (NO_DETAIL_RESEP)
);

/*==============================================================*/
/* Table: DETAIL_TINDAKAN                                       */
/*==============================================================*/
create table DETAIL_TINDAKAN
(
   NO_DETAIL            int not null,
   ID_TINDAKAN          int,
   KETERANGAN           varchar(100),
   primary key (NO_DETAIL)
);

/*==============================================================*/
/* Table: DET_LAYANAN_KECANTIKAN                                */
/*==============================================================*/
create table DET_LAYANAN_KECANTIKAN
(
   ID_DET_KESEHATAN     int not null,
   ID_KECANTIKAN        int,
   KETERANGAN           varchar(100),
   primary key (ID_DET_KESEHATAN)
);

/*==============================================================*/
/* Table: DIAGNOSA                                              */
/*==============================================================*/
create table DIAGNOSA
(
   ID_DIAGNOSA          int not null,
   ID_PENYAKIT          int,
   DIAGNOSA             varchar(30),
   KETERANGAN           varchar(100),
   primary key (ID_DIAGNOSA)
);

/*==============================================================*/
/* Table: LABORATORIUM                                          */
/*==============================================================*/
create table LABORATORIUM
(
   ID_LAB               int not null,
   JENIS_PEMERIKSAAN    varchar(30),
   HARGA                int,
   primary key (ID_LAB)
);

/*==============================================================*/
/* Table: LAYANAN_KECANTIKAN                                    */
/*==============================================================*/
create table LAYANAN_KECANTIKAN
(
   ID_KECANTIKAN        int not null,
   JENIS_LAYANAN        varchar(30),
   TARIF                int,
   primary key (ID_KECANTIKAN)
);

/*==============================================================*/
/* Table: OBAT                                                  */
/*==============================================================*/
create table OBAT
(
   ID_OBAT              int not null,
   NAMA_OBAT            varchar(30),
   JENIS_OBAT           varchar(30),
   HARGA_OBAT           int,
   SATUAN               int,
   primary key (ID_OBAT)
);

/*==============================================================*/
/* Table: PASIEN                                                */
/*==============================================================*/
create table PASIEN
(
   ID_PASIEN            int not null,
   NAMA_PASIEN          varchar(30),
   ALAMAT               varchar(100),
   TTL                  date,
   USIA                 int,
   NO_HP                int,
   JENIS_KELAMIN        varchar(100),
   primary key (ID_PASIEN)
);

/*==============================================================*/
/* Table: PEMBAYARAN                                            */
/*==============================================================*/
create table PEMBAYARAN
(
   ID_PEMBAYARAN        int not null,
   ID_USG               int,
   ID_DETAIL_LAB        int,
   ID_REKAM             int,
   ID_TRANSAKSI_LAYANAN int,
   TANGGAL_BAYAR        date,
   TOTAL_HARGA          int,
   primary key (ID_PEMBAYARAN)
);

/*==============================================================*/
/* Table: PENYAKIT                                              */
/*==============================================================*/
create table PENYAKIT
(
   ID_PENYAKIT          int not null,
   PENYAKIT             varchar(50),
   GEJALA               varchar(100),
   primary key (ID_PENYAKIT)
);

/*==============================================================*/
/* Table: REKAM_MEDIS                                           */
/*==============================================================*/
create table REKAM_MEDIS
(
   ID_REKAM             int not null,
   ID_DIAGNOSA          int,
   ID_PASIEN            int,
   NO_DETAIL            int,
   ID_RESEP             int,
   TGL_REKAM            date,
   TINGGI               int,
   BERAT                int,
   TEKANAN_DARAH        int,
   HASIL_PEMERIKSAAN    longblob,
   ALERGI               varchar(30),
   TOTAL_HARGA          int,
   LAYANAN_TAMBAHAN     varchar(30),
   primary key (ID_REKAM)
);

/*==============================================================*/
/* Table: RESEP                                                 */
/*==============================================================*/
create table RESEP
(
   ID_RESEP             int not null,
   TOTAL_HARGA          int,
   primary key (ID_RESEP)
);

/*==============================================================*/
/* Table: TINDAKAN                                              */
/*==============================================================*/
create table TINDAKAN
(
   ID_TINDAKAN          int not null,
   SPESIALISASI         varchar(30),
   NAMA_TINDAKAN        varchar(30),
   TARIF                int,
   KETERANGAN           varchar(100),
   primary key (ID_TINDAKAN)
);

/*==============================================================*/
/* Table: TRANSAKSI_LAYANAN_KESEHATAN                           */
/*==============================================================*/
create table TRANSAKSI_LAYANAN_KESEHATAN
(
   ID_TRANSAKSI_LAYANAN int not null,
   ID_DET_KESEHATAN     int,
   TOTAL_HARGA          int,
   primary key (ID_TRANSAKSI_LAYANAN)
);

/*==============================================================*/
/* Table: TRANSAKSI_USG                                         */
/*==============================================================*/
create table TRANSAKSI_USG
(
   ID_USG               int not null,
   HASIL                longblob,
   HARGA                int,
   primary key (ID_USG)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   ID_USER              int not null,
   NAMA_USER            varchar(30),
   JABATAN              varchar(100),
   USERNAME             varchar(30),
   PASSWORD             varchar(30),
   primary key (ID_USER)
);

alter table ANTRIAN add constraint FK_RELATIONSHIP_17 foreign key (ID_PASIEN)
      references PASIEN (ID_PASIEN) on delete restrict on update restrict;

alter table DETAIL_LAB add constraint FK_RELATIONSHIP_16 foreign key (ID_LAB)
      references LABORATORIUM (ID_LAB) on delete restrict on update restrict;

alter table DETAIL_RESEP add constraint FK_RELATIONSHIP_11 foreign key (ID_RESEP)
      references RESEP (ID_RESEP) on delete restrict on update restrict;

alter table DETAIL_RESEP add constraint FK_RELATIONSHIP_24 foreign key (ID_OBAT)
      references OBAT (ID_OBAT) on delete restrict on update restrict;

alter table DETAIL_TINDAKAN add constraint FK_RELATIONSHIP_19 foreign key (ID_TINDAKAN)
      references TINDAKAN (ID_TINDAKAN) on delete restrict on update restrict;

alter table DET_LAYANAN_KECANTIKAN add constraint FK_RELATIONSHIP_27 foreign key (ID_KECANTIKAN)
      references LAYANAN_KECANTIKAN (ID_KECANTIKAN) on delete restrict on update restrict;

alter table DIAGNOSA add constraint FK_RELATIONSHIP_10 foreign key (ID_PENYAKIT)
      references PENYAKIT (ID_PENYAKIT) on delete restrict on update restrict;

alter table PEMBAYARAN add constraint FK_RELATIONSHIP_18 foreign key (ID_DETAIL_LAB)
      references DETAIL_LAB (ID_DETAIL_LAB) on delete restrict on update restrict;

alter table PEMBAYARAN add constraint FK_RELATIONSHIP_21 foreign key (ID_REKAM)
      references REKAM_MEDIS (ID_REKAM) on delete restrict on update restrict;

alter table PEMBAYARAN add constraint FK_RELATIONSHIP_25 foreign key (ID_TRANSAKSI_LAYANAN)
      references TRANSAKSI_LAYANAN_KESEHATAN (ID_TRANSAKSI_LAYANAN) on delete restrict on update restrict;

alter table PEMBAYARAN add constraint FK_RELATIONSHIP_28 foreign key (ID_USG)
      references TRANSAKSI_USG (ID_USG) on delete restrict on update restrict;

alter table REKAM_MEDIS add constraint FK_RELATIONSHIP_1 foreign key (ID_PASIEN)
      references PASIEN (ID_PASIEN) on delete restrict on update restrict;

alter table REKAM_MEDIS add constraint FK_RELATIONSHIP_20 foreign key (NO_DETAIL)
      references DETAIL_TINDAKAN (NO_DETAIL) on delete restrict on update restrict;

alter table REKAM_MEDIS add constraint FK_RELATIONSHIP_22 foreign key (ID_DIAGNOSA)
      references DIAGNOSA (ID_DIAGNOSA) on delete restrict on update restrict;

alter table REKAM_MEDIS add constraint FK_RELATIONSHIP_23 foreign key (ID_RESEP)
      references RESEP (ID_RESEP) on delete restrict on update restrict;

alter table TRANSAKSI_LAYANAN_KESEHATAN add constraint FK_RELATIONSHIP_26 foreign key (ID_DET_KESEHATAN)
      references DET_LAYANAN_KECANTIKAN (ID_DET_KESEHATAN) on delete restrict on update restrict;

