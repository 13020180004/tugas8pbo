public class nomor1{

String nama;

String nim;

void isiData ( String nama,String nim) {



this.nama=nama;

this.nim=nim;



}

public static void main ( String [ ] args){



nomer1 mahasiswa = new nomer1 ( );

mahasiswa.isiData ("saya","1234567");

System.out.println( "Nama : "+ mahasiswa.nama);

System.out.println( "Nim : " + mahasiswa.nim);



}



}