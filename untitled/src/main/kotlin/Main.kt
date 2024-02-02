fun main(args: Array<String>) {
   println("ПЕРВАЯ ЗАДАЧА")
    val amount = 200
    val kom = amount/100*0.75

    if(kom < 35)
    {
       val kom = 35
        val res = amount+35
        println ("Комиссия при переводе $kom р")
        println ("Сумма при переводе с комиссией $res р")
    }
     else
    {
        val kom = amount/100*0.75
        val res = amount+kom
        println ("Комиссия при переводе $kom р")
        println ("Сумма при переводе с комиссией $res р")
    }



    println("ВТОРАЯ ЗАДАЧА")
    println("Введите число лайков")
    val likes =10
    if(likes == 10)
    {
        println("Понравилось 10 людям")
    }
    else if(likes ==20)
        println("Понравилось 20 людям")
    else if(likes ==30)
    {
        println("Понравилось 30 людям")
    }



    println("ТРЕТЬЯ ЗАДАЧА")
    val sum = 10001
    if(sum <=1000)
    {
        println("Покупка $sum р")
    }
    else if(sum >=1001 && sum<=10000)
    {
        val skidka = sum - 100
        println("Цена $sum, скидка 100р, итоговая покупка на $skidka р")
    }
    else if(sum >=10001 )
    {
        val skidka1 = sum/100*5
        val sum1 = sum-skidka1
        val skidka3 = sum1/100*1
        val sum3 = sum1 - skidka3
        println("Цена $sum, скидка 5%, итоговая покупка на $sum1 р")
        println("Так как вы постоянный клиент, скидка сверху 1%, итоговая сумма $sum3")

    }


}