# EventGears — Sistem Peminjaman Alat Kepanitiaan

Repositori proyek akhir mata kuliah Pengembangan Aplikasi Mobile (PAM) **EventGears** (`0094_EventGears`). Aplikasi dibangun menggunakan **Kotlin**, **Jetpack Compose (Material 3)**, **Navigation Compose**, arsitektur **MVVM** (`ViewModel`, `StateFlow`, `Repository`), **Retrofit 2 + OkHttp + Gson + Coil**, **Supabase** (Auth JWT, PostgREST, PostgreSQL Cloud), dan **Local File Storage** (tanpa Room Database), selaras dengan dokumen SRS.

---

## 4. Progress Mingguan (Weekly Progress)

Berikut adalah linimasa pengembangan proyek **EventGears** yang direkonstruksi secara riil berdasarkan riwayat git commit:

**🗓️ Pertemuan 9 (9 November 2026 - 15 November 2026)**
* **Penyusunan SRS & Perancangan Sistem** ( `575961e` ): Initial commit repositori proyek **EventGears** beserta penetapan perancangan sistem, arsitektur MVVM berbasis Jetpack Compose dan Supabase (Auth JWT, PostgREST, PostgreSQL Cloud) serta Local File Storage, dan rancangan 4 model data utama sesuai SRS.

**🗓️ Pertemuan 10 (16 November 2026 - 22 November 2026)**
* **Inisialisasi Proyek & Setup Dependensi** ( `fb07963` ): Konfigurasi dependensi Navigation Compose, Retrofit 2, OkHttp, Gson, Coroutines, dan Coil pada `build.gradle.kts` untuk mendukung komunikasi jaringan, manajemen state, dan pratinjau komponen UI di Jetpack Compose.
* **Struktur Paket MVVM & Model Data** ( `5c67943` , `df2919f` , `98782da` , `1ccab3d` ): Penambahan model data `User` & `UserRole` (`ADMIN` dan `USER`), `Equipment` untuk katalog inventaris, `RentalRequest` & `RentalStatus` (`PENDING`, `APPROVED`, `REJECTED`, `RETURNED`), serta `ReturnVerification` sesuai skema SRS.