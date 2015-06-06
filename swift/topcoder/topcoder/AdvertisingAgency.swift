//
//  AdvertisingAgency.swift
//  topcoder
// http://community.topcoder.com/stat?c=problem_statement&pm=7558
//
//  Created by Max on 05/06/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Foundation

class AdvertisingAgency {
    
    class func numberOfRejections(requests : [Int]) -> Int {
        var rejects = 0
        var cache = [Int]()
        for request in requests {
            if !contains(cache, request) {
                cache.append(request)
            } else {
                rejects++
            }
        }
        return rejects
    }
    
    class func smartNumberOfRejections(requests : [Int]) -> Int {
        var rejects = 0
        var used = Array(count:100, repeatedValue:
            false)
        
        for request in requests {
            if !used[request-1] {
                used[request-1] = true
            } else {
                rejects++
            }
        }
        
        return rejects
    }
 
}