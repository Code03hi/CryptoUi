package cryptocurrency.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.sam.cryptocurrency.R
import cryptocurrency.Domain.CryptoWallet

class CryptoWalletAdapter(private val mList: List<CryptoWallet>): RecyclerView.Adapter<CryptoWalletAdapter.CryptoWalletHolder>() {

    inner class CryptoWalletHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoWalletHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_wallet,parent,false)
        return CryptoWalletHolder(view)
    }

    override fun getItemCount() = mList.size

    override fun onBindViewHolder(holder: CryptoWalletHolder, position: Int) {
        val itemViewModel = mList[position]
        holder.image.setImageResource(itemViewModel.cryptoIcon.toInt())
    }
}