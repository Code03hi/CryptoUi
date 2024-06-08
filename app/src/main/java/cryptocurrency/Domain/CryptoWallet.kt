package cryptocurrency.Domain

import android.health.connect.datatypes.units.Percentage

data class CryptoWallet(val cryptoName:String,val cryptoIcon:String,val cryptoPrice:Int,val changePercentage: Percentage,val lineData:ArrayList<Int>,val propertyAmount:Int,val propertySize:Double) {
}