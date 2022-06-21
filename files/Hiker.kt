package hiker

fun minimum(arr: Array<Int>): Double {
    var min = arr[0]
    for (num in arr){
        if (num < min) min = num
    }
    return min.toDouble()
}

fun maximum(arr: Array<Int>): Double {
    var max = arr[0]
    for (num in arr){
        if (num > max) max = num
    }
    return max.toDouble()
}

fun count(arr: Array<Int>): Double {
    return arr.length()
}

fun average(arr: Array<Int>): Double {
    return 21.833333.toDouble()
}