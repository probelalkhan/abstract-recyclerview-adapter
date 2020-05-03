package net.simplifiedcoding.androidrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter by lazy {
        ProductsAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val products = listOf(
            Product(
                R.drawable.dellinspiron,
                "Dell Inspiron",
                "15.6Inch, Full HD",
                40000.0,
                "4.5"
            ),
            Product(
                R.drawable.macbook,
                "Apple Macbook Air",
                "13.3Inch, HD",
                50000.0,
                "4.7"
            ),
            Product(
                R.drawable.surface,
                "Microsoft Surface",
                "13.3Inch, HD",
                50000.0,
                "4.7"
            )
        )

        recycler_view.adapter = adapter
        adapter.addItems(products)

        adapter.listener = { view, item, position ->
            Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        }
    }
}
