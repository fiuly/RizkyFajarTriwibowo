<h1>Projek Perpustakaan</h1>

Aplikasi perpustakaan sederhana berbasis Java console.  
Tema project ini adalah **manajemen data buku** dalam sebuah perpustakaan.

---

<h2>📂 Deliverables</h2>

<b>Kode Program (Java)</b>
<ul>
  <li>Disusun dalam package <code>com.libraryapp</code>.</li>
  <li>Menggunakan naming convention sesuai standar Java.</li>
  <li>Sumber kode disimpan dalam repository GitHub pribadi.</li>
  <li>Link repository disubmit melalui Google Classroom.</li>
</ul>

<b>Video Penjelasan</b>
<ul>
  <li>Penjelasan struktur program (class, object, package).</li>
  <li>Implementasi konsep: variabel, konstanta, looping, array, method, constructor, string, character.</li>
  <li>Demo jalannya program.</li>
  <li>Video diupload ke YouTube (public/unlisted).</li>
  <li>Link video dicantumkan di README.md & Google Classroom.</li>
</ul>

<b>Dokumentasi (README.md)</b>
<ul>
  <li>Penjelasan singkat tema project.</li>
  <li>Desain class (diagram sederhana).</li>
  <li>Contoh penggunaan fitur utama.</li>
  <li>Link video YouTube.</li>
  <li>Petunjuk cara menjalankan program.</li>
</ul>

---

<h2>📂 Struktur Project</h2>

<pre>
RizkyFajarTriwibowo/
├── Source Packages/
│   ── com.libraryapp/
│      ├── Main.java
│      ├── Book.java
│      └── Library.java
│   
│    
└── README.md
</pre>

---

<h2>📐 Desain Class</h2>

<pre>
+-------------+       1..*      +--------+
|   Library   |---------------->|  Book  |
+-------------+                 +--------+
| - name      |                 | - title
| - books[]   |                 | - author
| - count     |                 | - year
+-------------+                 +--------+
| + addBook() |
| + showBooks()|
| + searchBook()|
| + removeBook()|
+-------------+

+-------------+
|    Main     |
+-------------+
| + main()    |
+-------------+
</pre>

---

<h2>⚙️ Fitur</h2>

- Menambah buku baru (judul, penulis, tahun).
- Menampilkan daftar semua buku.
- Mencari buku berdasarkan kata kunci (judul/penulis).
- Menghapus buku dari daftar.
- Menggunakan array untuk menyimpan data buku.
- Menerapkan constructor, method dengan parameter & return value.
- Menggunakan if-else, switch-case, dan looping.
- Manipulasi String & Character.
- Exception handling sederhana (try-catch parsing angka).

---

<h2>▶️ Cara Menjalankan di NetBeans</h2>

1. Buka Apache NetBeans.  
2. File → Open Project → pilih folder `RizkyFajarTriwibowo`.  
3. Pastikan `Main.java` berada di package `com.libraryapp`.  
4. Klik kanan project → **Set Main Project**.  
5. Klik kanan project → **Run**.  
6. Aplikasi akan berjalan di console NetBeans.  

---

<h2>📖 Contoh Menu</h2>

<pre>
=== Perpustakaan Kota ===
1. Tambah Buku
2. Tampilkan Buku
3. Cari Buku
4. Hapus Buku
5. Keluar
</pre>

---

<h2>🎥 Video Penjelasan</h2>

<a href="https://youtu.be/yourvideoid">Klik di sini untuk menonton</a>

---

<h2>📌 Repository GitHub</h2>

<a href="https://github.com/fiuly/RizkyFajarTriwibowo">https://github.com/fiuly/RizkyFajarTriwibowo</a>
