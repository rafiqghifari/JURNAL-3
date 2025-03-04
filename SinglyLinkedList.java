public class SinglyLinkedList {
        Node head;
    
        public SinglyLinkedList() {
            this.head = null;
        }
    
        // Metode untuk menambahkan resep di awal daftar
        public void tambahResepAwal(Resep resep) {
            Node newNode = new Node(resep);
            newNode.next = head;
            head = newNode;
        }
     
        // Metode untuk menghapus resep dari akhir daftar
        public void hapusResepAkhir() {
            if (head != null) {
                if (head.next == null) {
                    head = null;
                } else {
                    Node temp = head;
                    while (temp.next.next != null) {
                        temp = temp.next;
                    }
                    temp.next = null;
                }
            }
        }

         // Metode untuk menambahkan resep di akhir daftar
         public void tambahResepAkhir(Resep resep) {
            Node newNode = new Node(resep);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

         // Metode untuk menghapus resep dari awal daftar
         public void hapusResepAwal() {
            if (head != null) {
                head = head.next;
            }
        }
    
        // Metode untuk mencetak semua resep dalam daftar
        public void cetakResep() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    
        // Metode untuk mencari resep berdasarkan nama
        public Resep cariResep(String namaResep) {
            Node temp = head;
            while (temp != null) {
                if (temp.data.namaResep.equals(namaResep)) {
                    return temp.data;
                }
                temp = temp.next;
            }
            return null;
        }
    }

