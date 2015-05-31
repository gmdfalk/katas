//
//  TransformTheExpression.swift
//  CodeChef
// http://www.codechef.com/problems/ONP
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
                    addStackToPostfix(&stack, postfix: &postfix)
//                    (stack, postfix) = reduceStackAndPostfix(stack, postfix: postfix)
                } else {
                    stack.push(str)
                }
            } else {
                postfix += str
            }
        }
        
        return postfix
    }
    
    class func reduceStackAndPostfix(stack : [String], postfix : String) -> ([String], String) {
        var stackCopy = stack
        var postfixCopy = postfix
        var topItem = stackCopy.pop()
        while (!operators.isEmpty && topItem != operators[1]) {
            if (topItem != operators[1]) {
                postfixCopy += topItem
            }
            topItem = stackCopy.pop()
        }
        return (stackCopy, postfixCopy)
    }
    
    class func addStackToPostfix(inout stack : [String], inout postfix : String) {
        var topItem = stack.pop()
        while (!operators.isEmpty && topItem != operators[1]) {
            if (topItem != operators[1]) {
                postfix += topItem
            }
            topItem = stack.pop()
        }
    }
    
}