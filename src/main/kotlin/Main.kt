fun main(args: Array<String>) {

    print ("Digite sua primeira nota: ")
    var nota1 = readLine()!!.toDouble()
    print ("Digite sua segunda nota: ")
    var nota2 = readLine()!!.toDouble()
    print ("Digite sua terceira nota: ")
    var nota3 = readLine()!!.toDouble()
    print ("Digite sua quarta nota: ")
    var nota4 = readLine()!!.toDouble()

    var notaTotal = nota1 + nota2 + nota3 + nota4
    var media = notaTotal / 4

    if (media >=0 && media <= 4){
        println("Reprovado")
    }else if (media > 4.0 && media <= 5.0){
        println("Sua média está Regular")
    }else if (media > 5.0 && media <= 8.0){
        println("Sua média esta Boa")
    }else if (media > 8.0 && media <= 10.0){
        println("Excelente!!")
    }else
        println("Média Inválida!!")

}