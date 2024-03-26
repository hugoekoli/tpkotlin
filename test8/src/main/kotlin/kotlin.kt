fun prix (modele:String, taille:Int, nombre:Int): Double{
    val prixModele: Double = when (modele){
        "Champagne" -> 4.9
        "Vin" -> 4.2
        "Eau" -> 3.1
        else -> 0.0
        
    }
}