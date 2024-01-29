import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.swipify.R

class MyAdapter(private val data: List<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    //Este método crea un nuevo elemento de la lista.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_page, parent, false)
        return ViewHolder(view)
    }

    //Este método vincula los datos a un elemento de la lista existente.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = item
    }

    //Este método devuelve el número de elementos de la lista.
    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id)
    }
}
