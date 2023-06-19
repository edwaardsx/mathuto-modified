package tip.capstone.mathuto

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import tip.capstone.mathuto.databinding.ActivityCalculatorBinding
import java.lang.Math.pow
import java.lang.Math.toRadians
import kotlin.math.*

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding

    private lateinit var tvsec: TextView
    private lateinit var tvMain: TextView
    private lateinit var bac: Button
    private lateinit var bc: Button
    private lateinit var bbrac1: Button
    private lateinit var bbrac2: Button
    private lateinit var bsin: Button
    private lateinit var bcos: Button
    private lateinit var btan: Button
    private lateinit var blog: Button
    private lateinit var bln: Button
    private lateinit var bfact: Button
    private lateinit var bsquare: Button
    private lateinit var bsqrt: Button
    private lateinit var binv: Button
    private lateinit var b0: Button
    private lateinit var b9: Button
    private lateinit var b8: Button
    private lateinit var b7: Button
    private lateinit var b6: Button
    private lateinit var b5: Button
    private lateinit var b4: Button
    private lateinit var b3: Button
    private lateinit var b2: Button
    private lateinit var b1: Button
    private lateinit var bpi: Button
    private lateinit var bmul: Button
    private lateinit var bminus: Button
    private lateinit var bplus: Button
    private lateinit var bequal: Button
    private lateinit var bdot: Button
    private lateinit var bdiv: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tvsec = binding.idTVSecondary
        tvMain = binding.idTVprimary
        bac = binding.bac
        bc = binding.bc
        bbrac1 = binding.bbrac1
        bbrac2 = binding.bbrac2
        bsin = binding.bsin
        bcos = binding.bcos
        btan = binding.btan
        blog = binding.blog
        bln = binding.bln
        bfact = binding.bfact
        bsquare = binding.bsquare
        bsqrt = binding.bsqrt
        binv = binding.binv
        b0 = binding.b0
        b9 = binding.b9
        b8 = binding.b8
        b7 = binding.b7
        b6 = binding.b6
        b5 = binding.b5
        b4 = binding.b4
        b3 = binding.b3
        b2 = binding.b2
        b1 = binding.b1
        bpi = binding.bpi
        bmul = binding.bmul
        bminus = binding.bminus
        bplus = binding.bplus
        bequal = binding.bequal
        bdot = binding.bdot
        bdiv = binding.bdiv

        b1.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "1")
        }
        b2.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "2")
        }
        b3.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "3")
        }
        b4.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "4")
        }
        b5.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "5")
        }
        b6.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "6")
        }
        b7.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "7")
        }
        b8.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "8")
        }
        b9.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "9")
        }
        b0.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "0")
        }
        bdot.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + ".")
        }
        bplus.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "+")
        }
        bdiv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "/")
        }
        bbrac1.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "(")
        }
        bbrac2.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + ")")
        }
        bpi.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "3.142")
            tvsec.text = (bpi.text.toString())
        }
        bsin.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "sin")
        }
        bcos.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "cos")
        }
        btan.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "tan")
        }
        binv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "^" + "(-1)")
        }
        bln.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "ln")
        }
        blog.setOnClickListener {
            tvMain.text = (tvMain.text.toString() + "log")
        }

        bminus.setOnClickListener {
            val str: String = tvMain.text.toString()
            if (!str.last().equals('-')) {
                tvMain.text = (tvMain.text.toString() + "-")
            }
        }
        bmul.setOnClickListener {
            val str: String = tvMain.text.toString()
            if (!str.last().equals('*')) {
                tvMain.text = (tvMain.text.toString() + "*")
            }
        }
        bsqrt.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val str: String = tvMain.text.toString()
                val r = sqrt(str.toDouble())
                val result = r.toString()
                tvMain.text = result
            }
        }
        bequal.setOnClickListener {
            val str: String = tvMain.text.toString()
            val result: Double = evaluate(str)
            val r = result.toString()
            tvMain.text = r
            tvsec.text = str
        }
        bac.setOnClickListener {
            tvMain.text = ""
            tvsec.text = ""
        }
        bc.setOnClickListener {
            var str: String = tvMain.text.toString()
            if (str.isNotEmpty()) {
                str = str.substring(0, str.length - 1)
                tvMain.text = str
            }
        }
        bsquare.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val d: Double = tvMain.text.toString().toDouble()
                val square = d * d
                tvMain.text = square.toString()
                tvsec.text = "$d²"
            }
        }
        bfact.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show()
            } else {
                val value: Int = tvMain.text.toString().toInt()
                val fact: Int = factorial(value)
                tvMain.text = fact.toString()
                tvsec.text = "$value`!"
            }

        }

    }

    private fun factorial(n: Int): Int {
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    private fun evaluate(str: String): Double {
        return try {
            object : Any() {
                var pos = -1
                var ch = 0

                fun nextChar() {
                    ch = if (++pos < str.length) str[pos].toInt() else -1
                }

                fun eat(charToEat: Int): Boolean {
                    while (ch == ' '.toInt()) nextChar()
                    if (ch == charToEat) {
                        nextChar()
                        return true
                    }
                    return false
                }

                fun parse(): Double {
                    nextChar()
                    val x = parseExpression()
                    if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                    return x
                }

                fun parseExpression(): Double {
                    var x = parseTerm()
                    while (true) {
                        if (eat('+'.toInt())) x += parseTerm()
                        else if (eat('-'.toInt())) x -= parseTerm()
                        else return x
                    }
                }

                fun parseTerm(): Double {
                    var x = parseFactor()
                    while (true) {
                        if (eat('*'.toInt())) x *= parseFactor()
                        else if (eat('/'.toInt())) x /= parseFactor()
                        else return x
                    }
                }

                fun parseFactor(): Double {
                    if (eat('+'.toInt())) return parseFactor()
                    if (eat('-'.toInt())) return -parseFactor()
                    var x: Double
                    val startPos = pos
                    if (eat('('.toInt())) {
                        x = parseExpression()
                        eat(')'.toInt())
                    } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                        val stringBuilder = StringBuilder()
                        while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                            stringBuilder.append(ch.toChar())
                            nextChar()
                        }
                        x = stringBuilder.toString().toDouble()
                    } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                        val stringBuilder = StringBuilder()
                        while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                            stringBuilder.append(ch.toChar())
                            nextChar()
                        }
                        val func = stringBuilder.toString()
                        x = parseFactor()
                        x = when (func) {
                            "sqrt" -> sqrt(x)
                            "sin" -> sin(toRadians(x))
                            "cos" -> cos(toRadians(x))
                            "tan" -> tan(toRadians(x))
                            "log" -> log10(x)
                            "ln" -> ln(x)
                            else -> throw RuntimeException("Unknown function: $func")
                        }
                    } else {
                        throw RuntimeException("Unexpected: " + ch.toChar())
                    }
                    if (eat('^'.toInt())) x = pow(x, parseFactor())
                    return x
                }
            }.parse()
        } catch (e: RuntimeException) {
            Toast.makeText(this, "Invalid equation", Toast.LENGTH_SHORT).show()
            0.0 // Return a default value or handle the error as needed
        }
    }
}