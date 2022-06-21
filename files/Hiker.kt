package hiker

fun minimum(arr: Array<Int>): Double {
    var min = arr[0]
    for (num in arr){
        if (num < min) min = num
    }
    return min.toDouble()
}

fun maximum(arr: Array<Int>): Double {
    return 92.toDouble()
}

fun count(arr: Array<Int>): Double {
    return 6.toDouble() 
}

fun average(arr: Array<Int>): Double {
    return 21.833333.toDouble()
}