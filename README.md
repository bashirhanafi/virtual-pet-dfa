
# Virtual Pet dengan Deterministic Finite Automaton (DFA)
Virtual Pet atau "Hewan Peliharaan Maya" adalah sejenis aplikasi bot yang berperilaku secara maya seperti hewan peliharaan. Virtual Pet bertingkah laku yang dipengaruhi oleh tuannya dan dapat dirancang menggunakan Finite State Automaton (FSA) dengan mesin Deterministic Finite Automaton (DFA) pada Teori Bahasa dan Automata.

### Hamtaro sebagai Virtual Pet
Hamtaro adalah serial animasi Jepang bergenre petualangan, komedi, dan slice of life yang berfokus pada hamster imut yang bernama Hamtaro dan petualangannya bersama pemilik dan teman-temannya. Hamtaro adalah hamster laki-laki yang gemar makan kuaci, suka menolong, cerdas, mudah penasaran, dan polos. Pemilik Hamtaro bernama Laura Haruna. Hamtaro sangat menyukai pemiliknya dan akan sangat kecewa bila Laura tidak menghiraukanya.

Adaptasi dari serial animasi Jepang ini dapat kita jadikan Hamtaro sebagai Virtual Pet sederhana dengan memiliki sifat-sifat dasar pada hamster, yaitu hamster dapat makan, tidur, bermain (dengan kincir roda), dan mandi menggunakan BathHub yang diisi dengan pasir wangi hamster. Selain itu, dalam ceritanya Hamtaro memiliki pemilik bernama Laura Haruna. Laura Haruna dalam Virtual Pet dapat kita ibaratkan sebagai User yang dapat berinteraksi dengan Hamtaro.

### Definisi Formal
Berikut ini adalah Hamtaro sebagai Virtual Pet dengan 6 keadaan (lapar, kenyang, senang, sedih, kotor, bersih) dan 4 aksi (makan, tidur, bermain, mandi). Transisi keadaan didapatkan dari deskripsi pada keadaan dan aksi. Keadaan terakhir apabila Hamtaro merasa lebih baik. 
Jika dituliskan dalam bentuk formal:

P1 = ({Lapar, Kenyang, Senang, Sedih, Kotor, Bersih}, { Makan, Tidur, Bermain, Mandi}, δ, Sedih, {Kenyang, Senang, Bersih})

Q = {Lapar, Kenyang, Senang, Sedih, Kotor, Bersih}

Σ = {Makan, Tidur, Bermain, Mandi}

S = Sedih

F = {Kenyang, Senang, Bersih}

Dengan fungsi transisi sebagai berikut:
| **δ**       | **Makan** | **Tidur** | **Bermain** | **Mandi** |
|-------------|-----------|-----------|-------------|-----------|
| **Lapar**   | Kenyang   | Lapar     | Lapar       | Lapar     |
| **Kenyang** | Kenyang   | Lapar     | Senang      | Bersih    |
| **Senang**  | Kenyang   | Lapar     | Senang      | Senang    |
| **Sedih***  | Sedih     | Sedih     | Senang      | Bersih    |
| **Kotor**   | Kotor     | Kotor     | Kotor       | Bersih    |
| **Bersih**  | Kotor     | Kotor     | Kotor       | Bersih    |

### Diagram Transisi
Berdasarkan definisi formal yang telah dibuat di atas, maka mesin FSA jika dirancang menggunakan diagram transisi menjadi:

![Capture](https://user-images.githubusercontent.com/85800672/162574871-6115827d-51e0-4a49-935d-1b77f8ad4e50.PNG)

