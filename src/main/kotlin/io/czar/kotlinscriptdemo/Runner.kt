package io.czar.kotlinscriptdemo
import javax.script.Compilable
import javax.script.ScriptEngineManager
import javax.script.SimpleBindings

fun main() {
    val engine = ScriptEngineManager().getEngineByName("kotlin") as Compilable

    val script = {}.javaClass.getResourceAsStream("/hello.kts")

    engine.compile(script.reader(Charsets.UTF_8))
        .eval(SimpleBindings(mutableMapOf<String, Any>("name" to "World of Scripting")))
}
