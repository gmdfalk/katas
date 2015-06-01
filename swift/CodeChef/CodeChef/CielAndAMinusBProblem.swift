//
//  CielAndAMinusBProblem.swift
//  CodeChef
// http://www.codechef.com/problems/CIELAB
//
//  Created by Max on 31/05/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Foundation


class CielAndAMinusBProblem {
    
    class func main(a : Int, b : Int) -> Int {
        var difference = a - b;
        if (difference % 10 == 0) {
            difference += 1
        } else {
            difference -= 1
        }
        return difference
    }
    
}