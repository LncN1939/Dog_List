package ni.edu.uca.dog_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Esta clase se encarga de recibir una lista de imagenes que se envian desde la API

class DogAdapter(val images:List<String>):RecyclerView.Adapter<DogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        //Aqui se rellena la vista con las imagenes de todas la imagenes enviadas de la API
        return DogViewHolder(layoutInflater.inflate(R.layout.item_dog,parent, false))
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item:String = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size


}