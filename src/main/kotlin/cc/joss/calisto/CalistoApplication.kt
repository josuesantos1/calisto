package cc.joss.calisto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CalistoApplication

fun main(args: Array<String>) {
	runApplication<CalistoApplication>(*args)
}
