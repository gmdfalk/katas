//
//  CodechefTests.m
//  CodechefTests
//
//  Created by Max on 23/05/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

#import <Cocoa/Cocoa.h>
#import <XCTest/XCTest.h>
#import "AmbiguousPermutations.h"
#import "CoolingPies.h"
#import "TransformTheExpression.h"

@interface CodechefTests : XCTestCase

@end

@implementation CodechefTests

- (void)setUp {
    [super setUp];
}

- (void)tearDown {
    [super tearDown];
}

- (void)testAmbiguousPermutations {
    XCTAssertTrue([[AmbiguousPermutations main:4 withInput:@"1 4 3 2"] isEqualToString:@"ambiguous"]);
    XCTAssertTrue([[AmbiguousPermutations main:5 withInput:@"2 3 4 5 1"] isEqualToString:@"unambiguous"]);
    XCTAssertTrue([[AmbiguousPermutations main:1 withInput:@"1"] isEqualToString:@"ambiguous"]);
}

- (void)testCoolingPies {
//    XCTAssertEqual([CoolingPies main:3 withWeights:@[@10, @30, @20] andMaxWeights:@[@30, @10, @20]], @3);
    NSInteger result = [CoolingPies main:3 withWeights:@[@10, @30, @20] andMaxWeights:@[@30, @10, @20]];
    XCTAssertEqual(result, 3);
    result = [CoolingPies main:5 withWeights:@[@9, @7, @16, @4, @8] andMaxWeights:@[@8, @3, @14, @10, @10]];
    XCTAssertEqual(result, 4);
}

- (void)testTransformTheExpression {
    XCTAssertEqual([TransformTheExpression main:@"(a+(b*c))"], @"abc*+");
    XCTAssertEqual([TransformTheExpression main:@"((a+b)*(z+x))"], @"ab+zx+*");
    XCTAssertEqual([TransformTheExpression main:@"((a+t)*((b+(a+c))^(c+d)))"], @"at+bac++cd+^*");
}

@end
