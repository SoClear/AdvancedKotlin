//@file:JvmName("HelloWorld")
//@file:JvmName("HelloWorld")在文件开始出,表示更改当前文件的JvmName


package `fun`.soclear.kotlin4

//注解(annotation)
//元注解(meta-annotation):注解的注解

@MustBeDocumented
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER,
        AnnotationTarget.EXPRESSION,
        AnnotationTarget.CONSTRUCTOR,
        AnnotationTarget.PROPERTY_SETTER,
        AnnotationTarget.FIELD,
        AnnotationTarget.PROPERTY_GETTER)
annotation class MyAnnotation

@MyAnnotation
class MyClass {

    @MyAnnotation
    fun myMethod(@MyAnnotation a: Int): Int {
        return (@MyAnnotation 10)
    }
}

class MyClass2 @MyAnnotation constructor(a: Int)

class MyClass3 {
    var a: Int? = null
        @MyAnnotation set
}