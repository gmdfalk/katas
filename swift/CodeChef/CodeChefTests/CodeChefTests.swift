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
    
    func testPackagingCupcakes() {
        XCTAssertEqual(PackagingCupcakes.main(2), 2)
        XCTAssertEqual(PackagingCupcakes.main(5), 3)
    }
    
    func testCielAndAMinusBProblem() {
        XCTAssertEqual(CielAndAMinusBProblem.main(5858, b: 1238), 4621)
        XCTAssertEqual(CielAndAMinusBProblem.main(5858, b: 1234), 4623)
        XCTAssertEqual(CielAndAMinusBProblem.main(5859, b: 1230), 4628)
    }
    
    func testCielAndReceipt() {
        XCTAssertEqual(CielAndReceipt.main(10), 2)
        XCTAssertEqual(CielAndReceipt.main(256), 1)
        XCTAssertEqual(CielAndReceipt.main(255), 8)
        XCTAssertEqual(CielAndReceipt.main(4096), 2)
    }
    
    func testPrimePalindromes() {
        XCTAssertEqual(PrimePalindromes.main(31), 101)
        XCTAssertEqual(PrimePalindromes.main(102), 131)
        XCTAssertEqual(PrimePalindromes.main(150), 151)
        XCTAssertEqual(PrimePalindromes.main(250), 313)
    }
    
    func testCuttingRecipes() {
        XCTAssertEqual(CuttingRecipes.main(2, ingredients: [4, 4]), [1, 1])
        XCTAssertEqual(CuttingRecipes.main(3, ingredients: [2, 3, 4]), [2, 3, 4])
        XCTAssertEqual(CuttingRecipes.main(4, ingredients: [3, 15, 9, 6]), [1, 5, 3, 2])
    }
    
    func testPerformanceExample() {
        self.measureBlock() {
        }
    }
    
}
