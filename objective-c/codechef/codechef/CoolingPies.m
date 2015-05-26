//
//  CoolingPies.m
//  CodeChef
//
//  Created by Max on 26/05/15.
//  Copyright (c) 2015 Max. All rights reserved.
//

#import "CoolingPies.h"

@implementation CoolingPies

+ (NSInteger)main:(NSInteger)pies withWeights:(NSArray *)weights andMaxWeights:(NSArray *)maxWeights {
    NSSortDescriptor *sortDescending = [NSSortDescriptor sortDescriptorWithKey:@"self" ascending:NO];
    NSMutableArray *sortedWeights = [NSMutableArray arrayWithArray:weights];
    NSMutableArray *sortedMaxWeights = [NSMutableArray arrayWithArray:maxWeights];
    [sortedWeights sortUsingDescriptors:[NSArray arrayWithObject:sortDescending]];
    [sortedMaxWeights sortUsingDescriptors:[NSArray arrayWithObject:sortDescending]];

//     Violating all rules of flow control and immutability ¯\_(ツ)_/¯
    for (int i = 0; i < sortedWeights.count; i++) {
        for (int j = 0; j < sortedMaxWeights.count; j++) {
            if ([sortedWeights[i] intValue] <= [sortedMaxWeights[j] intValue]) {
                [sortedWeights removeObjectAtIndex:i--];
                [sortedMaxWeights removeObjectAtIndex:j];
                break;
            }
        }
    }
    return pies - [sortedWeights count];
}

@end
