import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TableLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.swipify.ExploreActivity
import com.example.swipify.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        val tableLayout = findViewById<TableLayout>(R.id.tableLayout)

        val gradient1 = resources.getDrawable(R.drawable.gradient1)
        val gradient2 = resources.getDrawable(R.drawable.gradient2)
        val gradient3 = resources.getDrawable(R.drawable.gradient3)
        val gradient4 = resources.getDrawable(R.drawable.gradient4)

        val textView1 = TextView(this)
        textView1.setText(R.string.top_mas_escuchado)
        textView1.setTextSize(20f)
        textView1.setTextColor(resources.getColor(R.color.titleColor))
        textView1.setPadding(12f)
        textView1.fontFamily = resources.getFont(R.font.lato_bold)

        val textView2 = TextView(this)
        textView2.setText(R.string.exitos_de_espana)
        textView2.setTextSize(20f)
        textView2.setTextColor(resources.getColor(R.color.titleColor))
        textView2.setPadding(12f)
        textView2.fontFamily = resources.getFont(R.font.lato_bold)

        val textView3 = TextView(this)
        textView3.setText(R.string.hits_internacional)
        textView3.setTextSize(20f)
        textView3.setTextColor(resources.getColor(R.color.titleColor))
        textView3.setPadding(12f)
        textView3.fontFamily = resources.getFont(R.font.lato_bold)

        val textView4 = TextView(this)
        textView4.setText(R.string.tendencia)
        textView4.setTextSize(20f)
        textView4.setTextColor(resources.getColor(R.color.titleColor))
        textView4.setPadding(12f)
        textView4.fontFamily = resources.getFont(R.font.lato_bold)

        val tableRow1 = TableRow(this)
        tableRow1.addView(textView1)
        tableRow1.setBackgroundDrawable(gradient1)
        tableLayout.addView(tableRow1)

        val tableRow2 = TableRow(this)
        tableRow2.addView(textView2)
        tableRow2.setBackgroundDrawable(gradient2)
        tableLayout.addView(tableRow2)

        val tableRow3 = TableRow(this)
        tableRow3.addView(textView3)
        tableRow3.setBackgroundDrawable(gradient3)
        tableLayout.addView(tableRow3)

        val tableRow4 = TableRow(this)
        tableRow4.addView(textView4)
        tableRow4.setBackgroundDrawable(gradient4)
        tableLayout.addView(tableRow4)
    }


    fun explore(view: View) {
        setContentView(R.layout.explore)
    }
}
