# Tubes-PBO-JavaDietary-

Tema: Kesehatan

Judul: Membuat Perencana Diet Komprehensif dengan 
	     Antarmuka dan Kelas Abstrak

Nama apk: JavaDietary

Penjelasan rencana awal pengunanan pengembangan didasari modul pratikum: 

Instance:
nanti didalamnya terdapat DietPlan adalah interface yang mencakup metode setDietType, getDietType, dan calculateCalories.

Abstract class:
Abstract class digunakan untuk menyediakan implementasi parsial dan memungkinkan kelas turunan untuk menyelesaikan implementasi tersebut.
'Meal' adalah abstract class yang mengimplementasikan DietPlan interface dan menyediakan beberapa atribut dan 
metode bersama, seperti getMealName, getCalories, dan prepare.

Concrete class (interface):
Kelas konkret adalah implementasi nyata dari abstract class atau interface.
Breakfast, lunch dan dinner, dll adalah subclass dari Meal yang memberikan implementasi konkrit untuk metode abstract prepare.

GUI (Graphical User Interface)
dalam GUI sendiri hanya pengembangan interaktif antar sistem dan pengguna seperti membuat frame dan tombol.

Multithreading:
penggunaan multithreading dengan dua thread yang berbeda untuk mempersiapkan makanan dan menghitung kalori.
