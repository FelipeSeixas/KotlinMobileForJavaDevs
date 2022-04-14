package br.com.kotlincustocombustivel

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    Inteiros:
    val pMedio: Int = 100
    var precoMedio = 6

//    Doubles:
    var precoLocal = 7.10
    val capacidadeTanque: Double = 40.4

    val meuLong: Long = 100
    var meuInt: Int = 100
    val meuShort: Short = 100
    var meuByte: Byte = 100
    val meuDouble: Double = 40.4
    var meuFloat: Float = 40.4F

    var novoDouble = 5.5

    var novoInt = 0




    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        novoDouble = meuInt.toDouble()

        novoInt = meuDouble.toInt()

        val verdadeLazy = meuInt > meuDouble || meuLong < meuInt
        val verdade = meuInt > meuDouble && meuLong < meuInt

//        Template de strings
        val titulo = "Calculadora"

        val personalizado = "Bem vindo(a)! $titulo inciada."

        val contaTitulo = "O título do aplicativo possui ${titulo.length} caracteres."

//        Strings
        val combEscapeAtivo = "\n 1) Gasolina; \n 2) Alcool; e \n 3) Gás veicular."

        val combScapeInativo = """\n 1) Gasolina; \n 2) Alcool; e \n 3) Gás veicular."""

        val msnFinal = """Obrigado por utilizar, compartilhe! \n"""

        Log.i("string20", personalizado)

        Log.i("string21", contaTitulo)

        Log.d("string22", "Aspas duplas (com escape): $combEscapeAtivo")

        Log.d("string23", "Aspas triplas (com escape): $combScapeInativo")

        Log.d("string24", "Aspas triplas: $msnFinal")

/*Arrays
Exemplos: criação, impressão e atualização:*/
        val meuArray = arrayOf(444,555,666)

        Log.d("MeusArrays", "Posição Zero: ${meuArray[0]}")
        Log.d("MeusArrays", "Posição Um: ${meuArray[1]}")
        Log.d("MeusArrays", "Posição Dois: ${meuArray[2]}")

        meuArray[0] = 1000

        Log.d("MeusArrays", "Posição Zero atualizada: ${meuArray[0]}")

        for (i in meuArray.indices){
            Log.d("MeusArrays", "indices de array - ${i} = ${meuArray[i]}")}
//        Laços for:
        val deslocamentos = listOf("Trabalho 1", "Trabalho 2", "Trabalho 3", "Praia", "Academia")
        for (k in deslocamentos){
            Log.d("Listas", "Locais de deslocamento: $k")
        }

//        Uso do controle "in":
        val umAdez = 1..10
        for (k in umAdez){
            for (j in 1..5){
//                Log.d("ControleIn", "Multiplicação: ${k*j}")
            }
        }
//        Uso do "in" para contar caracteres de uma string:
        val combustivel = "Gás"
        for (char in combustivel){
            Log.d("ControleIn", "In com string: $char")
        }

//Uso da função sem retorno - Unit:
        fun comUnit(nome: String): Unit {
            Log.d("FuncaoUnit", "Unit explícito: $nome")
        }
        fun semUnit(nome: String) {
            Log.d("FuncaoUnit", "Unit implícito: $nome")
        }

        comUnit("Alcóol")
        semUnit("Gasolina")

//        Função "single line":
        fun calculaLitros (distancia: Double, consumo: Double) = distancia / consumo

        val totalLitros = calculaLitros(40.0, 14.5)
        Log.d("FuncaoSingle", "Serão necessários : $totalLitros litros para concluir o trajeto.")

        //  When com argumento:
        fun informaDescontos(x: Int){
            when(x){
                1 ->  Log.d("Descontos","Desconto baixo")

                2 ->  Log.d("Descontos","Desconto moderado")

                3 ->  Log.d("Descontos","Desconto alto")

                else ->  Log.d("Descontos","Sem desconto")
            }
        }
//          When sem argumento:
        fun melhorPrecoPostos(postoUm: Double, postoDois: Double){
            when{
                postoUm < postoDois ->  Log.d("Precos","Abasteça no posto 1")

                postoUm > postoDois ->  Log.d("Precos","Abasteça no posto 2")

                else -> Log.d("Precos","Os preços estão iguais")
            }
        }



    }
}
