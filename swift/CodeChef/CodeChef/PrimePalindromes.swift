//
//  PrimePalindromes.swift
//  CodeChef
// http://www.codechef.com/problems/PRPALIN
//
//  Created by Max on 31/05/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Foundation

class PrimePalindromes {
    
    class func main(num : Int) -> Int {
        var counter = num;
        
        while (true) {
            counter++;
            if (isPalindrome(counter) && isPrime(counter)) {
                break
            }
        }
        
        return counter
    }
    
    class func isPalindrome(num : Int) -> Bool {
        var numString = Array(String(num))
        var reversed = reverse(numString)
        return reverse(numString) == numString
    }
    
    /**
    Check if a number is a prime
    http://en.wikipedia.org/wiki/AKS_primality_test
    
    :param: num An integer
    
    :returns: true if num is a prime
    */
    class func isPrime(num : Int) -> Bool {
        if num < 4 {
            return true
        }
        if num % 2 == 0 || num % 3 == 0 {
            return false
        }
        
        var i = 5
        var w = 2
        while i * i <= num {
            if num % i == 0 {
                return false
            }
            
            i += w
            w = 6 - w
        }
        
        return true
    }
    
}
