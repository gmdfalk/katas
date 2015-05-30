//
//  CodeChefTests.swift
//  CodeChefTests
//
//  Created by Max on 30/05/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Cocoa
import XCTest
import CodeChef

class CodeChefTests: XCTestCase {
    
    override func setUp() {
        super.setUp()
    }
    
    override func tearDown() {
        super.tearDown()
    }
    
    func testSayHello() {
        XCTAssert(sayHello("Max") == "Hello, Max!")
    }
    
    func testTransformTheExpression() {
        XCTAssertEqual(TransformTheExpression.main("(a+(b*c))"), "abc*+");
        XCTAssertEqual(TransformTheExpression.main("((a+b)*(z+x))"), "ab+zx+*");
        XCTAssertEqual(TransformTheExpression.main("((a+t)*((b+(a+c))^(c+d)))"), "at+bac++cd+^*");
    }
    
    func testPerformanceExample() {
        self.measureBlock() {
        }
    }
    
}
