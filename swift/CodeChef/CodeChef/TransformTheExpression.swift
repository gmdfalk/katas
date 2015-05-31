//
//  TransformTheExpression.swift
//  CodeChef
//
//  Created by Max on 30/05/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Foundation


extension Array {
    
    mutating func pop() -> T {
        return self.removeLast()
    }
    
    mutating func push(item: T) {
        self.append(item)
    }
    
}

class TransformTheExpression {
    
    static let operators = [")", "(", "^", "*", "/", "-", "+"]
    
    class func main(infix : String) -> String {
        var stack = [String]()
        var postfix = ""
        
        for char in infix {
            var str = String(char)
            if contains(operators, str) {
                if (str == operators[0]) {
                    do {
                        var topItem = stack.pop()
                        if (topItem != operators[1]) {
                            postfix += topItem
                        }
                    } while stack.last != operators[1]
                } else {
                    stack.push(str)
                }
            } else {
                postfix += str
            }
        }
        
        return postfix
    }
    
}