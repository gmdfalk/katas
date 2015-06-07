//
//  PayingUp.swift
//  CodeChef
//
//  Created by Max on 06/06/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Foundation

class PayingUp {
    class func main(targetAmount : Int, banknotes : [Int]) -> Bool {
        var len = banknotes.count
        var end = len
        var start = 0
        var banknoteSum = 0
        var offset = 0
        
        for idx in 0..<len {
            
            var banknote = banknotes[idx]
            while end > idx {
                while start < end {
                    banknoteSum += banknotes[start]
                    if banknoteSum == targetAmount {
                        return true
                    }
                    start++
                }
                banknoteSum = 0
                offset++
                start = idx+offset
                end--
            }
            end = len-1
        }
        
        return false;
    }
}