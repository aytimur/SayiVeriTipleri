package ibrahim.aytimur.sayiveritipleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Sayı veri tipleri
        // Tamsayı veri tipleri
        var sayi1 = 23
        var sayi2 = 5
        var sonuc = 0
        sonuc = sayi1 / sayi2

        var number1 = 23
        var number2 = 20000000000L
        var result = 0L
        result = number1 + number2

        // Kesirli veri tipleri

        var x = 23.5
        var y = 5.5
        var bolmesonuc = 0.0
        bolmesonuc = x/y

        var yuvarla = 2.749999999f
        Toast.makeText(applicationContext,"$bolmesonuc",Toast.LENGTH_SHORT).show()
    }
}
