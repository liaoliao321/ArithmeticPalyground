/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if(n<0)
        return

    var methodNum = 0

    if(n == 0)
        return methodNum

    /*

f(n) = f(n-1) + f(n-2)

f(4) = f(3) + f(2)
f(3) = f(2) + f(1)
    */

    if(n == 1)
        return 1
    if(n == 2)
        return 2

    var idx = 3
    var f1 = 1
    var f2 = 2

    while(idx <= n){
        methodNum = f2 + f1
        f1 = f2
        f2 = methodNum
        idx++
    }
    return methodNum
};