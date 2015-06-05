//
//  topcoderTests.swift
//  topcoderTests
//
//  Created by Max on 05/06/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

import Cocoa
import XCTest
import topcoder

class topcoderTests: XCTestCase {
    
    override func setUp() {
        super.setUp()
    }
    
    override func tearDown() {
        super.tearDown()
    }
    
    func testAdvertisingAgency() {
        XCTAssertEqual(AdvertisingAgency.numberOfRejections([1,2,3]), 0)
        XCTAssertEqual(AdvertisingAgency.numberOfRejections([1,1,1]), 2)
        XCTAssertEqual(AdvertisingAgency.numberOfRejections([1,2,1,2]), 2)
        XCTAssertEqual(AdvertisingAgency.numberOfRejections([
            100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
            100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
            100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
            100, 100, 100, 100, 100, 100, 100, 100, 100, 100,
            100, 100, 100, 100, 100, 100, 100, 100, 100, 100
            ]), 49)
    }
    
    func testPerformanceExample() {
        self.measureBlock() {
        }
    }
    
}
