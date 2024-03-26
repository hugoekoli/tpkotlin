fun main() {
    val v1 = Voiture()
    val v2 = Voiture("Volvo","V50",0)
    v1.marque = "Peugeot"
    v1.modele = "308"
    println(v2.marque)
    v1.vitesse = 60
    v2.vitesse = 40
    println(v1.vitesse)
    println(v2.vitesse)
}
class Voiture {
//Attributs
//constructeurs
//Méthodes

var marque: String = ""
var modele: String = ""
var vitesse: Int = 0
constructor() {
}

constructor(marque: String, modele: String, vitesse: Int) {
    this.marque = marque
    this.modele = modele
    this.vitesse = vitesse
}
fun accelerer(vitesse: Int) {
    this.vitesse += vitesse
}
fun ralentir(vitesse: Int) {
    this.vitesse -= vitesse
}
fun retourneVitesse() : String{
    return "la vitesse actuelle est de${this.vitesse}"
}
override fun toString(): String {
    return "Voiture(marque='$marque', modele='$modele', vitesse=$vitesse)"
}
}


