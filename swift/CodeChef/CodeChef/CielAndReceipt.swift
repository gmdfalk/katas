//
//  CielAndReceipt.swift
//  CodeChef
// http://www.codechef.com/problems/CIELRCPT
//
//  Created by Max on 31/05/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Foundation

class CielAndReceipt {
    
    static let prices = [Int](0..<12).map({pow(2,Double($0))})
    
    class func main(price : Int) -> Int {
        var minMenus = 0;
        var tempPrice = price;
        var priceIndex = prices.count-1
        while tempPrice != 0 {
            while (priceIndex >= 0) {
                if tempPrice - Int(prices[priceIndex]) >= 0 {
                    tempPrice -= Int(prices[priceIndex])
                    minMenus++;
                } else {
                    priceIndex--;
                }
            }
            
        }
        
        return minMenus;
    }
    
}