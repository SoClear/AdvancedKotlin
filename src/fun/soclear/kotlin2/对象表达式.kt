package `fun`.soclear.kotlin2

import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame


fun main() {
    val jFrame=JFrame("My JFrame")
    val jButton=JButton("My JButton")

    jFrame.addWindowListener(object :WindowListener{
        override fun windowDeiconified(e: WindowEvent?) {
        }

        override fun windowClosing(e: WindowEvent?) {
            println("window closing")
        }

        override fun windowClosed(e: WindowEvent?) {
            println("window closed")
        }

        override fun windowActivated(e: WindowEvent?) {
            println("window activated")
        }

        override fun windowDeactivated(e: WindowEvent?) {

        }

        override fun windowOpened(e: WindowEvent?) {
            println("window opened")
        }

        override fun windowIconified(e: WindowEvent?) {
        }

    })


    /*
    如果对象是Java函数式接口的一个实例（即只拥有一个抽象方法的接口)
    那么可以通过Lambda表达式来调用，其中Lambda表达式前面加上接口的类型。
    Lambda表达式前面加上接口的类型表示调用这个接口中的函数,而函数的参数就是lambda表达式,所以省略了括号,直接后面接上一个lambda表达式
    */

    /*
    原始的较为复杂的调用方式
    jButton.addActionListener(object :ActionListener{
        override fun actionPerformed(e: ActionEvent?) {
            println("Button Pressed")
        }
    })
     */

    /*
    简洁一点的调用方法
     */
//    jButton.addActionListener(ActionListener { println("Button Pressed") })

    /*
    更加简洁的方法
    因为编译器可以自动推断出来接口的类型,所以可以省略ActionListener
     */
    jButton.addActionListener{ println("Button Pressed") }

    jFrame.apply {
        add(jButton)
        pack()
        isVisible=true
        defaultCloseOperation=JFrame.EXIT_ON_CLOSE
    }
}