package ni.edu.uca.dog_list

import android.app.VoiceInteractor
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ni.edu.uca.dog_list.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

// Esta clase se encarga de recibir las imagenes y transformarlas a un formato mostrable en Kotlim

class DogViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image:String){
        //Piccaso transforma una url en una imagen
        Picasso.get().load(image).into(binding.ivDog)
    }
}