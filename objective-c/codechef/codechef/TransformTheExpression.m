//
//  TransformTheExpression.m
//  CodeChef
//
//  Created by Max on 27/05/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

#import "TransformTheExpression.h"

@implementation TransformTheExpression

+ (NSString *)main:(NSString *)input {
    NSArray *operators = @[@"+", @"-", @"/", @"*", @"^"];
    NSArray *parens = @[@"(", @")"];
    NSMutableString *result = [NSMutableString string];
    NSInteger operandPosition = result.length - 1;

    for (int i = 0; i < input.length; i++) {
        NSString *ch = [input substringWithRange:NSMakeRange(i, 1)];
        if ([operators containsObject:ch]) {
            [result appendString:ch];
        } else if (![parens containsObject:ch]) {
            operandPosition = i;
            [result insertString:ch atIndex:0];
        }
    }

    return result;
}

@end
