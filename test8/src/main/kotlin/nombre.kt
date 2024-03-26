class nombre {
    var nb = 0

    constructor(nb: Int) {
        this.nb = nb
    }

    constructor() {}

    fun sommeChiffres(): Int {
        val liste = mutableListOf<Int>()
        var q = this.nb
        var r = 0
        while (q != 0) {
            r = q % 10
            q = q / 10
            liste.add(r)
        }
        return liste.sum()
    }
}