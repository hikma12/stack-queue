# Stack-Queue
Nur Hikmah (H071211006) 

# Struktur Data Stack
Stack atau dalam Bahasa Indonesia diartikan tumpukan. Stack merupakan struktur data linier yang menggunakan paradigma LIFO (Last In First Out), dimana elemen yang terakhir masuk adalah yang pertama keluar. 
![Screenshot_2022_1221_205647](https://user-images.githubusercontent.com/106948962/208910688-854069ef-a952-4fbc-b848-55769adac643.png)

Pada gambar di atas, dapat terlihat bahwa meskipun elemen ke-3 adalah yang paling terakhir ditambahkan, namun elemen tersebut justru yang pertama dihapus.

Dalam stack, ada beberapa operasi yang penting untuk diperhatikan, antara lain :
<ul>
<li>push(elemen) : memasukkan elemen ke dalam stack</li>
<li>pop() : mengambil elemen dari stack</li>
<li>peek() : mencari elemen yang berada di paling atas (yang terakhir dimasukkan)</li>
<li>empty() : mengecek apakah stack tersebut kosong atau tidak.</li>
<li>full() : mengecek apakah stack tersebut penuh atau tidak (jika dimasukkan berakibat overflow).</li>
</ul>


# Struktur Data Queue
Queue atau dalam Bahasa Indonesia diartikan antrian. Queue merupakan sruktur data linier yang menggunakan paradigma FIFO (First In First Out), dimana elemen yang pertama masuk adalah elemen yang pertama keluar.

![Screenshot_2022_1221_205201](https://user-images.githubusercontent.com/106948962/208909803-0fb7e9fe-5d35-4745-901a-66d477f3c30e.png)

Pada gambar di atas, karena elemen 1 ditambahkan ke antrian lebih dulu daripada 2, maka elemen 1 adalah elemen yang pertama dihapus dari antrian.

Dalam queue, ada beberapa operasi yang penting untuk diperhatikan, antara lain :
<ul>
<li>enqueue(elemen) : memasukkan elemen ke dalam queue.

note: Pada Java interface namanya add/offer.
<li>dequeue() : mengambil elemen dari queue. 

note: Pada Java interface namanya remove. 
<li>peek() : mencari elemen yang berada di paling depan (yang pertama dimasukkan), namun tidak dikeluarkan.
<li>poll() : mencari elemen yang berada di paling depan dan dikeluarkan.
<li>isEmpty() : mengecek apakah queue tersebut kosong atau tidak.
<li>isFull() : mengecek apakah queue tersebut penuh atau tidak (pada Queue statis yang diimplementasikan dengan array).
</ul>

