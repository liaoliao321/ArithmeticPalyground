/**
 * @param {number} n
 * @return {number}
 */
/*

f(1) = 1
f(2) = 2

f(n) = f(n-1) + f(n-2)

f(4) = f(3) + f(2)
f(3) = f(2) + f(1)

*/
const climbStairs = function (n) {
    if (n < 0)
        return

    var methodNum = 0

    if (n === 0)
        return methodNum

    if (n === 1 || n === 2)
        return n

    var idx = 3
    var f1 = 1
    var f2 = 2

    while (idx <= n) {
        methodNum = f2 + f1
        f1 = f2
        f2 = methodNum
        idx++
    }
    return methodNum
};