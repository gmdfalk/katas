//
//  CuttingRecipes.swift
//  CodeChef
// http://www.codechef.com/problems/RECIPE
//
//  Created by Max on 05/06/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Foundation


class CuttingRecipes {
    
    
    class func main(ingredientCount : Int, ingredients : [Int]) -> [Int] {
        var divisor = 1
       
        for i in 0..<ingredientCount {
            for j in 0..<ingredientCount {
                if (ingredients[j] % ingredients[i] > 0) {
                    break
                } else if (j == ingredientCount-1) {
                    divisor = ingredients[i]
                }
            }
        }
 
        return ingredients.map({$0/divisor})
    }
    
}